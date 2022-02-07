// Generated from C:/Users/PERSONAL/Documents/Proyectos/Independientes/Lenguajes de Programación/Eacier/grammar\Arbol.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Expresion=2, CorIzq=3, CorDer=4;
	public static final int
		RULE_arbol = 0, RULE_raiz = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"arbol", "raiz"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'nodo'", null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "Expresion", "CorIzq", "CorDer"
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
	public String getGrammarFileName() { return "Arbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ArbolContext extends ParserRuleContext {
		public TerminalNode CorIzq() { return getToken(ArbolParser.CorIzq, 0); }
		public TerminalNode CorDer() { return getToken(ArbolParser.CorDer, 0); }
		public List<RaizContext> raiz() {
			return getRuleContexts(RaizContext.class);
		}
		public RaizContext raiz(int i) {
			return getRuleContext(RaizContext.class,i);
		}
		public ArbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArbolListener ) ((ArbolListener)listener).enterArbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArbolListener ) ((ArbolListener)listener).exitArbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArbolVisitor ) return ((ArbolVisitor<? extends T>)visitor).visitArbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArbolContext arbol() throws RecognitionException {
		ArbolContext _localctx = new ArbolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_arbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(CorIzq);
			setState(6); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(5);
				raiz();
				}
				}
				setState(8); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(10);
			match(CorDer);
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

	public static class RaizContext extends ParserRuleContext {
		public List<TerminalNode> CorIzq() { return getTokens(ArbolParser.CorIzq); }
		public TerminalNode CorIzq(int i) {
			return getToken(ArbolParser.CorIzq, i);
		}
		public TerminalNode Expresion() { return getToken(ArbolParser.Expresion, 0); }
		public List<TerminalNode> CorDer() { return getTokens(ArbolParser.CorDer); }
		public TerminalNode CorDer(int i) {
			return getToken(ArbolParser.CorDer, i);
		}
		public List<RaizContext> raiz() {
			return getRuleContexts(RaizContext.class);
		}
		public RaizContext raiz(int i) {
			return getRuleContext(RaizContext.class,i);
		}
		public RaizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArbolListener ) ((ArbolListener)listener).enterRaiz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArbolListener ) ((ArbolListener)listener).exitRaiz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArbolVisitor ) return ((ArbolVisitor<? extends T>)visitor).visitRaiz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaizContext raiz() throws RecognitionException {
		RaizContext _localctx = new RaizContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_raiz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			match(CorIzq);
			setState(14);
			match(Expresion);
			setState(15);
			match(CorDer);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CorIzq) {
				{
				setState(16);
				match(CorIzq);
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(17);
					raiz();
					}
					}
					setState(20); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(22);
				match(CorDer);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\35\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\6\2\t\n\2\r\2\16\2\n\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"\25\n\3\r\3\16\3\26\3\3\3\3\5\3\33\n\3\3\3\2\2\4\2\4\2\2\2\35\2\6\3\2"+
		"\2\2\4\16\3\2\2\2\6\b\7\5\2\2\7\t\5\4\3\2\b\7\3\2\2\2\t\n\3\2\2\2\n\b"+
		"\3\2\2\2\n\13\3\2\2\2\13\f\3\2\2\2\f\r\7\6\2\2\r\3\3\2\2\2\16\17\7\3\2"+
		"\2\17\20\7\5\2\2\20\21\7\4\2\2\21\32\7\6\2\2\22\24\7\5\2\2\23\25\5\4\3"+
		"\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2"+
		"\2\30\31\7\6\2\2\31\33\3\2\2\2\32\22\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2"+
		"\2\5\n\26\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}