// Generated from br\u005Cufscar\dc\compiladores\tabelaSimples\tabelaSimples.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.tabelaSimples;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tabelaSimplesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tabelaSimplesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(tabelaSimplesParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(tabelaSimplesParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#define_variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_variavel(tabelaSimplesParser.Define_variavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#cria_tabela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCria_tabela(tabelaSimplesParser.Cria_tabelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#insere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsere(tabelaSimplesParser.InsereContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#encontra_tudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncontra_tudo(tabelaSimplesParser.Encontra_tudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#encontra_em}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncontra_em(tabelaSimplesParser.Encontra_emContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#deleta_tudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleta_tudo(tabelaSimplesParser.Deleta_tudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#deleta_linhas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleta_linhas(tabelaSimplesParser.Deleta_linhasContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(tabelaSimplesParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#tamanho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTamanho(tabelaSimplesParser.TamanhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tabelaSimplesParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(tabelaSimplesParser.ConstanteContext ctx);
}