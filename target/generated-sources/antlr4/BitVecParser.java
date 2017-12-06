// Generated from BitVec.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BitVecParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PROGRAM=11, VAR=12, LOCALS=13, FUNCTION=14, OBRACK=15, CBRACK=16, 
		IF=17, THEN=18, ELSE=19, DO=20, WHILE=21, RETURN=22, MATCH=23, WITH=24, 
		STRING=25, BOOL=26, IDENTIFIER=27, INTEGER=28, FLOAT=29, MUL_OP=30, DIV_OP=31, 
		ADD_OP=32, SUB_OP=33, EQ=34, NE=35, LT=36, GT=37, NEWLINE=38, WS=39;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_funcdeclarations = 4, RULE_declarations = 5, RULE_localDeclarations = 6, 
		RULE_declList = 7, RULE_decl = 8, RULE_varList = 9, RULE_varId = 10, RULE_typeId = 11, 
		RULE_formalParmList = 12, RULE_formalParm = 13, RULE_compoundStmt = 14, 
		RULE_stmt = 15, RULE_stmtList = 16, RULE_assignmentStmt = 17, RULE_if_stat = 18, 
		RULE_match_stat = 19, RULE_dowhile_stat = 20, RULE_while_stat = 21, RULE_print_stat = 22, 
		RULE_println_stat = 23, RULE_return_stat = 24, RULE_variable = 25, RULE_expr = 26, 
		RULE_mulDivOp = 27, RULE_addSubOp = 28, RULE_relOp = 29, RULE_signedNumber = 30, 
		RULE_sign = 31, RULE_number = 32, RULE_function_call = 33;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "funcdeclarations", "declarations", 
		"localDeclarations", "declList", "decl", "varList", "varId", "typeId", 
		"formalParmList", "formalParm", "compoundStmt", "stmt", "stmtList", "assignmentStmt", 
		"if_stat", "match_stat", "dowhile_stat", "while_stat", "print_stat", "println_stat", 
		"return_stat", "variable", "expr", "mulDivOp", "addSubOp", "relOp", "signedNumber", 
		"sign", "number", "function_call"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'('", "')'", "':'", "','", "'&'", "':='", "'print'", 
		"'println'", "'PROGRAM'", "'VARIABLES'", "'LOCALS'", "'FUNCTION'", "'{'", 
		"'}'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'WHILE'", "'RETURN'", "'MATCH'", 
		"'WITH'", null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'=='", 
		"'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "LOCALS", "FUNCTION", "OBRACK", "CBRACK", "IF", "THEN", "ELSE", 
		"DO", "WHILE", "RETURN", "MATCH", "WITH", "STRING", "BOOL", "IDENTIFIER", 
		"INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQ", "NE", 
		"LT", "GT", "NEWLINE", "WS"
	};
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
	public String getGrammarFileName() { return "BitVec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BitVecParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			header();
			setState(69);
			mainBlock();
			setState(70);
			match(T__0);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(BitVecParser.PROGRAM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(PROGRAM);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(T__1);
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

	public static class MainBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitMainBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public List<DeclarationsContext> declarations() {
			return getRuleContexts(DeclarationsContext.class);
		}
		public DeclarationsContext declarations(int i) {
			return getRuleContext(DeclarationsContext.class,i);
		}
		public List<FuncdeclarationsContext> funcdeclarations() {
			return getRuleContexts(FuncdeclarationsContext.class);
		}
		public FuncdeclarationsContext funcdeclarations(int i) {
			return getRuleContext(FuncdeclarationsContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==LOCALS) {
				{
				{
				setState(78);
				declarations();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(84);
				funcdeclarations();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			compoundStmt();
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

	public static class FuncdeclarationsContext extends ParserRuleContext {
		public FuncdeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdeclarations; }
	 
		public FuncdeclarationsContext() { }
		public void copyFrom(FuncdeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionDeclarContext extends FuncdeclarationsContext {
		public TerminalNode FUNCTION() { return getToken(BitVecParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FormalParmListContext> formalParmList() {
			return getRuleContexts(FormalParmListContext.class);
		}
		public FormalParmListContext formalParmList(int i) {
			return getRuleContext(FormalParmListContext.class,i);
		}
		public FunctionDeclarContext(FuncdeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitFunctionDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdeclarationsContext funcdeclarations() throws RecognitionException {
		FuncdeclarationsContext _localctx = new FuncdeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcdeclarations);
		int _la;
		try {
			_localctx = new FunctionDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(FUNCTION);
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(T__2);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==IDENTIFIER) {
				{
				{
				setState(95);
				formalParmList();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__3);
			setState(102);
			match(T__4);
			setState(103);
			typeId();
			setState(104);
			match(T__1);
			setState(105);
			block();
			setState(106);
			match(T__1);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	 
		public DeclarationsContext() { }
		public void copyFrom(DeclarationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocalDeclarContext extends DeclarationsContext {
		public LocalDeclarationsContext localDeclarations() {
			return getRuleContext(LocalDeclarationsContext.class,0);
		}
		public LocalDeclarContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitLocalDeclar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarContext extends DeclarationsContext {
		public TerminalNode VAR() { return getToken(BitVecParser.VAR, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public VarDeclarContext(DeclarationsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitVarDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarations);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new VarDeclarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(VAR);
				setState(109);
				declList();
				setState(110);
				match(T__1);
				}
				break;
			case LOCALS:
				_localctx = new LocalDeclarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				localDeclarations();
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

	public static class LocalDeclarationsContext extends ParserRuleContext {
		public Integer slot = -1;
		public TerminalNode LOCALS() { return getToken(BitVecParser.LOCALS, 0); }
		public DeclListContext declList() {
			return getRuleContext(DeclListContext.class,0);
		}
		public LocalDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localDeclarations; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitLocalDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalDeclarationsContext localDeclarations() throws RecognitionException {
		LocalDeclarationsContext _localctx = new LocalDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_localDeclarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(LOCALS);
			setState(116);
			declList();
			setState(117);
			match(T__1);
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

	public static class DeclListContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclListContext declList() throws RecognitionException {
		DeclListContext _localctx = new DeclListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			decl();
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					match(T__1);
					setState(121);
					decl();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class DeclContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			varList();
			setState(128);
			match(T__4);
			setState(129);
			typeId();
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

	public static class VarListContext extends ParserRuleContext {
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		VarListContext _localctx = new VarListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			varId();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(132);
				match(T__5);
				setState(133);
				varId();
				}
				}
				setState(138);
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

	public static class VarIdContext extends ParserRuleContext {
		public String type = null;
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
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

	public static class TypeIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public TypeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeId; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitTypeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIdContext typeId() throws RecognitionException {
		TypeIdContext _localctx = new TypeIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFIER);
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

	public static class FormalParmListContext extends ParserRuleContext {
		public List<FormalParmContext> formalParm() {
			return getRuleContexts(FormalParmContext.class);
		}
		public FormalParmContext formalParm(int i) {
			return getRuleContext(FormalParmContext.class,i);
		}
		public FormalParmListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParmList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitFormalParmList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParmListContext formalParmList() throws RecognitionException {
		FormalParmListContext _localctx = new FormalParmListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_formalParmList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			formalParm();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(144);
				match(T__5);
				setState(145);
				formalParm();
				}
				}
				setState(150);
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

	public static class FormalParmContext extends ParserRuleContext {
		public TypeSpec type = null;
		public FormalParmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParm; }
	 
		public FormalParmContext() { }
		public void copyFrom(FormalParmContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class ValueParmContext extends FormalParmContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public ValueParmContext(FormalParmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitValueParm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefParmContext extends FormalParmContext {
		public VarIdContext varId() {
			return getRuleContext(VarIdContext.class,0);
		}
		public TypeIdContext typeId() {
			return getRuleContext(TypeIdContext.class,0);
		}
		public RefParmContext(FormalParmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitRefParm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParmContext formalParm() throws RecognitionException {
		FormalParmContext _localctx = new FormalParmContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formalParm);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ValueParmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				varId();
				setState(152);
				match(T__4);
				setState(153);
				typeId();
				}
				break;
			case T__6:
				_localctx = new RefParmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__6);
				setState(156);
				varId();
				setState(157);
				match(T__4);
				setState(158);
				typeId();
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

	public static class CompoundStmtContext extends ParserRuleContext {
		public TerminalNode OBRACK() { return getToken(BitVecParser.OBRACK, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode CBRACK() { return getToken(BitVecParser.CBRACK, 0); }
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(OBRACK);
			setState(163);
			stmtList();
			setState(164);
			match(CBRACK);
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

	public static class StmtContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public Match_statContext match_stat() {
			return getRuleContext(Match_statContext.class,0);
		}
		public Dowhile_statContext dowhile_stat() {
			return getRuleContext(Dowhile_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Print_statContext print_stat() {
			return getRuleContext(Print_statContext.class,0);
		}
		public Println_statContext println_stat() {
			return getRuleContext(Println_statContext.class,0);
		}
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				dowhile_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				print_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				println_stat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(174);
				return_stat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
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

	public static class StmtListContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitStmtList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			stmt();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(179);
				match(T__1);
				setState(180);
				stmt();
				}
				}
				setState(185);
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

	public static class AssignmentStmtContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			variable();
			setState(187);
			match(T__7);
			setState(188);
			expr(0);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BitVecParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(BitVecParser.THEN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(BitVecParser.ELSE, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(IF);
			setState(191);
			expr(0);
			setState(192);
			match(THEN);
			setState(193);
			stmt();
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(194);
				match(ELSE);
				setState(195);
				stmt();
				}
				break;
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

	public static class Match_statContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(BitVecParser.MATCH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WITH() { return getToken(BitVecParser.WITH, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Match_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitMatch_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_statContext match_stat() throws RecognitionException {
		Match_statContext _localctx = new Match_statContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_match_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(MATCH);
			setState(199);
			expr(0);
			setState(200);
			match(WITH);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					number();
					setState(202);
					match(T__4);
					setState(203);
					stmt();
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Dowhile_statContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(BitVecParser.DO, 0); }
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(BitVecParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Dowhile_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitDowhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_statContext dowhile_stat() throws RecognitionException {
		Dowhile_statContext _localctx = new Dowhile_statContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dowhile_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(DO);
			setState(211);
			stmtList();
			setState(212);
			match(WHILE);
			setState(213);
			expr(0);
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(BitVecParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(BitVecParser.DO, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(WHILE);
			setState(216);
			expr(0);
			setState(217);
			match(DO);
			setState(218);
			stmt();
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

	public static class Print_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Print_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitPrint_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statContext print_stat() throws RecognitionException {
		Print_statContext _localctx = new Print_statContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__8);
			setState(221);
			match(T__2);
			setState(222);
			expr(0);
			setState(223);
			match(T__3);
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

	public static class Println_statContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Println_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitPrintln_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Println_statContext println_stat() throws RecognitionException {
		Println_statContext _localctx = new Println_statContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_println_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__9);
			setState(226);
			match(T__2);
			setState(227);
			expr(0);
			setState(228);
			match(T__3);
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

	public static class Return_statContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BitVecParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitReturn_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statContext return_stat() throws RecognitionException {
		Return_statContext _localctx = new Return_statContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(RETURN);
			setState(231);
			expr(0);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(IDENTIFIER);
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

	public static class ExprContext extends ParserRuleContext {
		public TypeSpec type = null;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class StringExprContext extends ExprContext {
		public TerminalNode STRING() { return getToken(BitVecParser.STRING, 0); }
		public StringExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitStringExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableExprContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctioncallExprContext extends ExprContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctioncallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitFunctioncallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubOpContext addSubOp() {
			return getRuleContext(AddSubOpContext.class,0);
		}
		public AddSubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelOpExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public RelOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitRelOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanExprContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(BitVecParser.BOOL, 0); }
		public BooleanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitBooleanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsignedNumberExprContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UnsignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitUnsignedNumberExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivOpContext mulDivOp() {
			return getRuleContext(MulDivOpContext.class,0);
		}
		public MulDivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitMulDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedNumberExprContext extends ExprContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitSignedNumberExpr(this);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new UnsignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(236);
				number();
				}
				break;
			case 2:
				{
				_localctx = new SignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				signedNumber();
				}
				break;
			case 3:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				variable();
				}
				break;
			case 4:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				match(T__2);
				setState(240);
				expr(0);
				setState(241);
				match(T__3);
				}
				break;
			case 5:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new BooleanExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new FunctioncallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(249);
						mulDivOp();
						setState(250);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(252);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(253);
						addSubOp();
						setState(254);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new RelOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(256);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(257);
						relOp();
						setState(258);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class MulDivOpContext extends ParserRuleContext {
		public TerminalNode MUL_OP() { return getToken(BitVecParser.MUL_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(BitVecParser.DIV_OP, 0); }
		public MulDivOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulDivOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitMulDivOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulDivOpContext mulDivOp() throws RecognitionException {
		MulDivOpContext _localctx = new MulDivOpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==MUL_OP || _la==DIV_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AddSubOpContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(BitVecParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BitVecParser.SUB_OP, 0); }
		public AddSubOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitAddSubOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubOpContext addSubOp() throws RecognitionException {
		AddSubOpContext _localctx = new AddSubOpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(BitVecParser.EQ, 0); }
		public TerminalNode NE() { return getToken(BitVecParser.NE, 0); }
		public TerminalNode LT() { return getToken(BitVecParser.LT, 0); }
		public TerminalNode GT() { return getToken(BitVecParser.GT, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LT) | (1L << GT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SignedNumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_signedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			sign();
			setState(272);
			number();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode ADD_OP() { return getToken(BitVecParser.ADD_OP, 0); }
		public TerminalNode SUB_OP() { return getToken(BitVecParser.SUB_OP, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==ADD_OP || _la==SUB_OP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public TypeSpec type = null;
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
			this.type = ctx.type;
		}
	}
	public static class FloatConstContext extends NumberContext {
		public TerminalNode FLOAT() { return getToken(BitVecParser.FLOAT, 0); }
		public FloatConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitFloatConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends NumberContext {
		public TerminalNode INTEGER() { return getToken(BitVecParser.INTEGER, 0); }
		public IntegerConstContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_number);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(FLOAT);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(BitVecParser.IDENTIFIER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BitVecVisitor ) return ((BitVecVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IDENTIFIER);
			setState(281);
			match(T__2);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << STRING) | (1L << BOOL) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				{
				setState(282);
				expr(0);
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(288);
				match(T__5);
				setState(289);
				expr(0);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(T__3);
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
		case 26:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u012c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5R\n\5"+
		"\f\5\16\5U\13\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\7\16\u0095\n\16\f\16\16\16\u0098\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b3\n\21"+
		"\3\22\3\22\3\22\7\22\u00b8\n\22\f\22\16\22\u00bb\13\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c7\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u00d0\n\25\f\25\16\25\u00d3\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u00f9\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0107\n\34\f\34\16\34\u010a\13\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\5\"\u0119\n\"\3"+
		"#\3#\3#\7#\u011e\n#\f#\16#\u0121\13#\3#\3#\7#\u0125\n#\f#\16#\u0128\13"+
		"#\3#\3#\3#\2\3\66$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BD\2\5\3\2 !\3\2\"#\3\2$\'\2\u0129\2F\3\2\2\2\4J\3\2\2\2"+
		"\6N\3\2\2\2\bS\3\2\2\2\n^\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20y\3\2\2\2\22"+
		"\u0081\3\2\2\2\24\u0085\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2\2\32\u0091"+
		"\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3\2\2\2 \u00b2\3\2\2\2\"\u00b4\3\2"+
		"\2\2$\u00bc\3\2\2\2&\u00c0\3\2\2\2(\u00c8\3\2\2\2*\u00d4\3\2\2\2,\u00d9"+
		"\3\2\2\2.\u00de\3\2\2\2\60\u00e3\3\2\2\2\62\u00e8\3\2\2\2\64\u00eb\3\2"+
		"\2\2\66\u00f8\3\2\2\28\u010b\3\2\2\2:\u010d\3\2\2\2<\u010f\3\2\2\2>\u0111"+
		"\3\2\2\2@\u0114\3\2\2\2B\u0118\3\2\2\2D\u011a\3\2\2\2FG\5\4\3\2GH\5\6"+
		"\4\2HI\7\3\2\2I\3\3\2\2\2JK\7\r\2\2KL\7\35\2\2LM\7\4\2\2M\5\3\2\2\2NO"+
		"\5\b\5\2O\7\3\2\2\2PR\5\f\7\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TY\3\2\2\2US\3\2\2\2VX\5\n\6\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2"+
		"Z\\\3\2\2\2[Y\3\2\2\2\\]\5\36\20\2]\t\3\2\2\2^_\7\20\2\2_`\7\35\2\2`d"+
		"\7\5\2\2ac\5\32\16\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fd\3\2\2\2gh\7\6\2\2hi\7\7\2\2ij\5\30\r\2jk\7\4\2\2kl\5\b\5\2lm\7\4\2"+
		"\2m\13\3\2\2\2no\7\16\2\2op\5\20\t\2pq\7\4\2\2qt\3\2\2\2rt\5\16\b\2sn"+
		"\3\2\2\2sr\3\2\2\2t\r\3\2\2\2uv\7\17\2\2vw\5\20\t\2wx\7\4\2\2x\17\3\2"+
		"\2\2y~\5\22\n\2z{\7\4\2\2{}\5\22\n\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2"+
		"\2~\177\3\2\2\2\177\21\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\7\7\2\2\u0083\u0084\5\30\r\2\u0084\23\3\2\2\2\u0085\u008a\5\26"+
		"\f\2\u0086\u0087\7\b\2\2\u0087\u0089\5\26\f\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u008e\7\35\2\2\u008e\27\3\2\2\2\u008f\u0090"+
		"\7\35\2\2\u0090\31\3\2\2\2\u0091\u0096\5\34\17\2\u0092\u0093\7\b\2\2\u0093"+
		"\u0095\5\34\17\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0097\33\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009a\5\26\f\2\u009a\u009b\7\7\2\2\u009b\u009c\5\30\r\2\u009c\u00a3\3"+
		"\2\2\2\u009d\u009e\7\t\2\2\u009e\u009f\5\26\f\2\u009f\u00a0\7\7\2\2\u00a0"+
		"\u00a1\5\30\r\2\u00a1\u00a3\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009d\3"+
		"\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\5\"\22\2\u00a6"+
		"\u00a7\7\22\2\2\u00a7\37\3\2\2\2\u00a8\u00b3\5\36\20\2\u00a9\u00b3\5$"+
		"\23\2\u00aa\u00b3\5&\24\2\u00ab\u00b3\5(\25\2\u00ac\u00b3\5*\26\2\u00ad"+
		"\u00b3\5,\27\2\u00ae\u00b3\5.\30\2\u00af\u00b3\5\60\31\2\u00b0\u00b3\5"+
		"\62\32\2\u00b1\u00b3\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2"+
		"\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2"+
		"\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3!\3\2\2\2\u00b4\u00b9\5 \21\2\u00b5\u00b6\7\4\2\2"+
		"\u00b6\u00b8\5 \21\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba#\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\5\64\33\2\u00bd\u00be\7\n\2\2\u00be\u00bf\5\66\34\2\u00bf%\3\2"+
		"\2\2\u00c0\u00c1\7\23\2\2\u00c1\u00c2\5\66\34\2\u00c2\u00c3\7\24\2\2\u00c3"+
		"\u00c6\5 \21\2\u00c4\u00c5\7\25\2\2\u00c5\u00c7\5 \21\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\u00ca\5\66\34\2\u00ca\u00d1\7\32\2\2\u00cb\u00cc\5B\"\2\u00cc\u00cd\7"+
		"\7\2\2\u00cd\u00ce\5 \21\2\u00ce\u00d0\3\2\2\2\u00cf\u00cb\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2)\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7"+
		"\7\27\2\2\u00d7\u00d8\5\66\34\2\u00d8+\3\2\2\2\u00d9\u00da\7\27\2\2\u00da"+
		"\u00db\5\66\34\2\u00db\u00dc\7\26\2\2\u00dc\u00dd\5 \21\2\u00dd-\3\2\2"+
		"\2\u00de\u00df\7\13\2\2\u00df\u00e0\7\5\2\2\u00e0\u00e1\5\66\34\2\u00e1"+
		"\u00e2\7\6\2\2\u00e2/\3\2\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00e5\7\5\2\2"+
		"\u00e5\u00e6\5\66\34\2\u00e6\u00e7\7\6\2\2\u00e7\61\3\2\2\2\u00e8\u00e9"+
		"\7\30\2\2\u00e9\u00ea\5\66\34\2\u00ea\63\3\2\2\2\u00eb\u00ec\7\35\2\2"+
		"\u00ec\65\3\2\2\2\u00ed\u00ee\b\34\1\2\u00ee\u00f9\5B\"\2\u00ef\u00f9"+
		"\5> \2\u00f0\u00f9\5\64\33\2\u00f1\u00f2\7\5\2\2\u00f2\u00f3\5\66\34\2"+
		"\u00f3\u00f4\7\6\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f9\7\33\2\2\u00f6\u00f9"+
		"\7\34\2\2\u00f7\u00f9\5D#\2\u00f8\u00ed\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2"+
		"\2\2\u00f8\u00f7\3\2\2\2\u00f9\u0108\3\2\2\2\u00fa\u00fb\f\f\2\2\u00fb"+
		"\u00fc\58\35\2\u00fc\u00fd\5\66\34\r\u00fd\u0107\3\2\2\2\u00fe\u00ff\f"+
		"\13\2\2\u00ff\u0100\5:\36\2\u0100\u0101\5\66\34\f\u0101\u0107\3\2\2\2"+
		"\u0102\u0103\f\n\2\2\u0103\u0104\5<\37\2\u0104\u0105\5\66\34\13\u0105"+
		"\u0107\3\2\2\2\u0106\u00fa\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0102\3\2"+
		"\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\67\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\t\2\2\2\u010c9\3\2\2\2\u010d"+
		"\u010e\t\3\2\2\u010e;\3\2\2\2\u010f\u0110\t\4\2\2\u0110=\3\2\2\2\u0111"+
		"\u0112\5@!\2\u0112\u0113\5B\"\2\u0113?\3\2\2\2\u0114\u0115\t\3\2\2\u0115"+
		"A\3\2\2\2\u0116\u0119\7\36\2\2\u0117\u0119\7\37\2\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0117\3\2\2\2\u0119C\3\2\2\2\u011a\u011b\7\35\2\2\u011b\u011f"+
		"\7\5\2\2\u011c\u011e\5\66\34\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2"+
		"\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0126\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0123\7\b\2\2\u0123\u0125\5\66\34\2\u0124\u0122\3\2\2\2"+
		"\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7\6\2\2\u012aE\3\2\2\2\24SYd"+
		"s~\u008a\u0096\u00a2\u00b2\u00b9\u00c6\u00d1\u00f8\u0106\u0108\u0118\u011f"+
		"\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}