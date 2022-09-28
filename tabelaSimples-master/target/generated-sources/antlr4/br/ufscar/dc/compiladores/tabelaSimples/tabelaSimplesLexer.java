// Generated from br\u005Cufscar\dc\compiladores\tabelaSimples\tabelaSimples.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tabelaSimples;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tabelaSimplesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, COMENTARIO=4, COMENTARIO_ERRADO=5, TABULACAO=6, 
		ONDE=7, ABRE_PARENTESES=8, FECHA_PARENTESES=9, ABRE_CHAVE=10, FECHA_CHAVE=11, 
		CRIA_TABELA=12, INSERIR_EM=13, ENCONTRA_TUDO=14, ENCONTRA_EM=15, DELETA_TUDO=16, 
		DELETA_LINHAS=17, DEFINIR=18, TIPO=19, CADEIA=20, DATA=21, INTEIRO=22, 
		REAL=23, CADEIA_NFECHADA=24, IDENT=25, SIMBOLO_NAO_CONHECIDO=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "COMENTARIO", "COMENTARIO_ERRADO", "TABULACAO", 
			"ONDE", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVE", "FECHA_CHAVE", 
			"CRIA_TABELA", "INSERIR_EM", "ENCONTRA_TUDO", "ENCONTRA_EM", "DELETA_TUDO", 
			"DELETA_LINHAS", "DEFINIR", "TIPO", "CADEIA", "DATA", "INTEIRO", "REAL", 
			"CADEIA_NFECHADA", "IDENT", "SIMBOLO_NAO_CONHECIDO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','", "':'", null, null, null, "'onde'", "'('", "')'", 
			"'['", "']'", "'criaTabela'", "'inserirEm'", "'encontraTudo'", "'encontraEm'", 
			"'deletaTudoEm'", "'deletaLinhas'", "'definir'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "COMENTARIO", "COMENTARIO_ERRADO", "TABULACAO", 
			"ONDE", "ABRE_PARENTESES", "FECHA_PARENTESES", "ABRE_CHAVE", "FECHA_CHAVE", 
			"CRIA_TABELA", "INSERIR_EM", "ENCONTRA_TUDO", "ENCONTRA_EM", "DELETA_TUDO", 
			"DELETA_LINHAS", "DEFINIR", "TIPO", "CADEIA", "DATA", "INTEIRO", "REAL", 
			"CADEIA_NFECHADA", "IDENT", "SIMBOLO_NAO_CONHECIDO"
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


	public tabelaSimplesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tabelaSimples.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0100\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5@\n\5\f\5"+
		"\16\5C\13\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u00c7\n\24\3\25\3\25\7\25\u00cb\n\25\f\25\16\25\u00ce\13\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\6\27\u00e0\n\27\r\27\16\27\u00e1\3\30\6\30\u00e5\n\30\r\30\16\30\u00e6"+
		"\3\30\3\30\6\30\u00eb\n\30\r\30\16\30\u00ec\3\31\3\31\7\31\u00f1\n\31"+
		"\f\31\16\31\u00f4\13\31\3\31\3\31\3\32\3\32\7\32\u00fa\n\32\f\32\16\32"+
		"\u00fd\13\32\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\3\2\b\5\2\f\f\17\17\177\177\5\2\13\f\17\17\"\"\4\2\f\f"+
		"$$\5\2C\\aac|\6\2\62;C\\aac|\b\2##&\'==AB~\u0080\u00aa\u00aa\2\u010a\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2"+
		"\2\2\t=\3\2\2\2\13H\3\2\2\2\rQ\3\2\2\2\17U\3\2\2\2\21Z\3\2\2\2\23\\\3"+
		"\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33m\3\2\2\2\35w\3\2\2\2\37"+
		"\u0084\3\2\2\2!\u008f\3\2\2\2#\u009c\3\2\2\2%\u00a9\3\2\2\2\'\u00c6\3"+
		"\2\2\2)\u00c8\3\2\2\2+\u00d1\3\2\2\2-\u00df\3\2\2\2/\u00e4\3\2\2\2\61"+
		"\u00ee\3\2\2\2\63\u00f7\3\2\2\2\65\u00fe\3\2\2\2\678\7?\2\28\4\3\2\2\2"+
		"9:\7.\2\2:\6\3\2\2\2;<\7<\2\2<\b\3\2\2\2=A\7}\2\2>@\n\2\2\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\7\177\2\2EF\3\2\2"+
		"\2FG\b\5\2\2G\n\3\2\2\2HL\7}\2\2IK\n\2\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\f\2\2P\f\3\2\2\2QR\t\3\2\2RS\3\2"+
		"\2\2ST\b\7\2\2T\16\3\2\2\2UV\7q\2\2VW\7p\2\2WX\7f\2\2XY\7g\2\2Y\20\3\2"+
		"\2\2Z[\7*\2\2[\22\3\2\2\2\\]\7+\2\2]\24\3\2\2\2^_\7]\2\2_\26\3\2\2\2`"+
		"a\7_\2\2a\30\3\2\2\2bc\7e\2\2cd\7t\2\2de\7k\2\2ef\7c\2\2fg\7V\2\2gh\7"+
		"c\2\2hi\7d\2\2ij\7g\2\2jk\7n\2\2kl\7c\2\2l\32\3\2\2\2mn\7k\2\2no\7p\2"+
		"\2op\7u\2\2pq\7g\2\2qr\7t\2\2rs\7k\2\2st\7t\2\2tu\7G\2\2uv\7o\2\2v\34"+
		"\3\2\2\2wx\7g\2\2xy\7p\2\2yz\7e\2\2z{\7q\2\2{|\7p\2\2|}\7v\2\2}~\7t\2"+
		"\2~\177\7c\2\2\177\u0080\7V\2\2\u0080\u0081\7w\2\2\u0081\u0082\7f\2\2"+
		"\u0082\u0083\7q\2\2\u0083\36\3\2\2\2\u0084\u0085\7g\2\2\u0085\u0086\7"+
		"p\2\2\u0086\u0087\7e\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2\u0089\u008a"+
		"\7v\2\2\u008a\u008b\7t\2\2\u008b\u008c\7c\2\2\u008c\u008d\7G\2\2\u008d"+
		"\u008e\7o\2\2\u008e \3\2\2\2\u008f\u0090\7f\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7v\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7V\2\2\u0096\u0097\7w\2\2\u0097\u0098\7f\2\2\u0098\u0099"+
		"\7q\2\2\u0099\u009a\7G\2\2\u009a\u009b\7o\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7f\2\2\u009d\u009e\7g\2\2\u009e\u009f\7n\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7N\2\2\u00a3\u00a4\7k\2\2"+
		"\u00a4\u00a5\7p\2\2\u00a5\u00a6\7j\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8$\3\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac"+
		"\7h\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7k\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7e\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7f\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7k\2\2\u00b6\u00c7\7c\2\2"+
		"\u00b7\u00b8\7f\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2\u00ba\u00c7"+
		"\7c\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c7\7q\2\2"+
		"\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c7"+
		"\7n\2\2\u00c6\u00b1\3\2\2\2\u00c6\u00b7\3\2\2\2\u00c6\u00bb\3\2\2\2\u00c6"+
		"\u00c2\3\2\2\2\u00c7(\3\2\2\2\u00c8\u00cc\7$\2\2\u00c9\u00cb\n\4\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7$\2\2\u00d0"+
		"*\3\2\2\2\u00d1\u00d2\7)\2\2\u00d2\u00d3\4\62;\2\u00d3\u00d4\4\62;\2\u00d4"+
		"\u00d5\4\62;\2\u00d5\u00d6\4\62;\2\u00d6\u00d7\7/\2\2\u00d7\u00d8\4\62"+
		"\63\2\u00d8\u00d9\4\62;\2\u00d9\u00da\7/\2\2\u00da\u00db\4\62\65\2\u00db"+
		"\u00dc\4\62;\2\u00dc\u00dd\7)\2\2\u00dd,\3\2\2\2\u00de\u00e0\4\62;\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2.\3\2\2\2\u00e3\u00e5\4\62;\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\7\60\2\2\u00e9\u00eb\4\62;\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\60\3\2\2\2\u00ee"+
		"\u00f2\7$\2\2\u00ef\u00f1\n\4\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f2\3\2\2\2\u00f5\u00f6\7\f\2\2\u00f6\62\3\2\2\2\u00f7\u00fb\t\5\2"+
		"\2\u00f8\u00fa\t\6\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\64\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe"+
		"\u00ff\t\7\2\2\u00ff\66\3\2\2\2\f\2AL\u00c6\u00cc\u00e1\u00e6\u00ec\u00f2"+
		"\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}