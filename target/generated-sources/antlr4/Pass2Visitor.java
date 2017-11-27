import java.io.PrintWriter;

import org.antlr.v4.runtime.tree.ParseTree;

import wci.intermediate.*;
import wci.intermediate.symtabimpl.*;

import wci.intermediate.Label;

public class Pass2Visitor extends BitVecBaseVisitor<Integer> 
{
    String programName;
    private PrintWriter jFile;
    
    public Pass2Visitor(PrintWriter jFile)
    {
        this.jFile = jFile;
    }
    
    
    
    @Override 
    public Integer visitProgram(BitVecParser.ProgramContext ctx) 
    { 
        Integer value = visitChildren(ctx); 
        jFile.close();
        return value;
    }
    
    @Override 
    public Integer visitHeader(BitVecParser.HeaderContext ctx) 
    { 
        programName = ctx.IDENTIFIER().toString();       
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitMainBlock(BitVecParser.MainBlockContext ctx) 
    { 
        // Emit the main program header.
        jFile.println();
        jFile.println(".method public static main([Ljava/lang/String;)V");
        jFile.println();
        jFile.println("\tnew RunTimer");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual RunTimer/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tnew PascalTextIn");
        jFile.println("\tdup");
        jFile.println("\tinvokenonvirtual PascalTextIn/<init>()V");
        jFile.println("\tputstatic        " + programName + "/_standardIn LPascalTextIn;");
        
        Integer value = visitChildren(ctx);
        
        // Emit the main program epilogue.
        jFile.println();
        jFile.println("\tgetstatic     " + programName + "/_runTimer LRunTimer;");
        jFile.println("\tinvokevirtual RunTimer.printElapsedTime()V");
        jFile.println();
        jFile.println("\treturn");
        jFile.println();
        jFile.println(".limit locals 16");
        jFile.println(".limit stack 16");
        jFile.println(".end method");
        
        return value;
    }

    @Override 
    public Integer visitStmt(BitVecParser.StmtContext ctx) 
    { 
        jFile.println("\n; " + ctx.getText() + "\n");
        
        return visitChildren(ctx); 
    }
    @Override 
    public Integer visitAssignmentStmt(BitVecParser.AssignmentStmtContext ctx)
    {
        Integer value = visit(ctx.expr());
        
        String typeIndicator = (ctx.expr().type == Predefined.integerType) ? "I"
                             : (ctx.expr().type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field put instruction.
        jFile.println("\tputstatic\t" + programName
                           +  "/" + ctx.variable().IDENTIFIER().toString() 
                           + " " + typeIndicator);

        return value; 
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
        	
        	jFile.println("\tifeq\t" + nextLabel.toString());
        	
        	//code for the THEN statement (visit statements)
        	visit(ctx.getChild(3));
        	
        	jFile.println(nextLabel.toString() + ": Hello");
        	
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
    		
    		jFile.println("\tifeq\t" + falseLabel.toString());
    		
    		//code for the THEN statement
    		visit(ctx.getChild(3));
    		
    		jFile.println("\tgoto\t" + nextLabel.toString());
    		jFile.println(falseLabel.toString() + ":");
    		
    		//code for the ELSE statement
    		visit(ctx.getChild(5));
    		
    		jFile.println(nextLabel.toString() + ":");
    	}
    	
    	return 0;
    }
    
    @Override
    public Integer visitDowhile_stat(BitVecParser.Dowhile_statContext ctx)
    {
    	
    	Label loopLabel = Label.newLabel();
    	Label nextLabel = Label.newLabel();
    	
    	jFile.println(loopLabel.toString() + ":");	
    	
    	visit(ctx.getChild(1));
    	
    	jFile.println("\tifne\t" + nextLabel.toString());
    	
    	visit(ctx.expr());
    	
    	jFile.println("\tgoto\t" + loopLabel.toString());
    	
    	jFile.println(nextLabel.toString() + ":");
    	
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
    	
    	jFile.println(loopLabel.toString() + ":");
    	visit(ctx.expr());
    	jFile.println("\tifne\t" + nextLabel.toString());
    	visit(ctx.getChild(3));
    	jFile.println("\tgoto\t" + loopLabel.toString());
    	jFile.println(nextLabel.toString() + ":");
    	
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
        
        return value; 
    }
    
    @Override
    public Integer visitRelOpExpr(BitVecParser.RelOpExprContext ctx)
    {
    	Integer value = visitChildren(ctx);
    	
    	TypeSpec type1 = ctx.expr(0).type;
    	TypeSpec type2 = ctx.expr(1).type;
    	
    	boolean integerMode =	(type1 == Predefined.integerType)
    						 && (type2 == Predefined.integerType);
    	boolean realMode	=	(type1 == Predefined.realType)
    					     && (type2 == Predefined.realType);
    	
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
        
        return value; 
    }

    @Override 
    public Integer visitVariableExpr(BitVecParser.VariableExprContext ctx)
    {
        String variableName = ctx.variable().IDENTIFIER().toString();
        TypeSpec type = ctx.type;
        
        String typeIndicator = (type == Predefined.integerType) ? "I"
                             : (type == Predefined.realType)    ? "F"
                             :                                    "?";
        
        // Emit a field get instruction.
        jFile.println("\tgetstatic\t" + programName +
                      "/" + variableName + " " + typeIndicator);
        
        return visitChildren(ctx); 
    }
    
    @Override 
    public Integer visitSignedNumber(BitVecParser.SignedNumberContext ctx)
    {
        Integer value = visitChildren(ctx);         
        TypeSpec type = ctx.number().type;
        
        if (ctx.sign().getChild(0) == ctx.sign().SUB_OP()) {
            String opcode = (type == Predefined.integerType) ? "ineg"
                          : (type == Predefined.realType)    ? "fneg"
                          :                                    "?neg";
            
            // Emit a negate instruction.
            jFile.println("\t" + opcode);
        }
        
        return value;
    }

    @Override 
    public Integer visitIntegerConst(BitVecParser.IntegerConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }

    @Override 
    public Integer visitFloatConst(BitVecParser.FloatConstContext ctx)
    {
        // Emit a load constant instruction.
        jFile.println("\tldc\t" + ctx.getText());
        
        return visitChildren(ctx); 
    }
}