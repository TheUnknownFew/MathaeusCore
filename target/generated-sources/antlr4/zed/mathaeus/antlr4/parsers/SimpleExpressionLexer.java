// Generated from zed\mathaeus\antlr4\parsers\SimpleExpression.g4 by ANTLR 4.8
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
public class SimpleExpressionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, NUM=3, DECI=4, CNUM=5;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "NUM", "DECI", "CNUM", "DIGIT", "DIGIT1"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "NUM", "DECI", "CNUM"
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


	public SimpleExpressionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleExpression.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\7j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\7\4\30\n\4\f\4\16\4\33\13\4\3\4\5\4\36\n\4\3\5\3\5\3\5\6\5#\n\5\r\5\16"+
		"\5$\3\6\3\6\3\6\3\6\3\6\3\6\6\6-\n\6\r\6\16\6.\3\6\3\6\7\6\63\n\6\f\6"+
		"\16\6\66\13\6\5\68\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6A\n\6\r\6\16\6B"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\5\6L\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6V\n\6\r\6\16\6W\3\6\3\6\7\6\\\n\6\f\6\16\6_\13\6\5\6a\n\6\5\6"+
		"c\n\6\3\7\3\7\5\7g\n\7\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\2\17\2\3\2"+
		"\2\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\21"+
		"\3\2\2\2\5\23\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13b\3\2\2\2\rf\3\2\2\2"+
		"\17h\3\2\2\2\21\22\7\"\2\2\22\4\3\2\2\2\23\24\7-\2\2\24\6\3\2\2\2\25\31"+
		"\5\17\b\2\26\30\5\r\7\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\36\3\2\2\2\33\31\3\2\2\2\34\36\5\r\7\2\35\25\3\2\2\2\35\34"+
		"\3\2\2\2\36\b\3\2\2\2\37 \5\7\4\2 \"\7\60\2\2!#\5\r\7\2\"!\3\2\2\2#$\3"+
		"\2\2\2$\"\3\2\2\2$%\3\2\2\2%\n\3\2\2\2&,\5\17\b\2\'(\7.\2\2()\5\r\7\2"+
		")*\5\r\7\2*+\5\r\7\2+-\3\2\2\2,\'\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2"+
		"\2/\67\3\2\2\2\60\64\7\60\2\2\61\63\5\r\7\2\62\61\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\67\60\3\2\2\2"+
		"\678\3\2\2\28c\3\2\2\29:\5\17\b\2:@\5\r\7\2;<\7.\2\2<=\5\r\7\2=>\5\r\7"+
		"\2>?\5\r\7\2?A\3\2\2\2@;\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CK\3\2\2"+
		"\2DH\7\60\2\2EG\5\r\7\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IL\3\2"+
		"\2\2JH\3\2\2\2KD\3\2\2\2KL\3\2\2\2Lc\3\2\2\2MN\5\17\b\2NO\5\r\7\2OU\5"+
		"\r\7\2PQ\7.\2\2QR\5\r\7\2RS\5\r\7\2ST\5\r\7\2TV\3\2\2\2UP\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X`\3\2\2\2Y]\7\60\2\2Z\\\5\r\7\2[Z\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`Y\3\2\2\2`a\3\2\2\2"+
		"ac\3\2\2\2b&\3\2\2\2b9\3\2\2\2bM\3\2\2\2c\f\3\2\2\2dg\7\62\2\2eg\5\17"+
		"\b\2fd\3\2\2\2fe\3\2\2\2g\16\3\2\2\2hi\4\63;\2i\20\3\2\2\2\21\2\31\35"+
		"$.\64\67BHKW]`bf\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}