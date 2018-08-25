// Generated from C:/Users/Usuario/IdeaProjects/ProyectoScanner\miParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTS=1, COMMENT_MULTI=2, COMMENT_MULTICLOSE=3, PyCOMA=4, PUNTO=5, 
		COMILLAS=6, ASSIGN=7, COMA=8, PIZQ=9, PDER=10, CUAIZQ=11, CUADER=12, CORIZQ=13, 
		CORDER=14, SUMA=15, RESTA=16, MULTIPLICACION=17, DIVISION=18, RESIDUO=19, 
		AUMENTO=20, DECREMENTO=21, OO=22, YY=23, COMP_IGUAL=24, COMP_MENOR=25, 
		COMP_MAYOR=26, COMP_DIFERENTE=27, MENOR=28, MAYOR=29, CLASS=30, IF=31, 
		WHILE=32, LET=33, THEN=34, ELSE=35, IN=36, DO=37, BEGIN=38, END=39, CONST=40, 
		VAR=41, VOID=42, BREAK=43, RETURN=44, READ=45, WRITE=46, NEW=47, NUM=48, 
		FLOAT=49, INT=50, ID=51, CHAR=52, BOOL=53, STRING=54, WS=55, PyCOM=56, 
		FOR=57, PyComa=58;
	public static final int
		RULE_program = 0, RULE_constDec1 = 1, RULE_varDec1 = 2, RULE_classDec1 = 3, 
		RULE_methodDec1 = 4, RULE_formPars = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_block = 8, RULE_actPars = 9, RULE_condition = 10, RULE_condTerm = 11, 
		RULE_condFact = 12, RULE_expr = 13, RULE_term = 14, RULE_factor = 15, 
		RULE_designator = 16, RULE_relop = 17, RULE_addop = 18, RULE_mulop = 19;
	public static final String[] ruleNames = {
		"program", "constDec1", "varDec1", "classDec1", "methodDec1", "formPars", 
		"type", "statement", "block", "actPars", "condition", "condTerm", "condFact", 
		"expr", "term", "factor", "designator", "relop", "addop", "mulop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'//'", "'/*'", "'*/'", "';'", "'.'", "'''", "'='", "','", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'++'", "'--'", "'||'", "'&&'", "'=='", "'<='", "'>='", "'!='", "'<'", 
		"'>'", "'class'", "'if'", "'while'", "'let'", "'then'", "'else'", "'in'", 
		"'do'", "'begin'", "'end'", "'const'", "'var'", "'void'", "'break'", "'return'", 
		"'read'", "'write'", "'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENTS", "COMMENT_MULTI", "COMMENT_MULTICLOSE", "PyCOMA", "PUNTO", 
		"COMILLAS", "ASSIGN", "COMA", "PIZQ", "PDER", "CUAIZQ", "CUADER", "CORIZQ", 
		"CORDER", "SUMA", "RESTA", "MULTIPLICACION", "DIVISION", "RESIDUO", "AUMENTO", 
		"DECREMENTO", "OO", "YY", "COMP_IGUAL", "COMP_MENOR", "COMP_MAYOR", "COMP_DIFERENTE", 
		"MENOR", "MAYOR", "CLASS", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", 
		"DO", "BEGIN", "END", "CONST", "VAR", "VOID", "BREAK", "RETURN", "READ", 
		"WRITE", "NEW", "NUM", "FLOAT", "INT", "ID", "CHAR", "BOOL", "STRING", 
		"WS", "PyCOM", "FOR", "PyComa"
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
	public String getGrammarFileName() { return "miParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(miParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(miParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(miParser.CORDER, 0); }
		public TerminalNode EOF() { return getToken(miParser.EOF, 0); }
		public List<ConstDec1Context> constDec1() {
			return getRuleContexts(ConstDec1Context.class);
		}
		public ConstDec1Context constDec1(int i) {
			return getRuleContext(ConstDec1Context.class,i);
		}
		public List<VarDec1Context> varDec1() {
			return getRuleContexts(VarDec1Context.class);
		}
		public VarDec1Context varDec1(int i) {
			return getRuleContext(VarDec1Context.class,i);
		}
		public List<ClassDec1Context> classDec1() {
			return getRuleContexts(ClassDec1Context.class);
		}
		public ClassDec1Context classDec1(int i) {
			return getRuleContext(ClassDec1Context.class,i);
		}
		public List<MethodDec1Context> methodDec1() {
			return getRuleContexts(MethodDec1Context.class);
		}
		public MethodDec1Context methodDec1(int i) {
			return getRuleContext(MethodDec1Context.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CLASS);
			setState(41);
			match(ID);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << CONST) | (1L << ID))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(42);
					constDec1();
					}
					break;
				case ID:
					{
					setState(43);
					varDec1();
					}
					break;
				case CLASS:
					{
					setState(44);
					classDec1();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(CORIZQ);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID || _la==ID) {
				{
				{
				setState(51);
				methodDec1();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(CORDER);
			setState(58);
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

	public static class ConstDec1Context extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(miParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public TerminalNode PyCOM() { return getToken(miParser.PyCOM, 0); }
		public TerminalNode NUM() { return getToken(miParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(miParser.CHAR, 0); }
		public ConstDec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDec1; }
	}

	public final ConstDec1Context constDec1() throws RecognitionException {
		ConstDec1Context _localctx = new ConstDec1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_constDec1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(CONST);
			setState(61);
			type();
			setState(62);
			match(ID);
			setState(63);
			match(ASSIGN);
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==CHAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(65);
			match(PyCOM);
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

	public static class VarDec1Context extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public TerminalNode PyCOMA() { return getToken(miParser.PyCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public VarDec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec1; }
	}

	public final VarDec1Context varDec1() throws RecognitionException {
		VarDec1Context _localctx = new VarDec1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDec1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			type();
			setState(68);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(69);
				match(COMA);
				setState(70);
				match(ID);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(PyCOMA);
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

	public static class ClassDec1Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(miParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(miParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(miParser.CORDER, 0); }
		public List<VarDec1Context> varDec1() {
			return getRuleContexts(VarDec1Context.class);
		}
		public VarDec1Context varDec1(int i) {
			return getRuleContext(VarDec1Context.class,i);
		}
		public ClassDec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec1; }
	}

	public final ClassDec1Context classDec1() throws RecognitionException {
		ClassDec1Context _localctx = new ClassDec1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDec1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(CLASS);
			setState(79);
			match(ID);
			setState(80);
			match(CORIZQ);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(81);
				varDec1();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(CORDER);
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

	public static class MethodDec1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(miParser.VOID, 0); }
		public FormParsContext formPars() {
			return getRuleContext(FormParsContext.class,0);
		}
		public List<VarDec1Context> varDec1() {
			return getRuleContexts(VarDec1Context.class);
		}
		public VarDec1Context varDec1(int i) {
			return getRuleContext(VarDec1Context.class,i);
		}
		public MethodDec1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDec1; }
	}

	public final MethodDec1Context methodDec1() throws RecognitionException {
		MethodDec1Context _localctx = new MethodDec1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDec1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(89);
				type();
				}
				break;
			case VOID:
				{
				setState(90);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			match(ID);
			setState(94);
			match(PIZQ);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(95);
				formPars();
				}
			}

			setState(98);
			match(PDER);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(99);
				varDec1();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105);
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

	public static class FormParsContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public FormParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formPars; }
	}

	public final FormParsContext formPars() throws RecognitionException {
		FormParsContext _localctx = new FormParsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			type();
			setState(108);
			match(ID);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				type();
				setState(111);
				match(ID);
				}
				}
				setState(117);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public TerminalNode CUAIZQ() { return getToken(miParser.CUAIZQ, 0); }
		public TerminalNode CUADER() { return getToken(miParser.CUADER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CUAIZQ) {
				{
				setState(119);
				match(CUAIZQ);
				setState(120);
				match(CUADER);
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

	public static class StatementContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(miParser.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(miParser.PyCOMA, i);
		}
		public TerminalNode ASSIGN() { return getToken(miParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public TerminalNode AUMENTO() { return getToken(miParser.AUMENTO, 0); }
		public TerminalNode DECREMENTO() { return getToken(miParser.DECREMENTO, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode IF() { return getToken(miParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(miParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(miParser.FOR, 0); }
		public TerminalNode WHILE() { return getToken(miParser.WHILE, 0); }
		public TerminalNode BREAK() { return getToken(miParser.BREAK, 0); }
		public TerminalNode RETURN() { return getToken(miParser.RETURN, 0); }
		public TerminalNode PyComa() { return getToken(miParser.PyComa, 0); }
		public TerminalNode READ() { return getToken(miParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(miParser.WRITE, 0); }
		public TerminalNode COMA() { return getToken(miParser.COMA, 0); }
		public TerminalNode NUM() { return getToken(miParser.NUM, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				designator();
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(124);
					match(ASSIGN);
					setState(125);
					expr();
					}
					break;
				case PIZQ:
					{
					setState(126);
					match(PIZQ);
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << RESTA) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAR) | (1L << BOOL))) != 0)) {
						{
						setState(127);
						actPars();
						}
					}

					setState(130);
					match(PDER);
					}
					break;
				case AUMENTO:
					{
					setState(131);
					match(AUMENTO);
					}
					break;
				case DECREMENTO:
					{
					setState(132);
					match(DECREMENTO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(PyCOMA);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(IF);
				setState(138);
				match(PIZQ);
				setState(139);
				condition();
				setState(140);
				match(PDER);
				setState(141);
				statement();
				setState(144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(142);
					match(ELSE);
					setState(143);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(FOR);
				{
				setState(147);
				match(PIZQ);
				setState(148);
				expr();
				setState(149);
				match(PyCOMA);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << RESTA) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(150);
					condition();
					}
				}

				setState(153);
				match(PyCOMA);
				setState(155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(154);
					statement();
					}
					break;
				}
				}
				setState(157);
				statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(WHILE);
				setState(160);
				match(PIZQ);
				setState(161);
				condition();
				setState(162);
				match(PDER);
				setState(163);
				statement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				match(BREAK);
				setState(166);
				match(PyCOMA);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				match(RETURN);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << RESTA) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAR) | (1L << BOOL))) != 0)) {
					{
					setState(168);
					expr();
					}
				}

				setState(171);
				match(PyComa);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(READ);
				setState(173);
				match(PIZQ);
				setState(174);
				designator();
				setState(175);
				match(PDER);
				setState(176);
				match(PyComa);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(WRITE);
				setState(179);
				match(PIZQ);
				setState(180);
				expr();
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMA) {
					{
					setState(181);
					match(COMA);
					setState(182);
					match(NUM);
					}
				}

				setState(185);
				match(PDER);
				setState(186);
				match(PyCOMA);
				}
				break;
			case CORIZQ:
				enterOuterAlt(_localctx, 9);
				{
				setState(188);
				block();
				}
				break;
			case PyCOMA:
				enterOuterAlt(_localctx, 10);
				{
				setState(189);
				match(PyCOMA);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CORIZQ() { return getToken(miParser.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(miParser.CORDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(CORIZQ);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PyCOMA) | (1L << CORIZQ) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << ID) | (1L << FOR))) != 0)) {
				{
				{
				setState(193);
				statement();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(CORDER);
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

	public static class ActParsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(miParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(miParser.COMA, i);
		}
		public ActParsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actPars; }
	}

	public final ActParsContext actPars() throws RecognitionException {
		ActParsContext _localctx = new ActParsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_actPars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			expr();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(202);
				match(COMA);
				setState(203);
				expr();
				}
				}
				setState(208);
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

	public static class ConditionContext extends ParserRuleContext {
		public List<CondTermContext> condTerm() {
			return getRuleContexts(CondTermContext.class);
		}
		public CondTermContext condTerm(int i) {
			return getRuleContext(CondTermContext.class,i);
		}
		public List<TerminalNode> OO() { return getTokens(miParser.OO); }
		public TerminalNode OO(int i) {
			return getToken(miParser.OO, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			condTerm();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OO) {
				{
				{
				setState(210);
				match(OO);
				setState(211);
				condTerm();
				}
				}
				setState(216);
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

	public static class CondTermContext extends ParserRuleContext {
		public List<CondFactContext> condFact() {
			return getRuleContexts(CondFactContext.class);
		}
		public CondFactContext condFact(int i) {
			return getRuleContext(CondFactContext.class,i);
		}
		public List<TerminalNode> YY() { return getTokens(miParser.YY); }
		public TerminalNode YY(int i) {
			return getToken(miParser.YY, i);
		}
		public CondTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condTerm; }
	}

	public final CondTermContext condTerm() throws RecognitionException {
		CondTermContext _localctx = new CondTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			condFact();
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==YY) {
				{
				{
				setState(218);
				match(YY);
				setState(219);
				condFact();
				}
				}
				setState(224);
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

	public static class CondFactContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondFactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFact; }
	}

	public final CondFactContext condFact() throws RecognitionException {
		CondFactContext _localctx = new CondFactContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condFact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expr();
			setState(226);
			relop();
			setState(227);
			expr();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode RESTA() { return getToken(miParser.RESTA, 0); }
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESTA) {
				{
				setState(229);
				match(RESTA);
				}
			}

			setState(232);
			term();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SUMA || _la==RESTA) {
				{
				{
				setState(233);
				addop();
				setState(234);
				term();
				}
				}
				setState(240);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			factor();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << RESIDUO))) != 0)) {
				{
				{
				setState(242);
				mulop();
				setState(243);
				factor();
				}
				}
				setState(249);
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

	public static class FactorContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(miParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(miParser.PDER, 0); }
		public ActParsContext actPars() {
			return getRuleContext(ActParsContext.class,0);
		}
		public TerminalNode NUM() { return getToken(miParser.NUM, 0); }
		public TerminalNode CHAR() { return getToken(miParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(miParser.BOOL, 0); }
		public TerminalNode NEW() { return getToken(miParser.NEW, 0); }
		public TerminalNode ID() { return getToken(miParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				designator();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PIZQ) {
					{
					setState(251);
					match(PIZQ);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIZQ) | (1L << RESTA) | (1L << NEW) | (1L << NUM) | (1L << ID) | (1L << CHAR) | (1L << BOOL))) != 0)) {
						{
						setState(252);
						actPars();
						}
					}

					setState(255);
					match(PDER);
					}
				}

				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(NUM);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				match(CHAR);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(BOOL);
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 5);
				{
				setState(261);
				match(NEW);
				setState(262);
				match(ID);
				}
				break;
			case PIZQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				match(PIZQ);
				setState(264);
				expr();
				setState(265);
				match(PDER);
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

	public static class DesignatorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(miParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(miParser.ID, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(miParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(miParser.PUNTO, i);
		}
		public List<TerminalNode> CUAIZQ() { return getTokens(miParser.CUAIZQ); }
		public TerminalNode CUAIZQ(int i) {
			return getToken(miParser.CUAIZQ, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CUADER() { return getTokens(miParser.CUADER); }
		public TerminalNode CUADER(int i) {
			return getToken(miParser.CUADER, i);
		}
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_designator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(ID);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO || _la==CUAIZQ) {
				{
				setState(276);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PUNTO:
					{
					setState(270);
					match(PUNTO);
					setState(271);
					match(ID);
					}
					break;
				case CUAIZQ:
					{
					setState(272);
					match(CUAIZQ);
					setState(273);
					expr();
					setState(274);
					match(CUADER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(280);
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

	public static class RelopContext extends ParserRuleContext {
		public TerminalNode COMP_IGUAL() { return getToken(miParser.COMP_IGUAL, 0); }
		public TerminalNode COMP_DIFERENTE() { return getToken(miParser.COMP_DIFERENTE, 0); }
		public TerminalNode MAYOR() { return getToken(miParser.MAYOR, 0); }
		public TerminalNode COMP_MAYOR() { return getToken(miParser.COMP_MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(miParser.MENOR, 0); }
		public TerminalNode COMP_MENOR() { return getToken(miParser.COMP_MENOR, 0); }
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMP_IGUAL) | (1L << COMP_MENOR) | (1L << COMP_MAYOR) | (1L << COMP_DIFERENTE) | (1L << MENOR) | (1L << MAYOR))) != 0)) ) {
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

	public static class AddopContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(miParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(miParser.RESTA, 0); }
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==SUMA || _la==RESTA) ) {
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

	public static class MulopContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACION() { return getToken(miParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(miParser.DIVISION, 0); }
		public TerminalNode RESIDUO() { return getToken(miParser.RESIDUO, 0); }
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICACION) | (1L << DIVISION) | (1L << RESIDUO))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\5\6^\n\6\3\6\3\6\3\6\5"+
		"\6c\n\6\3\6\3\6\7\6g\n\6\f\6\16\6j\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7t\n\7\f\7\16\7w\13\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0083\n\t\3\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u0093\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\3\t\5\t\u009e"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ac\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00ba\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\7\n\u00c5\n\n\f\n\16\n\u00c8\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\7\13\u00cf\n\13\f\13\16\13\u00d2\13\13\3\f\3\f\3\f\7"+
		"\f\u00d7\n\f\f\f\16\f\u00da\13\f\3\r\3\r\3\r\7\r\u00df\n\r\f\r\16\r\u00e2"+
		"\13\r\3\16\3\16\3\16\3\16\3\17\5\17\u00e9\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00ef\n\17\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\7\20\u00f8\n\20"+
		"\f\20\16\20\u00fb\13\20\3\21\3\21\3\21\5\21\u0100\n\21\3\21\5\21\u0103"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u010e\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0117\n\22\f\22\16\22\u011a\13\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(\2\6\4\2\62\62\66\66\3\2\32\37\3\2\21\22\3\2\23\25\2"+
		"\u013a\2*\3\2\2\2\4>\3\2\2\2\6E\3\2\2\2\bP\3\2\2\2\n]\3\2\2\2\fm\3\2\2"+
		"\2\16x\3\2\2\2\20\u00c0\3\2\2\2\22\u00c2\3\2\2\2\24\u00cb\3\2\2\2\26\u00d3"+
		"\3\2\2\2\30\u00db\3\2\2\2\32\u00e3\3\2\2\2\34\u00e8\3\2\2\2\36\u00f3\3"+
		"\2\2\2 \u010d\3\2\2\2\"\u010f\3\2\2\2$\u011b\3\2\2\2&\u011d\3\2\2\2(\u011f"+
		"\3\2\2\2*+\7 \2\2+\61\7\65\2\2,\60\5\4\3\2-\60\5\6\4\2.\60\5\b\5\2/,\3"+
		"\2\2\2/-\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\648\7\17\2\2\65\67\5\n\6\2\66\65\3\2\2\2\67"+
		":\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\20\2\2<=\7\2\2"+
		"\3=\3\3\2\2\2>?\7*\2\2?@\5\16\b\2@A\7\65\2\2AB\7\t\2\2BC\t\2\2\2CD\7:"+
		"\2\2D\5\3\2\2\2EF\5\16\b\2FK\7\65\2\2GH\7\n\2\2HJ\7\65\2\2IG\3\2\2\2J"+
		"M\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\6\2\2O\7\3\2\2\2"+
		"PQ\7 \2\2QR\7\65\2\2RV\7\17\2\2SU\5\6\4\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2"+
		"\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7\20\2\2Z\t\3\2\2\2[^\5\16\b\2\\^\7"+
		",\2\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_`\7\65\2\2`b\7\13\2\2ac\5\f\7\2b"+
		"a\3\2\2\2bc\3\2\2\2cd\3\2\2\2dh\7\f\2\2eg\5\6\4\2fe\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\5\22\n\2l\13\3\2\2\2mn\5\16"+
		"\b\2nu\7\65\2\2op\7\n\2\2pq\5\16\b\2qr\7\65\2\2rt\3\2\2\2so\3\2\2\2tw"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2v\r\3\2\2\2wu\3\2\2\2x{\7\65\2\2yz\7\r\2\2"+
		"z|\7\16\2\2{y\3\2\2\2{|\3\2\2\2|\17\3\2\2\2}\u0087\5\"\22\2~\177\7\t\2"+
		"\2\177\u0088\5\34\17\2\u0080\u0082\7\13\2\2\u0081\u0083\5\24\13\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0088\7\f"+
		"\2\2\u0085\u0088\7\26\2\2\u0086\u0088\7\27\2\2\u0087~\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7\6\2\2\u008a\u00c1\3\2\2\2\u008b\u008c\7!\2\2\u008c\u008d\7\13"+
		"\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\f\2\2\u008f\u0092\5\20\t\2\u0090"+
		"\u0091\7%\2\2\u0091\u0093\5\20\t\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u00c1\3\2\2\2\u0094\u0095\7;\2\2\u0095\u0096\7\13\2\2\u0096"+
		"\u0097\5\34\17\2\u0097\u0099\7\6\2\2\u0098\u009a\5\26\f\2\u0099\u0098"+
		"\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\6\2\2\u009c"+
		"\u009e\5\20\t\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\5\20\t\2\u00a0\u00c1\3\2\2\2\u00a1\u00a2\7\"\2\2\u00a2"+
		"\u00a3\7\13\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\f\2\2\u00a5\u00a6\5"+
		"\20\t\2\u00a6\u00c1\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8\u00c1\7\6\2\2\u00a9"+
		"\u00ab\7.\2\2\u00aa\u00ac\5\34\17\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c1\7<\2\2\u00ae\u00af\7/\2\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\7"+
		"<\2\2\u00b3\u00c1\3\2\2\2\u00b4\u00b5\7\60\2\2\u00b5\u00b6\7\13\2\2\u00b6"+
		"\u00b9\5\34\17\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\7\62\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc"+
		"\u00bd\7\6\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c1\5\22\n\2\u00bf\u00c1\7"+
		"\6\2\2\u00c0}\3\2\2\2\u00c0\u008b\3\2\2\2\u00c0\u0094\3\2\2\2\u00c0\u00a1"+
		"\3\2\2\2\u00c0\u00a7\3\2\2\2\u00c0\u00a9\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0"+
		"\u00b4\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\21\3\2\2"+
		"\2\u00c2\u00c6\7\17\2\2\u00c3\u00c5\5\20\t\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7\20\2\2\u00ca\23\3\2\2\2\u00cb\u00d0"+
		"\5\34\17\2\u00cc\u00cd\7\n\2\2\u00cd\u00cf\5\34\17\2\u00ce\u00cc\3\2\2"+
		"\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\25"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d8\5\30\r\2\u00d4\u00d5\7\30\2\2"+
		"\u00d5\u00d7\5\30\r\2\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\27\3\2\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00e0\5\32\16\2\u00dc\u00dd\7\31\2\2\u00dd\u00df\5\32\16\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\31\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5\34\17\2\u00e4\u00e5\5$\23"+
		"\2\u00e5\u00e6\5\34\17\2\u00e6\33\3\2\2\2\u00e7\u00e9\7\22\2\2\u00e8\u00e7"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f0\5\36\20\2"+
		"\u00eb\u00ec\5&\24\2\u00ec\u00ed\5\36\20\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\35\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f9\5 \21\2\u00f4\u00f5\5(\25"+
		"\2\u00f5\u00f6\5 \21\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\37\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u0102\5\"\22\2\u00fd\u00ff\7\13\2\2\u00fe\u0100\5"+
		"\24\13\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\7\f\2\2\u0102\u00fd\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010e\3\2"+
		"\2\2\u0104\u010e\7\62\2\2\u0105\u010e\7\66\2\2\u0106\u010e\7\67\2\2\u0107"+
		"\u0108\7\61\2\2\u0108\u010e\7\65\2\2\u0109\u010a\7\13\2\2\u010a\u010b"+
		"\5\34\17\2\u010b\u010c\7\f\2\2\u010c\u010e\3\2\2\2\u010d\u00fc\3\2\2\2"+
		"\u010d\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0107"+
		"\3\2\2\2\u010d\u0109\3\2\2\2\u010e!\3\2\2\2\u010f\u0118\7\65\2\2\u0110"+
		"\u0111\7\7\2\2\u0111\u0117\7\65\2\2\u0112\u0113\7\r\2\2\u0113\u0114\5"+
		"\34\17\2\u0114\u0115\7\16\2\2\u0115\u0117\3\2\2\2\u0116\u0110\3\2\2\2"+
		"\u0116\u0112\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119#\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\t\3\2\2\u011c"+
		"%\3\2\2\2\u011d\u011e\t\4\2\2\u011e\'\3\2\2\2\u011f\u0120\t\5\2\2\u0120"+
		")\3\2\2\2 /\618KV]bhu{\u0082\u0087\u0092\u0099\u009d\u00ab\u00b9\u00c0"+
		"\u00c6\u00d0\u00d8\u00e0\u00e8\u00f0\u00f9\u00ff\u0102\u010d\u0116\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}