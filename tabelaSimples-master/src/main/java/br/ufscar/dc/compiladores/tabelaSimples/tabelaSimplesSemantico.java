
package br.ufscar.dc.compiladores.tabelaSimples;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class tabelaSimplesSemantico extends tabelaSimplesBaseVisitor<Void>{
    
    ArrayList<tabelaSimples> tabelas;
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public tabelaSimplesSemantico() {
        tabelas = new ArrayList<>();
    }
    
    public static void adicionarErroSemantico(Token t, String mensagem){
        int linha = t.getLine();
        String msgErro = String.format("Linha %d: %s", linha, mensagem);
        errosSemanticos.add(msgErro);
        //System.out.println(msgErro);
    }
    
    @Override
    public Void visitCria_tabela(tabelaSimplesParser.Cria_tabelaContext ctx){

        String nomeTabela = ctx.IDENT().getText();
        ArrayList<tabelaSimples.Field> camposTabela = new ArrayList<>();
        for(var tabela: tabelas){
            if (tabela.name.equals(nomeTabela)){
                adicionarErroSemantico(ctx.IDENT().getSymbol(), "tabela " + nomeTabela +" já existe!");
                return null;
            }
        }
        
        for(var declaracao: ctx.declaracao()){
            String nomeCampo = declaracao.IDENT().getText();
            
            tabelaSimples.Field campo = new tabelaSimples.Field(nomeCampo, 0, declaracao.TIPO().getText());
            camposTabela.add(campo);
        }
               
        tabelaSimples tabela = new tabelaSimples(nomeTabela, camposTabela);
        this.tabelas.add(tabela);
        
        return null;
    }
}
