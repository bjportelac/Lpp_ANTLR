// Generated from D:/Universidad/Lenguajes/IntroANTLR/Lpp_Antlr/grammar/LPP_grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LPP_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LPP_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LPP_grammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(LPP_grammarParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#subprograms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprograms(LPP_grammarParser.SubprogramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(LPP_grammarParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(LPP_grammarParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(LPP_grammarParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#singlePar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglePar(LPP_grammarParser.SingleParContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(LPP_grammarParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#singleVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleVar(LPP_grammarParser.SingleVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(LPP_grammarParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(LPP_grammarParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#intList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntList(LPP_grammarParser.IntListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#mainCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainCode(LPP_grammarParser.MainCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#subroutineCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineCode(LPP_grammarParser.SubroutineCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#programCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramCode(LPP_grammarParser.ProgramCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#sentences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentences(LPP_grammarParser.SentencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#singleSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSentence(LPP_grammarParser.SingleSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LPP_grammarParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(LPP_grammarParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LPP_grammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(LPP_grammarParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(LPP_grammarParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(LPP_grammarParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(LPP_grammarParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#caseOpt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseOpt(LPP_grammarParser.CaseOptContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(LPP_grammarParser.DefaultCaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LPP_grammarParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LPP_grammarParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(LPP_grammarParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(LPP_grammarParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(LPP_grammarParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LPP_grammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LPP_grammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(LPP_grammarParser.LiteralContext ctx);
}