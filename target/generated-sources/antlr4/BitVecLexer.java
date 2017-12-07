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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, PROGRAM=11, VAR=12, FUNCTION=13, OBRACK=14, CBRACK=15, IF=16, 
		THEN=17, ELSE=18, DO=19, WHILE=20, RETURN=21, MATCH=22, WITH=23, STRING=24, 
		BOOL=25, IDENTIFIER=26, INTEGER=27, FLOAT=28, MUL_OP=29, DIV_OP=30, ADD_OP=31, 
		SUB_OP=32, EQ=33, NE=34, LT=35, GT=36, NEWLINE=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PROGRAM", "VAR", "FUNCTION", "OBRACK", "CBRACK", "IF", "THEN", 
		"ELSE", "DO", "WHILE", "RETURN", "MATCH", "WITH", "STRING", "BOOL", "IDENTIFIER", 
		"INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", "EQ", "NE", 
		"LT", "GT", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "';'", "'('", "')'", "':'", "','", "'&'", "':='", "'print'", 
		"'println'", "'PROGRAM'", "'VARIABLES'", "'FUNCTION'", "'{'", "'}'", "'IF'", 
		"'THEN'", "'ELSE'", "'DO'", "'WHILE'", "'RETURN'", "'MATCH'", "'WITH'", 
		null, null, null, null, null, "'*'", "'/'", "'+'", "'-'", "'=='", "'!='", 
		"'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "PROGRAM", 
		"VAR", "FUNCTION", "OBRACK", "CBRACK", "IF", "THEN", "ELSE", "DO", "WHILE", 
		"RETURN", "MATCH", "WITH", "STRING", "BOOL", "IDENTIFIER", "INTEGER", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u00b8\n\31\f\31\16\31\u00bb\13"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00c8"+
		"\n\32\3\33\3\33\7\33\u00cc\n\33\f\33\16\33\u00cf\13\33\3\34\6\34\u00d2"+
		"\n\34\r\34\16\34\u00d3\3\35\6\35\u00d7\n\35\r\35\16\35\u00d8\3\35\3\35"+
		"\6\35\u00dd\n\35\r\35\16\35\u00de\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\5&\u00f4\n&\3&\3&\3&\3&\3\'\6\'\u00fb"+
		"\n\'\r\'\16\'\u00fc\3\'\3\'\3\u00b9\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(\3\2\6\4\2C\\"+
		"c|\5\2\62;C\\c|\3\2\62;\4\2\13\13\"\"\2\u0107\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\r"+
		"Y\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23`\3\2\2\2\25f\3\2\2\2\27n\3\2\2\2"+
		"\31v\3\2\2\2\33\u0080\3\2\2\2\35\u0089\3\2\2\2\37\u008b\3\2\2\2!\u008d"+
		"\3\2\2\2#\u0090\3\2\2\2%\u0095\3\2\2\2\'\u009a\3\2\2\2)\u009d\3\2\2\2"+
		"+\u00a3\3\2\2\2-\u00aa\3\2\2\2/\u00b0\3\2\2\2\61\u00b5\3\2\2\2\63\u00c7"+
		"\3\2\2\2\65\u00c9\3\2\2\2\67\u00d1\3\2\2\29\u00d6\3\2\2\2;\u00e0\3\2\2"+
		"\2=\u00e2\3\2\2\2?\u00e4\3\2\2\2A\u00e6\3\2\2\2C\u00e8\3\2\2\2E\u00eb"+
		"\3\2\2\2G\u00ee\3\2\2\2I\u00f0\3\2\2\2K\u00f3\3\2\2\2M\u00fa\3\2\2\2O"+
		"P\7\60\2\2P\4\3\2\2\2QR\7=\2\2R\6\3\2\2\2ST\7*\2\2T\b\3\2\2\2UV\7+\2\2"+
		"V\n\3\2\2\2WX\7<\2\2X\f\3\2\2\2YZ\7.\2\2Z\16\3\2\2\2[\\\7(\2\2\\\20\3"+
		"\2\2\2]^\7<\2\2^_\7?\2\2_\22\3\2\2\2`a\7r\2\2ab\7t\2\2bc\7k\2\2cd\7p\2"+
		"\2de\7v\2\2e\24\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7k\2\2ij\7p\2\2jk\7v\2\2k"+
		"l\7n\2\2lm\7p\2\2m\26\3\2\2\2no\7R\2\2op\7T\2\2pq\7Q\2\2qr\7I\2\2rs\7"+
		"T\2\2st\7C\2\2tu\7O\2\2u\30\3\2\2\2vw\7X\2\2wx\7C\2\2xy\7T\2\2yz\7K\2"+
		"\2z{\7C\2\2{|\7D\2\2|}\7N\2\2}~\7G\2\2~\177\7U\2\2\177\32\3\2\2\2\u0080"+
		"\u0081\7H\2\2\u0081\u0082\7W\2\2\u0082\u0083\7P\2\2\u0083\u0084\7E\2\2"+
		"\u0084\u0085\7V\2\2\u0085\u0086\7K\2\2\u0086\u0087\7Q\2\2\u0087\u0088"+
		"\7P\2\2\u0088\34\3\2\2\2\u0089\u008a\7}\2\2\u008a\36\3\2\2\2\u008b\u008c"+
		"\7\177\2\2\u008c \3\2\2\2\u008d\u008e\7K\2\2\u008e\u008f\7H\2\2\u008f"+
		"\"\3\2\2\2\u0090\u0091\7V\2\2\u0091\u0092\7J\2\2\u0092\u0093\7G\2\2\u0093"+
		"\u0094\7P\2\2\u0094$\3\2\2\2\u0095\u0096\7G\2\2\u0096\u0097\7N\2\2\u0097"+
		"\u0098\7U\2\2\u0098\u0099\7G\2\2\u0099&\3\2\2\2\u009a\u009b\7F\2\2\u009b"+
		"\u009c\7Q\2\2\u009c(\3\2\2\2\u009d\u009e\7Y\2\2\u009e\u009f\7J\2\2\u009f"+
		"\u00a0\7K\2\2\u00a0\u00a1\7N\2\2\u00a1\u00a2\7G\2\2\u00a2*\3\2\2\2\u00a3"+
		"\u00a4\7T\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7\7W\2\2"+
		"\u00a7\u00a8\7T\2\2\u00a8\u00a9\7P\2\2\u00a9,\3\2\2\2\u00aa\u00ab\7O\2"+
		"\2\u00ab\u00ac\7C\2\2\u00ac\u00ad\7V\2\2\u00ad\u00ae\7E\2\2\u00ae\u00af"+
		"\7J\2\2\u00af.\3\2\2\2\u00b0\u00b1\7Y\2\2\u00b1\u00b2\7K\2\2\u00b2\u00b3"+
		"\7V\2\2\u00b3\u00b4\7J\2\2\u00b4\60\3\2\2\2\u00b5\u00b9\7$\2\2\u00b6\u00b8"+
		"\13\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\7$\2\2\u00bd\62\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c8\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7c\2\2\u00c4"+
		"\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c8\7g\2\2\u00c7\u00be\3\2\2"+
		"\2\u00c7\u00c2\3\2\2\2\u00c8\64\3\2\2\2\u00c9\u00cd\t\2\2\2\u00ca\u00cc"+
		"\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\66\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d2\t\4\2"+
		"\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d48\3\2\2\2\u00d5\u00d7\t\4\2\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\7\60\2\2\u00db\u00dd\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df:\3\2\2\2"+
		"\u00e0\u00e1\7,\2\2\u00e1<\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3>\3\2\2\2"+
		"\u00e4\u00e5\7-\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7/\2\2\u00e7B\3\2\2\2\u00e8"+
		"\u00e9\7?\2\2\u00e9\u00ea\7?\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7#\2\2\u00ec"+
		"\u00ed\7?\2\2\u00edF\3\2\2\2\u00ee\u00ef\7>\2\2\u00efH\3\2\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1J\3\2\2\2\u00f2\u00f4\7\17\2\2\u00f3\u00f2\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\b&\2\2\u00f8L\3\2\2\2\u00f9\u00fb\t\5\2\2\u00fa\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u00ff\b\'\2\2\u00ffN\3\2\2\2\13\2\u00b9\u00c7\u00cd"+
		"\u00d3\u00d8\u00de\u00f3\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}