// Generated from dato.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class datoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TAG=1, OPEN=2, END=3, MID=4, WHITESPACES=5, Comment=6, MULTICOMMENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TAG", "OPEN", "END", "MID", "WHITESPACES", "Comment", "MULTICOMMENT"
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
			null, "TAG", "OPEN", "END", "MID", "WHITESPACES", "Comment", "MULTICOMMENT"
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


	public datoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dato.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4\3\4"+
		"\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\6\4.\n\4\r\4\16\4/\3\5\3\5\7\5\64"+
		"\n\5\f\5\16\5\67\13\5\3\6\6\6:\n\6\r\6\16\6;\3\6\3\6\3\7\3\7\3\7\3\7\7"+
		"\7D\n\7\f\7\16\7G\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bQ\n\b\f\b\16"+
		"\bT\13\b\3\b\3\b\3\b\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\b\17\t\3\2\n"+
		"\3\2c|\4\2\63;c|\6\2\"\"\62;C\\c|\7\2\f\f\"\"\62;C\\c|\4\2\13\f\"\"\3"+
		"\2\f\f\3\2\61\61\3\2,,\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2\2\2\5\36\3\2\2\2\7"+
		"-\3\2\2\2\t\61\3\2\2\2\139\3\2\2\2\r?\3\2\2\2\17J\3\2\2\2\21\22\5\5\3"+
		"\2\22\23\5\t\5\2\23\24\5\7\4\2\24\4\3\2\2\2\25\26\7>\2\2\26\32\t\2\2\2"+
		"\27\31\t\3\2\2\30\27\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2"+
		"\33\35\3\2\2\2\34\32\3\2\2\2\35\37\7@\2\2\36\25\3\2\2\2\37 \3\2\2\2 \36"+
		"\3\2\2\2 !\3\2\2\2!\6\3\2\2\2\"#\7>\2\2#$\7\61\2\2$%\3\2\2\2%)\t\2\2\2"+
		"&(\t\3\2\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2"+
		"\2,.\7@\2\2-\"\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\b\3\2\2\2\61"+
		"\65\t\4\2\2\62\64\t\5\2\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\n\3\2\2\2\67\65\3\2\2\28:\t\6\2\298\3\2\2\2:;\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\b\6\2\2>\f\3\2\2\2?@\7\61\2\2@A\7\61\2"+
		"\2AE\3\2\2\2BD\n\7\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2"+
		"\2GE\3\2\2\2HI\b\7\2\2I\16\3\2\2\2JK\7\61\2\2KL\7,\2\2LR\3\2\2\2MN\7,"+
		"\2\2NQ\n\b\2\2OQ\n\t\2\2PM\3\2\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2SU\3\2\2\2TR\3\2\2\2UV\7,\2\2VW\7\61\2\2WX\3\2\2\2XY\b\b\2\2Y\20\3"+
		"\2\2\2\f\2\32 )/\65;EPR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}