// Generated from BitVec.g4 by ANTLR 4.7

    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BitVecLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PROGRAM=8, VAR=9, 
		OBRACK=10, CBRACK=11, IF=12, THEN=13, ELSE=14, DO=15, WHILE=16, IDENTIFIER=17, 
		INTEGER=18, FLOAT=19, MUL_OP=20, DIV_OP=21, ADD_OP=22, SUB_OP=23, EQ=24, 
		NE=25, LT=26, GT=27, NEWLINE=28, WS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "PROGRAM", "VAR", 
		"OBRACK", "CBRACK", "IF", "THEN", "ELSE", "DO", "WHILE", "IDENTIFIER", 
		"INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQ", "NE", 
		"LT", "GT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "':'", "','", "':='", "'('", "')'", "'PROGRAM'", "'VARIABLES'", 
		"'{'", "'}'", "'IF'", "'THEN'", "'ELSE'", "'DO'", "'WHILE'", null, null, 
		null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PROGRAM", "VAR", "OBRACK", 
		"CBRACK", "IF", "THEN", "ELSE", "DO", "WHILE", "IDENTIFIER", "INTEGER", 
		"FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQ", "NE", "LT", "GT", 
		"NEWLINE", "WS"
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


	public BitVecLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BitVec.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22{\n\22\f\22\16\22~\13"+
		"\22\3\23\6\23\u0081\n\23\r\23\16\23\u0082\3\24\6\24\u0086\n\24\r\24\16"+
		"\24\u0087\3\24\3\24\6\24\u008c\n\24\r\24\16\24\u008d\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\5\35\u00a3\n\35\3\35\3\35\3\35\3\35\3\36\6\36\u00aa\n\36\r\36"+
		"\16\36\u00ab\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2"+
		"\13\13\"\"\2\u00b4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5?\3\2\2\2\7A\3\2\2\2\tC\3\2\2\2\13"+
		"E\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23T\3\2\2\2\25^\3\2\2\2\27"+
		"`\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35j\3\2\2\2\37o\3\2\2\2!r\3\2\2\2#x"+
		"\3\2\2\2%\u0080\3\2\2\2\'\u0085\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2"+
		"-\u0093\3\2\2\2/\u0095\3\2\2\2\61\u0097\3\2\2\2\63\u009a\3\2\2\2\65\u009d"+
		"\3\2\2\2\67\u009f\3\2\2\29\u00a2\3\2\2\2;\u00a9\3\2\2\2=>\7\60\2\2>\4"+
		"\3\2\2\2?@\7=\2\2@\6\3\2\2\2AB\7<\2\2B\b\3\2\2\2CD\7.\2\2D\n\3\2\2\2E"+
		"F\7<\2\2FG\7?\2\2G\f\3\2\2\2HI\7*\2\2I\16\3\2\2\2JK\7+\2\2K\20\3\2\2\2"+
		"LM\7R\2\2MN\7T\2\2NO\7Q\2\2OP\7I\2\2PQ\7T\2\2QR\7C\2\2RS\7O\2\2S\22\3"+
		"\2\2\2TU\7X\2\2UV\7C\2\2VW\7T\2\2WX\7K\2\2XY\7C\2\2YZ\7D\2\2Z[\7N\2\2"+
		"[\\\7G\2\2\\]\7U\2\2]\24\3\2\2\2^_\7}\2\2_\26\3\2\2\2`a\7\177\2\2a\30"+
		"\3\2\2\2bc\7K\2\2cd\7H\2\2d\32\3\2\2\2ef\7V\2\2fg\7J\2\2gh\7G\2\2hi\7"+
		"P\2\2i\34\3\2\2\2jk\7G\2\2kl\7N\2\2lm\7U\2\2mn\7G\2\2n\36\3\2\2\2op\7"+
		"F\2\2pq\7Q\2\2q \3\2\2\2rs\7Y\2\2st\7J\2\2tu\7K\2\2uv\7N\2\2vw\7G\2\2"+
		"w\"\3\2\2\2x|\t\2\2\2y{\t\3\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}$\3\2\2\2~|\3\2\2\2\177\u0081\t\4\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083&\3\2\2\2\u0084"+
		"\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\7\60\2\2\u008a"+
		"\u008c\t\4\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e(\3\2\2\2\u008f\u0090\7,\2\2\u0090*\3\2"+
		"\2\2\u0091\u0092\7\61\2\2\u0092,\3\2\2\2\u0093\u0094\7-\2\2\u0094.\3\2"+
		"\2\2\u0095\u0096\7/\2\2\u0096\60\3\2\2\2\u0097\u0098\7?\2\2\u0098\u0099"+
		"\7?\2\2\u0099\62\3\2\2\2\u009a\u009b\7#\2\2\u009b\u009c\7?\2\2\u009c\64"+
		"\3\2\2\2\u009d\u009e\7>\2\2\u009e\66\3\2\2\2\u009f\u00a0\7@\2\2\u00a0"+
		"8\3\2\2\2\u00a1\u00a3\7\17\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7"+
		"\b\35\2\2\u00a7:\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ae\b\36\2\2\u00ae<\3\2\2\2\t\2|\u0082\u0087\u008d\u00a2"+
		"\u00ab\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}