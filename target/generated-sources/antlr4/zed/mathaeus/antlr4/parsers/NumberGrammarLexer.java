// Generated from zed\mathaeus\antlr4\parsers\NumberGrammar.g4 by ANTLR 4.8
package zed.mathaeus.antlr4.parsers;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NumberGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, DECI=2, CNUM=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUM", "DECI", "CNUM", "DIGIT", "DIGIT1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUM", "DECI", "CNUM"
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


	public NumberGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NumberGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\5b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\5\2\26\n\2\3\3\3\3\3\3\6\3\33\n\3\r\3\16\3\34\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4%\n\4\r\4\16\4&\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\5\4\60\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\6\49\n\4\r\4\16\4:\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\5\4D\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4N\n\4\r\4\16\4O\3\4\3\4"+
		"\7\4T\n\4\f\4\16\4W\13\4\5\4Y\n\4\5\4[\n\4\3\5\3\5\5\5_\n\5\3\6\3\6\2"+
		"\2\7\3\3\5\4\7\5\t\2\13\2\3\2\2\2n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\3\25\3\2\2\2\5\27\3\2\2\2\7Z\3\2\2\2\t^\3\2\2\2\13`\3\2\2\2\r\21\5\13"+
		"\6\2\16\20\5\t\5\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2"+
		"\2\2\22\26\3\2\2\2\23\21\3\2\2\2\24\26\5\t\5\2\25\r\3\2\2\2\25\24\3\2"+
		"\2\2\26\4\3\2\2\2\27\30\5\3\2\2\30\32\7\60\2\2\31\33\5\t\5\2\32\31\3\2"+
		"\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\6\3\2\2\2\36$\5\13\6"+
		"\2\37 \7.\2\2 !\5\t\5\2!\"\5\t\5\2\"#\5\t\5\2#%\3\2\2\2$\37\3\2\2\2%&"+
		"\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'/\3\2\2\2(,\7\60\2\2)+\5\t\5\2*)\3\2\2"+
		"\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/(\3\2\2\2/\60\3"+
		"\2\2\2\60[\3\2\2\2\61\62\5\13\6\2\628\5\t\5\2\63\64\7.\2\2\64\65\5\t\5"+
		"\2\65\66\5\t\5\2\66\67\5\t\5\2\679\3\2\2\28\63\3\2\2\29:\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;C\3\2\2\2<@\7\60\2\2=?\5\t\5\2>=\3\2\2\2?B\3\2\2\2@>\3"+
		"\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C<\3\2\2\2CD\3\2\2\2D[\3\2\2\2EF\5"+
		"\13\6\2FG\5\t\5\2GM\5\t\5\2HI\7.\2\2IJ\5\t\5\2JK\5\t\5\2KL\5\t\5\2LN\3"+
		"\2\2\2MH\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PX\3\2\2\2QU\7\60\2\2RT"+
		"\5\t\5\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2WU\3\2\2\2X"+
		"Q\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\36\3\2\2\2Z\61\3\2\2\2ZE\3\2\2\2[\b\3\2"+
		"\2\2\\_\7\62\2\2]_\5\13\6\2^\\\3\2\2\2^]\3\2\2\2_\n\3\2\2\2`a\4\63;\2"+
		"a\f\3\2\2\2\21\2\21\25\34&,/:@COUXZ^\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}