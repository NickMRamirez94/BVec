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
		PROGRAM=10, VAR=11, FUNCTION=12, OBRACK=13, CBRACK=14, IF=15, THEN=16, 
		ELSE=17, DO=18, WHILE=19, RETURN=20, MATCH=21, WITH=22, STRING=23, IDENTIFIER=24, 
		INTEGER=25, FLOAT=26, MUL_OP=27, DIV_OP=28, ADD_OP=29, SUB_OP=30, EQ=31, 
		NE=32, LT=33, GT=34, NEWLINE=35, WS=36;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_mainBlock = 2, RULE_block = 3, 
		RULE_funcdeclarations = 4, RULE_declarations = 5, RULE_declList = 6, RULE_decl = 7, 
		RULE_varList = 8, RULE_varId = 9, RULE_typeId = 10, RULE_formalParmList = 11, 
		RULE_formalParm = 12, RULE_compoundStmt = 13, RULE_stmt = 14, RULE_stmtList = 15, 
		RULE_assignmentStmt = 16, RULE_if_stat = 17, RULE_match_stat = 18, RULE_dowhile_stat = 19, 
		RULE_while_stat = 20, RULE_print_stat = 21, RULE_return_stat = 22, RULE_function_call = 23, 
		RULE_variable = 24, RULE_expr = 25, RULE_mulDivOp = 26, RULE_addSubOp = 27, 
		RULE_relOp = 28, RULE_signedNumber = 29, RULE_sign = 30, RULE_number = 31;
	public static final String[] ruleNames = {
		"program", "header", "mainBlock", "block", "funcdeclarations", "declarations", 
		"declList", "decl", "varList", "varId", "typeId", "formalParmList", "formalParm", 
		"compoundStmt", "stmt", "stmtList", "assignmentStmt", "if_stat", "match_stat", 
		"dowhile_stat", "while_stat", "print_stat", "return_stat", "function_call", 
		"variable", "expr", "mulDivOp", "addSubOp", "relOp", "signedNumber", "sign", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'('", "')'", "':'", "','", "'&'", "':='", "'print'", 
		"'PROGRAM'", "'VARIABLES'", "'FUNCTION'", "'{'", "'}'", "'IF'", "'THEN'", 
		"'ELSE'", "'DO'", "'WHILE'", "'RETURN'", "'MATCH'", "'WITH'", null, null, 
		null, null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "FUNCTION", "OBRACK", "CBRACK", "IF", "THEN", "ELSE", "DO", "WHILE", 
		"RETURN", "MATCH", "WITH", "STRING", "IDENTIFIER", "INTEGER", "FLOAT", 
		"MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQ", "NE", "LT", "GT", "NEWLINE", 
		"WS"
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
			setState(64);
			header();
			setState(65);
			mainBlock();
			setState(66);
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
			setState(68);
			match(PROGRAM);
			setState(69);
			match(IDENTIFIER);
			setState(70);
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
			setState(72);
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
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(74);
				declarations();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(80);
				funcdeclarations();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
			setState(88);
			match(FUNCTION);
			setState(89);
			match(IDENTIFIER);
			setState(90);
			match(T__2);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==IDENTIFIER) {
				{
				{
				setState(91);
				formalParmList();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(T__3);
			setState(98);
			match(T__4);
			setState(99);
			typeId();
			setState(100);
			match(T__1);
			setState(101);
			block();
			setState(102);
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
			_localctx = new VarDeclarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(VAR);
			setState(105);
			declList();
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
		enterRule(_localctx, 12, RULE_declList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			decl();
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(109);
					match(T__1);
					setState(110);
					decl();
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 14, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			varList();
			setState(117);
			match(T__4);
			setState(118);
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
		enterRule(_localctx, 16, RULE_varList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			varId();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(121);
				match(T__5);
				setState(122);
				varId();
				}
				}
				setState(127);
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
		enterRule(_localctx, 18, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		enterRule(_localctx, 20, RULE_typeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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
		enterRule(_localctx, 22, RULE_formalParmList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			formalParm();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(133);
				match(T__5);
				setState(134);
				formalParm();
				}
				}
				setState(139);
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
		enterRule(_localctx, 24, RULE_formalParm);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new ValueParmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				varId();
				setState(141);
				match(T__4);
				setState(142);
				typeId();
				}
				break;
			case T__6:
				_localctx = new RefParmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(T__6);
				setState(145);
				varId();
				setState(146);
				match(T__4);
				setState(147);
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
		enterRule(_localctx, 26, RULE_compoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(OBRACK);
			setState(152);
			stmtList();
			setState(153);
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
		public Return_statContext return_stat() {
			return getRuleContext(Return_statContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		enterRule(_localctx, 28, RULE_stmt);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				compoundStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(157);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(159);
				dowhile_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160);
				while_stat();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161);
				print_stat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(162);
				return_stat();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(163);
				function_call();
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
		enterRule(_localctx, 30, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			stmt();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(168);
				match(T__1);
				setState(169);
				stmt();
				}
				}
				setState(174);
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
		enterRule(_localctx, 32, RULE_assignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			variable();
			setState(176);
			match(T__7);
			setState(177);
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
		enterRule(_localctx, 34, RULE_if_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(IF);
			setState(180);
			expr(0);
			setState(181);
			match(THEN);
			setState(182);
			stmt();
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(183);
				match(ELSE);
				setState(184);
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
		enterRule(_localctx, 36, RULE_match_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(MATCH);
			setState(188);
			expr(0);
			setState(189);
			match(WITH);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(190);
					number();
					setState(191);
					match(T__4);
					setState(192);
					stmt();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 38, RULE_dowhile_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(DO);
			setState(200);
			stmtList();
			setState(201);
			match(WHILE);
			setState(202);
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
		enterRule(_localctx, 40, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(WHILE);
			setState(205);
			expr(0);
			setState(206);
			match(DO);
			setState(207);
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
		enterRule(_localctx, 42, RULE_print_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__8);
			setState(210);
			match(T__2);
			setState(211);
			expr(0);
			setState(212);
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
		enterRule(_localctx, 44, RULE_return_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(RETURN);
			setState(215);
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
		enterRule(_localctx, 46, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(T__2);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << STRING) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT) | (1L << ADD_OP) | (1L << SUB_OP))) != 0)) {
				{
				{
				setState(219);
				expr(0);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(225);
				match(T__5);
				setState(226);
				expr(0);
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
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
		enterRule(_localctx, 48, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				{
				_localctx = new UnsignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(237);
				number();
				}
				break;
			case ADD_OP:
			case SUB_OP:
				{
				_localctx = new SignedNumberExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				variable();
				}
				break;
			case T__2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(T__2);
				setState(241);
				expr(0);
				setState(242);
				match(T__3);
				}
				break;
			case STRING:
				{
				_localctx = new StringExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(247);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(248);
						mulDivOp();
						setState(249);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(252);
						addSubOp();
						setState(253);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new RelOpExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(255);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(256);
						relOp();
						setState(257);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(263);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		enterRule(_localctx, 52, RULE_mulDivOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
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
		enterRule(_localctx, 54, RULE_addSubOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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
		enterRule(_localctx, 56, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 58, RULE_signedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			sign();
			setState(271);
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
		enterRule(_localctx, 60, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 62, RULE_number);
		try {
			setState(277);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(INTEGER);
				}
				break;
			case FLOAT:
				_localctx = new FloatConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u011a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\7\5N\n\5\f\5\16\5Q\13"+
		"\5\3\5\7\5T\n\5\f\5\16\5W\13\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16"+
		"\6b\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\br"+
		"\n\b\f\b\16\bu\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081"+
		"\13\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\r\u008a\n\r\f\r\16\r\u008d\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0098\n\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a8"+
		"\n\20\3\21\3\21\3\21\7\21\u00ad\n\21\f\21\16\21\u00b0\13\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u00c5\n\24\f\24\16\24\u00c8\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\7\31\u00df\n\31\f\31\16\31\u00e2\13\31\3\31"+
		"\3\31\7\31\u00e6\n\31\f\31\16\31\u00e9\13\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00f8\n\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0106\n\33\f\33\16"+
		"\33\u0109\13\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3!"+
		"\3!\5!\u0118\n!\3!\2\3\64\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@\2\5\3\2\35\36\3\2\37 \3\2!$\2\u0116\2B\3\2\2\2"+
		"\4F\3\2\2\2\6J\3\2\2\2\bO\3\2\2\2\nZ\3\2\2\2\fj\3\2\2\2\16n\3\2\2\2\20"+
		"v\3\2\2\2\22z\3\2\2\2\24\u0082\3\2\2\2\26\u0084\3\2\2\2\30\u0086\3\2\2"+
		"\2\32\u0097\3\2\2\2\34\u0099\3\2\2\2\36\u00a7\3\2\2\2 \u00a9\3\2\2\2\""+
		"\u00b1\3\2\2\2$\u00b5\3\2\2\2&\u00bd\3\2\2\2(\u00c9\3\2\2\2*\u00ce\3\2"+
		"\2\2,\u00d3\3\2\2\2.\u00d8\3\2\2\2\60\u00db\3\2\2\2\62\u00ec\3\2\2\2\64"+
		"\u00f7\3\2\2\2\66\u010a\3\2\2\28\u010c\3\2\2\2:\u010e\3\2\2\2<\u0110\3"+
		"\2\2\2>\u0113\3\2\2\2@\u0117\3\2\2\2BC\5\4\3\2CD\5\6\4\2DE\7\3\2\2E\3"+
		"\3\2\2\2FG\7\f\2\2GH\7\32\2\2HI\7\4\2\2I\5\3\2\2\2JK\5\b\5\2K\7\3\2\2"+
		"\2LN\5\f\7\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2"+
		"\2RT\5\n\6\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2"+
		"\2XY\5\34\17\2Y\t\3\2\2\2Z[\7\16\2\2[\\\7\32\2\2\\`\7\5\2\2]_\5\30\r\2"+
		"^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\6\2\2"+
		"de\7\7\2\2ef\5\26\f\2fg\7\4\2\2gh\5\b\5\2hi\7\4\2\2i\13\3\2\2\2jk\7\r"+
		"\2\2kl\5\16\b\2lm\7\4\2\2m\r\3\2\2\2ns\5\20\t\2op\7\4\2\2pr\5\20\t\2q"+
		"o\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3\2\2\2vw\5\22\n"+
		"\2wx\7\7\2\2xy\5\26\f\2y\21\3\2\2\2z\177\5\24\13\2{|\7\b\2\2|~\5\24\13"+
		"\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\23\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\32\2\2\u0083\25\3\2\2\2\u0084\u0085"+
		"\7\32\2\2\u0085\27\3\2\2\2\u0086\u008b\5\32\16\2\u0087\u0088\7\b\2\2\u0088"+
		"\u008a\5\32\16\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\31\3\2\2\2\u008d\u008b\3\2\2\2\u008e"+
		"\u008f\5\24\13\2\u008f\u0090\7\7\2\2\u0090\u0091\5\26\f\2\u0091\u0098"+
		"\3\2\2\2\u0092\u0093\7\t\2\2\u0093\u0094\5\24\13\2\u0094\u0095\7\7\2\2"+
		"\u0095\u0096\5\26\f\2\u0096\u0098\3\2\2\2\u0097\u008e\3\2\2\2\u0097\u0092"+
		"\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u009b\5 \21\2\u009b"+
		"\u009c\7\20\2\2\u009c\35\3\2\2\2\u009d\u00a8\5\34\17\2\u009e\u00a8\5\""+
		"\22\2\u009f\u00a8\5$\23\2\u00a0\u00a8\5&\24\2\u00a1\u00a8\5(\25\2\u00a2"+
		"\u00a8\5*\26\2\u00a3\u00a8\5,\27\2\u00a4\u00a8\5.\30\2\u00a5\u00a8\5\60"+
		"\31\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u009e\3\2\2\2\u00a7"+
		"\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00ae\5\36\20\2\u00aa\u00ab\7\4"+
		"\2\2\u00ab\u00ad\5\36\20\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af!\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b1\u00b2\5\62\32\2\u00b2\u00b3\7\n\2\2\u00b3\u00b4\5\64\33\2\u00b4"+
		"#\3\2\2\2\u00b5\u00b6\7\21\2\2\u00b6\u00b7\5\64\33\2\u00b7\u00b8\7\22"+
		"\2\2\u00b8\u00bb\5\36\20\2\u00b9\u00ba\7\23\2\2\u00ba\u00bc\5\36\20\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc%\3\2\2\2\u00bd\u00be\7"+
		"\27\2\2\u00be\u00bf\5\64\33\2\u00bf\u00c6\7\30\2\2\u00c0\u00c1\5@!\2\u00c1"+
		"\u00c2\7\7\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\'\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5 \21"+
		"\2\u00cb\u00cc\7\25\2\2\u00cc\u00cd\5\64\33\2\u00cd)\3\2\2\2\u00ce\u00cf"+
		"\7\25\2\2\u00cf\u00d0\5\64\33\2\u00d0\u00d1\7\24\2\2\u00d1\u00d2\5\36"+
		"\20\2\u00d2+\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d6"+
		"\5\64\33\2\u00d6\u00d7\7\6\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\26\2\2\u00d9"+
		"\u00da\5\64\33\2\u00da/\3\2\2\2\u00db\u00dc\7\32\2\2\u00dc\u00e0\7\5\2"+
		"\2\u00dd\u00df\5\64\33\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e7\3\2\2\2\u00e2\u00e0\3\2"+
		"\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e6\5\64\33\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7\6\2\2\u00eb\61\3\2\2\2\u00ec\u00ed"+
		"\7\32\2\2\u00ed\63\3\2\2\2\u00ee\u00ef\b\33\1\2\u00ef\u00f8\5@!\2\u00f0"+
		"\u00f8\5<\37\2\u00f1\u00f8\5\62\32\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5"+
		"\64\33\2\u00f4\u00f5\7\6\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f8\7\31\2\2"+
		"\u00f7\u00ee\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f1\3\2\2\2\u00f7\u00f2"+
		"\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u0107\3\2\2\2\u00f9\u00fa\f\n\2\2\u00fa"+
		"\u00fb\5\66\34\2\u00fb\u00fc\5\64\33\13\u00fc\u0106\3\2\2\2\u00fd\u00fe"+
		"\f\t\2\2\u00fe\u00ff\58\35\2\u00ff\u0100\5\64\33\n\u0100\u0106\3\2\2\2"+
		"\u0101\u0102\f\b\2\2\u0102\u0103\5:\36\2\u0103\u0104\5\64\33\t\u0104\u0106"+
		"\3\2\2\2\u0105\u00f9\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0101\3\2\2\2\u0106"+
		"\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\65\3\2\2"+
		"\2\u0109\u0107\3\2\2\2\u010a\u010b\t\2\2\2\u010b\67\3\2\2\2\u010c\u010d"+
		"\t\3\2\2\u010d9\3\2\2\2\u010e\u010f\t\4\2\2\u010f;\3\2\2\2\u0110\u0111"+
		"\5> \2\u0111\u0112\5@!\2\u0112=\3\2\2\2\u0113\u0114\t\3\2\2\u0114?\3\2"+
		"\2\2\u0115\u0118\7\33\2\2\u0116\u0118\7\34\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118A\3\2\2\2\23OU`s\177\u008b\u0097\u00a7\u00ae\u00bb"+
		"\u00c6\u00e0\u00e7\u00f7\u0105\u0107\u0117";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}