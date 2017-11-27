// Generated from BitVec.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BitVecParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BitVecVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BitVecParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BitVecParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(BitVecParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#mainBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainBlock(BitVecParser.MainBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BitVecParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(BitVecParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#declList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclList(BitVecParser.DeclListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(BitVecParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(BitVecParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#varId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarId(BitVecParser.VarIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#typeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeId(BitVecParser.TypeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(BitVecParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(BitVecParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#stmtList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(BitVecParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStmt(BitVecParser.AssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(BitVecParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#dowhile_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_stat(BitVecParser.Dowhile_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(BitVecParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BitVecParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(BitVecParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(BitVecParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOpExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOpExpr(BitVecParser.RelOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsignedNumberExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsignedNumberExpr(BitVecParser.UnsignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivExpr(BitVecParser.MulDivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BitVecParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signedNumberExpr}
	 * labeled alternative in {@link BitVecParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberExpr(BitVecParser.SignedNumberExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#mulDivOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivOp(BitVecParser.MulDivOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#addSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubOp(BitVecParser.AddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#relOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOp(BitVecParser.RelOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#signedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(BitVecParser.SignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BitVecParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(BitVecParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerConst}
	 * labeled alternative in {@link BitVecParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConst(BitVecParser.IntegerConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code floatConst}
	 * labeled alternative in {@link BitVecParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConst(BitVecParser.FloatConstContext ctx);
}