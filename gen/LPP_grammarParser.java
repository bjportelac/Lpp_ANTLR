// Generated from D:/Universidad/Lenguajes/IntroANTLR/Lpp_Antlr/grammar/LPP_grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LPP_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Procedure=1, Boolean=2, Then=3, While=4, Register=5, Character=6, Write=7, 
		Function=8, Array=9, Return=10, String=11, Repeat=12, Call=13, Begin=14, 
		Integer=15, Until=16, Do=17, Double=18, Else=19, For=20, Case=21, Read=22, 
		End=23, Var=24, Of=25, If=26, ProcNewLine=27, PER=28, COM=29, COL=30, 
		OBRA=31, CBRA=32, OPAR=33, CPAR=34, ASG=35, GEQ=36, GRT=37, LEQ=38, LES=39, 
		NEQ=40, EQU=41, SUM=42, SUB=43, TMS=44, DIV=45, IDV=46, MOD=47, POW=48, 
		AND=49, OR=50, NOT=51, INT_VAL=52, DOUBLE_VAL=53, CHAR_VAL=54, STRING_VAL=55, 
		TRUE_VAL=56, FALSE_VAL=57, ID=58, NEWLINE=59, SPACE=60, SLC=61, MLC=62;
	public static final int
		RULE_program = 0, RULE_register = 1, RULE_subprograms = 2, RULE_procedure = 3, 
		RULE_function = 4, RULE_parameters = 5, RULE_singlePar = 6, RULE_variables = 7, 
		RULE_singleVar = 8, RULE_varType = 9, RULE_idList = 10, RULE_intList = 11, 
		RULE_mainCode = 12, RULE_subroutineCode = 13, RULE_programCode = 14, RULE_sentences = 15, 
		RULE_singleSentence = 16, RULE_read = 17, RULE_write = 18, RULE_assign = 19, 
		RULE_call = 20, RULE_if = 21, RULE_else = 22, RULE_switch = 23, RULE_caseOpt = 24, 
		RULE_defaultCase = 25, RULE_while = 26, RULE_for = 27, RULE_repeat = 28, 
		RULE_return = 29, RULE_exprList = 30, RULE_expr = 31, RULE_literal = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "register", "subprograms", "procedure", "function", "parameters", 
			"singlePar", "variables", "singleVar", "varType", "idList", "intList", 
			"mainCode", "subroutineCode", "programCode", "sentences", "singleSentence", 
			"read", "write", "assign", "call", "if", "else", "switch", "caseOpt", 
			"defaultCase", "while", "for", "repeat", "return", "exprList", "expr", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'.'", "','", "':'", "'['", "']'", "'('", "')'", 
			"'<-'", "'>='", "'>'", "'<='", "'<'", "'<>'", "'='", "'+'", "'-'", "'*'", 
			"'/'", null, null, "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Procedure", "Boolean", "Then", "While", "Register", "Character", 
			"Write", "Function", "Array", "Return", "String", "Repeat", "Call", "Begin", 
			"Integer", "Until", "Do", "Double", "Else", "For", "Case", "Read", "End", 
			"Var", "Of", "If", "ProcNewLine", "PER", "COM", "COL", "OBRA", "CBRA", 
			"OPAR", "CPAR", "ASG", "GEQ", "GRT", "LEQ", "LES", "NEQ", "EQU", "SUM", 
			"SUB", "TMS", "DIV", "IDV", "MOD", "POW", "AND", "OR", "NOT", "INT_VAL", 
			"DOUBLE_VAL", "CHAR_VAL", "STRING_VAL", "TRUE_VAL", "FALSE_VAL", "ID", 
			"NEWLINE", "SPACE", "SLC", "MLC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LPP_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LPP_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public MainCodeContext mainCode() {
			return getRuleContext(MainCodeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(66);
				match(NEWLINE);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Register) {
				{
				{
				setState(72);
				register();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			variables();
			setState(79);
			subprograms();
			setState(80);
			mainCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegisterContext extends ParserRuleContext {
		public List<TerminalNode> Register() { return getTokens(LPP_grammarParser.Register); }
		public TerminalNode Register(int i) {
			return getToken(LPP_grammarParser.Register, i);
		}
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(Register);
			setState(83);
			match(ID);
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				match(NEWLINE);
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(89);
			variables();
			setState(90);
			match(End);
			setState(91);
			match(Register);
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				match(NEWLINE);
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubprogramsContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public SubprogramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprograms; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSubprograms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramsContext subprograms() throws RecognitionException {
		SubprogramsContext _localctx = new SubprogramsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subprograms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Procedure || _la==Function) {
				{
				setState(99);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Procedure:
					{
					setState(97);
					procedure();
					}
					break;
				case Function:
					{
					setState(98);
					function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode Procedure() { return getToken(LPP_grammarParser.Procedure, 0); }
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SubroutineCodeContext subroutineCode() {
			return getRuleContext(SubroutineCodeContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(LPP_grammarParser.OPAR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(LPP_grammarParser.CPAR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(Procedure);
			setState(105);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(106);
				match(OPAR);
				setState(107);
				parameters();
				setState(108);
				match(CPAR);
				}
			}

			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				match(NEWLINE);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(117);
			variables();
			setState(118);
			subroutineCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(LPP_grammarParser.Function, 0); }
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public TerminalNode COL() { return getToken(LPP_grammarParser.COL, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SubroutineCodeContext subroutineCode() {
			return getRuleContext(SubroutineCodeContext.class,0);
		}
		public TerminalNode OPAR() { return getToken(LPP_grammarParser.OPAR, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(LPP_grammarParser.CPAR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(Function);
			setState(121);
			match(ID);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPAR) {
				{
				setState(122);
				match(OPAR);
				setState(123);
				parameters();
				setState(124);
				match(CPAR);
				}
			}

			setState(128);
			match(COL);
			setState(129);
			varType();
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(NEWLINE);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(135);
			variables();
			setState(136);
			subroutineCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<SingleParContext> singlePar() {
			return getRuleContexts(SingleParContext.class);
		}
		public SingleParContext singlePar(int i) {
			return getRuleContext(SingleParContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(LPP_grammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LPP_grammarParser.COM, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			singlePar();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(139);
				match(COM);
				setState(140);
				singlePar();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleParContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public TerminalNode Var() { return getToken(LPP_grammarParser.Var, 0); }
		public SingleParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singlePar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSinglePar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleParContext singlePar() throws RecognitionException {
		SingleParContext _localctx = new SingleParContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singlePar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var) {
				{
				setState(146);
				match(Var);
				}
			}

			setState(149);
			varType();
			setState(150);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<SingleVarContext> singleVar() {
			return getRuleContexts(SingleVarContext.class);
		}
		public SingleVarContext singleVar(int i) {
			return getRuleContext(SingleVarContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288230376152009284L) != 0)) {
				{
				{
				setState(152);
				singleVar();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleVarContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public SingleVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarContext singleVar() throws RecognitionException {
		SingleVarContext _localctx = new SingleVarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_singleVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			varType();
			setState(159);
			idList();
			setState(161); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(160);
				match(NEWLINE);
				}
				}
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(LPP_grammarParser.Integer, 0); }
		public TerminalNode Double() { return getToken(LPP_grammarParser.Double, 0); }
		public TerminalNode Boolean() { return getToken(LPP_grammarParser.Boolean, 0); }
		public TerminalNode Character() { return getToken(LPP_grammarParser.Character, 0); }
		public TerminalNode String() { return getToken(LPP_grammarParser.String, 0); }
		public TerminalNode OBRA() { return getToken(LPP_grammarParser.OBRA, 0); }
		public TerminalNode INT_VAL() { return getToken(LPP_grammarParser.INT_VAL, 0); }
		public TerminalNode CBRA() { return getToken(LPP_grammarParser.CBRA, 0); }
		public TerminalNode Array() { return getToken(LPP_grammarParser.Array, 0); }
		public IntListContext intList() {
			return getRuleContext(IntListContext.class,0);
		}
		public TerminalNode Of() { return getToken(LPP_grammarParser.Of, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varType);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(Integer);
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(Double);
				}
				break;
			case Boolean:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(Boolean);
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(Character);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(String);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBRA) {
					{
					setState(170);
					match(OBRA);
					setState(171);
					match(INT_VAL);
					setState(172);
					match(CBRA);
					}
				}

				}
				break;
			case Array:
				enterOuterAlt(_localctx, 6);
				{
				setState(175);
				match(Array);
				setState(176);
				match(OBRA);
				setState(177);
				intList();
				setState(178);
				match(CBRA);
				setState(179);
				match(Of);
				setState(180);
				varType();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LPP_grammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LPP_grammarParser.ID, i);
		}
		public List<TerminalNode> COM() { return getTokens(LPP_grammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LPP_grammarParser.COM, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(186);
				match(COM);
				setState(187);
				match(ID);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntListContext extends ParserRuleContext {
		public List<TerminalNode> INT_VAL() { return getTokens(LPP_grammarParser.INT_VAL); }
		public TerminalNode INT_VAL(int i) {
			return getToken(LPP_grammarParser.INT_VAL, i);
		}
		public List<TerminalNode> COM() { return getTokens(LPP_grammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LPP_grammarParser.COM, i);
		}
		public IntListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitIntList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntListContext intList() throws RecognitionException {
		IntListContext _localctx = new IntListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_intList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(INT_VAL);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(194);
				match(COM);
				setState(195);
				match(INT_VAL);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainCodeContext extends ParserRuleContext {
		public ProgramCodeContext programCode() {
			return getRuleContext(ProgramCodeContext.class,0);
		}
		public MainCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitMainCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainCodeContext mainCode() throws RecognitionException {
		MainCodeContext _localctx = new MainCodeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mainCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			programCode();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubroutineCodeContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LPP_grammarParser.Begin, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public SubroutineCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSubroutineCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineCodeContext subroutineCode() throws RecognitionException {
		SubroutineCodeContext _localctx = new SubroutineCodeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_subroutineCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(Begin);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(209);
			sentences();
			setState(210);
			match(End);
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(NEWLINE);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramCodeContext extends ParserRuleContext {
		public TerminalNode Begin() { return getToken(LPP_grammarParser.Begin, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public TerminalNode EOF() { return getToken(LPP_grammarParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ProgramCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programCode; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitProgramCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramCodeContext programCode() throws RecognitionException {
		ProgramCodeContext _localctx = new ProgramCodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_programCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Begin);
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NEWLINE);
				}
				}
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(222);
			sentences();
			setState(223);
			match(End);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(224);
				match(NEWLINE);
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentencesContext extends ParserRuleContext {
		public List<SingleSentenceContext> singleSentence() {
			return getRuleContexts(SingleSentenceContext.class);
		}
		public SingleSentenceContext singleSentence(int i) {
			return getRuleContext(SingleSentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sentences);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(232);
					singleSentence();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleSentenceContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public SingleSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleSentence; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSingleSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleSentenceContext singleSentence() throws RecognitionException {
		SingleSentenceContext _localctx = new SingleSentenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_singleSentence);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Read:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				read();
				}
				break;
			case Write:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				write();
				}
				break;
			case OPAR:
			case SUB:
			case NOT:
			case INT_VAL:
			case DOUBLE_VAL:
			case CHAR_VAL:
			case STRING_VAL:
			case TRUE_VAL:
			case FALSE_VAL:
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				assign();
				}
				break;
			case Call:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				call();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				if_();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				switch_();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				while_();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				for_();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				repeat();
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				return_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public TerminalNode Read() { return getToken(LPP_grammarParser.Read, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(Read);
			setState(251);
			exprList();
			setState(253); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(252);
				match(NEWLINE);
				}
				}
				setState(255); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WriteContext extends ParserRuleContext {
		public TerminalNode Write() { return getToken(LPP_grammarParser.Write, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_write);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(Write);
			setState(258);
			exprList();
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				match(NEWLINE);
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASG() { return getToken(LPP_grammarParser.ASG, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			expr(0);
			setState(265);
			match(ASG);
			setState(266);
			expr(0);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				match(NEWLINE);
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode Call() { return getToken(LPP_grammarParser.Call, 0); }
		public TerminalNode ProcNewLine() { return getToken(LPP_grammarParser.ProcNewLine, 0); }
		public TerminalNode OPAR() { return getToken(LPP_grammarParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(LPP_grammarParser.CPAR, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_call);
		int _la;
		try {
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(Call);
				setState(273);
				match(ProcNewLine);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPAR) {
					{
					setState(274);
					match(OPAR);
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574217757172695040L) != 0)) {
						{
						setState(275);
						exprList();
						}
					}

					setState(278);
					match(CPAR);
					}
				}

				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(281);
					match(NEWLINE);
					}
					}
					setState(284); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(Call);
				setState(287);
				match(ID);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPAR) {
					{
					setState(288);
					match(OPAR);
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574217757172695040L) != 0)) {
						{
						setState(289);
						exprList();
						}
					}

					setState(292);
					match(CPAR);
					}
				}

				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(295);
					match(NEWLINE);
					}
					}
					setState(298); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public List<TerminalNode> If() { return getTokens(LPP_grammarParser.If); }
		public TerminalNode If(int i) {
			return getToken(LPP_grammarParser.If, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Then() { return getToken(LPP_grammarParser.Then, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(If);
			setState(303);
			expr(0);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(304);
				match(NEWLINE);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(Then);
			setState(312); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(311);
				match(NEWLINE);
				}
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(316);
			sentences();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(317);
				else_();
				}
			}

			setState(320);
			match(End);
			setState(321);
			match(If);
			setState(323); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(322);
				match(NEWLINE);
				}
				}
				setState(325); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(LPP_grammarParser.Else, 0); }
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(Else);
				setState(328);
				if_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(Else);
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330);
					match(NEWLINE);
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(335);
				sentences();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public List<TerminalNode> Case() { return getTokens(LPP_grammarParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(LPP_grammarParser.Case, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public List<CaseOptContext> caseOpt() {
			return getRuleContexts(CaseOptContext.class);
		}
		public CaseOptContext caseOpt(int i) {
			return getRuleContext(CaseOptContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(Case);
			setState(339);
			expr(0);
			setState(341); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(NEWLINE);
				}
				}
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(346); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(345);
				caseOpt();
				}
				}
				setState(348); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 574217757172695040L) != 0) );
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(350);
				defaultCase();
				}
			}

			setState(353);
			match(End);
			setState(354);
			match(Case);
			setState(356); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(355);
				match(NEWLINE);
				}
				}
				setState(358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseOptContext extends ParserRuleContext {
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode COL() { return getToken(LPP_grammarParser.COL, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public CaseOptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseOpt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitCaseOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseOptContext caseOpt() throws RecognitionException {
		CaseOptContext _localctx = new CaseOptContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_caseOpt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			exprList();
			setState(361);
			match(COL);
			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				match(NEWLINE);
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(367);
			sentences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(LPP_grammarParser.Else, 0); }
		public TerminalNode COL() { return getToken(LPP_grammarParser.COL, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitDefaultCase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(Else);
			setState(370);
			match(COL);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(371);
				match(NEWLINE);
				}
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(377);
			sentences();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public List<TerminalNode> While() { return getTokens(LPP_grammarParser.While); }
		public TerminalNode While(int i) {
			return getToken(LPP_grammarParser.While, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Do() { return getToken(LPP_grammarParser.Do, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(While);
			setState(380);
			expr(0);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(381);
				match(NEWLINE);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
			match(Do);
			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				match(NEWLINE);
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(393);
			sentences();
			setState(394);
			match(End);
			setState(395);
			match(While);
			setState(397); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(396);
				match(NEWLINE);
				}
				}
				setState(399); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends ParserRuleContext {
		public List<TerminalNode> For() { return getTokens(LPP_grammarParser.For); }
		public TerminalNode For(int i) {
			return getToken(LPP_grammarParser.For, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASG() { return getToken(LPP_grammarParser.ASG, 0); }
		public TerminalNode Until() { return getToken(LPP_grammarParser.Until, 0); }
		public TerminalNode Do() { return getToken(LPP_grammarParser.Do, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode End() { return getToken(LPP_grammarParser.End, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(For);
			setState(402);
			expr(0);
			setState(403);
			match(ASG);
			setState(404);
			expr(0);
			setState(405);
			match(Until);
			setState(406);
			expr(0);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(407);
				match(NEWLINE);
				}
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(413);
			match(Do);
			setState(415); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(414);
				match(NEWLINE);
				}
				}
				setState(417); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(419);
			sentences();
			setState(420);
			match(End);
			setState(421);
			match(For);
			setState(423); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(422);
				match(NEWLINE);
				}
				}
				setState(425); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(LPP_grammarParser.Repeat, 0); }
		public SentencesContext sentences() {
			return getRuleContext(SentencesContext.class,0);
		}
		public TerminalNode Until() { return getToken(LPP_grammarParser.Until, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_repeat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(Repeat);
			setState(429); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(428);
				match(NEWLINE);
				}
				}
				setState(431); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(433);
			sentences();
			setState(434);
			match(Until);
			setState(435);
			expr(0);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(436);
				match(NEWLINE);
				}
				}
				setState(439); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(LPP_grammarParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(LPP_grammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LPP_grammarParser.NEWLINE, i);
		}
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Return);
			setState(442);
			expr(0);
			setState(444); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(443);
				match(NEWLINE);
				}
				}
				setState(446); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COM() { return getTokens(LPP_grammarParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(LPP_grammarParser.COM, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			expr(0);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(449);
				match(COM);
				setState(450);
				expr(0);
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode OPAR() { return getToken(LPP_grammarParser.OPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CPAR() { return getToken(LPP_grammarParser.CPAR, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(LPP_grammarParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode SUB() { return getToken(LPP_grammarParser.SUB, 0); }
		public TerminalNode NOT() { return getToken(LPP_grammarParser.NOT, 0); }
		public TerminalNode POW() { return getToken(LPP_grammarParser.POW, 0); }
		public TerminalNode SUM() { return getToken(LPP_grammarParser.SUM, 0); }
		public TerminalNode TMS() { return getToken(LPP_grammarParser.TMS, 0); }
		public TerminalNode DIV() { return getToken(LPP_grammarParser.DIV, 0); }
		public TerminalNode IDV() { return getToken(LPP_grammarParser.IDV, 0); }
		public TerminalNode MOD() { return getToken(LPP_grammarParser.MOD, 0); }
		public TerminalNode EQU() { return getToken(LPP_grammarParser.EQU, 0); }
		public TerminalNode NEQ() { return getToken(LPP_grammarParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(LPP_grammarParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(LPP_grammarParser.GEQ, 0); }
		public TerminalNode LES() { return getToken(LPP_grammarParser.LES, 0); }
		public TerminalNode GRT() { return getToken(LPP_grammarParser.GRT, 0); }
		public TerminalNode AND() { return getToken(LPP_grammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(LPP_grammarParser.OR, 0); }
		public TerminalNode PER() { return getToken(LPP_grammarParser.PER, 0); }
		public TerminalNode OBRA() { return getToken(LPP_grammarParser.OBRA, 0); }
		public TerminalNode CBRA() { return getToken(LPP_grammarParser.CBRA, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(457);
				match(OPAR);
				setState(458);
				expr(0);
				setState(459);
				match(CPAR);
				}
				break;
			case 2:
				{
				setState(461);
				literal();
				}
				break;
			case 3:
				{
				setState(462);
				match(ID);
				}
				break;
			case 4:
				{
				setState(463);
				match(ID);
				setState(464);
				match(OPAR);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574217757172695040L) != 0)) {
					{
					setState(465);
					exprList();
					}
				}

				setState(468);
				match(CPAR);
				}
				break;
			case 5:
				{
				setState(469);
				match(SUB);
				setState(470);
				expr(8);
				}
				break;
			case 6:
				{
				setState(471);
				match(NOT);
				setState(472);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(503);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(501);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(475);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(476);
						match(POW);
						setState(477);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(478);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(479);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(480);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(481);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(482);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(483);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(484);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(485);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034368L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(486);
						expr(5);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(487);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(488);
						match(AND);
						setState(489);
						expr(4);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						match(OR);
						setState(492);
						expr(3);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(493);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(494);
						match(PER);
						setState(495);
						match(ID);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(496);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(497);
						match(OBRA);
						setState(498);
						exprList();
						setState(499);
						match(CBRA);
						}
						break;
					}
					} 
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(LPP_grammarParser.INT_VAL, 0); }
		public TerminalNode DOUBLE_VAL() { return getToken(LPP_grammarParser.DOUBLE_VAL, 0); }
		public TerminalNode CHAR_VAL() { return getToken(LPP_grammarParser.CHAR_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(LPP_grammarParser.STRING_VAL, 0); }
		public TerminalNode TRUE_VAL() { return getToken(LPP_grammarParser.TRUE_VAL, 0); }
		public TerminalNode FALSE_VAL() { return getToken(LPP_grammarParser.FALSE_VAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPP_grammarVisitor ) return ((LPP_grammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_literal);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(INT_VAL);
				}
				break;
			case DOUBLE_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(DOUBLE_VAL);
				}
				break;
			case CHAR_VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(CHAR_VAL);
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(509);
				match(STRING_VAL);
				}
				break;
			case TRUE_VAL:
			case FALSE_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==TRUE_VAL || _la==FALSE_VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001>\u0202\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000"+
		"M\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001V\b\u0001\u000b\u0001\f\u0001W\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001^\b\u0001\u000b"+
		"\u0001\f\u0001_\u0001\u0002\u0001\u0002\u0005\u0002d\b\u0002\n\u0002\f"+
		"\u0002g\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003o\b\u0003\u0001\u0003\u0004\u0003r\b\u0003"+
		"\u000b\u0003\f\u0003s\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u007f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0084\b"+
		"\u0004\u000b\u0004\f\u0004\u0085\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008e\b\u0005\n\u0005\f\u0005"+
		"\u0091\t\u0005\u0001\u0006\u0003\u0006\u0094\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0005\u0007\u009a\b\u0007\n\u0007\f\u0007"+
		"\u009d\t\u0007\u0001\b\u0001\b\u0001\b\u0004\b\u00a2\b\b\u000b\b\f\b\u00a3"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ae\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00b8\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00bd\b\n\n\n\f\n"+
		"\u00c0\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c5\b\u000b"+
		"\n\u000b\f\u000b\u00c8\t\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0004\r"+
		"\u00ce\b\r\u000b\r\f\r\u00cf\u0001\r\u0001\r\u0001\r\u0004\r\u00d5\b\r"+
		"\u000b\r\f\r\u00d6\u0001\u000e\u0001\u000e\u0004\u000e\u00db\b\u000e\u000b"+
		"\u000e\f\u000e\u00dc\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00e2"+
		"\b\u000e\n\u000e\f\u000e\u00e5\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0005\u000f\u00ea\b\u000f\n\u000f\f\u000f\u00ed\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0004\u0011\u00fe\b\u0011\u000b\u0011\f\u0011\u00ff"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u0105\b\u0012\u000b\u0012"+
		"\f\u0012\u0106\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0004\u0013"+
		"\u010d\b\u0013\u000b\u0013\f\u0013\u010e\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0115\b\u0014\u0001\u0014\u0003\u0014\u0118"+
		"\b\u0014\u0001\u0014\u0004\u0014\u011b\b\u0014\u000b\u0014\f\u0014\u011c"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0123\b\u0014"+
		"\u0001\u0014\u0003\u0014\u0126\b\u0014\u0001\u0014\u0004\u0014\u0129\b"+
		"\u0014\u000b\u0014\f\u0014\u012a\u0003\u0014\u012d\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0132\b\u0015\n\u0015\f\u0015\u0135"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0139\b\u0015\u000b\u0015"+
		"\f\u0015\u013a\u0001\u0015\u0001\u0015\u0003\u0015\u013f\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u0144\b\u0015\u000b\u0015\f"+
		"\u0015\u0145\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016"+
		"\u014c\b\u0016\u000b\u0016\f\u0016\u014d\u0001\u0016\u0003\u0016\u0151"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017\u0156\b\u0017"+
		"\u000b\u0017\f\u0017\u0157\u0001\u0017\u0004\u0017\u015b\b\u0017\u000b"+
		"\u0017\f\u0017\u015c\u0001\u0017\u0003\u0017\u0160\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0004\u0017\u0165\b\u0017\u000b\u0017\f\u0017"+
		"\u0166\u0001\u0018\u0001\u0018\u0001\u0018\u0004\u0018\u016c\b\u0018\u000b"+
		"\u0018\f\u0018\u016d\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0175\b\u0019\n\u0019\f\u0019\u0178\t\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u017f\b\u001a"+
		"\n\u001a\f\u001a\u0182\t\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u0186"+
		"\b\u001a\u000b\u001a\f\u001a\u0187\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0004\u001a\u018e\b\u001a\u000b\u001a\f\u001a\u018f\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0199\b\u001b\n\u001b\f\u001b\u019c\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u01a0\b\u001b\u000b\u001b\f\u001b\u01a1\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0004\u001b\u01a8\b\u001b\u000b"+
		"\u001b\f\u001b\u01a9\u0001\u001c\u0001\u001c\u0004\u001c\u01ae\b\u001c"+
		"\u000b\u001c\f\u001c\u01af\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0004\u001c\u01b6\b\u001c\u000b\u001c\f\u001c\u01b7\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0004\u001d\u01bd\b\u001d\u000b\u001d\f\u001d\u01be"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01c4\b\u001e\n\u001e"+
		"\f\u001e\u01c7\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0003\u001f\u01d3\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01da\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f"+
		"\u01f6\b\u001f\n\u001f\f\u001f\u01f9\t\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0200\b \u0001 \u0000\u0001>!\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@\u0000\u0004\u0001\u0000*+\u0001\u0000,/\u0001\u0000$)\u0001"+
		"\u000089\u0237\u0000E\u0001\u0000\u0000\u0000\u0002R\u0001\u0000\u0000"+
		"\u0000\u0004e\u0001\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\b"+
		"x\u0001\u0000\u0000\u0000\n\u008a\u0001\u0000\u0000\u0000\f\u0093\u0001"+
		"\u0000\u0000\u0000\u000e\u009b\u0001\u0000\u0000\u0000\u0010\u009e\u0001"+
		"\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00b9\u0001"+
		"\u0000\u0000\u0000\u0016\u00c1\u0001\u0000\u0000\u0000\u0018\u00c9\u0001"+
		"\u0000\u0000\u0000\u001a\u00cb\u0001\u0000\u0000\u0000\u001c\u00d8\u0001"+
		"\u0000\u0000\u0000\u001e\u00eb\u0001\u0000\u0000\u0000 \u00f8\u0001\u0000"+
		"\u0000\u0000\"\u00fa\u0001\u0000\u0000\u0000$\u0101\u0001\u0000\u0000"+
		"\u0000&\u0108\u0001\u0000\u0000\u0000(\u012c\u0001\u0000\u0000\u0000*"+
		"\u012e\u0001\u0000\u0000\u0000,\u0150\u0001\u0000\u0000\u0000.\u0152\u0001"+
		"\u0000\u0000\u00000\u0168\u0001\u0000\u0000\u00002\u0171\u0001\u0000\u0000"+
		"\u00004\u017b\u0001\u0000\u0000\u00006\u0191\u0001\u0000\u0000\u00008"+
		"\u01ab\u0001\u0000\u0000\u0000:\u01b9\u0001\u0000\u0000\u0000<\u01c0\u0001"+
		"\u0000\u0000\u0000>\u01d9\u0001\u0000\u0000\u0000@\u01ff\u0001\u0000\u0000"+
		"\u0000BD\u0005;\u0000\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FK\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NO\u0003\u000e\u0007\u0000OP\u0003\u0004\u0002\u0000PQ\u0003\u0018"+
		"\f\u0000Q\u0001\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000SU\u0005"+
		":\u0000\u0000TV\u0005;\u0000\u0000UT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000YZ\u0003\u000e\u0007\u0000Z[\u0005\u0017\u0000\u0000"+
		"[]\u0005\u0005\u0000\u0000\\^\u0005;\u0000\u0000]\\\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`\u0003\u0001\u0000\u0000\u0000ad\u0003\u0006\u0003\u0000"+
		"bd\u0003\b\u0004\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000f\u0005\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005"+
		"\u0001\u0000\u0000in\u0005:\u0000\u0000jk\u0005!\u0000\u0000kl\u0003\n"+
		"\u0005\u0000lm\u0005\"\u0000\u0000mo\u0001\u0000\u0000\u0000nj\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pr\u0005"+
		";\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0003\u000e\u0007\u0000vw\u0003\u001a\r\u0000w\u0007\u0001\u0000\u0000"+
		"\u0000xy\u0005\b\u0000\u0000y~\u0005:\u0000\u0000z{\u0005!\u0000\u0000"+
		"{|\u0003\n\u0005\u0000|}\u0005\"\u0000\u0000}\u007f\u0001\u0000\u0000"+
		"\u0000~z\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u001e\u0000\u0000\u0081"+
		"\u0083\u0003\u0012\t\u0000\u0082\u0084\u0005;\u0000\u0000\u0083\u0082"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u000e\u0007\u0000\u0088\u0089"+
		"\u0003\u001a\r\u0000\u0089\t\u0001\u0000\u0000\u0000\u008a\u008f\u0003"+
		"\f\u0006\u0000\u008b\u008c\u0005\u001d\u0000\u0000\u008c\u008e\u0003\f"+
		"\u0006\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u000b\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0092\u0094\u0005\u0018\u0000\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097\u0005:\u0000"+
		"\u0000\u0097\r\u0001\u0000\u0000\u0000\u0098\u009a\u0003\u0010\b\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0003\u0012\t\u0000\u009f\u00a1\u0003\u0014\n\u0000\u00a0"+
		"\u00a2\u0005;\u0000\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a4\u0011\u0001\u0000\u0000\u0000\u00a5\u00b8"+
		"\u0005\u000f\u0000\u0000\u00a6\u00b8\u0005\u0012\u0000\u0000\u00a7\u00b8"+
		"\u0005\u0002\u0000\u0000\u00a8\u00b8\u0005\u0006\u0000\u0000\u00a9\u00ad"+
		"\u0005\u000b\u0000\u0000\u00aa\u00ab\u0005\u001f\u0000\u0000\u00ab\u00ac"+
		"\u00054\u0000\u0000\u00ac\u00ae\u0005 \u0000\u0000\u00ad\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b8\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b1\u0005\u001f\u0000"+
		"\u0000\u00b1\u00b2\u0003\u0016\u000b\u0000\u00b2\u00b3\u0005 \u0000\u0000"+
		"\u00b3\u00b4\u0005\u0019\u0000\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005:\u0000\u0000\u00b7\u00a5"+
		"\u0001\u0000\u0000\u0000\u00b7\u00a6\u0001\u0000\u0000\u0000\u00b7\u00a7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00a8\u0001\u0000\u0000\u0000\u00b7\u00a9"+
		"\u0001\u0000\u0000\u0000\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u0013\u0001\u0000\u0000\u0000\u00b9\u00be"+
		"\u0005:\u0000\u0000\u00ba\u00bb\u0005\u001d\u0000\u0000\u00bb\u00bd\u0005"+
		":\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000"+
		"\u0000\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c6\u00054\u0000\u0000\u00c2\u00c3\u0005\u001d\u0000"+
		"\u0000\u00c3\u00c5\u00054\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u0017\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u001c\u000e\u0000"+
		"\u00ca\u0019\u0001\u0000\u0000\u0000\u00cb\u00cd\u0005\u000e\u0000\u0000"+
		"\u00cc\u00ce\u0005;\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0003\u001e\u000f\u0000\u00d2\u00d4\u0005\u0017\u0000\u0000\u00d3"+
		"\u00d5\u0005;\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8\u00da"+
		"\u0005\u000e\u0000\u0000\u00d9\u00db\u0005;\u0000\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0003\u001e\u000f\u0000\u00df\u00e3\u0005"+
		"\u0017\u0000\u0000\u00e0\u00e2\u0005;\u0000\u0000\u00e1\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0000"+
		"\u0000\u0001\u00e7\u001d\u0001\u0000\u0000\u0000\u00e8\u00ea\u0003 \u0010"+
		"\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u001f\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f9\u0003\"\u0011\u0000\u00ef\u00f9\u0003$\u0012\u0000"+
		"\u00f0\u00f9\u0003&\u0013\u0000\u00f1\u00f9\u0003(\u0014\u0000\u00f2\u00f9"+
		"\u0003*\u0015\u0000\u00f3\u00f9\u0003.\u0017\u0000\u00f4\u00f9\u00034"+
		"\u001a\u0000\u00f5\u00f9\u00036\u001b\u0000\u00f6\u00f9\u00038\u001c\u0000"+
		"\u00f7\u00f9\u0003:\u001d\u0000\u00f8\u00ee\u0001\u0000\u0000\u0000\u00f8"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f8\u00f2\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9!\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0016\u0000\u0000\u00fb\u00fd\u0003<\u001e\u0000\u00fc\u00fe\u0005"+
		";\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000"+
		"\u0000\u0000\u0100#\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0007\u0000"+
		"\u0000\u0102\u0104\u0003<\u001e\u0000\u0103\u0105\u0005;\u0000\u0000\u0104"+
		"\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107"+
		"%\u0001\u0000\u0000\u0000\u0108\u0109\u0003>\u001f\u0000\u0109\u010a\u0005"+
		"#\u0000\u0000\u010a\u010c\u0003>\u001f\u0000\u010b\u010d\u0005;\u0000"+
		"\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000"+
		"\u0000\u010f\'\u0001\u0000\u0000\u0000\u0110\u0111\u0005\r\u0000\u0000"+
		"\u0111\u0117\u0005\u001b\u0000\u0000\u0112\u0114\u0005!\u0000\u0000\u0113"+
		"\u0115\u0003<\u001e\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0118"+
		"\u0005\"\u0000\u0000\u0117\u0112\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u011b\u0005"+
		";\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000"+
		"\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000"+
		"\u0000\u0000\u011d\u012d\u0001\u0000\u0000\u0000\u011e\u011f\u0005\r\u0000"+
		"\u0000\u011f\u0125\u0005:\u0000\u0000\u0120\u0122\u0005!\u0000\u0000\u0121"+
		"\u0123\u0003<\u001e\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0005\"\u0000\u0000\u0125\u0120\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0129\u0005"+
		";\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000"+
		"\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u0110\u0001\u0000"+
		"\u0000\u0000\u012c\u011e\u0001\u0000\u0000\u0000\u012d)\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0005\u001a\u0000\u0000\u012f\u0133\u0003>\u001f\u0000"+
		"\u0130\u0132\u0005;\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0136\u0138\u0005\u0003\u0000\u0000\u0137"+
		"\u0139\u0005;\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0003\u001e\u000f\u0000\u013d\u013f\u0003,\u0016\u0000\u013e\u013d\u0001"+
		"\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0005\u0017\u0000\u0000\u0141\u0143\u0005"+
		"\u001a\u0000\u0000\u0142\u0144\u0005;\u0000\u0000\u0143\u0142\u0001\u0000"+
		"\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146+\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u0013\u0000\u0000\u0148\u0151\u0003*\u0015\u0000"+
		"\u0149\u014b\u0005\u0013\u0000\u0000\u014a\u014c\u0005;\u0000\u0000\u014b"+
		"\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014b\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e"+
		"\u014f\u0001\u0000\u0000\u0000\u014f\u0151\u0003\u001e\u000f\u0000\u0150"+
		"\u0147\u0001\u0000\u0000\u0000\u0150\u0149\u0001\u0000\u0000\u0000\u0151"+
		"-\u0001\u0000\u0000\u0000\u0152\u0153\u0005\u0015\u0000\u0000\u0153\u0155"+
		"\u0003>\u001f\u0000\u0154\u0156\u0005;\u0000\u0000\u0155\u0154\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000"+
		"\u0000\u0000\u0159\u015b\u00030\u0018\u0000\u015a\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000"+
		"\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u00032\u0019\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0005\u0017\u0000\u0000\u0162\u0164\u0005\u0015\u0000\u0000"+
		"\u0163\u0165\u0005;\u0000\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0001\u0000\u0000\u0000\u0167/\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0003<\u001e\u0000\u0169\u016b\u0005\u001e\u0000\u0000\u016a\u016c\u0005"+
		";\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0003\u001e"+
		"\u000f\u0000\u01701\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u0013\u0000"+
		"\u0000\u0172\u0176\u0005\u001e\u0000\u0000\u0173\u0175\u0005;\u0000\u0000"+
		"\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000"+
		"\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001\u0000\u0000\u0000"+
		"\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0003\u001e\u000f\u0000\u017a3\u0001\u0000\u0000\u0000\u017b"+
		"\u017c\u0005\u0004\u0000\u0000\u017c\u0180\u0003>\u001f\u0000\u017d\u017f"+
		"\u0005;\u0000\u0000\u017e\u017d\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0005\u0011\u0000\u0000\u0184\u0186\u0005"+
		";\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000"+
		"\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018a\u0003\u001e"+
		"\u000f\u0000\u018a\u018b\u0005\u0017\u0000\u0000\u018b\u018d\u0005\u0004"+
		"\u0000\u0000\u018c\u018e\u0005;\u0000\u0000\u018d\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u01905\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0005\u0014\u0000\u0000\u0192\u0193\u0003>\u001f\u0000\u0193"+
		"\u0194\u0005#\u0000\u0000\u0194\u0195\u0003>\u001f\u0000\u0195\u0196\u0005"+
		"\u0010\u0000\u0000\u0196\u019a\u0003>\u001f\u0000\u0197\u0199\u0005;\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000\u0000"+
		"\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000"+
		"\u0000\u019d\u019f\u0005\u0011\u0000\u0000\u019e\u01a0\u0005;\u0000\u0000"+
		"\u019f\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0003\u001e\u000f\u0000"+
		"\u01a4\u01a5\u0005\u0017\u0000\u0000\u01a5\u01a7\u0005\u0014\u0000\u0000"+
		"\u01a6\u01a8\u0005;\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0001\u0000\u0000\u0000\u01aa7\u0001\u0000\u0000\u0000\u01ab\u01ad"+
		"\u0005\f\u0000\u0000\u01ac\u01ae\u0005;\u0000\u0000\u01ad\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01ad\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0003\u001e\u000f\u0000\u01b2\u01b3\u0005"+
		"\u0010\u0000\u0000\u01b3\u01b5\u0003>\u001f\u0000\u01b4\u01b6\u0005;\u0000"+
		"\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b89\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\n\u0000\u0000"+
		"\u01ba\u01bc\u0003>\u001f\u0000\u01bb\u01bd\u0005;\u0000\u0000\u01bc\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01bc"+
		"\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf;\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c5\u0003>\u001f\u0000\u01c1\u01c2\u0005\u001d"+
		"\u0000\u0000\u01c2\u01c4\u0003>\u001f\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6=\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9\u0006\u001f\uffff\uffff"+
		"\u0000\u01c9\u01ca\u0005!\u0000\u0000\u01ca\u01cb\u0003>\u001f\u0000\u01cb"+
		"\u01cc\u0005\"\u0000\u0000\u01cc\u01da\u0001\u0000\u0000\u0000\u01cd\u01da"+
		"\u0003@ \u0000\u01ce\u01da\u0005:\u0000\u0000\u01cf\u01d0\u0005:\u0000"+
		"\u0000\u01d0\u01d2\u0005!\u0000\u0000\u01d1\u01d3\u0003<\u001e\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d4\u01da\u0005\"\u0000\u0000\u01d5\u01d6"+
		"\u0005+\u0000\u0000\u01d6\u01da\u0003>\u001f\b\u01d7\u01d8\u00053\u0000"+
		"\u0000\u01d8\u01da\u0003>\u001f\u0001\u01d9\u01c8\u0001\u0000\u0000\u0000"+
		"\u01d9\u01cd\u0001\u0000\u0000\u0000\u01d9\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d9\u01cf\u0001\u0000\u0000\u0000\u01d9\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01f7\u0001\u0000\u0000\u0000"+
		"\u01db\u01dc\n\u0007\u0000\u0000\u01dc\u01dd\u00050\u0000\u0000\u01dd"+
		"\u01f6\u0003>\u001f\b\u01de\u01df\n\u0006\u0000\u0000\u01df\u01e0\u0007"+
		"\u0000\u0000\u0000\u01e0\u01f6\u0003>\u001f\u0007\u01e1\u01e2\n\u0005"+
		"\u0000\u0000\u01e2\u01e3\u0007\u0001\u0000\u0000\u01e3\u01f6\u0003>\u001f"+
		"\u0006\u01e4\u01e5\n\u0004\u0000\u0000\u01e5\u01e6\u0007\u0002\u0000\u0000"+
		"\u01e6\u01f6\u0003>\u001f\u0005\u01e7\u01e8\n\u0003\u0000\u0000\u01e8"+
		"\u01e9\u00051\u0000\u0000\u01e9\u01f6\u0003>\u001f\u0004\u01ea\u01eb\n"+
		"\u0002\u0000\u0000\u01eb\u01ec\u00052\u0000\u0000\u01ec\u01f6\u0003>\u001f"+
		"\u0003\u01ed\u01ee\n\u000b\u0000\u0000\u01ee\u01ef\u0005\u001c\u0000\u0000"+
		"\u01ef\u01f6\u0005:\u0000\u0000\u01f0\u01f1\n\n\u0000\u0000\u01f1\u01f2"+
		"\u0005\u001f\u0000\u0000\u01f2\u01f3\u0003<\u001e\u0000\u01f3\u01f4\u0005"+
		" \u0000\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01db\u0001\u0000"+
		"\u0000\u0000\u01f5\u01de\u0001\u0000\u0000\u0000\u01f5\u01e1\u0001\u0000"+
		"\u0000\u0000\u01f5\u01e4\u0001\u0000\u0000\u0000\u01f5\u01e7\u0001\u0000"+
		"\u0000\u0000\u01f5\u01ea\u0001\u0000\u0000\u0000\u01f5\u01ed\u0001\u0000"+
		"\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000\u0000\u01f6\u01f9\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f8?\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01fa\u0200\u00054\u0000\u0000\u01fb\u0200\u00055\u0000\u0000\u01fc"+
		"\u0200\u00056\u0000\u0000\u01fd\u0200\u00057\u0000\u0000\u01fe\u0200\u0007"+
		"\u0003\u0000\u0000\u01ff\u01fa\u0001\u0000\u0000\u0000\u01ff\u01fb\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200A\u0001\u0000"+
		"\u0000\u0000=EKW_cens~\u0085\u008f\u0093\u009b\u00a3\u00ad\u00b7\u00be"+
		"\u00c6\u00cf\u00d6\u00dc\u00e3\u00eb\u00f8\u00ff\u0106\u010e\u0114\u0117"+
		"\u011c\u0122\u0125\u012a\u012c\u0133\u013a\u013e\u0145\u014d\u0150\u0157"+
		"\u015c\u015f\u0166\u016d\u0176\u0180\u0187\u018f\u019a\u01a1\u01a9\u01af"+
		"\u01b7\u01be\u01c5\u01d2\u01d9\u01f5\u01f7\u01ff";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}