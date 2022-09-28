// Generated from br\u005Cufscar\dc\compiladores\tabelaSimples\tabelaSimples.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tabelaSimples;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tabelaSimplesParser extends Parser {
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
	public static final int
		RULE_programa = 0, RULE_instrucao = 1, RULE_define_variavel = 2, RULE_cria_tabela = 3, 
		RULE_insere = 4, RULE_encontra_tudo = 5, RULE_encontra_em = 6, RULE_deleta_tudo = 7, 
		RULE_deleta_linhas = 8, RULE_declaracao = 9, RULE_tamanho = 10, RULE_constante = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucao", "define_variavel", "cria_tabela", "insere", 
			"encontra_tudo", "encontra_em", "deleta_tudo", "deleta_linhas", "declaracao", 
			"tamanho", "constante"
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

	@Override
	public String getGrammarFileName() { return "tabelaSimples.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tabelaSimplesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<Define_variavelContext> define_variavel() {
			return getRuleContexts(Define_variavelContext.class);
		}
		public Define_variavelContext define_variavel(int i) {
			return getRuleContext(Define_variavelContext.class,i);
		}
		public List<Cria_tabelaContext> cria_tabela() {
			return getRuleContexts(Cria_tabelaContext.class);
		}
		public Cria_tabelaContext cria_tabela(int i) {
			return getRuleContext(Cria_tabelaContext.class,i);
		}
		public List<InstrucaoContext> instrucao() {
			return getRuleContexts(InstrucaoContext.class);
		}
		public InstrucaoContext instrucao(int i) {
			return getRuleContext(InstrucaoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEFINIR) {
				{
				{
				setState(24);
				define_variavel();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(30);
					cria_tabela();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(33); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CRIA_TABELA) | (1L << INSERIR_EM) | (1L << ENCONTRA_TUDO) | (1L << ENCONTRA_EM) | (1L << DELETA_TUDO) | (1L << DELETA_LINHAS))) != 0)) {
				{
				{
				setState(35);
				instrucao();
				}
				}
				setState(40);
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

	public static class InstrucaoContext extends ParserRuleContext {
		public Cria_tabelaContext cria_tabela() {
			return getRuleContext(Cria_tabelaContext.class,0);
		}
		public InsereContext insere() {
			return getRuleContext(InsereContext.class,0);
		}
		public Encontra_tudoContext encontra_tudo() {
			return getRuleContext(Encontra_tudoContext.class,0);
		}
		public Encontra_emContext encontra_em() {
			return getRuleContext(Encontra_emContext.class,0);
		}
		public Deleta_tudoContext deleta_tudo() {
			return getRuleContext(Deleta_tudoContext.class,0);
		}
		public Deleta_linhasContext deleta_linhas() {
			return getRuleContext(Deleta_linhasContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucao);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CRIA_TABELA:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				cria_tabela();
				}
				break;
			case INSERIR_EM:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				insere();
				}
				break;
			case ENCONTRA_TUDO:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				encontra_tudo();
				}
				break;
			case ENCONTRA_EM:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				encontra_em();
				}
				break;
			case DELETA_TUDO:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				deleta_tudo();
				}
				break;
			case DELETA_LINHAS:
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				deleta_linhas();
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

	public static class Define_variavelContext extends ParserRuleContext {
		public TerminalNode DEFINIR() { return getToken(tabelaSimplesParser.DEFINIR, 0); }
		public TerminalNode TIPO() { return getToken(tabelaSimplesParser.TIPO, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public Define_variavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterDefine_variavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitDefine_variavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitDefine_variavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_variavelContext define_variavel() throws RecognitionException {
		Define_variavelContext _localctx = new Define_variavelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(DEFINIR);
			setState(50);
			match(TIPO);
			setState(51);
			match(IDENT);
			setState(52);
			match(T__0);
			setState(53);
			constante();
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

	public static class Cria_tabelaContext extends ParserRuleContext {
		public TerminalNode CRIA_TABELA() { return getToken(tabelaSimplesParser.CRIA_TABELA, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(tabelaSimplesParser.ABRE_PARENTESES, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(tabelaSimplesParser.FECHA_PARENTESES, 0); }
		public Cria_tabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cria_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterCria_tabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitCria_tabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitCria_tabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cria_tabelaContext cria_tabela() throws RecognitionException {
		Cria_tabelaContext _localctx = new Cria_tabelaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cria_tabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(CRIA_TABELA);
			setState(56);
			match(IDENT);
			setState(57);
			match(ABRE_PARENTESES);
			setState(58);
			declaracao();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(59);
				match(T__1);
				setState(60);
				declaracao();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(FECHA_PARENTESES);
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

	public static class InsereContext extends ParserRuleContext {
		public TerminalNode INSERIR_EM() { return getToken(tabelaSimplesParser.INSERIR_EM, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(tabelaSimplesParser.ABRE_PARENTESES, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(tabelaSimplesParser.FECHA_PARENTESES, 0); }
		public InsereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterInsere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitInsere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitInsere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsereContext insere() throws RecognitionException {
		InsereContext _localctx = new InsereContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insere);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(INSERIR_EM);
			setState(69);
			match(IDENT);
			setState(70);
			match(ABRE_PARENTESES);
			setState(71);
			constante();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(72);
				match(T__1);
				setState(73);
				constante();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(FECHA_PARENTESES);
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

	public static class Encontra_tudoContext extends ParserRuleContext {
		public TerminalNode ENCONTRA_TUDO() { return getToken(tabelaSimplesParser.ENCONTRA_TUDO, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public Encontra_tudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encontra_tudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterEncontra_tudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitEncontra_tudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitEncontra_tudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encontra_tudoContext encontra_tudo() throws RecognitionException {
		Encontra_tudoContext _localctx = new Encontra_tudoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_encontra_tudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ENCONTRA_TUDO);
			setState(82);
			match(IDENT);
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

	public static class Encontra_emContext extends ParserRuleContext {
		public TerminalNode ENCONTRA_EM() { return getToken(tabelaSimplesParser.ENCONTRA_EM, 0); }
		public List<TerminalNode> IDENT() { return getTokens(tabelaSimplesParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(tabelaSimplesParser.IDENT, i);
		}
		public TerminalNode ONDE() { return getToken(tabelaSimplesParser.ONDE, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(tabelaSimplesParser.ABRE_PARENTESES, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(tabelaSimplesParser.FECHA_PARENTESES, 0); }
		public Encontra_emContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_encontra_em; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterEncontra_em(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitEncontra_em(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitEncontra_em(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Encontra_emContext encontra_em() throws RecognitionException {
		Encontra_emContext _localctx = new Encontra_emContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_encontra_em);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ENCONTRA_EM);
			setState(85);
			match(IDENT);
			setState(86);
			match(ONDE);
			setState(87);
			match(ABRE_PARENTESES);
			setState(88);
			match(IDENT);
			setState(89);
			match(T__0);
			setState(90);
			constante();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(91);
				match(T__1);
				setState(92);
				match(IDENT);
				setState(93);
				match(T__0);
				setState(94);
				constante();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(FECHA_PARENTESES);
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

	public static class Deleta_tudoContext extends ParserRuleContext {
		public TerminalNode DELETA_TUDO() { return getToken(tabelaSimplesParser.DELETA_TUDO, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public Deleta_tudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleta_tudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterDeleta_tudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitDeleta_tudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitDeleta_tudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deleta_tudoContext deleta_tudo() throws RecognitionException {
		Deleta_tudoContext _localctx = new Deleta_tudoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleta_tudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(DELETA_TUDO);
			setState(103);
			match(IDENT);
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

	public static class Deleta_linhasContext extends ParserRuleContext {
		public TerminalNode DELETA_LINHAS() { return getToken(tabelaSimplesParser.DELETA_LINHAS, 0); }
		public List<TerminalNode> IDENT() { return getTokens(tabelaSimplesParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(tabelaSimplesParser.IDENT, i);
		}
		public TerminalNode ONDE() { return getToken(tabelaSimplesParser.ONDE, 0); }
		public TerminalNode ABRE_PARENTESES() { return getToken(tabelaSimplesParser.ABRE_PARENTESES, 0); }
		public List<ConstanteContext> constante() {
			return getRuleContexts(ConstanteContext.class);
		}
		public ConstanteContext constante(int i) {
			return getRuleContext(ConstanteContext.class,i);
		}
		public TerminalNode FECHA_PARENTESES() { return getToken(tabelaSimplesParser.FECHA_PARENTESES, 0); }
		public Deleta_linhasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleta_linhas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterDeleta_linhas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitDeleta_linhas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitDeleta_linhas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Deleta_linhasContext deleta_linhas() throws RecognitionException {
		Deleta_linhasContext _localctx = new Deleta_linhasContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_deleta_linhas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(DELETA_LINHAS);
			setState(106);
			match(IDENT);
			setState(107);
			match(ONDE);
			setState(108);
			match(ABRE_PARENTESES);
			setState(109);
			match(IDENT);
			setState(110);
			match(T__0);
			setState(111);
			constante();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(112);
				match(T__1);
				setState(113);
				match(IDENT);
				setState(114);
				match(T__0);
				setState(115);
				constante();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(FECHA_PARENTESES);
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(tabelaSimplesParser.TIPO, 0); }
		public TerminalNode IDENT() { return getToken(tabelaSimplesParser.IDENT, 0); }
		public TamanhoContext tamanho() {
			return getRuleContext(TamanhoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(TIPO);
			setState(124);
			match(T__2);
			setState(125);
			match(IDENT);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABRE_CHAVE) {
				{
				setState(126);
				tamanho();
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

	public static class TamanhoContext extends ParserRuleContext {
		public TerminalNode ABRE_CHAVE() { return getToken(tabelaSimplesParser.ABRE_CHAVE, 0); }
		public TerminalNode INTEIRO() { return getToken(tabelaSimplesParser.INTEIRO, 0); }
		public TerminalNode FECHA_CHAVE() { return getToken(tabelaSimplesParser.FECHA_CHAVE, 0); }
		public TamanhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tamanho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterTamanho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitTamanho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitTamanho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TamanhoContext tamanho() throws RecognitionException {
		TamanhoContext _localctx = new TamanhoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tamanho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(ABRE_CHAVE);
			setState(130);
			match(INTEIRO);
			setState(131);
			match(FECHA_CHAVE);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(tabelaSimplesParser.CADEIA, 0); }
		public TerminalNode DATA() { return getToken(tabelaSimplesParser.DATA, 0); }
		public TerminalNode INTEIRO() { return getToken(tabelaSimplesParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(tabelaSimplesParser.REAL, 0); }
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tabelaSimplesListener ) ((tabelaSimplesListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tabelaSimplesVisitor ) return ((tabelaSimplesVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADEIA) | (1L << DATA) | (1L << INTEIRO) | (1L << REAL))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\6\2\"\n\2\r"+
		"\2\16\2#\3\2\7\2\'\n\2\f\2\16\2*\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b"+
		"\16\be\13\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u0082"+
		"\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\3\3\2\26\31\2\u008a\2\35\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b9\3\2\2"+
		"\2\nF\3\2\2\2\fS\3\2\2\2\16V\3\2\2\2\20h\3\2\2\2\22k\3\2\2\2\24}\3\2\2"+
		"\2\26\u0083\3\2\2\2\30\u0087\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2 \"\5\b"+
		"\5\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$(\3\2\2\2%\'\5\4\3\2&%\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*(\3\2\2\2+\62\5\b\5\2"+
		",\62\5\n\6\2-\62\5\f\7\2.\62\5\16\b\2/\62\5\20\t\2\60\62\5\22\n\2\61+"+
		"\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3\2\2\2\61/\3\2\2\2\61\60\3\2\2\2"+
		"\62\5\3\2\2\2\63\64\7\24\2\2\64\65\7\25\2\2\65\66\7\33\2\2\66\67\7\3\2"+
		"\2\678\5\30\r\28\7\3\2\2\29:\7\16\2\2:;\7\33\2\2;<\7\n\2\2<A\5\24\13\2"+
		"=>\7\4\2\2>@\5\24\13\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2"+
		"\2CA\3\2\2\2DE\7\13\2\2E\t\3\2\2\2FG\7\17\2\2GH\7\33\2\2HI\7\n\2\2IN\5"+
		"\30\r\2JK\7\4\2\2KM\5\30\r\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O"+
		"Q\3\2\2\2PN\3\2\2\2QR\7\13\2\2R\13\3\2\2\2ST\7\20\2\2TU\7\33\2\2U\r\3"+
		"\2\2\2VW\7\21\2\2WX\7\33\2\2XY\7\t\2\2YZ\7\n\2\2Z[\7\33\2\2[\\\7\3\2\2"+
		"\\c\5\30\r\2]^\7\4\2\2^_\7\33\2\2_`\7\3\2\2`b\5\30\r\2a]\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\13\2\2g\17\3\2\2\2hi"+
		"\7\22\2\2ij\7\33\2\2j\21\3\2\2\2kl\7\23\2\2lm\7\33\2\2mn\7\t\2\2no\7\n"+
		"\2\2op\7\33\2\2pq\7\3\2\2qx\5\30\r\2rs\7\4\2\2st\7\33\2\2tu\7\3\2\2uw"+
		"\5\30\r\2vr\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2"+
		"{|\7\13\2\2|\23\3\2\2\2}~\7\25\2\2~\177\7\5\2\2\177\u0081\7\33\2\2\u0080"+
		"\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\25\3\2\2"+
		"\2\u0083\u0084\7\f\2\2\u0084\u0085\7\30\2\2\u0085\u0086\7\r\2\2\u0086"+
		"\27\3\2\2\2\u0087\u0088\t\2\2\2\u0088\31\3\2\2\2\13\35#(\61ANcx\u0081";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}