// Generated from br\u005Cufscar\dc\compiladores\tabelaSimples\tabelaSimples.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tabelaSimples;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tabelaSimplesParser}.
 */
public interface tabelaSimplesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(tabelaSimplesParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(tabelaSimplesParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(tabelaSimplesParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(tabelaSimplesParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#define_variavel}.
	 * @param ctx the parse tree
	 */
	void enterDefine_variavel(tabelaSimplesParser.Define_variavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#define_variavel}.
	 * @param ctx the parse tree
	 */
	void exitDefine_variavel(tabelaSimplesParser.Define_variavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#cria_tabela}.
	 * @param ctx the parse tree
	 */
	void enterCria_tabela(tabelaSimplesParser.Cria_tabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#cria_tabela}.
	 * @param ctx the parse tree
	 */
	void exitCria_tabela(tabelaSimplesParser.Cria_tabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#insere}.
	 * @param ctx the parse tree
	 */
	void enterInsere(tabelaSimplesParser.InsereContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#insere}.
	 * @param ctx the parse tree
	 */
	void exitInsere(tabelaSimplesParser.InsereContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#encontra_tudo}.
	 * @param ctx the parse tree
	 */
	void enterEncontra_tudo(tabelaSimplesParser.Encontra_tudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#encontra_tudo}.
	 * @param ctx the parse tree
	 */
	void exitEncontra_tudo(tabelaSimplesParser.Encontra_tudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#encontra_em}.
	 * @param ctx the parse tree
	 */
	void enterEncontra_em(tabelaSimplesParser.Encontra_emContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#encontra_em}.
	 * @param ctx the parse tree
	 */
	void exitEncontra_em(tabelaSimplesParser.Encontra_emContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#deleta_tudo}.
	 * @param ctx the parse tree
	 */
	void enterDeleta_tudo(tabelaSimplesParser.Deleta_tudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#deleta_tudo}.
	 * @param ctx the parse tree
	 */
	void exitDeleta_tudo(tabelaSimplesParser.Deleta_tudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#deleta_linhas}.
	 * @param ctx the parse tree
	 */
	void enterDeleta_linhas(tabelaSimplesParser.Deleta_linhasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#deleta_linhas}.
	 * @param ctx the parse tree
	 */
	void exitDeleta_linhas(tabelaSimplesParser.Deleta_linhasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(tabelaSimplesParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(tabelaSimplesParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#tamanho}.
	 * @param ctx the parse tree
	 */
	void enterTamanho(tabelaSimplesParser.TamanhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#tamanho}.
	 * @param ctx the parse tree
	 */
	void exitTamanho(tabelaSimplesParser.TamanhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tabelaSimplesParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(tabelaSimplesParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tabelaSimplesParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(tabelaSimplesParser.ConstanteContext ctx);
}