import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;
import wci.util.*;

import static wci.intermediate.symtabimpl.SymTabKeyImpl.*;
import static wci.intermediate.symtabimpl.DefinitionImpl.*;

public class Pass1Visitor extends BitVecBaseVisitor<Integer> 
{
    private SymTabStack symTabStack;
    private SymTabEntry programId;
    private ArrayList<SymTabEntry> variableIdList;
    private ArrayList<SymTabEntry> variableIdListFunc;
   
    private PrintWriter jFile;
    String progName;
    Boolean inFunc = false;
    Integer slotNum = 0;
    ArrayList<String> localVars = new ArrayList<String>();
    Integer level = -1;
    
    
    public Pass1Visitor()
    {
        // Create and initialize the symbol table stack.
        symTabStack = SymTabFactory.createSymTabStack();
        Predefined.initialize(symTabStack);
    }
    
    public PrintWriter getAssemblyFile() { return jFile; }
    
    @Override 
    public Integer visitProgram(BitVecParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        
        // Print the cross-reference table.
        CrossReferencer crossReferencer = new CrossReferencer();
        crossReferencer.print(symTabStack);
        
        return value;
    }
    
    public SymTabStack getSymTabStack() {return symTabStack;}
    
    @Override 
    public Integer visitHeader(BitVecParser.HeaderContext ctx) 
    { 
        String programName = ctx.IDENTIFIER().toString();
        progName = programName;
        
        programId = symTabStack.enterLocal(programName);
        programId.setDefinition(DefinitionImpl.PROGRAM);
        programId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
        System.out.println(symTabStack.getCurrentNestingLevel());
        symTabStack.setProgramId(programId);
        
        // Create the assembly output file.
        try {
            jFile = new PrintWriter(new FileWriter(programName + ".j"));
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        
        // Emit the program header.
        jFile.println(".class public " + programName);
        jFile.println(".super java/lang/Object");
        
        // Emit the RunTimer and PascalTextIn fields.
        jFile.println();
        jFile.println(".field private static _runTimer LRunTimer;");
        jFile.println(".field private static _standardIn LPascalTextIn;");

        return visitChildren(ctx);
    }

    @Override 
    public Integer visitVarDeclar(BitVecParser.VarDeclarContext ctx) 
    { 
        Integer value = visitChildren(ctx);
        
        
        
        if (symTabStack.getCurrentNestingLevel() == 1) {
        	// Emit the class constructor.
            jFile.println();
            jFile.println(".method public <init>()V");
            jFile.println();
            jFile.println("\taload_0");
            jFile.println("\tinvokenonvirtual    java/lang/Object/<init>()V");
            jFile.println("\treturn");
            jFile.println();
            jFile.println(".limit locals 1");
            jFile.println(".limit stack 1");
            jFile.println(".end method");
        }
        
        return value;
    }
    
    @Override
    public Integer visitFunctionDeclar(BitVecParser.FunctionDeclarContext ctx)
    {
    	inFunc = true;
    	
    	SymTabEntry functionId;
    	
    	String functionName = ctx.IDENTIFIER().toString();
    	
    	functionId = symTabStack.enterLocal(functionName);
        functionId.setDefinition(DefinitionImpl.FUNCTION);
        functionId.setAttribute(ROUTINE_SYMTAB, symTabStack.push());
       
    	String fName = ctx.getChild(1).toString();
    	String typeName = ctx.typeId().IDENTIFIER().toString();
    	String rType;
    	
    	if (typeName.equalsIgnoreCase("integer")) {
            rType = "I";
        }
        else if (typeName.equalsIgnoreCase("real")) {
            rType = "F";
        }
        else {
            rType = "V";
        }
    	
    	jFile.println();
    	jFile.print(".method static " + fName + "(");
    	//print parameter indicator types
    	//there's probably a better way to do this
    	Integer i = 0;
    	while (ctx.formalParmList(i) != null) {
    		visit(ctx.formalParmList(i));
    		i++;
    	}
    	
    	jFile.println(")" + rType);
    	
    	//visit block statement here
    	visit(ctx.block());
    	
    	
    	jFile.println("\n\treturn\n");
    	
    	jFile.println(".limit stack 2");
    	jFile.println(".limit locals " + localVars.size());
    	jFile.println(".end method");
    	jFile.println();
    	//pop function's symbol table off the stack
    	symTabStack.pop();
    	inFunc = false;
    	return 0;
    }
    
    @Override 
    public Integer visitFormalParmList(BitVecParser.FormalParmListContext ctx)
    {
    	Integer i = 0;
    	variableIdListFunc = new ArrayList<SymTabEntry>();
    	while (ctx.getChild(i) != null){
    		visit(ctx.getChild(i));
    		i++;
    	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitValueParm(BitVecParser.ValueParmContext ctx)
    {
    	
    	String typeName = ctx.typeId().IDENTIFIER().toString();
    	String variableName = ctx.varId().IDENTIFIER().toString();
    	
        TypeSpec type;
        String   typeIndicator;
        
        if (typeName.equalsIgnoreCase("integer")) {
            type = Predefined.integerType;
            typeIndicator = "I";
        }
        else if (typeName.equalsIgnoreCase("real")) {
            type = Predefined.realType;
            typeIndicator = "F";
        }
        else {
            type = null;
            typeIndicator = "?";
        }
        
        ctx.type = type;
        
        //null pointer here with valueparameters
        SymTabEntry variableId = symTabStack.enterLocal(variableName);
        
        variableId.setDefinition(VARIABLE);
        variableIdListFunc.add(variableId);
        if (!localVars.contains(variableName)) {
    		localVars.add(variableName);
    	}
        
        jFile.print(typeIndicator);
        
    	return 0;
    }
    
    @Override
    public Integer visitRefParm(BitVecParser.RefParmContext ctx)
    {
    	
    	String typeName = ctx.typeId().IDENTIFIER().toString();
    	
        TypeSpec type;
        String   typeIndicator;
        
        if (typeName.equalsIgnoreCase("integer")) {
            type = Predefined.integerType;
            typeIndicator = "I";
        }
        else if (typeName.equalsIgnoreCase("real")) {
            type = Predefined.realType;
            typeIndicator = "F";
        }
        else {
            type = null;
            typeIndicator = "?";
        }
        
        ctx.type = type;
        
        jFile.print(typeIndicator);
        
    	return 0;
    }

    @Override 
    public Integer visitDecl(BitVecParser.DeclContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitVarList(BitVecParser.VarListContext ctx) 
    { 
        if (symTabStack.getCurrentNestingLevel() == 1) {
        	variableIdList = new ArrayList<SymTabEntry>();
        }
        else if (symTabStack.getCurrentNestingLevel() == 2) {
        	variableIdListFunc = new ArrayList<SymTabEntry>();
        }
        return visitChildren(ctx);         
    }
    
    @Override 
    public Integer visitVarId(BitVecParser.VarIdContext ctx) 
    {
        String variableName = ctx.IDENTIFIER().toString();
        
        if (symTabStack.getCurrentNestingLevel() == 1) {
        	SymTabEntry variableId = symTabStack.enterLocal(variableName);
            variableId.setDefinition(VARIABLE);
            variableIdList.add(variableId);
        }
        else if (symTabStack.getCurrentNestingLevel() == 2) {
        	SymTabEntry variableId = symTabStack.enterLocal(variableName);
            variableId.setDefinition(VARIABLE);
            variableIdListFunc.add(variableId);
            if (!localVars.contains(variableName)) {
        		localVars.add(variableName);
        	}
        }
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitTypeId(BitVecParser.TypeIdContext ctx) 
    { 
        String typeName = ctx.IDENTIFIER().toString();
        TypeSpec type;
        String   typeIndicator;
        
        	if (typeName.equalsIgnoreCase("integer")) {
                type = Predefined.integerType;
                typeIndicator = "I";
            }
            else if (typeName.equalsIgnoreCase("real")) {
                type = Predefined.realType;
                typeIndicator = "F";
            }
            
            else if (typeName.equalsIgnoreCase("boolean")) {
            	type = Predefined.booleanType;
            	typeIndicator = "Z";
            }
            
            else if(typeName.equalsIgnoreCase("array")) {
            	type = Predefined.undefinedType;
            	typeIndicator = "?";
            }
            else {
                type = null;
                typeIndicator = "?";
            }
            
        	if (symTabStack.getCurrentNestingLevel() == 1) {
        		for (SymTabEntry id : variableIdList) {
        			id.setTypeSpec(type);
        			if ((type == Predefined.realType) || (type == Predefined.integerType) || (type == Predefined.booleanType)) {
        				// Emit a field declaration.
        				jFile.println(".field private static " +
    	                               id.getName() + " " + typeIndicator);
        			}
	    	        //array
	    	        
	    	        else if (type == Predefined.undefinedType){
	    	        	jFile.println(".field private static " +
	                               id.getName() + " " + "[Z");
	    	        }
	    	        
            
        		}
        	}
        	else if (symTabStack.getCurrentNestingLevel() == 2) {
        		for (SymTabEntry id : variableIdListFunc) {
        			id.setTypeSpec(type);
        			int slotNumber = -1;
                	
                	for(int i = 0; i < localVars.size(); i++) {
                		String temp = localVars.get(i);
                		if (temp.equals(id.getName())) {
                			slotNumber = i;
                		}
                	}
        			jFile.println(".var " + slotNumber + " is " + id.getName() + " " + typeIndicator);
        		}
        	}
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitStmt(BitVecParser.StmtContext ctx) 
    { 
    	if(symTabStack.getCurrentNestingLevel() == 2) {
    		jFile.println("\n; " + ctx.getText() + "\n");
    	}
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitAssignmentStmt(BitVecParser.AssignmentStmtContext ctx)
    {
    	
    	Integer value = visit(ctx.expr());
    	
        if (symTabStack.getCurrentNestingLevel() == 2) {
            
            int slotNumber = -1;
            String variableName = ctx.variable().IDENTIFIER().toString();
            
            String type = "?";
        	
        	for(int i = 0; i < localVars.size(); i++) {
        		String temp = localVars.get(i);
        		if (temp.equals(variableName)) {
        			slotNumber = i;
        		}
        	}
        	
        	String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "i"
        						 : (ctx.expr().type == Predefined.realType) ? "f"
        						 : (ctx.expr().type == Predefined.booleanType) ? "z"
        						 : 											"?";
			jFile.println("\t" + typeIndicator + "store_" + slotNumber);

            return value;
        }
        else {
        	return 0;
        }
    }
    
    @Override
    public Integer visitIf_stat(BitVecParser.If_statContext ctx)
    {
    		Label nextLabel = Label.newLabel();
        	
        	/*
        	 * NO ELSE should be
        	 * code to evaluate the boolean expression
        	 * ifeq next-label
        	 * code for the then statement
        	 * next-label:
        	 * */
        	if (ctx.getChild(5) == null) {
            	//code to evaluate the boolean expression (visit boolean)
            	visit(ctx.expr());
            	
            	if (symTabStack.getCurrentNestingLevel() == 2) {
            	jFile.println("\tifeq\t" + nextLabel.toString());
            	
            	//code for the THEN statement (visit statements)
            	visit(ctx.getChild(3));
            	
            	jFile.println(nextLabel.toString() + ":");
            	}
            	
        	}
        	
        	/*
        	 * There is an ELSE should be
        	 * code to evaluate the boolean expression
        	 * ifeq false-label
        	 * code for the THEN statement
        	 * goto next-label
        	 * false-label:
        	 * code for the ELSE statement
        	 * next-label:
        	 * */
        	else {
        		
        		Label falseLabel = Label.newLabel();
        		
        		//code to evaluate the boolean expression
        		visit(ctx.expr());
        		
        		
        		if (symTabStack.getCurrentNestingLevel() == 2) {
        		jFile.println("\tifeq\t" + falseLabel.toString());
        		}
        		
        		//code for the THEN statement
        		visit(ctx.getChild(3));
        		
        		if (symTabStack.getCurrentNestingLevel() == 2) {
        		jFile.println("\tgoto\t" + nextLabel.toString());
        		jFile.println(falseLabel.toString() + ":");
        		}
        		
        		//code for the ELSE statement
        		visit(ctx.getChild(5));
        		if (symTabStack.getCurrentNestingLevel() == 2) {
        		jFile.println(nextLabel.toString() + ":");
        		}
        	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitDowhile_stat(BitVecParser.Dowhile_statContext ctx)
    {
    	
    	
    		Label loopLabel = Label.newLabel();
        	Label nextLabel = Label.newLabel();
        	
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println(loopLabel.toString() + ":");
        	}
        	
        	visit(ctx.getChild(1));
        	
        	visit(ctx.expr());
        	
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println("\ticonst_1");
        	jFile.println("\tixor");
        	jFile.println("\tifne\t" + nextLabel.toString());
        	
        	jFile.println("\tgoto\t" + loopLabel.toString());
        	
        	jFile.println(nextLabel.toString() + ":");
        	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitWhile_stat(BitVecParser.While_statContext ctx)
    {
    	
    		/*
        	 * Form is:
        	 * loop-label:
        	 * code to evaluate boolean test expression
        	 * ifne next-label
        	 * code for statements after test
        	 * goto loop-label
        	 * next-label:
        	 * */
        	
        	Label loopLabel = Label.newLabel();
        	Label nextLabel = Label.newLabel();
        	
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println(loopLabel.toString() + ":");
        	}
        	visit(ctx.expr());
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println("\ticonst_1");
        	jFile.println("\tixor");
        	jFile.println("\tifne\t" + nextLabel.toString());
        	}
        	visit(ctx.getChild(3));
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println("\tgoto\t" + loopLabel.toString());
        	jFile.println(nextLabel.toString() + ":");
        	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitPrint_stat(BitVecParser.Print_statContext ctx)
    {
    	if (symTabStack.getCurrentNestingLevel() == 2) {
    		jFile.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
    	}
        	visit(ctx.expr());
        	
        	TypeSpec type = ctx.expr().type;
        	
        	String typeIndicator = (type == Predefined.integerType) ? "I"
                    : (type == Predefined.realType)    ? "F"
                    :                                    "Ljava/lang/String;"; //gets here it's a string
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println("\tinvokevirtual	java/io/PrintStream/print(" + typeIndicator + ")V");
        	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitPrintln_stat(BitVecParser.Println_statContext ctx)
    {
    	
    	if (symTabStack.getCurrentNestingLevel() == 2) {
    		jFile.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;");
    	}
        	visit(ctx.expr());
        	
        	TypeSpec type = ctx.expr().type;
        	
        	String typeIndicator = (type == Predefined.integerType) ? "I"
                    : (type == Predefined.realType)    ? "F"
                    :                                    "Ljava/lang/String;"; //gets here it's a string
        	if (symTabStack.getCurrentNestingLevel() == 2) {
        	jFile.println("\tinvokevirtual	java/io/PrintStream/println(" + typeIndicator + ")V");
    	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitReturn_stat(BitVecParser.Return_statContext ctx)
    {
    	
    	if (symTabStack.getCurrentNestingLevel() == 2) {
    		visit(ctx.expr());
        	TypeSpec type = ctx.expr().type;
        	
        	if ((type == Predefined.integerType) ||
                    (type == Predefined.booleanType))
                {
                    jFile.println("\tireturn");
                }
        	else if (type == Predefined.realType)
        	{
        		jFile.println("\tfreturn");
        	}
        	else
        	{
        		jFile.println("\t???");
        	}
    	}
    	return 0;
    }
    

    @Override 
    public Integer visitAddSubExpr(BitVecParser.AddSubExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               null;
        ctx.type = type;
        
        if (symTabStack.getCurrentNestingLevel() == 2) {
        	String op = ctx.addSubOp().getText();
            String opcode;

            if (op.equals("+")) {
                opcode = integerMode ? "iadd"
                       : realMode    ? "fadd"
                       :               "????";
            }
            else {
                opcode = integerMode ? "isub"
                       : realMode    ? "fsub"
                       :               "????";
            }
            
            // Emit an add or subtract instruction.
            jFile.println("\t" + opcode);
        }
        
        return value; 
    }
    
    @Override
    public Integer visitRelOpExpr (BitVecParser.RelOpExprContext ctx)
    {
    	Integer value = visitChildren(ctx);
    	
    	TypeSpec type1 = ctx.expr(0).type;
    	TypeSpec type2 = ctx.expr(1).type;
    	
    	boolean integerMode =	(type1 == Predefined.integerType)
    						 && (type2 == Predefined.integerType);
    	boolean realMode =		(type1 == Predefined.realType)
    						 && (type2 == Predefined.realType);
    	
    	TypeSpec type = integerMode ? Predefined.integerType
    				  : realMode	? Predefined.realType
    				  : 			  null;
    	ctx.type = Predefined.booleanType;
    	
    	if(symTabStack.getCurrentNestingLevel() == 2) {
    		
    		String op = ctx.relOp().getText();
        	String opcode;
        	
        	if (realMode) {
        		jFile.println("fcmpg");
        	}
        	
        	if (op.equals("==")) {
                opcode = integerMode ? "if_icmpeq"
                        : realMode    ? "ifeq"
                        :               "????";
        	}
        	
        	else if (op.equals("!=")) {
                opcode = integerMode ? "if_icmpne"
                        : realMode    ? "ifne"
                        :               "????";
        	}
        	
        	else if (op.equals("<")) {
                opcode = integerMode ? "if_icmplt"
                        : realMode    ? "iflt"
                        :               "????";
        	}
        	
        	else {
                opcode = integerMode ? "if_icmpgt"
                        : realMode    ? "ifgt"
                        :               "????";
        	}
        	
        	Label trueLabel = Label.newLabel();
        	Label nextLabel = Label.newLabel();
        	
        	//emit the appropriate opcode for relational expression
        	jFile.println("\t" + opcode + "\t" + trueLabel.toString());
        	
        	//emit remaining code
        	
        	jFile.println("\ticonst_0");
        	jFile.println("\tgoto" + "\t" + nextLabel.toString());
        	//true-label
        	jFile.println(trueLabel.toString() + ":");
        	jFile.println("\ticonst_1");
        	//next-label
        	jFile.println(nextLabel.toString() + ":");
    		
    	}
    	
    	return value;
    }

    @Override 
    public Integer visitMulDivExpr(BitVecParser.MulDivExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        
        TypeSpec type1 = ctx.expr(0).type;
        TypeSpec type2 = ctx.expr(1).type;
        
        boolean integerMode =    (type1 == Predefined.integerType)
                              && (type2 == Predefined.integerType);
        boolean realMode    =    (type1 == Predefined.realType)
                              && (type2 == Predefined.realType);
        
        TypeSpec type = integerMode ? Predefined.integerType
                      : realMode    ? Predefined.realType
                      :               null;
        ctx.type = type;
        
        if (symTabStack.getCurrentNestingLevel() == 2) {
        	String op = ctx.mulDivOp().getText();
            String opcode;

            if (op.equals("*")) {
                opcode = integerMode ? "imul"
                       : realMode    ? "fmul"
                       :               "f???";
            }
            else {
                opcode = integerMode ? "idiv"
                       : realMode    ? "fdiv"
                       :               "????";
            }
            
            // Emit a multiply or divide instruction.
            jFile.println("\t" + opcode);
        }
        
        return value; 
    }
    
    //need to change the emitted instruction
    @Override 
    public Integer visitVariableExpr(BitVecParser.VariableExprContext ctx)
    {
    	
        String variableName = ctx.variable().IDENTIFIER().toString();
        SymTabEntry variableId = symTabStack.lookup(variableName);
        
        
        ctx.type = variableId.getTypeSpec(); 
        
        if (symTabStack.getCurrentNestingLevel() == 2) {

        	int slotNumber = -1;
        	
        	for(int i = 0; i < localVars.size(); i++) {
        		String temp = localVars.get(i);
        		if (temp.equals(variableName)) {
        			slotNumber = i;
        		}
        	}

			jFile.println("\tiload_" + slotNumber);
        }
        
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitSignedNumberExpr(BitVecParser.SignedNumberExprContext ctx)
    {
        Integer value = visitChildren(ctx);
        ctx.type = ctx.signedNumber().type;
        return value;
    }
    
    @Override 
    public Integer visitStringExpr(BitVecParser.StringExprContext ctx) 
    {
    	
    	ctx.type = Predefined.undefinedType;
    	if (symTabStack.getCurrentNestingLevel() == 2) {
    		String sValue = ctx.getChild(0).toString();
        	
        	//Emit instruction
        	jFile.println("\tldc " + sValue);
    	}
    	return visitChildren(ctx);
    }

    @Override 
    public Integer visitSignedNumber(BitVecParser.SignedNumberContext ctx)
    {
        Integer value = visit(ctx.number());
        ctx.type = ctx.number().type;
        TypeSpec type = ctx.type;
        if (symTabStack.getCurrentNestingLevel() == 2) {
        	if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
                String opcode = (type == Predefined.integerType) ? "ineg"
                              : (type == Predefined.realType)    ? "fneg"
                              :                                    "?neg";
                
                // Emit a negate instruction.
                jFile.println("\t" + opcode);
            }
        }
        return value;
    }

    @Override 
    public Integer visitUnsignedNumberExpr(BitVecParser.UnsignedNumberExprContext ctx)
    {
        Integer value = visit(ctx.number());
        ctx.type = ctx.number().type;
        return value;
    }
    
    @Override
    public Integer visitBooleanExpr(BitVecParser.BooleanExprContext ctx)
    {
    	ctx.type = Predefined.booleanType;
    	if (symTabStack.getCurrentNestingLevel() == 2) {
    		String boolVal = ctx.getText().toString();
        	String indicator;
        	if (boolVal.equals("false")) {
        		indicator = "0";
        	}
        	else if (boolVal.equals("true")) {
        		indicator = "1";
        	}
        	else {
        		indicator ="?";
        	}
        	jFile.println("\tldc\t" + indicator);
    	}
    	return visitChildren(ctx);
    }

    @Override 
    public Integer visitIntegerConst(BitVecParser.IntegerConstContext ctx)
    {
        ctx.type = Predefined.integerType;
        if (symTabStack.getCurrentNestingLevel() == 2) {
        	// Emit a load constant instruction.
            jFile.println("\tldc\t" + ctx.getText());
        }
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(BitVecParser.FloatConstContext ctx)
    {
        ctx.type = Predefined.realType;
        if (symTabStack.getCurrentNestingLevel() == 2) {
        	// Emit a load constant instruction.
            jFile.println("\tldc\t" + ctx.getText());
        }
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitParenExpr(BitVecParser.ParenExprContext ctx)
    {
        Integer value = visitChildren(ctx); 
        ctx.type = ctx.expr().type;
        return value;
    }
}