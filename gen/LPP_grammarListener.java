// Generated from D:/Universidad/Lenguajes/IntroANTLR/Lpp_Antlr/grammar/LPP_grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LPP_grammarParser}.
 */
public interface LPP_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LPP_grammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LPP_grammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(LPP_grammarParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(LPP_grammarParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void enterSubprograms(LPP_grammarParser.SubprogramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#subprograms}.
	 * @param ctx the parse tree
	 */
	void exitSubprograms(LPP_grammarParser.SubprogramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(LPP_grammarParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(LPP_grammarParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(LPP_grammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(LPP_grammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(LPP_grammarParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(LPP_grammarParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#singlePar}.
	 * @param ctx the parse tree
	 */
	void enterSinglePar(LPP_grammarParser.SingleParContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#singlePar}.
	 * @param ctx the parse tree
	 */
	void exitSinglePar(LPP_grammarParser.SingleParContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(LPP_grammarParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(LPP_grammarParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#singleVar}.
	 * @param ctx the parse tree
	 */
	void enterSingleVar(LPP_grammarParser.SingleVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#singleVar}.
	 * @param ctx the parse tree
	 */
	void exitSingleVar(LPP_grammarParser.SingleVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(LPP_grammarParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(LPP_grammarParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(LPP_grammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(LPP_grammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#intList}.
	 * @param ctx the parse tree
	 */
	void enterIntList(LPP_grammarParser.IntListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#intList}.
	 * @param ctx the parse tree
	 */
	void exitIntList(LPP_grammarParser.IntListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#mainCode}.
	 * @param ctx the parse tree
	 */
	void enterMainCode(LPP_grammarParser.MainCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#mainCode}.
	 * @param ctx the parse tree
	 */
	void exitMainCode(LPP_grammarParser.MainCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#subroutineCode}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineCode(LPP_grammarParser.SubroutineCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#subroutineCode}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineCode(LPP_grammarParser.SubroutineCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#simpleRoutine}.
	 * @param ctx the parse tree
	 */
	void enterSimpleRoutine(LPP_grammarParser.SimpleRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#simpleRoutine}.
	 * @param ctx the parse tree
	 */
	void exitSimpleRoutine(LPP_grammarParser.SimpleRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#sentences}.
	 * @param ctx the parse tree
	 */
	void enterSentences(LPP_grammarParser.SentencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#sentences}.
	 * @param ctx the parse tree
	 */
	void exitSentences(LPP_grammarParser.SentencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#singleSentence}.
	 * @param ctx the parse tree
	 */
	void enterSingleSentence(LPP_grammarParser.SingleSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#singleSentence}.
	 * @param ctx the parse tree
	 */
	void exitSingleSentence(LPP_grammarParser.SingleSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(LPP_grammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(LPP_grammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(LPP_grammarParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(LPP_grammarParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LPP_grammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LPP_grammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(LPP_grammarParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(LPP_grammarParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(LPP_grammarParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(LPP_grammarParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(LPP_grammarParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(LPP_grammarParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(LPP_grammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#switch}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(LPP_grammarParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#caseOpt}.
	 * @param ctx the parse tree
	 */
	void enterCaseOpt(LPP_grammarParser.CaseOptContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#caseOpt}.
	 * @param ctx the parse tree
	 */
	void exitCaseOpt(LPP_grammarParser.CaseOptContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(LPP_grammarParser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(LPP_grammarParser.DefaultCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LPP_grammarParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LPP_grammarParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(LPP_grammarParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(LPP_grammarParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(LPP_grammarParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(LPP_grammarParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(LPP_grammarParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(LPP_grammarParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(LPP_grammarParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(LPP_grammarParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LPP_grammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LPP_grammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LPP_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LPP_grammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LPP_grammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LPP_grammarParser.LiteralContext ctx);
}