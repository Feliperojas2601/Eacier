// Generated from C:/Users/julia/Documents/Eacier/grammar\Expresion.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpresionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TOKEN_REAL=6, TOKEN_ENTERO=7, 
		TOKEN_CADENA=8, TOKEN_CHAR=9, TYPE=10, PAR_IZQ=11, PAR_DER=12, NEG=13, 
		ID=14, OP_REL=15, OP_DIV=16, OP_MAT=17, TILDE=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "TOKEN_REAL", "TOKEN_ENTERO", 
			"TOKEN_CADENA", "TOKEN_CHAR", "TYPE", "PAR_IZQ", "PAR_DER", "NEG", "ID", 
			"OP_REL", "OP_DIV", "OP_MAT", "TILDE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "','", "')'", null, null, null, null, null, 
			null, null, "'!'", null, null, null, null, "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TOKEN_REAL", "TOKEN_ENTERO", "TOKEN_CADENA", 
			"TOKEN_CHAR", "TYPE", "PAR_IZQ", "PAR_DER", "NEG", "ID", "OP_REL", "OP_DIV", 
			"OP_MAT", "TILDE"
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


	public ExpresionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expresion.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00ab\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7"+
		"\7\65\n\7\f\7\16\78\13\7\3\b\6\b;\n\b\r\b\16\b<\3\t\3\t\7\tA\n\t\f\t\16"+
		"\tD\13\t\3\t\3\t\3\n\3\n\5\nJ\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13"+
		"\3\f\3\f\3\r\3\r\3\r\5\r\u0083\n\r\3\16\3\16\3\17\3\17\7\17\u0089\n\17"+
		"\f\17\16\17\u008c\13\17\3\17\3\17\5\17\u0090\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u009f\n\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00a8\n\22\3\23\3\23\3B\2\24\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\3\2\t\3\2$$\3\2))\4\2**AA\4\2C\\c|\6\2\62;C\\aac|\4\2>>@@\5\2"+
		"\'\',-//\2\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3"+
		"\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17:\3\2\2\2\21>\3\2\2\2\23G\3\2\2\2\25"+
		"{\3\2\2\2\27}\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u008f\3\2\2"+
		"\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a7\3\2\2\2%\u00a9\3\2\2\2\'(\7"+
		"]\2\2(\4\3\2\2\2)*\7_\2\2*\6\3\2\2\2+,\7*\2\2,\b\3\2\2\2-.\7.\2\2.\n\3"+
		"\2\2\2/\60\7+\2\2\60\f\3\2\2\2\61\62\5\17\b\2\62\66\7\60\2\2\63\65\5\17"+
		"\b\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\16\3\2\2"+
		"\28\66\3\2\2\29;\4\62;\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\20\3"+
		"\2\2\2>B\t\2\2\2?A\13\2\2\2@?\3\2\2\2AD\3\2\2\2BC\3\2\2\2B@\3\2\2\2CE"+
		"\3\2\2\2DB\3\2\2\2EF\t\2\2\2F\22\3\2\2\2GI\t\3\2\2HJ\13\2\2\2IH\3\2\2"+
		"\2IJ\3\2\2\2JK\3\2\2\2KL\t\3\2\2L\24\3\2\2\2MN\7e\2\2NO\7j\2\2OP\7c\2"+
		"\2P|\7t\2\2QR\7u\2\2RS\7j\2\2ST\7q\2\2TU\7t\2\2U|\7v\2\2VW\7k\2\2WX\7"+
		"p\2\2X|\7v\2\2YZ\7n\2\2Z[\7q\2\2[\\\7p\2\2\\|\7i\2\2]^\7h\2\2^_\7n\2\2"+
		"_`\7q\2\2`a\7c\2\2a|\7v\2\2bc\7f\2\2cd\7q\2\2de\7w\2\2ef\7d\2\2fg\7n\2"+
		"\2g|\7g\2\2hi\7u\2\2ij\7k\2\2jk\7i\2\2kl\7p\2\2lm\7g\2\2m|\7f\2\2no\7"+
		"w\2\2op\7p\2\2pq\7u\2\2qr\7k\2\2rs\7i\2\2st\7p\2\2tu\7g\2\2u|\7f\2\2v"+
		"w\7a\2\2wx\7D\2\2xy\7q\2\2yz\7q\2\2z|\7n\2\2{M\3\2\2\2{Q\3\2\2\2{V\3\2"+
		"\2\2{Y\3\2\2\2{]\3\2\2\2{b\3\2\2\2{h\3\2\2\2{n\3\2\2\2{v\3\2\2\2|\26\3"+
		"\2\2\2}~\t\4\2\2~\30\3\2\2\2\177\u0083\7+\2\2\u0080\u0081\7\u00c4\2\2"+
		"\u0081\u0083\7\u00c1\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0083\32"+
		"\3\2\2\2\u0084\u0085\7#\2\2\u0085\34\3\2\2\2\u0086\u008a\t\5\2\2\u0087"+
		"\u0089\t\6\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\7(\2\2\u008e\u0090\5\35\17\2\u008f\u0086\3\2\2\2\u008f\u008d\3"+
		"\2\2\2\u0090\36\3\2\2\2\u0091\u0092\7?\2\2\u0092\u009f\7?\2\2\u0093\u0094"+
		"\7#\2\2\u0094\u009f\7?\2\2\u0095\u009f\t\7\2\2\u0096\u0097\7>\2\2\u0097"+
		"\u009f\7?\2\2\u0098\u0099\7@\2\2\u0099\u009f\7?\2\2\u009a\u009b\7(\2\2"+
		"\u009b\u009f\7(\2\2\u009c\u009d\7~\2\2\u009d\u009f\7~\2\2\u009e\u0091"+
		"\3\2\2\2\u009e\u0093\3\2\2\2\u009e\u0095\3\2\2\2\u009e\u0096\3\2\2\2\u009e"+
		"\u0098\3\2\2\2\u009e\u009a\3\2\2\2\u009e\u009c\3\2\2\2\u009f \3\2\2\2"+
		"\u00a0\u00a1\7\61\2\2\u00a1\"\3\2\2\2\u00a2\u00a8\t\b\2\2\u00a3\u00a4"+
		"\7>\2\2\u00a4\u00a8\7>\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a8\7@\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8$\3\2\2\2"+
		"\u00a9\u00aa\7\u0080\2\2\u00aa&\3\2\2\2\r\2\66<BI{\u0082\u008a\u008f\u009e"+
		"\u00a7\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}