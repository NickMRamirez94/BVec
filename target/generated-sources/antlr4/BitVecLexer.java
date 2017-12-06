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
		T__9=10, PROGRAM=11, VAR=12, LOCALS=13, FUNCTION=14, OBRACK=15, CBRACK=16, 
		IF=17, THEN=18, ELSE=19, DO=20, WHILE=21, RETURN=22, MATCH=23, WITH=24, 
		STRING=25, BOOL=26, IDENTIFIER=27, INTEGER=28, FLOAT=29, MUL_OP=30, DIV_OP=31, 
		ADD_OP=32, SUB_OP=33, EQ=34, NE=35, LT=36, GT=37, NEWLINE=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "PROGRAM", "VAR", "LOCALS", "FUNCTION", "OBRACK", "CBRACK", "IF", 
		"THEN", "ELSE", "DO", "WHILE", "RETURN", "MATCH", "WITH", "STRING", "BOOL", 
		"IDENTIFIER", "INTEGER", "FLOAT", "MUL_OP", "DIV_OP", "ADD_OP", "SUB_OP", 
		"EQ", "NE", "LT", "GT", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0109\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\7\32\u00c1\n\32\f\32\16\32\u00c4\13\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d1\n\33\3\34\3\34\7\34\u00d5\n"+
		"\34\f\34\16\34\u00d8\13\34\3\35\6\35\u00db\n\35\r\35\16\35\u00dc\3\36"+
		"\6\36\u00e0\n\36\r\36\16\36\u00e1\3\36\3\36\6\36\u00e6\n\36\r\36\16\36"+
		"\u00e7\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\5\'\u00fd\n\'\3\'\3\'\3\'\3\'\3(\6(\u0104\n(\r(\16(\u0105\3(\3(\3\u00c2"+
		"\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)\3\2\6\4\2C\\c|\5\2\62;C\\c|\3\2\62;\4\2\13"+
		"\13\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3"+
		"\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2"+
		"\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13Y\3\2\2\2\r[\3\2\2\2\17]\3\2\2\2"+
		"\21_\3\2\2\2\23b\3\2\2\2\25h\3\2\2\2\27p\3\2\2\2\31x\3\2\2\2\33\u0082"+
		"\3\2\2\2\35\u0089\3\2\2\2\37\u0092\3\2\2\2!\u0094\3\2\2\2#\u0096\3\2\2"+
		"\2%\u0099\3\2\2\2\'\u009e\3\2\2\2)\u00a3\3\2\2\2+\u00a6\3\2\2\2-\u00ac"+
		"\3\2\2\2/\u00b3\3\2\2\2\61\u00b9\3\2\2\2\63\u00be\3\2\2\2\65\u00d0\3\2"+
		"\2\2\67\u00d2\3\2\2\29\u00da\3\2\2\2;\u00df\3\2\2\2=\u00e9\3\2\2\2?\u00eb"+
		"\3\2\2\2A\u00ed\3\2\2\2C\u00ef\3\2\2\2E\u00f1\3\2\2\2G\u00f4\3\2\2\2I"+
		"\u00f7\3\2\2\2K\u00f9\3\2\2\2M\u00fc\3\2\2\2O\u0103\3\2\2\2QR\7\60\2\2"+
		"R\4\3\2\2\2ST\7=\2\2T\6\3\2\2\2UV\7*\2\2V\b\3\2\2\2WX\7+\2\2X\n\3\2\2"+
		"\2YZ\7<\2\2Z\f\3\2\2\2[\\\7.\2\2\\\16\3\2\2\2]^\7(\2\2^\20\3\2\2\2_`\7"+
		"<\2\2`a\7?\2\2a\22\3\2\2\2bc\7r\2\2cd\7t\2\2de\7k\2\2ef\7p\2\2fg\7v\2"+
		"\2g\24\3\2\2\2hi\7r\2\2ij\7t\2\2jk\7k\2\2kl\7p\2\2lm\7v\2\2mn\7n\2\2n"+
		"o\7p\2\2o\26\3\2\2\2pq\7R\2\2qr\7T\2\2rs\7Q\2\2st\7I\2\2tu\7T\2\2uv\7"+
		"C\2\2vw\7O\2\2w\30\3\2\2\2xy\7X\2\2yz\7C\2\2z{\7T\2\2{|\7K\2\2|}\7C\2"+
		"\2}~\7D\2\2~\177\7N\2\2\177\u0080\7G\2\2\u0080\u0081\7U\2\2\u0081\32\3"+
		"\2\2\2\u0082\u0083\7N\2\2\u0083\u0084\7Q\2\2\u0084\u0085\7E\2\2\u0085"+
		"\u0086\7C\2\2\u0086\u0087\7N\2\2\u0087\u0088\7U\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\7H\2\2\u008a\u008b\7W\2\2\u008b\u008c\7P\2\2\u008c\u008d\7E\2\2"+
		"\u008d\u008e\7V\2\2\u008e\u008f\7K\2\2\u008f\u0090\7Q\2\2\u0090\u0091"+
		"\7P\2\2\u0091\36\3\2\2\2\u0092\u0093\7}\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7\177\2\2\u0095\"\3\2\2\2\u0096\u0097\7K\2\2\u0097\u0098\7H\2\2\u0098"+
		"$\3\2\2\2\u0099\u009a\7V\2\2\u009a\u009b\7J\2\2\u009b\u009c\7G\2\2\u009c"+
		"\u009d\7P\2\2\u009d&\3\2\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7N\2\2\u00a0"+
		"\u00a1\7U\2\2\u00a1\u00a2\7G\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7F\2\2\u00a4"+
		"\u00a5\7Q\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7Y\2\2\u00a7\u00a8\7J\2\2\u00a8"+
		"\u00a9\7K\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7G\2\2\u00ab,\3\2\2\2\u00ac"+
		"\u00ad\7T\2\2\u00ad\u00ae\7G\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7W\2\2"+
		"\u00b0\u00b1\7T\2\2\u00b1\u00b2\7P\2\2\u00b2.\3\2\2\2\u00b3\u00b4\7O\2"+
		"\2\u00b4\u00b5\7C\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7\7E\2\2\u00b7\u00b8"+
		"\7J\2\2\u00b8\60\3\2\2\2\u00b9\u00ba\7Y\2\2\u00ba\u00bb\7K\2\2\u00bb\u00bc"+
		"\7V\2\2\u00bc\u00bd\7J\2\2\u00bd\62\3\2\2\2\u00be\u00c2\7$\2\2\u00bf\u00c1"+
		"\13\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c2\u00c0\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\7$\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7w\2\2\u00ca\u00d1\7g\2\2\u00cb\u00cc\7h\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c7\3\2\2"+
		"\2\u00d0\u00cb\3\2\2\2\u00d1\66\3\2\2\2\u00d2\u00d6\t\2\2\2\u00d3\u00d5"+
		"\t\3\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d78\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00db\t\4\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd:\3\2\2\2\u00de\u00e0\t\4\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e5\7\60\2\2\u00e4\u00e6\t\4\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8<\3\2\2\2"+
		"\u00e9\u00ea\7,\2\2\u00ea>\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec@\3\2\2\2"+
		"\u00ed\u00ee\7-\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7/\2\2\u00f0D\3\2\2\2\u00f1"+
		"\u00f2\7?\2\2\u00f2\u00f3\7?\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7#\2\2\u00f5"+
		"\u00f6\7?\2\2\u00f6H\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8J\3\2\2\2\u00f9\u00fa"+
		"\7@\2\2\u00faL\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0101\b\'\2\2\u0101N\3\2\2\2\u0102\u0104\t\5\2\2\u0103\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\b(\2\2\u0108P\3\2\2\2\13\2\u00c2\u00d0\u00d6"+
		"\u00dc\u00e1\u00e7\u00fc\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}