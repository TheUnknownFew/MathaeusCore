// Generated from C:/Users/zedla/ZDocs/Local/Programming/Personal Projects/Mathaeus/src/zed/maetheus/api/grammars\NumberGrammar.g4 by ANTLR 4.8
package zed.maetheus.parsers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumberGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12;
	public static final int
		RULE_start = 0, RULE_val = 1, RULE_cnum = 2, RULE_cnum1 = 3, RULE_num = 4, 
		RULE_cont = 5, RULE_cap = 6, RULE_d = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "val", "cnum", "cnum1", "num", "cont", "cap", "d"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "','", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", 
			"'7'", "'8'", "'9'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
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
	public String getGrammarFileName() { return "NumberGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NumberGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode EOF() { return getToken(NumberGrammarParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			val();
			setState(17);
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

	public static class ValContext extends ParserRuleContext {
		public CnumContext cnum() {
			return getRuleContext(CnumContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_val);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				cnum();
				setState(20);
				match(T__0);
				setState(21);
				d();
				setState(22);
				cont();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				num();
				setState(25);
				match(T__0);
				setState(26);
				d();
				setState(27);
				cont();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				cnum();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(30);
				num();
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

	public static class CnumContext extends ParserRuleContext {
		public CapContext cap() {
			return getRuleContext(CapContext.class,0);
		}
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
		}
		public Cnum1Context cnum1() {
			return getRuleContext(Cnum1Context.class,0);
		}
		public CnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterCnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitCnum(this);
		}
	}

	public final CnumContext cnum() throws RecognitionException {
		CnumContext _localctx = new CnumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cnum);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				cap();
				setState(34);
				match(T__1);
				setState(35);
				d();
				setState(36);
				d();
				setState(37);
				d();
				setState(38);
				cnum1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				cap();
				setState(41);
				d();
				setState(42);
				match(T__1);
				setState(43);
				d();
				setState(44);
				d();
				setState(45);
				d();
				setState(46);
				cnum1();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				cap();
				setState(49);
				d();
				setState(50);
				d();
				setState(51);
				match(T__1);
				setState(52);
				d();
				setState(53);
				d();
				setState(54);
				d();
				setState(55);
				cnum1();
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

	public static class Cnum1Context extends ParserRuleContext {
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
		}
		public List<Cnum1Context> cnum1() {
			return getRuleContexts(Cnum1Context.class);
		}
		public Cnum1Context cnum1(int i) {
			return getRuleContext(Cnum1Context.class,i);
		}
		public Cnum1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnum1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterCnum1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitCnum1(this);
		}
	}

	public final Cnum1Context cnum1() throws RecognitionException {
		Cnum1Context _localctx = new Cnum1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_cnum1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(T__1);
					setState(60);
					d();
					setState(61);
					d();
					setState(62);
					d();
					setState(63);
					cnum1();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class NumContext extends ParserRuleContext {
		public CapContext cap() {
			return getRuleContext(CapContext.class,0);
		}
		public ContContext cont() {
			return getRuleContext(ContContext.class,0);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				cap();
				setState(71);
				cont();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__2);
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

	public static class ContContext extends ParserRuleContext {
		public List<DContext> d() {
			return getRuleContexts(DContext.class);
		}
		public DContext d(int i) {
			return getRuleContext(DContext.class,i);
		}
		public List<ContContext> cont() {
			return getRuleContexts(ContContext.class);
		}
		public ContContext cont(int i) {
			return getRuleContext(ContContext.class,i);
		}
		public ContContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterCont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitCont(this);
		}
	}

	public final ContContext cont() throws RecognitionException {
		ContContext _localctx = new ContContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cont);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					d();
					setState(77);
					cont();
					}
					} 
				}
				setState(83);
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

	public static class CapContext extends ParserRuleContext {
		public CapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterCap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitCap(this);
		}
	}

	public final CapContext cap() throws RecognitionException {
		CapContext _localctx = new CapContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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

	public static class DContext extends ParserRuleContext {
		public CapContext cap() {
			return getRuleContext(CapContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).enterD(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NumberGrammarListener ) ((NumberGrammarListener)listener).exitD(this);
		}
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_d);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__2);
				}
				break;
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				cap();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5D\n\5\f\5\16\5G\13\5\3\6\3"+
		"\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\7\7R\n\7\f\7\16\7U\13\7\3\b\3\b\3\t\3"+
		"\t\5\t[\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\6\16\2]\2\22\3\2\2\2\4"+
		"!\3\2\2\2\6;\3\2\2\2\bE\3\2\2\2\nL\3\2\2\2\fS\3\2\2\2\16V\3\2\2\2\20Z"+
		"\3\2\2\2\22\23\5\4\3\2\23\24\7\2\2\3\24\3\3\2\2\2\25\26\5\6\4\2\26\27"+
		"\7\3\2\2\27\30\5\20\t\2\30\31\5\f\7\2\31\"\3\2\2\2\32\33\5\n\6\2\33\34"+
		"\7\3\2\2\34\35\5\20\t\2\35\36\5\f\7\2\36\"\3\2\2\2\37\"\5\6\4\2 \"\5\n"+
		"\6\2!\25\3\2\2\2!\32\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\5\16"+
		"\b\2$%\7\4\2\2%&\5\20\t\2&\'\5\20\t\2\'(\5\20\t\2()\5\b\5\2)<\3\2\2\2"+
		"*+\5\16\b\2+,\5\20\t\2,-\7\4\2\2-.\5\20\t\2./\5\20\t\2/\60\5\20\t\2\60"+
		"\61\5\b\5\2\61<\3\2\2\2\62\63\5\16\b\2\63\64\5\20\t\2\64\65\5\20\t\2\65"+
		"\66\7\4\2\2\66\67\5\20\t\2\678\5\20\t\289\5\20\t\29:\5\b\5\2:<\3\2\2\2"+
		";#\3\2\2\2;*\3\2\2\2;\62\3\2\2\2<\7\3\2\2\2=>\7\4\2\2>?\5\20\t\2?@\5\20"+
		"\t\2@A\5\20\t\2AB\5\b\5\2BD\3\2\2\2C=\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2F\t\3\2\2\2GE\3\2\2\2HI\5\16\b\2IJ\5\f\7\2JM\3\2\2\2KM\7\5\2\2L"+
		"H\3\2\2\2LK\3\2\2\2M\13\3\2\2\2NO\5\20\t\2OP\5\f\7\2PR\3\2\2\2QN\3\2\2"+
		"\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\r\3\2\2\2US\3\2\2\2VW\t\2\2\2W\17\3"+
		"\2\2\2X[\7\5\2\2Y[\5\16\b\2ZX\3\2\2\2ZY\3\2\2\2[\21\3\2\2\2\b!;ELSZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}