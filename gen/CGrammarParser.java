// Generated from C:/Users/PERSONAL/Documents/Proyectos/Independientes/Lenguajes de Programación/Eacier/grammar\CGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		Auto=18, Break=19, Case=20, Char=21, Const=22, Continue=23, Default=24, 
		Do=25, Double=26, Else=27, Enum=28, Extern=29, Float=30, For=31, Goto=32, 
		If=33, Inline=34, Int=35, Long=36, Register=37, Restrict=38, Return=39, 
		Short=40, Signed=41, Sizeof=42, Static=43, Struct=44, Switch=45, Typedef=46, 
		Union=47, Unsigned=48, Void=49, Volatile=50, While=51, Alignas=52, Alignof=53, 
		Atomic=54, Bool=55, Complex=56, Generic=57, Imaginary=58, Noreturn=59, 
		StaticAssert=60, ThreadLocal=61, LeftParen=62, RightParen=63, LeftBracket=64, 
		RightBracket=65, LeftBrace=66, RightBrace=67, Less=68, LessEqual=69, Greater=70, 
		GreaterEqual=71, LeftShift=72, RightShift=73, Plus=74, PlusPlus=75, Minus=76, 
		MinusMinus=77, Star=78, Div=79, Mod=80, And=81, Or=82, AndAnd=83, OrOr=84, 
		Caret=85, Not=86, Tilde=87, Question=88, Colon=89, Semi=90, Comma=91, 
		Assign=92, StarAssign=93, DivAssign=94, ModAssign=95, PlusAssign=96, MinusAssign=97, 
		LeftShiftAssign=98, RightShiftAssign=99, AndAssign=100, XorAssign=101, 
		OrAssign=102, Equal=103, NotEqual=104, Arrow=105, Dot=106, Ellipsis=107, 
		Identifier=108, Constant=109, DigitSequence=110, StringLiteral=111, ComplexDefine=112, 
		IncludeDirective=113, AsmBlock=114, LineAfterPreprocessing=115, LineDirective=116, 
		PragmaDirective=117, Whitespace=118, Newline=119, BlockComment=120, LineComment=121;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_auxpostfixExpression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryExpression = 7, RULE_auxunaryExpression = 8, 
		RULE_unaryOperator = 9, RULE_castExpression = 10, RULE_multiplicativeExpression = 11, 
		RULE_multiplicativeOperator = 12, RULE_additiveExpression = 13, RULE_additiveOperator = 14, 
		RULE_shiftExpression = 15, RULE_shiftOperator = 16, RULE_relationalExpression = 17, 
		RULE_relationalOperator = 18, RULE_equalityExpression = 19, RULE_equilatyOperator = 20, 
		RULE_andExpression = 21, RULE_exclusiveOrExpression = 22, RULE_inclusiveOrExpression = 23, 
		RULE_logicalAndExpression = 24, RULE_logicalOrExpression = 25, RULE_conditionalExpression = 26, 
		RULE_assignmentExpression = 27, RULE_assignmentOperator = 28, RULE_expression = 29, 
		RULE_constantExpression = 30, RULE_declaration = 31, RULE_declarationSpecifiers = 32, 
		RULE_declarationSpecifiers2 = 33, RULE_declarationSpecifier = 34, RULE_initDeclaratorList = 35, 
		RULE_initDeclarator = 36, RULE_storageClassSpecifier = 37, RULE_typeSpecifier = 38, 
		RULE_structOrUnionSpecifier = 39, RULE_structOrUnion = 40, RULE_structDeclarationList = 41, 
		RULE_structDeclaration = 42, RULE_specifierQualifierList = 43, RULE_structDeclaratorList = 44, 
		RULE_structDeclarator = 45, RULE_enumSpecifier = 46, RULE_enumeratorList = 47, 
		RULE_enumerator = 48, RULE_enumerationConstant = 49, RULE_atomicTypeSpecifier = 50, 
		RULE_typeQualifier = 51, RULE_functionSpecifier = 52, RULE_auxfuntionSpecifier = 53, 
		RULE_alignmentSpecifier = 54, RULE_declarator = 55, RULE_directDeclarator = 56, 
		RULE_auxdirectDeclarator = 57, RULE_aux1directDeclarator = 58, RULE_aux2directDeclarator = 59, 
		RULE_aux3directDeclarator = 60, RULE_aux4directDeclarator = 61, RULE_aux5directDeclarator = 62, 
		RULE_gccDeclaratorExtension = 63, RULE_gccAttributeSpecifier = 64, RULE_gccAttributeList = 65, 
		RULE_auxgccAttributeList = 66, RULE_gccAttribute = 67, RULE_nestedParenthesesBlock = 68, 
		RULE_auxnestedParenthesesBlock = 69, RULE_pointer = 70, RULE_auxpointer = 71, 
		RULE_typeQualifierList = 72, RULE_parameterTypeList = 73, RULE_auxparameterTypeList = 74, 
		RULE_parameterList = 75, RULE_parameterDeclaration = 76, RULE_identifierList = 77, 
		RULE_typeName = 78, RULE_abstractDeclarator = 79, RULE_directAbstractDeclarator = 80, 
		RULE_auxAbstract1 = 81, RULE_auxAbstract2 = 82, RULE_auxAbstract3 = 83, 
		RULE_auxAbstract4 = 84, RULE_auxAbstract5 = 85, RULE_auxAbstract6 = 86, 
		RULE_typedefName = 87, RULE_initializer = 88, RULE_auxInitializer = 89, 
		RULE_initializerList = 90, RULE_designation = 91, RULE_designatorList = 92, 
		RULE_designator = 93, RULE_staticAssertDeclaration = 94, RULE_statement = 95, 
		RULE_asm = 96, RULE_volatileText = 97, RULE_auxStatement = 98, RULE_auxStatement2 = 99, 
		RULE_labeledStatement = 100, RULE_compoundStatement = 101, RULE_blockItemList = 102, 
		RULE_blockItem = 103, RULE_expressionStatement = 104, RULE_selectionStatement = 105, 
		RULE_iterationStatement = 106, RULE_forCondition = 107, RULE_forDeclaration = 108, 
		RULE_forExpression = 109, RULE_jumpStatement = 110, RULE_compilationUnit = 111, 
		RULE_translationUnit = 112, RULE_externalDeclaration = 113, RULE_functionDefinition = 114, 
		RULE_declarationList = 115;
	private static String[] makeRuleNames() {
		return new String[] {
			"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
			"postfixExpression", "auxpostfixExpression", "argumentExpressionList", 
			"unaryExpression", "auxunaryExpression", "unaryOperator", "castExpression", 
			"multiplicativeExpression", "multiplicativeOperator", "additiveExpression", 
			"additiveOperator", "shiftExpression", "shiftOperator", "relationalExpression", 
			"relationalOperator", "equalityExpression", "equilatyOperator", "andExpression", 
			"exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
			"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
			"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
			"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "auxfuntionSpecifier", 
			"alignmentSpecifier", "declarator", "directDeclarator", "auxdirectDeclarator", 
			"aux1directDeclarator", "aux2directDeclarator", "aux3directDeclarator", 
			"aux4directDeclarator", "aux5directDeclarator", "gccDeclaratorExtension", 
			"gccAttributeSpecifier", "gccAttributeList", "auxgccAttributeList", "gccAttribute", 
			"nestedParenthesesBlock", "auxnestedParenthesesBlock", "pointer", "auxpointer", 
			"typeQualifierList", "parameterTypeList", "auxparameterTypeList", "parameterList", 
			"parameterDeclaration", "identifierList", "typeName", "abstractDeclarator", 
			"directAbstractDeclarator", "auxAbstract1", "auxAbstract2", "auxAbstract3", 
			"auxAbstract4", "auxAbstract5", "auxAbstract6", "typedefName", "initializer", 
			"auxInitializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "asm", "volatileText", 
			"auxStatement", "auxStatement2", "labeledStatement", "compoundStatement", 
			"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
			"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
			"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
			"functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'_extension_'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'__m128'", "'__m128d'", "'__m128i'", "'_extension'", "'m128'", "'m128d'", 
			"'_m128i'", "'_typeof_'", "'__declspec'", "'_inline_'", "'__stdcall'", 
			"'__asm'", "'_attribute_'", "'asm'", "'auto'", "'break'", "'case'", "'char'", 
			"'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", "'enum'", 
			"'extern'", "'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", 
			"'long'", "'register'", "'restrict'", "'return'", "'short'", "'signed'", 
			"'sizeof'", "'static'", "'struct'", "'switch'", "'typedef'", "'union'", 
			"'unsigned'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
			"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Auto", "Break", "Case", "Char", 
			"Const", "Continue", "Default", "Do", "Double", "Else", "Enum", "Extern", 
			"Float", "For", "Goto", "If", "Inline", "Int", "Long", "Register", "Restrict", 
			"Return", "Short", "Signed", "Sizeof", "Static", "Struct", "Switch", 
			"Typedef", "Union", "Unsigned", "Void", "Volatile", "While", "Alignas", 
			"Alignof", "Atomic", "Bool", "Complex", "Generic", "Imaginary", "Noreturn", 
			"StaticAssert", "ThreadLocal", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", "Greater", 
			"GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", "Minus", 
			"MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", "Caret", 
			"Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", "StarAssign", 
			"DivAssign", "ModAssign", "PlusAssign", "MinusAssign", "LeftShiftAssign", 
			"RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", "Equal", "NotEqual", 
			"Arrow", "Dot", "Ellipsis", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "ComplexDefine", "IncludeDirective", "AsmBlock", "LineAfterPreprocessing", 
			"LineDirective", "PragmaDirective", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
	public String getGrammarFileName() { return "CGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(CGrammarParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CGrammarParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(234);
					match(StringLiteral);
					}
					}
					setState(237); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				match(LeftParen);
				setState(240);
				expression();
				setState(241);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(244);
					match(T__0);
					}
				}

				setState(247);
				match(LeftParen);
				setState(248);
				compoundStatement();
				setState(249);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(251);
				match(T__1);
				setState(252);
				match(LeftParen);
				setState(253);
				unaryExpression();
				setState(254);
				match(Comma);
				setState(255);
				typeName();
				setState(256);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(258);
				match(T__2);
				setState(259);
				match(LeftParen);
				setState(260);
				typeName();
				setState(261);
				match(Comma);
				setState(262);
				unaryExpression();
				setState(263);
				match(RightParen);
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

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(CGrammarParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Generic);
			setState(268);
			match(LeftParen);
			setState(269);
			assignmentExpression();
			setState(270);
			match(Comma);
			setState(271);
			genericAssocList();
			setState(272);
			match(RightParen);
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

	public static class GenericAssocListContext extends ParserRuleContext {
		public List<GenericAssociationContext> genericAssociation() {
			return getRuleContexts(GenericAssociationContext.class);
		}
		public GenericAssociationContext genericAssociation(int i) {
			return getRuleContext(GenericAssociationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericAssocList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			genericAssociation();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(275);
				match(Comma);
				setState(276);
				genericAssociation();
				}
				}
				setState(281);
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

	public static class GenericAssociationContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Default() { return getToken(CGrammarParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				{
				setState(282);
				typeName();
				}
				break;
			case Default:
				{
				setState(283);
				match(Default);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(286);
			match(Colon);
			setState(287);
			assignmentExpression();
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

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(CGrammarParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CGrammarParser.RightBrace, 0); }
		public List<AuxpostfixExpressionContext> auxpostfixExpression() {
			return getRuleContexts(AuxpostfixExpressionContext.class);
		}
		public AuxpostfixExpressionContext auxpostfixExpression(int i) {
			return getRuleContext(AuxpostfixExpressionContext.class,i);
		}
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_postfixExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(289);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(290);
					match(T__0);
					}
				}

				setState(293);
				match(LeftParen);
				setState(294);
				typeName();
				setState(295);
				match(RightParen);
				setState(296);
				match(LeftBrace);
				setState(297);
				initializerList();
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(298);
					match(Comma);
					}
				}

				setState(301);
				match(RightBrace);
				}
				break;
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (PlusPlus - 62)) | (1L << (MinusMinus - 62)) | (1L << (Arrow - 62)) | (1L << (Dot - 62)))) != 0)) {
				{
				{
				setState(305);
				auxpostfixExpression();
				}
				}
				setState(310);
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

	public static class AuxpostfixExpressionContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode Dot() { return getToken(CGrammarParser.Dot, 0); }
		public TerminalNode Arrow() { return getToken(CGrammarParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(CGrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CGrammarParser.MinusMinus, 0); }
		public AuxpostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxpostfixExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxpostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxpostfixExpressionContext auxpostfixExpression() throws RecognitionException {
		AuxpostfixExpressionContext _localctx = new AuxpostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_auxpostfixExpression);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(LeftBracket);
				setState(312);
				expression();
				setState(313);
				match(RightBracket);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(LeftParen);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(316);
					argumentExpressionList();
					}
				}

				setState(319);
				match(RightParen);
				}
				break;
			case Arrow:
			case Dot:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				_la = _input.LA(1);
				if ( !(_la==Arrow || _la==Dot) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				match(Identifier);
				}
				break;
			case PlusPlus:
			case MinusMinus:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
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

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			assignmentExpression();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(326);
				match(Comma);
				setState(327);
				assignmentExpression();
				}
				}
				setState(332);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TerminalNode AndAnd() { return getToken(CGrammarParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public List<AuxunaryExpressionContext> auxunaryExpression() {
			return getRuleContexts(AuxunaryExpressionContext.class);
		}
		public AuxunaryExpressionContext auxunaryExpression(int i) {
			return getRuleContext(AuxunaryExpressionContext.class,i);
		}
		public TerminalNode Sizeof() { return getToken(CGrammarParser.Sizeof, 0); }
		public TerminalNode Alignof() { return getToken(CGrammarParser.Alignof, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					auxunaryExpression();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case Generic:
			case LeftParen:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(339);
				postfixExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case And:
			case Not:
			case Tilde:
				{
				setState(340);
				unaryOperator();
				setState(341);
				castExpression();
				}
				break;
			case Sizeof:
			case Alignof:
				{
				setState(343);
				_la = _input.LA(1);
				if ( !(_la==Sizeof || _la==Alignof) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(344);
				match(LeftParen);
				setState(345);
				typeName();
				setState(346);
				match(RightParen);
				}
				break;
			case AndAnd:
				{
				setState(348);
				match(AndAnd);
				setState(349);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AuxunaryExpressionContext extends ParserRuleContext {
		public TerminalNode PlusPlus() { return getToken(CGrammarParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(CGrammarParser.MinusMinus, 0); }
		public TerminalNode Sizeof() { return getToken(CGrammarParser.Sizeof, 0); }
		public AuxunaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxunaryExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxunaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxunaryExpressionContext auxunaryExpression() throws RecognitionException {
		AuxunaryExpressionContext _localctx = new AuxunaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_auxunaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (Sizeof - 42)) | (1L << (PlusPlus - 42)) | (1L << (MinusMinus - 42)))) != 0)) ) {
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(CGrammarParser.And, 0); }
		public TerminalNode Star() { return getToken(CGrammarParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CGrammarParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CGrammarParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CGrammarParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (Minus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)))) != 0)) ) {
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

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CGrammarParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_castExpression);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(356);
					match(T__0);
					}
				}

				setState(359);
				match(LeftParen);
				setState(360);
				typeName();
				setState(361);
				match(RightParen);
				setState(362);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(DigitSequence);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<CastExpressionContext> castExpression() {
			return getRuleContexts(CastExpressionContext.class);
		}
		public CastExpressionContext castExpression(int i) {
			return getRuleContext(CastExpressionContext.class,i);
		}
		public List<MultiplicativeOperatorContext> multiplicativeOperator() {
			return getRuleContexts(MultiplicativeOperatorContext.class);
		}
		public MultiplicativeOperatorContext multiplicativeOperator(int i) {
			return getRuleContext(MultiplicativeOperatorContext.class,i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			castExpression();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Div - 78)) | (1L << (Mod - 78)))) != 0)) {
				{
				{
				setState(369);
				multiplicativeOperator();
				setState(370);
				castExpression();
				}
				}
				setState(376);
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

	public static class MultiplicativeOperatorContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CGrammarParser.Star, 0); }
		public TerminalNode Div() { return getToken(CGrammarParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CGrammarParser.Mod, 0); }
		public MultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeOperatorContext multiplicativeOperator() throws RecognitionException {
		MultiplicativeOperatorContext _localctx = new MultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiplicativeOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Div - 78)) | (1L << (Mod - 78)))) != 0)) ) {
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<AdditiveOperatorContext> additiveOperator() {
			return getRuleContexts(AdditiveOperatorContext.class);
		}
		public AdditiveOperatorContext additiveOperator(int i) {
			return getRuleContext(AdditiveOperatorContext.class,i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			multiplicativeExpression();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Plus || _la==Minus) {
				{
				{
				setState(380);
				additiveOperator();
				setState(381);
				multiplicativeExpression();
				}
				}
				setState(387);
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

	public static class AdditiveOperatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(CGrammarParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CGrammarParser.Minus, 0); }
		public AdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveOperatorContext additiveOperator() throws RecognitionException {
		AdditiveOperatorContext _localctx = new AdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_additiveOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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

	public static class ShiftExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<ShiftOperatorContext> shiftOperator() {
			return getRuleContexts(ShiftOperatorContext.class);
		}
		public ShiftOperatorContext shiftOperator(int i) {
			return getRuleContext(ShiftOperatorContext.class,i);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shiftExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			additiveExpression();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LeftShift || _la==RightShift) {
				{
				{
				setState(391);
				shiftOperator();
				setState(392);
				additiveExpression();
				}
				}
				setState(398);
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

	public static class ShiftOperatorContext extends ParserRuleContext {
		public TerminalNode LeftShift() { return getToken(CGrammarParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CGrammarParser.RightShift, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitShiftOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_la = _input.LA(1);
			if ( !(_la==LeftShift || _la==RightShift) ) {
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ShiftExpressionContext> shiftExpression() {
			return getRuleContexts(ShiftExpressionContext.class);
		}
		public ShiftExpressionContext shiftExpression(int i) {
			return getRuleContext(ShiftExpressionContext.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			shiftExpression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Less - 68)) | (1L << (LessEqual - 68)) | (1L << (Greater - 68)) | (1L << (GreaterEqual - 68)))) != 0)) {
				{
				{
				setState(402);
				relationalOperator();
				setState(403);
				shiftExpression();
				}
				}
				setState(409);
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(CGrammarParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CGrammarParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CGrammarParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CGrammarParser.GreaterEqual, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitRelationalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (Less - 68)) | (1L << (LessEqual - 68)) | (1L << (Greater - 68)) | (1L << (GreaterEqual - 68)))) != 0)) ) {
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<EquilatyOperatorContext> equilatyOperator() {
			return getRuleContexts(EquilatyOperatorContext.class);
		}
		public EquilatyOperatorContext equilatyOperator(int i) {
			return getRuleContext(EquilatyOperatorContext.class,i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			relationalExpression();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Equal || _la==NotEqual) {
				{
				{
				setState(413);
				equilatyOperator();
				setState(414);
				relationalExpression();
				}
				}
				setState(420);
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

	public static class EquilatyOperatorContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(CGrammarParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(CGrammarParser.NotEqual, 0); }
		public EquilatyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equilatyOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEquilatyOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquilatyOperatorContext equilatyOperator() throws RecognitionException {
		EquilatyOperatorContext _localctx = new EquilatyOperatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_equilatyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !(_la==Equal || _la==NotEqual) ) {
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

	public static class AndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(CGrammarParser.And); }
		public TerminalNode And(int i) {
			return getToken(CGrammarParser.And, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			equalityExpression();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(424);
				match(And);
				setState(425);
				equalityExpression();
				}
				}
				setState(430);
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

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> Caret() { return getTokens(CGrammarParser.Caret); }
		public TerminalNode Caret(int i) {
			return getToken(CGrammarParser.Caret, i);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			andExpression();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Caret) {
				{
				{
				setState(432);
				match(Caret);
				setState(433);
				andExpression();
				}
				}
				setState(438);
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

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public List<ExclusiveOrExpressionContext> exclusiveOrExpression() {
			return getRuleContexts(ExclusiveOrExpressionContext.class);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression(int i) {
			return getRuleContext(ExclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(CGrammarParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(CGrammarParser.Or, i);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_inclusiveOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			exclusiveOrExpression();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(440);
				match(Or);
				setState(441);
				exclusiveOrExpression();
				}
				}
				setState(446);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<InclusiveOrExpressionContext> inclusiveOrExpression() {
			return getRuleContexts(InclusiveOrExpressionContext.class);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression(int i) {
			return getRuleContext(InclusiveOrExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(CGrammarParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(CGrammarParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			inclusiveOrExpression();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AndAnd) {
				{
				{
				setState(448);
				match(AndAnd);
				setState(449);
				inclusiveOrExpression();
				}
				}
				setState(454);
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(CGrammarParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(CGrammarParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			logicalAndExpression();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OrOr) {
				{
				{
				setState(456);
				match(OrOr);
				setState(457);
				logicalAndExpression();
				}
				}
				setState(462);
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

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(CGrammarParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conditionalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			logicalOrExpression();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Question) {
				{
				setState(464);
				match(Question);
				setState(465);
				expression();
				setState(466);
				match(Colon);
				setState(467);
				conditionalExpression();
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

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(CGrammarParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_assignmentExpression);
		try {
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(Identifier);
				setState(473);
				assignmentOperator();
				setState(474);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(476);
				match(DigitSequence);
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CGrammarParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CGrammarParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CGrammarParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CGrammarParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CGrammarParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CGrammarParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CGrammarParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CGrammarParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CGrammarParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CGrammarParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CGrammarParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (Assign - 92)) | (1L << (StarAssign - 92)) | (1L << (DivAssign - 92)) | (1L << (ModAssign - 92)) | (1L << (PlusAssign - 92)) | (1L << (MinusAssign - 92)) | (1L << (LeftShiftAssign - 92)) | (1L << (RightShiftAssign - 92)) | (1L << (AndAssign - 92)) | (1L << (XorAssign - 92)) | (1L << (OrAssign - 92)))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			assignmentExpression();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(482);
				match(Comma);
				setState(483);
				assignmentExpression();
				}
				}
				setState(488);
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			conditionalExpression();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				declarationSpecifiers();
				setState(493);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(492);
					initDeclaratorList();
					}
				}

				setState(495);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				staticAssertDeclaration();
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

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(500);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(503); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationSpecifiers2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(505);
				declarationSpecifier();
				}
				}
				setState(508); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier );
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

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declarationSpecifier);
		try {
			setState(515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(512);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(513);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(514);
				alignmentSpecifier();
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

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			initDeclarator();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(518);
				match(Comma);
				setState(519);
				initDeclarator();
				}
				}
				setState(524);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CGrammarParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			declarator();
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(526);
				match(Assign);
				setState(527);
				initializer();
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

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(CGrammarParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(CGrammarParser.Extern, 0); }
		public TerminalNode Static() { return getToken(CGrammarParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(CGrammarParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(CGrammarParser.Auto, 0); }
		public TerminalNode Register() { return getToken(CGrammarParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(CGrammarParser.Void, 0); }
		public TerminalNode Char() { return getToken(CGrammarParser.Char, 0); }
		public TerminalNode Short() { return getToken(CGrammarParser.Short, 0); }
		public TerminalNode Int() { return getToken(CGrammarParser.Int, 0); }
		public TerminalNode Long() { return getToken(CGrammarParser.Long, 0); }
		public TerminalNode Float() { return getToken(CGrammarParser.Float, 0); }
		public TerminalNode Double() { return getToken(CGrammarParser.Double, 0); }
		public TerminalNode Signed() { return getToken(CGrammarParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CGrammarParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(CGrammarParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(CGrammarParser.Complex, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				setState(533);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__6:
				{
				setState(534);
				match(T__6);
				setState(535);
				match(LeftParen);
				setState(536);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(537);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				setState(538);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				setState(539);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(540);
				enumSpecifier();
				}
				break;
			case Identifier:
				{
				setState(541);
				typedefName();
				}
				break;
			case T__10:
				{
				setState(542);
				match(T__10);
				setState(543);
				match(LeftParen);
				setState(544);
				constantExpression();
				setState(545);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(549);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(550);
					pointer();
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CGrammarParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CGrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				structOrUnion();
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(557);
					match(Identifier);
					}
				}

				setState(560);
				match(LeftBrace);
				setState(561);
				structDeclarationList();
				setState(562);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				structOrUnion();
				setState(565);
				match(Identifier);
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

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(CGrammarParser.Struct, 0); }
		public TerminalNode Union() { return getToken(CGrammarParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
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

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(571);
				structDeclaration();
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << StaticAssert))) != 0) || _la==Identifier );
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_structDeclaration);
		int _la;
		try {
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__10:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				specifierQualifierList();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Colon - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(577);
					structDeclaratorList();
					}
				}

				setState(580);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				staticAssertDeclaration();
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

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_specifierQualifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(585);
				typeSpecifier(0);
				}
				break;
			case 2:
				{
				setState(586);
				typeQualifier();
				}
				break;
			}
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(589);
				specifierQualifierList();
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

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			structDeclarator();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(593);
				match(Comma);
				setState(594);
				structDeclarator();
				}
				}
				setState(599);
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

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_structDeclarator);
		int _la;
		try {
			setState(606);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
					{
					setState(601);
					declarator();
					}
				}

				setState(604);
				match(Colon);
				setState(605);
				constantExpression();
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

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CGrammarParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(CGrammarParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CGrammarParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enumSpecifier);
		int _la;
		try {
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(608);
				match(Enum);
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(609);
					match(Identifier);
					}
				}

				setState(612);
				match(LeftBrace);
				setState(613);
				enumeratorList();
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(614);
					match(Comma);
					}
				}

				setState(617);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(619);
				match(Enum);
				setState(620);
				match(Identifier);
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

	public static class EnumeratorListContext extends ParserRuleContext {
		public List<EnumeratorContext> enumerator() {
			return getRuleContexts(EnumeratorContext.class);
		}
		public EnumeratorContext enumerator(int i) {
			return getRuleContext(EnumeratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_enumeratorList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			enumerator();
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(624);
					match(Comma);
					setState(625);
					enumerator();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CGrammarParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_enumerator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			enumerationConstant();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(632);
				match(Assign);
				setState(633);
				constantExpression();
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

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(Identifier);
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

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(CGrammarParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(Atomic);
			setState(639);
			match(LeftParen);
			setState(640);
			typeName();
			setState(641);
			match(RightParen);
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

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CGrammarParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(CGrammarParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(CGrammarParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(CGrammarParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
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

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public AuxfuntionSpecifierContext auxfuntionSpecifier() {
			return getRuleContext(AuxfuntionSpecifierContext.class,0);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_functionSpecifier);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				auxfuntionSpecifier();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				gccAttributeSpecifier();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(647);
				match(T__11);
				setState(648);
				match(LeftParen);
				setState(649);
				match(Identifier);
				setState(650);
				match(RightParen);
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

	public static class AuxfuntionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CGrammarParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(CGrammarParser.Noreturn, 0); }
		public AuxfuntionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxfuntionSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxfuntionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxfuntionSpecifierContext auxfuntionSpecifier() throws RecognitionException {
		AuxfuntionSpecifierContext _localctx = new AuxfuntionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_auxfuntionSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
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

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CGrammarParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_alignmentSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(Alignas);
			setState(656);
			match(LeftParen);
			setState(659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(657);
				typeName();
				}
				break;
			case 2:
				{
				setState(658);
				constantExpression();
				}
				break;
			}
			setState(661);
			match(RightParen);
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

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(663);
				pointer();
				}
			}

			setState(666);
			directDeclarator(0);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(667);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(CGrammarParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public AuxdirectDeclaratorContext auxdirectDeclarator() {
			return getRuleContext(AuxdirectDeclaratorContext.class,0);
		}
		public Aux1directDeclaratorContext aux1directDeclarator() {
			return getRuleContext(Aux1directDeclaratorContext.class,0);
		}
		public Aux2directDeclaratorContext aux2directDeclarator() {
			return getRuleContext(Aux2directDeclaratorContext.class,0);
		}
		public Aux3directDeclaratorContext aux3directDeclarator() {
			return getRuleContext(Aux3directDeclaratorContext.class,0);
		}
		public Aux4directDeclaratorContext aux4directDeclarator() {
			return getRuleContext(Aux4directDeclaratorContext.class,0);
		}
		public Aux5directDeclaratorContext aux5directDeclarator() {
			return getRuleContext(Aux5directDeclaratorContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(674);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(675);
				match(LeftParen);
				setState(676);
				declarator();
				setState(677);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(679);
				match(Identifier);
				setState(680);
				match(Colon);
				setState(681);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(682);
				match(LeftParen);
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(683);
					typeSpecifier(0);
					}
				}

				setState(686);
				pointer();
				setState(687);
				directDeclarator(0);
				setState(688);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(706);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(704);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(692);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(693);
						auxdirectDeclarator();
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(694);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(695);
						aux1directDeclarator();
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(696);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(697);
						aux2directDeclarator();
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(698);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(699);
						aux3directDeclarator();
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(700);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(701);
						aux4directDeclarator();
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(702);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(703);
						aux5directDeclarator();
						}
						break;
					}
					} 
				}
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
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

	public static class AuxdirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AuxdirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxdirectDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxdirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxdirectDeclaratorContext auxdirectDeclarator() throws RecognitionException {
		AuxdirectDeclaratorContext _localctx = new AuxdirectDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_auxdirectDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			match(LeftBracket);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(710);
				typeQualifierList();
				}
			}

			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(713);
				assignmentExpression();
				}
			}

			setState(716);
			match(RightBracket);
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

	public static class Aux1directDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode Static() { return getToken(CGrammarParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public Aux1directDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux1directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAux1directDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux1directDeclaratorContext aux1directDeclarator() throws RecognitionException {
		Aux1directDeclaratorContext _localctx = new Aux1directDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_aux1directDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			match(LeftBracket);
			setState(719);
			match(Static);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(720);
				typeQualifierList();
				}
			}

			setState(723);
			assignmentExpression();
			setState(724);
			match(RightBracket);
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

	public static class Aux2directDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TerminalNode Static() { return getToken(CGrammarParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public Aux2directDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux2directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAux2directDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux2directDeclaratorContext aux2directDeclarator() throws RecognitionException {
		Aux2directDeclaratorContext _localctx = new Aux2directDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_aux2directDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(LeftBracket);
			setState(727);
			typeQualifierList();
			setState(728);
			match(Static);
			setState(729);
			assignmentExpression();
			setState(730);
			match(RightBracket);
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

	public static class Aux3directDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode Star() { return getToken(CGrammarParser.Star, 0); }
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public Aux3directDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux3directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAux3directDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux3directDeclaratorContext aux3directDeclarator() throws RecognitionException {
		Aux3directDeclaratorContext _localctx = new Aux3directDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_aux3directDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			match(LeftBracket);
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(733);
				typeQualifierList();
				}
			}

			setState(736);
			match(Star);
			setState(737);
			match(RightBracket);
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

	public static class Aux4directDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public Aux4directDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux4directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAux4directDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux4directDeclaratorContext aux4directDeclarator() throws RecognitionException {
		Aux4directDeclaratorContext _localctx = new Aux4directDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_aux4directDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(LeftParen);
			setState(740);
			parameterTypeList();
			setState(741);
			match(RightParen);
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

	public static class Aux5directDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Aux5directDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux5directDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAux5directDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aux5directDeclaratorContext aux5directDeclarator() throws RecognitionException {
		Aux5directDeclaratorContext _localctx = new Aux5directDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_aux5directDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(LeftParen);
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(744);
				identifierList();
				}
			}

			setState(747);
			match(RightParen);
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

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CGrammarParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(749);
				match(T__14);
				setState(750);
				match(LeftParen);
				setState(752); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(751);
					match(StringLiteral);
					}
					}
					setState(754); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(756);
				match(RightParen);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(757);
				gccAttributeSpecifier();
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

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(CGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CGrammarParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(CGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CGrammarParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(T__15);
			setState(761);
			match(LeftParen);
			setState(762);
			match(LeftParen);
			setState(763);
			gccAttributeList();
			setState(764);
			match(RightParen);
			setState(765);
			match(RightParen);
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

	public static class GccAttributeListContext extends ParserRuleContext {
		public GccAttributeContext gccAttribute() {
			return getRuleContext(GccAttributeContext.class,0);
		}
		public List<AuxgccAttributeListContext> auxgccAttributeList() {
			return getRuleContexts(AuxgccAttributeListContext.class);
		}
		public AuxgccAttributeListContext auxgccAttributeList(int i) {
			return getRuleContext(AuxgccAttributeListContext.class,i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_gccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(767);
				gccAttribute();
				}
			}

			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(770);
				auxgccAttributeList();
				}
				}
				setState(775);
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

	public static class AuxgccAttributeListContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public GccAttributeContext gccAttribute() {
			return getRuleContext(GccAttributeContext.class,0);
		}
		public AuxgccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxgccAttributeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxgccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxgccAttributeListContext auxgccAttributeList() throws RecognitionException {
		AuxgccAttributeListContext _localctx = new AuxgccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_auxgccAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(Comma);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(777);
				gccAttribute();
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

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(CGrammarParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(CGrammarParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(CGrammarParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(CGrammarParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_gccAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_la = _input.LA(1);
			if ( _la <= 0 || (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (RightParen - 62)) | (1L << (Comma - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(781);
				match(LeftParen);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(782);
					argumentExpressionList();
					}
				}

				setState(785);
				match(RightParen);
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

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<AuxnestedParenthesesBlockContext> auxnestedParenthesesBlock() {
			return getRuleContexts(AuxnestedParenthesesBlockContext.class);
		}
		public AuxnestedParenthesesBlockContext auxnestedParenthesesBlock(int i) {
			return getRuleContext(AuxnestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				{
				setState(788);
				auxnestedParenthesesBlock();
				}
				}
				setState(793);
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

	public static class AuxnestedParenthesesBlockContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public NestedParenthesesBlockContext nestedParenthesesBlock() {
			return getRuleContext(NestedParenthesesBlockContext.class,0);
		}
		public AuxnestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxnestedParenthesesBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxnestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxnestedParenthesesBlockContext auxnestedParenthesesBlock() throws RecognitionException {
		AuxnestedParenthesesBlockContext _localctx = new AuxnestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_auxnestedParenthesesBlock);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Comma:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case IncludeDirective:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(LeftParen);
				setState(796);
				nestedParenthesesBlock();
				setState(797);
				match(RightParen);
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

	public static class PointerContext extends ParserRuleContext {
		public List<AuxpointerContext> auxpointer() {
			return getRuleContexts(AuxpointerContext.class);
		}
		public AuxpointerContext auxpointer(int i) {
			return getRuleContext(AuxpointerContext.class,i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pointer);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(802); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(801);
					auxpointer();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(804); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AuxpointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(CGrammarParser.Star, 0); }
		public TerminalNode Caret() { return getToken(CGrammarParser.Caret, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AuxpointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxpointer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxpointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxpointerContext auxpointer() throws RecognitionException {
		AuxpointerContext _localctx = new AuxpointerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_auxpointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			_la = _input.LA(1);
			if ( !(_la==Star || _la==Caret) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(807);
				typeQualifierList();
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

	public static class TypeQualifierListContext extends ParserRuleContext {
		public List<TypeQualifierContext> typeQualifier() {
			return getRuleContexts(TypeQualifierContext.class);
		}
		public TypeQualifierContext typeQualifier(int i) {
			return getRuleContext(TypeQualifierContext.class,i);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_typeQualifierList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(811); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(810);
					typeQualifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(813); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public AuxparameterTypeListContext auxparameterTypeList() {
			return getRuleContext(AuxparameterTypeListContext.class,0);
		}
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_parameterTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			parameterList();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(816);
				auxparameterTypeList();
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

	public static class AuxparameterTypeListContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(CGrammarParser.Ellipsis, 0); }
		public AuxparameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxparameterTypeList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxparameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxparameterTypeListContext auxparameterTypeList() throws RecognitionException {
		AuxparameterTypeListContext _localctx = new AuxparameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_auxparameterTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(819);
			match(Comma);
			setState(820);
			match(Ellipsis);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_parameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(822);
			parameterDeclaration();
			setState(827);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(823);
					match(Comma);
					setState(824);
					parameterDeclaration();
					}
					} 
				}
				setState(829);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_parameterDeclaration);
		int _la;
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				declarationSpecifiers();
				setState(831);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				declarationSpecifiers2();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)))) != 0)) {
					{
					setState(834);
					abstractDeclarator();
					}
				}

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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(CGrammarParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(CGrammarParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839);
			match(Identifier);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(840);
				match(Comma);
				setState(841);
				match(Identifier);
				}
				}
				setState(846);
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

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			specifierQualifierList();
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (LeftBracket - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)))) != 0)) {
				{
				setState(848);
				abstractDeclarator();
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

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_abstractDeclarator);
		int _la;
		try {
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(852);
					pointer();
					}
				}

				setState(855);
				directAbstractDeclarator(0);
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14 || _la==T__15) {
					{
					{
					setState(856);
					gccDeclaratorExtension();
					}
					}
					setState(861);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public AuxAbstract1Context auxAbstract1() {
			return getRuleContext(AuxAbstract1Context.class,0);
		}
		public AuxAbstract2Context auxAbstract2() {
			return getRuleContext(AuxAbstract2Context.class,0);
		}
		public AuxAbstract3Context auxAbstract3() {
			return getRuleContext(AuxAbstract3Context.class,0);
		}
		public AuxAbstract4Context auxAbstract4() {
			return getRuleContext(AuxAbstract4Context.class,0);
		}
		public AuxAbstract5Context auxAbstract5() {
			return getRuleContext(AuxAbstract5Context.class,0);
		}
		public AuxAbstract6Context auxAbstract6() {
			return getRuleContext(AuxAbstract6Context.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_directAbstractDeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(865);
				auxAbstract1();
				}
				break;
			case 2:
				{
				setState(866);
				auxAbstract2();
				}
				break;
			case 3:
				{
				setState(867);
				auxAbstract3();
				}
				break;
			case 4:
				{
				setState(868);
				auxAbstract4();
				}
				break;
			case 5:
				{
				setState(869);
				auxAbstract5();
				}
				break;
			case 6:
				{
				setState(870);
				auxAbstract6();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(885);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(873);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(874);
						auxAbstract2();
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(875);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(876);
						auxAbstract3();
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(877);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(878);
						auxAbstract4();
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(879);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(880);
						auxAbstract5();
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(881);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(882);
						auxAbstract6();
						}
						break;
					}
					} 
				}
				setState(887);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class AuxAbstract1Context extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AuxAbstract1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract1Context auxAbstract1() throws RecognitionException {
		AuxAbstract1Context _localctx = new AuxAbstract1Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_auxAbstract1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(LeftParen);
			setState(889);
			abstractDeclarator();
			setState(890);
			match(RightParen);
			setState(894);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(891);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(896);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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

	public static class AuxAbstract2Context extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AuxAbstract2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract2Context auxAbstract2() throws RecognitionException {
		AuxAbstract2Context _localctx = new AuxAbstract2Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_auxAbstract2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(LeftBracket);
			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(898);
				typeQualifierList();
				}
			}

			setState(902);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(901);
				assignmentExpression();
				}
			}

			setState(904);
			match(RightBracket);
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

	public static class AuxAbstract3Context extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode Static() { return getToken(CGrammarParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AuxAbstract3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract3Context auxAbstract3() throws RecognitionException {
		AuxAbstract3Context _localctx = new AuxAbstract3Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_auxAbstract3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			match(LeftBracket);
			setState(907);
			match(Static);
			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
				{
				setState(908);
				typeQualifierList();
				}
			}

			setState(911);
			assignmentExpression();
			setState(912);
			match(RightBracket);
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

	public static class AuxAbstract4Context extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TerminalNode Static() { return getToken(CGrammarParser.Static, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public AuxAbstract4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract4; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract4Context auxAbstract4() throws RecognitionException {
		AuxAbstract4Context _localctx = new AuxAbstract4Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_auxAbstract4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(LeftBracket);
			setState(915);
			typeQualifierList();
			setState(916);
			match(Static);
			setState(917);
			assignmentExpression();
			setState(918);
			match(RightBracket);
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

	public static class AuxAbstract5Context extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public TerminalNode Star() { return getToken(CGrammarParser.Star, 0); }
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public AuxAbstract5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract5; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract5Context auxAbstract5() throws RecognitionException {
		AuxAbstract5Context _localctx = new AuxAbstract5Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_auxAbstract5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(LeftBracket);
			setState(921);
			match(Star);
			setState(922);
			match(RightBracket);
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

	public static class AuxAbstract6Context extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AuxAbstract6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxAbstract6; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxAbstract6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxAbstract6Context auxAbstract6() throws RecognitionException {
		AuxAbstract6Context _localctx = new AuxAbstract6Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_auxAbstract6);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(LeftParen);
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(925);
				parameterTypeList();
				}
			}

			setState(928);
			match(RightParen);
			setState(932);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(929);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(934);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(Identifier);
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

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(CGrammarParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(CGrammarParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_initializer);
		int _la;
		try {
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				assignmentExpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(938);
				match(LeftBrace);
				setState(939);
				initializerList();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(940);
					match(Comma);
					}
				}

				setState(943);
				match(RightBrace);
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

	public static class AuxInitializerContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public AuxInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxInitializerContext auxInitializer() throws RecognitionException {
		AuxInitializerContext _localctx = new AuxInitializerContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_auxInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(Comma);
			setState(949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(948);
				designation();
				}
			}

			setState(951);
			initializer();
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

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public List<AuxInitializerContext> auxInitializer() {
			return getRuleContexts(AuxInitializerContext.class);
		}
		public AuxInitializerContext auxInitializer(int i) {
			return getRuleContext(AuxInitializerContext.class,i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_initializerList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(953);
				designation();
				}
			}

			setState(956);
			initializer();
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(957);
					auxInitializer();
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(CGrammarParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			designatorList();
			setState(964);
			match(Assign);
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

	public static class DesignatorListContext extends ParserRuleContext {
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_designatorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(966);
				designator();
				}
				}
				setState(969); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
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

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(CGrammarParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(CGrammarParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(CGrammarParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_designator);
		try {
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				match(LeftBracket);
				setState(972);
				constantExpression();
				setState(973);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				match(Dot);
				setState(976);
				match(Identifier);
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

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(CGrammarParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(CGrammarParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(CGrammarParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CGrammarParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(StaticAssert);
			setState(980);
			match(LeftParen);
			setState(981);
			constantExpression();
			setState(982);
			match(Comma);
			setState(984); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(983);
				match(StringLiteral);
				}
				}
				setState(986); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(988);
			match(RightParen);
			setState(989);
			match(Semi);
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

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public AsmContext asm() {
			return getRuleContext(AsmContext.class,0);
		}
		public VolatileTextContext volatileText() {
			return getRuleContext(VolatileTextContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public AuxStatementContext auxStatement() {
			return getRuleContext(AuxStatementContext.class,0);
		}
		public List<AuxStatement2Context> auxStatement2() {
			return getRuleContexts(AuxStatement2Context.class);
		}
		public AuxStatement2Context auxStatement2(int i) {
			return getRuleContext(AuxStatement2Context.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_statement);
		int _la;
		try {
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(993);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(994);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(995);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(996);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(997);
				asm();
				setState(998);
				volatileText();
				setState(999);
				match(LeftParen);
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1000);
					auxStatement();
					}
				}

				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1003);
					auxStatement2();
					}
					}
					setState(1008);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1009);
				match(RightParen);
				setState(1010);
				match(Semi);
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

	public static class AsmContext extends ParserRuleContext {
		public AsmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAsm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsmContext asm() throws RecognitionException {
		AsmContext _localctx = new AsmContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_asm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			_la = _input.LA(1);
			if ( !(_la==T__16) ) {
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

	public static class VolatileTextContext extends ParserRuleContext {
		public TerminalNode Volatile() { return getToken(CGrammarParser.Volatile, 0); }
		public VolatileTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_volatileText; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitVolatileText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VolatileTextContext volatileText() throws RecognitionException {
		VolatileTextContext _localctx = new VolatileTextContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_volatileText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			_la = _input.LA(1);
			if ( !(_la==Volatile) ) {
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

	public static class AuxStatementContext extends ParserRuleContext {
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public AuxStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxStatementContext auxStatement() throws RecognitionException {
		AuxStatementContext _localctx = new AuxStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_auxStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			logicalOrExpression();
			setState(1023);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1019);
				match(Comma);
				setState(1020);
				logicalOrExpression();
				}
				}
				setState(1025);
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

	public static class AuxStatement2Context extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public AuxStatementContext auxStatement() {
			return getRuleContext(AuxStatementContext.class,0);
		}
		public AuxStatement2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_auxStatement2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitAuxStatement2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuxStatement2Context auxStatement2() throws RecognitionException {
		AuxStatement2Context _localctx = new AuxStatement2Context(_ctx, getState());
		enterRule(_localctx, 198, RULE_auxStatement2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(Colon);
			setState(1028);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1027);
				auxStatement();
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

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(CGrammarParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(CGrammarParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(CGrammarParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_labeledStatement);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				match(Identifier);
				setState(1031);
				match(Colon);
				setState(1032);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(Case);
				setState(1034);
				constantExpression();
				setState(1035);
				match(Colon);
				setState(1036);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1038);
				match(Default);
				setState(1039);
				match(Colon);
				setState(1040);
				statement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(CGrammarParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(CGrammarParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(LeftBrace);
			setState(1045);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0)) {
				{
				setState(1044);
				blockItemList();
				}
			}

			setState(1047);
			match(RightBrace);
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

	public static class BlockItemListContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_blockItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1049);
				blockItem();
				}
				}
				setState(1052); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LeftBrace - 66)) | (1L << (Plus - 66)) | (1L << (PlusPlus - 66)) | (1L << (Minus - 66)) | (1L << (MinusMinus - 66)) | (1L << (Star - 66)) | (1L << (And - 66)) | (1L << (AndAnd - 66)) | (1L << (Not - 66)) | (1L << (Tilde - 66)) | (1L << (Semi - 66)) | (1L << (Identifier - 66)) | (1L << (Constant - 66)) | (1L << (DigitSequence - 66)) | (1L << (StringLiteral - 66)))) != 0) );
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

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_blockItem);
		try {
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1054);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1055);
				declaration();
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1058);
				expression();
				}
			}

			setState(1061);
			match(Semi);
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

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(CGrammarParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(CGrammarParser.Else, 0); }
		public TerminalNode Switch() { return getToken(CGrammarParser.Switch, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_selectionStatement);
		try {
			setState(1078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(If);
				setState(1064);
				match(LeftParen);
				setState(1065);
				expression();
				setState(1066);
				match(RightParen);
				setState(1067);
				statement();
				setState(1070);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1068);
					match(Else);
					setState(1069);
					statement();
					}
					break;
				}
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(Switch);
				setState(1073);
				match(LeftParen);
				setState(1074);
				expression();
				setState(1075);
				match(RightParen);
				setState(1076);
				statement();
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CGrammarParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(CGrammarParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(CGrammarParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CGrammarParser.Do, 0); }
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public TerminalNode For() { return getToken(CGrammarParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_iterationStatement);
		try {
			setState(1100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				match(While);
				setState(1081);
				match(LeftParen);
				setState(1082);
				expression();
				setState(1083);
				match(RightParen);
				setState(1084);
				statement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1086);
				match(Do);
				setState(1087);
				statement();
				setState(1088);
				match(While);
				setState(1089);
				match(LeftParen);
				setState(1090);
				expression();
				setState(1091);
				match(RightParen);
				setState(1092);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				match(For);
				setState(1095);
				match(LeftParen);
				setState(1096);
				forCondition();
				setState(1097);
				match(RightParen);
				setState(1098);
				statement();
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

	public static class ForConditionContext extends ParserRuleContext {
		public List<TerminalNode> Semi() { return getTokens(CGrammarParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(CGrammarParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1102);
				forDeclaration();
				}
				break;
			case 2:
				{
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1103);
					expression();
					}
				}

				}
				break;
			}
			setState(1108);
			match(Semi);
			setState(1110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1109);
				forExpression();
				}
			}

			setState(1112);
			match(Semi);
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
				{
				setState(1113);
				forExpression();
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

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			declarationSpecifiers();
			setState(1118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (LeftParen - 62)) | (1L << (Star - 62)) | (1L << (Caret - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(1117);
				initDeclaratorList();
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

	public static class ForExpressionContext extends ParserRuleContext {
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(CGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(CGrammarParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			assignmentExpression();
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1121);
				match(Comma);
				setState(1122);
				assignmentExpression();
				}
				}
				setState(1127);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public TerminalNode Goto() { return getToken(CGrammarParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CGrammarParser.Identifier, 0); }
		public TerminalNode Return() { return getToken(CGrammarParser.Return, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Continue() { return getToken(CGrammarParser.Continue, 0); }
		public TerminalNode Break() { return getToken(CGrammarParser.Break, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_jumpStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1128);
				match(Goto);
				setState(1129);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==Break || _la==Continue) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(1131);
				match(Return);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (Plus - 74)) | (1L << (PlusPlus - 74)) | (1L << (Minus - 74)) | (1L << (MinusMinus - 74)) | (1L << (Star - 74)) | (1L << (And - 74)) | (1L << (AndAnd - 74)) | (1L << (Not - 74)) | (1L << (Tilde - 74)) | (1L << (Identifier - 74)) | (1L << (Constant - 74)) | (1L << (DigitSequence - 74)) | (1L << (StringLiteral - 74)))) != 0)) {
					{
					setState(1132);
					expression();
					}
				}

				}
				break;
			case 4:
				{
				setState(1135);
				match(Goto);
				setState(1136);
				unaryExpression();
				}
				break;
			}
			setState(1139);
			match(Semi);
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CGrammarParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Caret - 78)) | (1L << (Semi - 78)) | (1L << (Identifier - 78)) | (1L << (ComplexDefine - 78)) | (1L << (IncludeDirective - 78)))) != 0)) {
				{
				setState(1141);
				translationUnit();
				}
			}

			setState(1144);
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

	public static class TranslationUnitContext extends ParserRuleContext {
		public List<TerminalNode> IncludeDirective() { return getTokens(CGrammarParser.IncludeDirective); }
		public TerminalNode IncludeDirective(int i) {
			return getToken(CGrammarParser.IncludeDirective, i);
		}
		public List<TerminalNode> ComplexDefine() { return getTokens(CGrammarParser.ComplexDefine); }
		public TerminalNode ComplexDefine(int i) {
			return getToken(CGrammarParser.ComplexDefine, i);
		}
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IncludeDirective) {
				{
				{
				setState(1146);
				match(IncludeDirective);
				}
				}
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ComplexDefine) {
				{
				{
				setState(1152);
				match(ComplexDefine);
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1159); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1158);
				externalDeclaration();
				}
				}
				setState(1161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (Star - 78)) | (1L << (Caret - 78)) | (1L << (Semi - 78)) | (1L << (Identifier - 78)))) != 0) );
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

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(CGrammarParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_externalDeclaration);
		try {
			setState(1166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1163);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1164);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1165);
				match(Semi);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1168);
				declarationSpecifiers();
				}
				break;
			}
			setState(1171);
			declarator();
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1172);
				declarationList();
				}
			}

			setState(1175);
			compoundStatement();
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

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CGrammarVisitor ) return ((CGrammarVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1177);
				declaration();
				}
				}
				setState(1180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier );
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
		case 38:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 56:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 80:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u04a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\3\2\3\2"+
		"\3\2\6\2\u00ee\n\2\r\2\16\2\u00ef\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00f8\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2\u010c\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4\u0118\n"+
		"\4\f\4\16\4\u011b\13\4\3\5\3\5\5\5\u011f\n\5\3\5\3\5\3\5\3\6\3\6\5\6\u0126"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u012e\n\6\3\6\3\6\5\6\u0132\n\6\3\6\7"+
		"\6\u0135\n\6\f\6\16\6\u0138\13\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0140\n\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0146\n\7\3\b\3\b\3\b\7\b\u014b\n\b\f\b\16\b\u014e"+
		"\13\b\3\t\7\t\u0151\n\t\f\t\16\t\u0154\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0161\n\t\3\n\3\n\3\13\3\13\3\f\5\f\u0168\n\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0171\n\f\3\r\3\r\3\r\3\r\7\r\u0177\n\r"+
		"\f\r\16\r\u017a\13\r\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0182\n\17\f\17"+
		"\16\17\u0185\13\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u018d\n\21\f\21"+
		"\16\21\u0190\13\21\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0198\n\23\f\23"+
		"\16\23\u019b\13\23\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u01a3\n\25\f\25"+
		"\16\25\u01a6\13\25\3\26\3\26\3\27\3\27\3\27\7\27\u01ad\n\27\f\27\16\27"+
		"\u01b0\13\27\3\30\3\30\3\30\7\30\u01b5\n\30\f\30\16\30\u01b8\13\30\3\31"+
		"\3\31\3\31\7\31\u01bd\n\31\f\31\16\31\u01c0\13\31\3\32\3\32\3\32\7\32"+
		"\u01c5\n\32\f\32\16\32\u01c8\13\32\3\33\3\33\3\33\7\33\u01cd\n\33\f\33"+
		"\16\33\u01d0\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01d8\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u01e0\n\35\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u01e7\n\37\f\37\16\37\u01ea\13\37\3 \3 \3!\3!\5!\u01f0\n!\3!\3!\3!\5"+
		"!\u01f5\n!\3\"\6\"\u01f8\n\"\r\"\16\"\u01f9\3#\6#\u01fd\n#\r#\16#\u01fe"+
		"\3$\3$\3$\3$\3$\5$\u0206\n$\3%\3%\3%\7%\u020b\n%\f%\16%\u020e\13%\3&\3"+
		"&\3&\5&\u0213\n&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\5(\u0226\n(\3(\3(\7(\u022a\n(\f(\16(\u022d\13(\3)\3)\5)\u0231\n)\3)\3"+
		")\3)\3)\3)\3)\3)\5)\u023a\n)\3*\3*\3+\6+\u023f\n+\r+\16+\u0240\3,\3,\5"+
		",\u0245\n,\3,\3,\3,\5,\u024a\n,\3-\3-\5-\u024e\n-\3-\5-\u0251\n-\3.\3"+
		".\3.\7.\u0256\n.\f.\16.\u0259\13.\3/\3/\5/\u025d\n/\3/\3/\5/\u0261\n/"+
		"\3\60\3\60\5\60\u0265\n\60\3\60\3\60\3\60\5\60\u026a\n\60\3\60\3\60\3"+
		"\60\3\60\5\60\u0270\n\60\3\61\3\61\3\61\7\61\u0275\n\61\f\61\16\61\u0278"+
		"\13\61\3\62\3\62\3\62\5\62\u027d\n\62\3\63\3\63\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u028e\n\66\3\67\3\67"+
		"\38\38\38\38\58\u0296\n8\38\38\39\59\u029b\n9\39\39\79\u029f\n9\f9\16"+
		"9\u02a2\139\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u02af\n:\3:\3:\3:\3:\5"+
		":\u02b5\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\7:\u02c3\n:\f:\16:\u02c6"+
		"\13:\3;\3;\5;\u02ca\n;\3;\5;\u02cd\n;\3;\3;\3<\3<\3<\5<\u02d4\n<\3<\3"+
		"<\3<\3=\3=\3=\3=\3=\3=\3>\3>\5>\u02e1\n>\3>\3>\3>\3?\3?\3?\3?\3@\3@\5"+
		"@\u02ec\n@\3@\3@\3A\3A\3A\6A\u02f3\nA\rA\16A\u02f4\3A\3A\5A\u02f9\nA\3"+
		"B\3B\3B\3B\3B\3B\3B\3C\5C\u0303\nC\3C\7C\u0306\nC\fC\16C\u0309\13C\3D"+
		"\3D\5D\u030d\nD\3E\3E\3E\5E\u0312\nE\3E\5E\u0315\nE\3F\7F\u0318\nF\fF"+
		"\16F\u031b\13F\3G\3G\3G\3G\3G\5G\u0322\nG\3H\6H\u0325\nH\rH\16H\u0326"+
		"\3I\3I\5I\u032b\nI\3J\6J\u032e\nJ\rJ\16J\u032f\3K\3K\5K\u0334\nK\3L\3"+
		"L\3L\3M\3M\3M\7M\u033c\nM\fM\16M\u033f\13M\3N\3N\3N\3N\3N\5N\u0346\nN"+
		"\5N\u0348\nN\3O\3O\3O\7O\u034d\nO\fO\16O\u0350\13O\3P\3P\5P\u0354\nP\3"+
		"Q\3Q\5Q\u0358\nQ\3Q\3Q\7Q\u035c\nQ\fQ\16Q\u035f\13Q\5Q\u0361\nQ\3R\3R"+
		"\3R\3R\3R\3R\3R\5R\u036a\nR\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u0376\nR"+
		"\fR\16R\u0379\13R\3S\3S\3S\3S\7S\u037f\nS\fS\16S\u0382\13S\3T\3T\5T\u0386"+
		"\nT\3T\5T\u0389\nT\3T\3T\3U\3U\3U\5U\u0390\nU\3U\3U\3U\3V\3V\3V\3V\3V"+
		"\3V\3W\3W\3W\3W\3X\3X\5X\u03a1\nX\3X\3X\7X\u03a5\nX\fX\16X\u03a8\13X\3"+
		"Y\3Y\3Z\3Z\3Z\3Z\5Z\u03b0\nZ\3Z\3Z\5Z\u03b4\nZ\3[\3[\5[\u03b8\n[\3[\3"+
		"[\3\\\5\\\u03bd\n\\\3\\\3\\\7\\\u03c1\n\\\f\\\16\\\u03c4\13\\\3]\3]\3"+
		"]\3^\6^\u03ca\n^\r^\16^\u03cb\3_\3_\3_\3_\3_\3_\5_\u03d4\n_\3`\3`\3`\3"+
		"`\3`\6`\u03db\n`\r`\16`\u03dc\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5"+
		"a\u03ec\na\3a\7a\u03ef\na\fa\16a\u03f2\13a\3a\3a\3a\5a\u03f7\na\3b\3b"+
		"\3c\3c\3d\3d\3d\7d\u0400\nd\fd\16d\u0403\13d\3e\3e\5e\u0407\ne\3f\3f\3"+
		"f\3f\3f\3f\3f\3f\3f\3f\3f\5f\u0414\nf\3g\3g\5g\u0418\ng\3g\3g\3h\6h\u041d"+
		"\nh\rh\16h\u041e\3i\3i\5i\u0423\ni\3j\5j\u0426\nj\3j\3j\3k\3k\3k\3k\3"+
		"k\3k\3k\5k\u0431\nk\3k\3k\3k\3k\3k\3k\5k\u0439\nk\3l\3l\3l\3l\3l\3l\3"+
		"l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\3l\5l\u044f\nl\3m\3m\5m\u0453\n"+
		"m\5m\u0455\nm\3m\3m\5m\u0459\nm\3m\3m\5m\u045d\nm\3n\3n\5n\u0461\nn\3"+
		"o\3o\3o\7o\u0466\no\fo\16o\u0469\13o\3p\3p\3p\3p\3p\5p\u0470\np\3p\3p"+
		"\5p\u0474\np\3p\3p\3q\5q\u0479\nq\3q\3q\3r\7r\u047e\nr\fr\16r\u0481\13"+
		"r\3r\7r\u0484\nr\fr\16r\u0487\13r\3r\6r\u048a\nr\rr\16r\u048b\3s\3s\3"+
		"s\5s\u0491\ns\3t\5t\u0494\nt\3t\3t\5t\u0498\nt\3t\3t\3u\6u\u049d\nu\r"+
		"u\16u\u049e\3u\2\5Nr\u00a2v\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\2\31\3\2kl\4\2MMOO\4\2,,\67\67\5\2,,MMOO\7\2LLNNPPSSXY\3"+
		"\2PR\4\2LLNN\3\2JK\3\2FI\3\2ij\3\2^h\b\2\24\24\37\37\'\'--\60\60??\n\2"+
		"\6\b\27\27\34\34  %&*+\62\639:\3\2\n\f\4\2..\61\61\6\2\30\30((\64\648"+
		"8\5\2\17\20$$==\4\2@A]]\3\2@A\4\2PPWW\3\2\23\23\3\2\64\64\4\2\25\25\31"+
		"\31\2\u04dd\2\u010b\3\2\2\2\4\u010d\3\2\2\2\6\u0114\3\2\2\2\b\u011e\3"+
		"\2\2\2\n\u0131\3\2\2\2\f\u0145\3\2\2\2\16\u0147\3\2\2\2\20\u0152\3\2\2"+
		"\2\22\u0162\3\2\2\2\24\u0164\3\2\2\2\26\u0170\3\2\2\2\30\u0172\3\2\2\2"+
		"\32\u017b\3\2\2\2\34\u017d\3\2\2\2\36\u0186\3\2\2\2 \u0188\3\2\2\2\"\u0191"+
		"\3\2\2\2$\u0193\3\2\2\2&\u019c\3\2\2\2(\u019e\3\2\2\2*\u01a7\3\2\2\2,"+
		"\u01a9\3\2\2\2.\u01b1\3\2\2\2\60\u01b9\3\2\2\2\62\u01c1\3\2\2\2\64\u01c9"+
		"\3\2\2\2\66\u01d1\3\2\2\28\u01df\3\2\2\2:\u01e1\3\2\2\2<\u01e3\3\2\2\2"+
		">\u01eb\3\2\2\2@\u01f4\3\2\2\2B\u01f7\3\2\2\2D\u01fc\3\2\2\2F\u0205\3"+
		"\2\2\2H\u0207\3\2\2\2J\u020f\3\2\2\2L\u0214\3\2\2\2N\u0225\3\2\2\2P\u0239"+
		"\3\2\2\2R\u023b\3\2\2\2T\u023e\3\2\2\2V\u0249\3\2\2\2X\u024d\3\2\2\2Z"+
		"\u0252\3\2\2\2\\\u0260\3\2\2\2^\u026f\3\2\2\2`\u0271\3\2\2\2b\u0279\3"+
		"\2\2\2d\u027e\3\2\2\2f\u0280\3\2\2\2h\u0285\3\2\2\2j\u028d\3\2\2\2l\u028f"+
		"\3\2\2\2n\u0291\3\2\2\2p\u029a\3\2\2\2r\u02b4\3\2\2\2t\u02c7\3\2\2\2v"+
		"\u02d0\3\2\2\2x\u02d8\3\2\2\2z\u02de\3\2\2\2|\u02e5\3\2\2\2~\u02e9\3\2"+
		"\2\2\u0080\u02f8\3\2\2\2\u0082\u02fa\3\2\2\2\u0084\u0302\3\2\2\2\u0086"+
		"\u030a\3\2\2\2\u0088\u030e\3\2\2\2\u008a\u0319\3\2\2\2\u008c\u0321\3\2"+
		"\2\2\u008e\u0324\3\2\2\2\u0090\u0328\3\2\2\2\u0092\u032d\3\2\2\2\u0094"+
		"\u0331\3\2\2\2\u0096\u0335\3\2\2\2\u0098\u0338\3\2\2\2\u009a\u0347\3\2"+
		"\2\2\u009c\u0349\3\2\2\2\u009e\u0351\3\2\2\2\u00a0\u0360\3\2\2\2\u00a2"+
		"\u0369\3\2\2\2\u00a4\u037a\3\2\2\2\u00a6\u0383\3\2\2\2\u00a8\u038c\3\2"+
		"\2\2\u00aa\u0394\3\2\2\2\u00ac\u039a\3\2\2\2\u00ae\u039e\3\2\2\2\u00b0"+
		"\u03a9\3\2\2\2\u00b2\u03b3\3\2\2\2\u00b4\u03b5\3\2\2\2\u00b6\u03bc\3\2"+
		"\2\2\u00b8\u03c5\3\2\2\2\u00ba\u03c9\3\2\2\2\u00bc\u03d3\3\2\2\2\u00be"+
		"\u03d5\3\2\2\2\u00c0\u03f6\3\2\2\2\u00c2\u03f8\3\2\2\2\u00c4\u03fa\3\2"+
		"\2\2\u00c6\u03fc\3\2\2\2\u00c8\u0404\3\2\2\2\u00ca\u0413\3\2\2\2\u00cc"+
		"\u0415\3\2\2\2\u00ce\u041c\3\2\2\2\u00d0\u0422\3\2\2\2\u00d2\u0425\3\2"+
		"\2\2\u00d4\u0438\3\2\2\2\u00d6\u044e\3\2\2\2\u00d8\u0454\3\2\2\2\u00da"+
		"\u045e\3\2\2\2\u00dc\u0462\3\2\2\2\u00de\u0473\3\2\2\2\u00e0\u0478\3\2"+
		"\2\2\u00e2\u047f\3\2\2\2\u00e4\u0490\3\2\2\2\u00e6\u0493\3\2\2\2\u00e8"+
		"\u049c\3\2\2\2\u00ea\u010c\7n\2\2\u00eb\u010c\7o\2\2\u00ec\u00ee\7q\2"+
		"\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u010c\3\2\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\5<\37\2\u00f3"+
		"\u00f4\7A\2\2\u00f4\u010c\3\2\2\2\u00f5\u010c\5\4\3\2\u00f6\u00f8\7\3"+
		"\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\7@\2\2\u00fa\u00fb\5\u00ccg\2\u00fb\u00fc\7A\2\2\u00fc\u010c\3"+
		"\2\2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\5\20\t\2\u0100"+
		"\u0101\7]\2\2\u0101\u0102\5\u009eP\2\u0102\u0103\7A\2\2\u0103\u010c\3"+
		"\2\2\2\u0104\u0105\7\5\2\2\u0105\u0106\7@\2\2\u0106\u0107\5\u009eP\2\u0107"+
		"\u0108\7]\2\2\u0108\u0109\5\20\t\2\u0109\u010a\7A\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u00ea\3\2\2\2\u010b\u00eb\3\2\2\2\u010b\u00ed\3\2\2\2\u010b"+
		"\u00f1\3\2\2\2\u010b\u00f5\3\2\2\2\u010b\u00f7\3\2\2\2\u010b\u00fd\3\2"+
		"\2\2\u010b\u0104\3\2\2\2\u010c\3\3\2\2\2\u010d\u010e\7;\2\2\u010e\u010f"+
		"\7@\2\2\u010f\u0110\58\35\2\u0110\u0111\7]\2\2\u0111\u0112\5\6\4\2\u0112"+
		"\u0113\7A\2\2\u0113\5\3\2\2\2\u0114\u0119\5\b\5\2\u0115\u0116\7]\2\2\u0116"+
		"\u0118\5\b\5\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\7\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011f"+
		"\5\u009eP\2\u011d\u011f\7\32\2\2\u011e\u011c\3\2\2\2\u011e\u011d\3\2\2"+
		"\2\u011f\u0120\3\2\2\2\u0120\u0121\7[\2\2\u0121\u0122\58\35\2\u0122\t"+
		"\3\2\2\2\u0123\u0132\5\2\2\2\u0124\u0126\7\3\2\2\u0125\u0124\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7@\2\2\u0128\u0129\5\u009e"+
		"P\2\u0129\u012a\7A\2\2\u012a\u012b\7D\2\2\u012b\u012d\5\u00b6\\\2\u012c"+
		"\u012e\7]\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\7E\2\2\u0130\u0132\3\2\2\2\u0131\u0123\3\2\2\2\u0131"+
		"\u0125\3\2\2\2\u0132\u0136\3\2\2\2\u0133\u0135\5\f\7\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\13\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7B\2\2\u013a\u013b\5<\37\2"+
		"\u013b\u013c\7C\2\2\u013c\u0146\3\2\2\2\u013d\u013f\7@\2\2\u013e\u0140"+
		"\5\16\b\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u0146\7A\2\2\u0142\u0143\t\2\2\2\u0143\u0146\7n\2\2\u0144\u0146"+
		"\t\3\2\2\u0145\u0139\3\2\2\2\u0145\u013d\3\2\2\2\u0145\u0142\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\r\3\2\2\2\u0147\u014c\58\35\2\u0148\u0149\7]\2\2"+
		"\u0149\u014b\58\35\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d\17\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0151\5\22\n\2\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0160\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0161\5\n\6\2\u0156\u0157\5\24\13\2\u0157\u0158\5\26\f\2\u0158\u0161"+
		"\3\2\2\2\u0159\u015a\t\4\2\2\u015a\u015b\7@\2\2\u015b\u015c\5\u009eP\2"+
		"\u015c\u015d\7A\2\2\u015d\u0161\3\2\2\2\u015e\u015f\7U\2\2\u015f\u0161"+
		"\7n\2\2\u0160\u0155\3\2\2\2\u0160\u0156\3\2\2\2\u0160\u0159\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0161\21\3\2\2\2\u0162\u0163\t\5\2\2\u0163\23\3\2\2\2\u0164"+
		"\u0165\t\6\2\2\u0165\25\3\2\2\2\u0166\u0168\7\3\2\2\u0167\u0166\3\2\2"+
		"\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7@\2\2\u016a\u016b"+
		"\5\u009eP\2\u016b\u016c\7A\2\2\u016c\u016d\5\26\f\2\u016d\u0171\3\2\2"+
		"\2\u016e\u0171\5\20\t\2\u016f\u0171\7p\2\2\u0170\u0167\3\2\2\2\u0170\u016e"+
		"\3\2\2\2\u0170\u016f\3\2\2\2\u0171\27\3\2\2\2\u0172\u0178\5\26\f\2\u0173"+
		"\u0174\5\32\16\2\u0174\u0175\5\26\f\2\u0175\u0177\3\2\2\2\u0176\u0173"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\31\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\t\7\2\2\u017c\33\3\2\2\2\u017d"+
		"\u0183\5\30\r\2\u017e\u017f\5\36\20\2\u017f\u0180\5\30\r\2\u0180\u0182"+
		"\3\2\2\2\u0181\u017e\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\35\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\t\b\2"+
		"\2\u0187\37\3\2\2\2\u0188\u018e\5\34\17\2\u0189\u018a\5\"\22\2\u018a\u018b"+
		"\5\34\17\2\u018b\u018d\3\2\2\2\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f!\3\2\2\2\u0190\u018e\3"+
		"\2\2\2\u0191\u0192\t\t\2\2\u0192#\3\2\2\2\u0193\u0199\5 \21\2\u0194\u0195"+
		"\5&\24\2\u0195\u0196\5 \21\2\u0196\u0198\3\2\2\2\u0197\u0194\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a%\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019c\u019d\t\n\2\2\u019d\'\3\2\2\2\u019e\u01a4\5"+
		"$\23\2\u019f\u01a0\5*\26\2\u01a0\u01a1\5$\23\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u019f\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2"+
		"\2\2\u01a5)\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a8\t\13\2\2\u01a8+\3"+
		"\2\2\2\u01a9\u01ae\5(\25\2\u01aa\u01ab\7S\2\2\u01ab\u01ad\5(\25\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af-\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b6\5,\27\2\u01b2\u01b3"+
		"\7W\2\2\u01b3\u01b5\5,\27\2\u01b4\u01b2\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7/\3\2\2\2\u01b8\u01b6\3\2\2\2"+
		"\u01b9\u01be\5.\30\2\u01ba\u01bb\7T\2\2\u01bb\u01bd\5.\30\2\u01bc\u01ba"+
		"\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\61\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c6\5\60\31\2\u01c2\u01c3\7U\2"+
		"\2\u01c3\u01c5\5\60\31\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\63\3\2\2\2\u01c8\u01c6\3\2\2"+
		"\2\u01c9\u01ce\5\62\32\2\u01ca\u01cb\7V\2\2\u01cb\u01cd\5\62\32\2\u01cc"+
		"\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\65\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1\u01d7\5\64\33\2\u01d2"+
		"\u01d3\7Z\2\2\u01d3\u01d4\5<\37\2\u01d4\u01d5\7[\2\2\u01d5\u01d6\5\66"+
		"\34\2\u01d6\u01d8\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\67\3\2\2\2\u01d9\u01e0\5\66\34\2\u01da\u01db\7n\2\2\u01db\u01dc\5:\36"+
		"\2\u01dc\u01dd\58\35\2\u01dd\u01e0\3\2\2\2\u01de\u01e0\7p\2\2\u01df\u01d9"+
		"\3\2\2\2\u01df\u01da\3\2\2\2\u01df\u01de\3\2\2\2\u01e09\3\2\2\2\u01e1"+
		"\u01e2\t\f\2\2\u01e2;\3\2\2\2\u01e3\u01e8\58\35\2\u01e4\u01e5\7]\2\2\u01e5"+
		"\u01e7\58\35\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e8\u01e9\3\2\2\2\u01e9=\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ec"+
		"\5\66\34\2\u01ec?\3\2\2\2\u01ed\u01ef\5B\"\2\u01ee\u01f0\5H%\2\u01ef\u01ee"+
		"\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\7\\\2\2\u01f2"+
		"\u01f5\3\2\2\2\u01f3\u01f5\5\u00be`\2\u01f4\u01ed\3\2\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5A\3\2\2\2\u01f6\u01f8\5F$\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9"+
		"\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01faC\3\2\2\2\u01fb"+
		"\u01fd\5F$\2\u01fc\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01fc\3\2\2"+
		"\2\u01fe\u01ff\3\2\2\2\u01ffE\3\2\2\2\u0200\u0206\5L\'\2\u0201\u0206\5"+
		"N(\2\u0202\u0206\5h\65\2\u0203\u0206\5j\66\2\u0204\u0206\5n8\2\u0205\u0200"+
		"\3\2\2\2\u0205\u0201\3\2\2\2\u0205\u0202\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0204\3\2\2\2\u0206G\3\2\2\2\u0207\u020c\5J&\2\u0208\u0209\7]\2\2\u0209"+
		"\u020b\5J&\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2"+
		"\2\u020c\u020d\3\2\2\2\u020dI\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0212"+
		"\5p9\2\u0210\u0211\7^\2\2\u0211\u0213\5\u00b2Z\2\u0212\u0210\3\2\2\2\u0212"+
		"\u0213\3\2\2\2\u0213K\3\2\2\2\u0214\u0215\t\r\2\2\u0215M\3\2\2\2\u0216"+
		"\u0217\b(\1\2\u0217\u0226\t\16\2\2\u0218\u0219\7\t\2\2\u0219\u021a\7@"+
		"\2\2\u021a\u021b\t\17\2\2\u021b\u0226\7A\2\2\u021c\u0226\5f\64\2\u021d"+
		"\u0226\5P)\2\u021e\u0226\5^\60\2\u021f\u0226\5\u00b0Y\2\u0220\u0221\7"+
		"\r\2\2\u0221\u0222\7@\2\2\u0222\u0223\5> \2\u0223\u0224\7A\2\2\u0224\u0226"+
		"\3\2\2\2\u0225\u0216\3\2\2\2\u0225\u0218\3\2\2\2\u0225\u021c\3\2\2\2\u0225"+
		"\u021d\3\2\2\2\u0225\u021e\3\2\2\2\u0225\u021f\3\2\2\2\u0225\u0220\3\2"+
		"\2\2\u0226\u022b\3\2\2\2\u0227\u0228\f\3\2\2\u0228\u022a\5\u008eH\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2"+
		"\2\2\u022cO\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\5R*\2\u022f\u0231"+
		"\7n\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\7D\2\2\u0233\u0234\5T+\2\u0234\u0235\7E\2\2\u0235\u023a\3\2\2\2"+
		"\u0236\u0237\5R*\2\u0237\u0238\7n\2\2\u0238\u023a\3\2\2\2\u0239\u022e"+
		"\3\2\2\2\u0239\u0236\3\2\2\2\u023aQ\3\2\2\2\u023b\u023c\t\20\2\2\u023c"+
		"S\3\2\2\2\u023d\u023f\5V,\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241U\3\2\2\2\u0242\u0244\5X-\2\u0243"+
		"\u0245\5Z.\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2"+
		"\2\u0246\u0247\7\\\2\2\u0247\u024a\3\2\2\2\u0248\u024a\5\u00be`\2\u0249"+
		"\u0242\3\2\2\2\u0249\u0248\3\2\2\2\u024aW\3\2\2\2\u024b\u024e\5N(\2\u024c"+
		"\u024e\5h\65\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0250\3\2"+
		"\2\2\u024f\u0251\5X-\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251Y"+
		"\3\2\2\2\u0252\u0257\5\\/\2\u0253\u0254\7]\2\2\u0254\u0256\5\\/\2\u0255"+
		"\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2"+
		"\2\2\u0258[\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u0261\5p9\2\u025b\u025d"+
		"\5p9\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\7[\2\2\u025f\u0261\5> \2\u0260\u025a\3\2\2\2\u0260\u025c\3\2\2"+
		"\2\u0261]\3\2\2\2\u0262\u0264\7\36\2\2\u0263\u0265\7n\2\2\u0264\u0263"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\7D\2\2\u0267"+
		"\u0269\5`\61\2\u0268\u026a\7]\2\2\u0269\u0268\3\2\2\2\u0269\u026a\3\2"+
		"\2\2\u026a\u026b\3\2\2\2\u026b\u026c\7E\2\2\u026c\u0270\3\2\2\2\u026d"+
		"\u026e\7\36\2\2\u026e\u0270\7n\2\2\u026f\u0262\3\2\2\2\u026f\u026d\3\2"+
		"\2\2\u0270_\3\2\2\2\u0271\u0276\5b\62\2\u0272\u0273\7]\2\2\u0273\u0275"+
		"\5b\62\2\u0274\u0272\3\2\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277a\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027c\5d\63\2"+
		"\u027a\u027b\7^\2\2\u027b\u027d\5> \2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027dc\3\2\2\2\u027e\u027f\7n\2\2\u027fe\3\2\2\2\u0280\u0281"+
		"\78\2\2\u0281\u0282\7@\2\2\u0282\u0283\5\u009eP\2\u0283\u0284\7A\2\2\u0284"+
		"g\3\2\2\2\u0285\u0286\t\21\2\2\u0286i\3\2\2\2\u0287\u028e\5l\67\2\u0288"+
		"\u028e\5\u0082B\2\u0289\u028a\7\16\2\2\u028a\u028b\7@\2\2\u028b\u028c"+
		"\7n\2\2\u028c\u028e\7A\2\2\u028d\u0287\3\2\2\2\u028d\u0288\3\2\2\2\u028d"+
		"\u0289\3\2\2\2\u028ek\3\2\2\2\u028f\u0290\t\22\2\2\u0290m\3\2\2\2\u0291"+
		"\u0292\7\66\2\2\u0292\u0295\7@\2\2\u0293\u0296\5\u009eP\2\u0294\u0296"+
		"\5> \2\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297"+
		"\u0298\7A\2\2\u0298o\3\2\2\2\u0299\u029b\5\u008eH\2\u029a\u0299\3\2\2"+
		"\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u02a0\5r:\2\u029d\u029f"+
		"\5\u0080A\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2"+
		"\2\u02a0\u02a1\3\2\2\2\u02a1q\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u02a4"+
		"\b:\1\2\u02a4\u02b5\7n\2\2\u02a5\u02a6\7@\2\2\u02a6\u02a7\5p9\2\u02a7"+
		"\u02a8\7A\2\2\u02a8\u02b5\3\2\2\2\u02a9\u02aa\7n\2\2\u02aa\u02ab\7[\2"+
		"\2\u02ab\u02b5\7p\2\2\u02ac\u02ae\7@\2\2\u02ad\u02af\5N(\2\u02ae\u02ad"+
		"\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\5\u008eH"+
		"\2\u02b1\u02b2\5r:\2\u02b2\u02b3\7A\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02a3"+
		"\3\2\2\2\u02b4\u02a5\3\2\2\2\u02b4\u02a9\3\2\2\2\u02b4\u02ac\3\2\2\2\u02b5"+
		"\u02c4\3\2\2\2\u02b6\u02b7\f\n\2\2\u02b7\u02c3\5t;\2\u02b8\u02b9\f\t\2"+
		"\2\u02b9\u02c3\5v<\2\u02ba\u02bb\f\b\2\2\u02bb\u02c3\5x=\2\u02bc\u02bd"+
		"\f\7\2\2\u02bd\u02c3\5z>\2\u02be\u02bf\f\6\2\2\u02bf\u02c3\5|?\2\u02c0"+
		"\u02c1\f\5\2\2\u02c1\u02c3\5~@\2\u02c2\u02b6\3\2\2\2\u02c2\u02b8\3\2\2"+
		"\2\u02c2\u02ba\3\2\2\2\u02c2\u02bc\3\2\2\2\u02c2\u02be\3\2\2\2\u02c2\u02c0"+
		"\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"s\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\7B\2\2\u02c8\u02ca\5\u0092J"+
		"\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb\u02cd"+
		"\58\35\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02cf\7C\2\2\u02cfu\3\2\2\2\u02d0\u02d1\7B\2\2\u02d1\u02d3\7-\2\2\u02d2"+
		"\u02d4\5\u0092J\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5"+
		"\3\2\2\2\u02d5\u02d6\58\35\2\u02d6\u02d7\7C\2\2\u02d7w\3\2\2\2\u02d8\u02d9"+
		"\7B\2\2\u02d9\u02da\5\u0092J\2\u02da\u02db\7-\2\2\u02db\u02dc\58\35\2"+
		"\u02dc\u02dd\7C\2\2\u02ddy\3\2\2\2\u02de\u02e0\7B\2\2\u02df\u02e1\5\u0092"+
		"J\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e3\7P\2\2\u02e3\u02e4\7C\2\2\u02e4{\3\2\2\2\u02e5\u02e6\7@\2\2\u02e6"+
		"\u02e7\5\u0094K\2\u02e7\u02e8\7A\2\2\u02e8}\3\2\2\2\u02e9\u02eb\7@\2\2"+
		"\u02ea\u02ec\5\u009cO\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\7A\2\2\u02ee\177\3\2\2\2\u02ef\u02f0\7\21\2"+
		"\2\u02f0\u02f2\7@\2\2\u02f1\u02f3\7q\2\2\u02f2\u02f1\3\2\2\2\u02f3\u02f4"+
		"\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u02f9\7A\2\2\u02f7\u02f9\5\u0082B\2\u02f8\u02ef\3\2\2\2\u02f8\u02f7\3"+
		"\2\2\2\u02f9\u0081\3\2\2\2\u02fa\u02fb\7\22\2\2\u02fb\u02fc\7@\2\2\u02fc"+
		"\u02fd\7@\2\2\u02fd\u02fe\5\u0084C\2\u02fe\u02ff\7A\2\2\u02ff\u0300\7"+
		"A\2\2\u0300\u0083\3\2\2\2\u0301\u0303\5\u0088E\2\u0302\u0301\3\2\2\2\u0302"+
		"\u0303\3\2\2\2\u0303\u0307\3\2\2\2\u0304\u0306\5\u0086D\2\u0305\u0304"+
		"\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308"+
		"\u0085\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030c\7]\2\2\u030b\u030d\5\u0088"+
		"E\2\u030c\u030b\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u0087\3\2\2\2\u030e"+
		"\u0314\n\23\2\2\u030f\u0311\7@\2\2\u0310\u0312\5\16\b\2\u0311\u0310\3"+
		"\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\7A\2\2\u0314"+
		"\u030f\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0089\3\2\2\2\u0316\u0318\5\u008c"+
		"G\2\u0317\u0316\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u008b\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u0322\n\24"+
		"\2\2\u031d\u031e\7@\2\2\u031e\u031f\5\u008aF\2\u031f\u0320\7A\2\2\u0320"+
		"\u0322\3\2\2\2\u0321\u031c\3\2\2\2\u0321\u031d\3\2\2\2\u0322\u008d\3\2"+
		"\2\2\u0323\u0325\5\u0090I\2\u0324\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0324\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u008f\3\2\2\2\u0328\u032a\t\25"+
		"\2\2\u0329\u032b\5\u0092J\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u0091\3\2\2\2\u032c\u032e\5h\65\2\u032d\u032c\3\2\2\2\u032e\u032f\3\2"+
		"\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0093\3\2\2\2\u0331"+
		"\u0333\5\u0098M\2\u0332\u0334\5\u0096L\2\u0333\u0332\3\2\2\2\u0333\u0334"+
		"\3\2\2\2\u0334\u0095\3\2\2\2\u0335\u0336\7]\2\2\u0336\u0337\7m\2\2\u0337"+
		"\u0097\3\2\2\2\u0338\u033d\5\u009aN\2\u0339\u033a\7]\2\2\u033a\u033c\5"+
		"\u009aN\2\u033b\u0339\3\2\2\2\u033c\u033f\3\2\2\2\u033d\u033b\3\2\2\2"+
		"\u033d\u033e\3\2\2\2\u033e\u0099\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0341"+
		"\5B\"\2\u0341\u0342\5p9\2\u0342\u0348\3\2\2\2\u0343\u0345\5D#\2\u0344"+
		"\u0346\5\u00a0Q\2\u0345\u0344\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348"+
		"\3\2\2\2\u0347\u0340\3\2\2\2\u0347\u0343\3\2\2\2\u0348\u009b\3\2\2\2\u0349"+
		"\u034e\7n\2\2\u034a\u034b\7]\2\2\u034b\u034d\7n\2\2\u034c\u034a\3\2\2"+
		"\2\u034d\u0350\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u009d"+
		"\3\2\2\2\u0350\u034e\3\2\2\2\u0351\u0353\5X-\2\u0352\u0354\5\u00a0Q\2"+
		"\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u009f\3\2\2\2\u0355\u0361"+
		"\5\u008eH\2\u0356\u0358\5\u008eH\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2"+
		"\2\2\u0358\u0359\3\2\2\2\u0359\u035d\5\u00a2R\2\u035a\u035c\5\u0080A\2"+
		"\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e"+
		"\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u0360\u0355\3\2\2\2\u0360"+
		"\u0357\3\2\2\2\u0361\u00a1\3\2\2\2\u0362\u0363\bR\1\2\u0363\u036a\5\u00a4"+
		"S\2\u0364\u036a\5\u00a6T\2\u0365\u036a\5\u00a8U\2\u0366\u036a\5\u00aa"+
		"V\2\u0367\u036a\5\u00acW\2\u0368\u036a\5\u00aeX\2\u0369\u0362\3\2\2\2"+
		"\u0369\u0364\3\2\2\2\u0369\u0365\3\2\2\2\u0369\u0366\3\2\2\2\u0369\u0367"+
		"\3\2\2\2\u0369\u0368\3\2\2\2\u036a\u0377\3\2\2\2\u036b\u036c\f\7\2\2\u036c"+
		"\u0376\5\u00a6T\2\u036d\u036e\f\6\2\2\u036e\u0376\5\u00a8U\2\u036f\u0370"+
		"\f\5\2\2\u0370\u0376\5\u00aaV\2\u0371\u0372\f\4\2\2\u0372\u0376\5\u00ac"+
		"W\2\u0373\u0374\f\3\2\2\u0374\u0376\5\u00aeX\2\u0375\u036b\3\2\2\2\u0375"+
		"\u036d\3\2\2\2\u0375\u036f\3\2\2\2\u0375\u0371\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2\2\2\u0377\u0378\3\2\2\2\u0378"+
		"\u00a3\3\2\2\2\u0379\u0377\3\2\2\2\u037a\u037b\7@\2\2\u037b\u037c\5\u00a0"+
		"Q\2\u037c\u0380\7A\2\2\u037d\u037f\5\u0080A\2\u037e\u037d\3\2\2\2\u037f"+
		"\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u00a5\3\2"+
		"\2\2\u0382\u0380\3\2\2\2\u0383\u0385\7B\2\2\u0384\u0386\5\u0092J\2\u0385"+
		"\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0389\58"+
		"\35\2\u0388\u0387\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\7C\2\2\u038b\u00a7\3\2\2\2\u038c\u038d\7B\2\2\u038d\u038f\7-\2"+
		"\2\u038e\u0390\5\u0092J\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390"+
		"\u0391\3\2\2\2\u0391\u0392\58\35\2\u0392\u0393\7C\2\2\u0393\u00a9\3\2"+
		"\2\2\u0394\u0395\7B\2\2\u0395\u0396\5\u0092J\2\u0396\u0397\7-\2\2\u0397"+
		"\u0398\58\35\2\u0398\u0399\7C\2\2\u0399\u00ab\3\2\2\2\u039a\u039b\7B\2"+
		"\2\u039b\u039c\7P\2\2\u039c\u039d\7C\2\2\u039d\u00ad\3\2\2\2\u039e\u03a0"+
		"\7@\2\2\u039f\u03a1\5\u0094K\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2"+
		"\u03a1\u03a2\3\2\2\2\u03a2\u03a6\7A\2\2\u03a3\u03a5\5\u0080A\2\u03a4\u03a3"+
		"\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7"+
		"\u00af\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\7n\2\2\u03aa\u00b1\3\2"+
		"\2\2\u03ab\u03b4\58\35\2\u03ac\u03ad\7D\2\2\u03ad\u03af\5\u00b6\\\2\u03ae"+
		"\u03b0\7]\2\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b2\7E\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03ab\3\2\2\2\u03b3"+
		"\u03ac\3\2\2\2\u03b4\u00b3\3\2\2\2\u03b5\u03b7\7]\2\2\u03b6\u03b8\5\u00b8"+
		"]\2\u03b7\u03b6\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9"+
		"\u03ba\5\u00b2Z\2\u03ba\u00b5\3\2\2\2\u03bb\u03bd\5\u00b8]\2\u03bc\u03bb"+
		"\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c2\5\u00b2Z"+
		"\2\u03bf\u03c1\5\u00b4[\2\u03c0\u03bf\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u00b7\3\2\2\2\u03c4\u03c2\3\2"+
		"\2\2\u03c5\u03c6\5\u00ba^\2\u03c6\u03c7\7^\2\2\u03c7\u00b9\3\2\2\2\u03c8"+
		"\u03ca\5\u00bc_\2\u03c9\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03c9"+
		"\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u00bb\3\2\2\2\u03cd\u03ce\7B\2\2\u03ce"+
		"\u03cf\5> \2\u03cf\u03d0\7C\2\2\u03d0\u03d4\3\2\2\2\u03d1\u03d2\7l\2\2"+
		"\u03d2\u03d4\7n\2\2\u03d3\u03cd\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u00bd"+
		"\3\2\2\2\u03d5\u03d6\7>\2\2\u03d6\u03d7\7@\2\2\u03d7\u03d8\5> \2\u03d8"+
		"\u03da\7]\2\2\u03d9\u03db\7q\2\2\u03da\u03d9\3\2\2\2\u03db\u03dc\3\2\2"+
		"\2\u03dc\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df"+
		"\7A\2\2\u03df\u03e0\7\\\2\2\u03e0\u00bf\3\2\2\2\u03e1\u03f7\5\u00caf\2"+
		"\u03e2\u03f7\5\u00ccg\2\u03e3\u03f7\5\u00d2j\2\u03e4\u03f7\5\u00d4k\2"+
		"\u03e5\u03f7\5\u00d6l\2\u03e6\u03f7\5\u00dep\2\u03e7\u03e8\5\u00c2b\2"+
		"\u03e8\u03e9\5\u00c4c\2\u03e9\u03eb\7@\2\2\u03ea\u03ec\5\u00c6d\2\u03eb"+
		"\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03f0\3\2\2\2\u03ed\u03ef\5\u00c8"+
		"e\2\u03ee\u03ed\3\2\2\2\u03ef\u03f2\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f3\u03f4\7A"+
		"\2\2\u03f4\u03f5\7\\\2\2\u03f5\u03f7\3\2\2\2\u03f6\u03e1\3\2\2\2\u03f6"+
		"\u03e2\3\2\2\2\u03f6\u03e3\3\2\2\2\u03f6\u03e4\3\2\2\2\u03f6\u03e5\3\2"+
		"\2\2\u03f6\u03e6\3\2\2\2\u03f6\u03e7\3\2\2\2\u03f7\u00c1\3\2\2\2\u03f8"+
		"\u03f9\t\26\2\2\u03f9\u00c3\3\2\2\2\u03fa\u03fb\t\27\2\2\u03fb\u00c5\3"+
		"\2\2\2\u03fc\u0401\5\64\33\2\u03fd\u03fe\7]\2\2\u03fe\u0400\5\64\33\2"+
		"\u03ff\u03fd\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u03ff\3\2\2\2\u0401\u0402"+
		"\3\2\2\2\u0402\u00c7\3\2\2\2\u0403\u0401\3\2\2\2\u0404\u0406\7[\2\2\u0405"+
		"\u0407\5\u00c6d\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u00c9"+
		"\3\2\2\2\u0408\u0409\7n\2\2\u0409\u040a\7[\2\2\u040a\u0414\5\u00c0a\2"+
		"\u040b\u040c\7\26\2\2\u040c\u040d\5> \2\u040d\u040e\7[\2\2\u040e\u040f"+
		"\5\u00c0a\2\u040f\u0414\3\2\2\2\u0410\u0411\7\32\2\2\u0411\u0412\7[\2"+
		"\2\u0412\u0414\5\u00c0a\2\u0413\u0408\3\2\2\2\u0413\u040b\3\2\2\2\u0413"+
		"\u0410\3\2\2\2\u0414\u00cb\3\2\2\2\u0415\u0417\7D\2\2\u0416\u0418\5\u00ce"+
		"h\2\u0417\u0416\3\2\2\2\u0417\u0418\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"\u041a\7E\2\2\u041a\u00cd\3\2\2\2\u041b\u041d\5\u00d0i\2\u041c\u041b\3"+
		"\2\2\2\u041d\u041e\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f"+
		"\u00cf\3\2\2\2\u0420\u0423\5\u00c0a\2\u0421\u0423\5@!\2\u0422\u0420\3"+
		"\2\2\2\u0422\u0421\3\2\2\2\u0423\u00d1\3\2\2\2\u0424\u0426\5<\37\2\u0425"+
		"\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\7\\"+
		"\2\2\u0428\u00d3\3\2\2\2\u0429\u042a\7#\2\2\u042a\u042b\7@\2\2\u042b\u042c"+
		"\5<\37\2\u042c\u042d\7A\2\2\u042d\u0430\5\u00c0a\2\u042e\u042f\7\35\2"+
		"\2\u042f\u0431\5\u00c0a\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431"+
		"\u0439\3\2\2\2\u0432\u0433\7/\2\2\u0433\u0434\7@\2\2\u0434\u0435\5<\37"+
		"\2\u0435\u0436\7A\2\2\u0436\u0437\5\u00c0a\2\u0437\u0439\3\2\2\2\u0438"+
		"\u0429\3\2\2\2\u0438\u0432\3\2\2\2\u0439\u00d5\3\2\2\2\u043a\u043b\7\65"+
		"\2\2\u043b\u043c\7@\2\2\u043c\u043d\5<\37\2\u043d\u043e\7A\2\2\u043e\u043f"+
		"\5\u00c0a\2\u043f\u044f\3\2\2\2\u0440\u0441\7\33\2\2\u0441\u0442\5\u00c0"+
		"a\2\u0442\u0443\7\65\2\2\u0443\u0444\7@\2\2\u0444\u0445\5<\37\2\u0445"+
		"\u0446\7A\2\2\u0446\u0447\7\\\2\2\u0447\u044f\3\2\2\2\u0448\u0449\7!\2"+
		"\2\u0449\u044a\7@\2\2\u044a\u044b\5\u00d8m\2\u044b\u044c\7A\2\2\u044c"+
		"\u044d\5\u00c0a\2\u044d\u044f\3\2\2\2\u044e\u043a\3\2\2\2\u044e\u0440"+
		"\3\2\2\2\u044e\u0448\3\2\2\2\u044f\u00d7\3\2\2\2\u0450\u0455\5\u00dan"+
		"\2\u0451\u0453\5<\37\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0455"+
		"\3\2\2\2\u0454\u0450\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0456\3\2\2\2\u0456"+
		"\u0458\7\\\2\2\u0457\u0459\5\u00dco\2\u0458\u0457\3\2\2\2\u0458\u0459"+
		"\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\7\\\2\2\u045b\u045d\5\u00dco"+
		"\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u00d9\3\2\2\2\u045e\u0460"+
		"\5B\"\2\u045f\u0461\5H%\2\u0460\u045f\3\2\2\2\u0460\u0461\3\2\2\2\u0461"+
		"\u00db\3\2\2\2\u0462\u0467\58\35\2\u0463\u0464\7]\2\2\u0464\u0466\58\35"+
		"\2\u0465\u0463\3\2\2\2\u0466\u0469\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u00dd\3\2\2\2\u0469\u0467\3\2\2\2\u046a\u046b\7\"\2\2\u046b"+
		"\u0474\7n\2\2\u046c\u0474\t\30\2\2\u046d\u046f\7)\2\2\u046e\u0470\5<\37"+
		"\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0474\3\2\2\2\u0471\u0472"+
		"\7\"\2\2\u0472\u0474\5\20\t\2\u0473\u046a\3\2\2\2\u0473\u046c\3\2\2\2"+
		"\u0473\u046d\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476"+
		"\7\\\2\2\u0476\u00df\3\2\2\2\u0477\u0479\5\u00e2r\2\u0478\u0477\3\2\2"+
		"\2\u0478\u0479\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b\7\2\2\3\u047b\u00e1"+
		"\3\2\2\2\u047c\u047e\7s\2\2\u047d\u047c\3\2\2\2\u047e\u0481\3\2\2\2\u047f"+
		"\u047d\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0485\3\2\2\2\u0481\u047f\3\2"+
		"\2\2\u0482\u0484\7r\2\2\u0483\u0482\3\2\2\2\u0484\u0487\3\2\2\2\u0485"+
		"\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2"+
		"\2\2\u0488\u048a\5\u00e4s\2\u0489\u0488\3\2\2\2\u048a\u048b\3\2\2\2\u048b"+
		"\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u00e3\3\2\2\2\u048d\u0491\5\u00e6"+
		"t\2\u048e\u0491\5@!\2\u048f\u0491\7\\\2\2\u0490\u048d\3\2\2\2\u0490\u048e"+
		"\3\2\2\2\u0490\u048f\3\2\2\2\u0491\u00e5\3\2\2\2\u0492\u0494\5B\"\2\u0493"+
		"\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0497\5p"+
		"9\2\u0496\u0498\5\u00e8u\2\u0497\u0496\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499\u049a\5\u00ccg\2\u049a\u00e7\3\2\2\2\u049b\u049d"+
		"\5@!\2\u049c\u049b\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049c\3\2\2\2\u049e"+
		"\u049f\3\2\2\2\u049f\u00e9\3\2\2\2\u0087\u00ef\u00f7\u010b\u0119\u011e"+
		"\u0125\u012d\u0131\u0136\u013f\u0145\u014c\u0152\u0160\u0167\u0170\u0178"+
		"\u0183\u018e\u0199\u01a4\u01ae\u01b6\u01be\u01c6\u01ce\u01d7\u01df\u01e8"+
		"\u01ef\u01f4\u01f9\u01fe\u0205\u020c\u0212\u0225\u022b\u0230\u0239\u0240"+
		"\u0244\u0249\u024d\u0250\u0257\u025c\u0260\u0264\u0269\u026f\u0276\u027c"+
		"\u028d\u0295\u029a\u02a0\u02ae\u02b4\u02c2\u02c4\u02c9\u02cc\u02d3\u02e0"+
		"\u02eb\u02f4\u02f8\u0302\u0307\u030c\u0311\u0314\u0319\u0321\u0326\u032a"+
		"\u032f\u0333\u033d\u0345\u0347\u034e\u0353\u0357\u035d\u0360\u0369\u0375"+
		"\u0377\u0380\u0385\u0388\u038f\u03a0\u03a6\u03af\u03b3\u03b7\u03bc\u03c2"+
		"\u03cb\u03d3\u03dc\u03eb\u03f0\u03f6\u0401\u0406\u0413\u0417\u041e\u0422"+
		"\u0425\u0430\u0438\u044e\u0452\u0454\u0458\u045c\u0460\u0467\u046f\u0473"+
		"\u0478\u047f\u0485\u048b\u0490\u0493\u0497\u049e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}