
package br.ufscar.dc.compiladores.tabelaSimples;

import java.util.ArrayList;

public class GeradorDeCodigo extends tabelaSimplesBaseVisitor<Void>{

    StringBuilder saida;
    ArrayList<tabelaSimples> tabelas;
    
    public GeradorDeCodigo() {
        saida = new StringBuilder();
        tabelas = new ArrayList<>();
    }
    
    // ----------  Funções Auxiliares ----------
    
    private String converteTipo_simplesToSql(String tipo){
        switch(tipo){
            case "cadeia": return "VARCHAR(50)";
            case "inteiro": return "int";
            case "data": return "date";
            case "real": return "float";
        }
        return null;
    }
    
    // ----------  Programa ----------
    
    @Override
    public Void visitPrograma(tabelaSimplesParser.ProgramaContext ctx){
        
        if(ctx.define_variavel() != null){
            for (var x: ctx.define_variavel()){
                this.visitDefine_variavel(x);
            }
        }
        if(ctx.cria_tabela() != null){
            for (var x: ctx.cria_tabela()){
                this.visitCria_tabela(x);
            }
        }
        if(ctx.instrucao() != null){
            for (var x: ctx.instrucao()){
                this.visitInstrucao(x);
            }
        }
        
        return null;
    }
    
    // ----------  Definicao de variavel ----------
    
    @Override
    public Void visitDefine_variavel(tabelaSimplesParser.Define_variavelContext ctx){
        
        String tipoSql = converteTipo_simplesToSql(ctx.TIPO().getText());
        
        saida.append("DECLARE @" + ctx.IDENT().getText() + " " + tipoSql + " ");
        saida.append("=" + ctx.constante().getText() + ";" + "\n");
        saida.append("\n");
      
        return null;
    }
    
    // ----------  Criacao de tabela ----------
    
    @Override
    public Void visitCria_tabela(tabelaSimplesParser.Cria_tabelaContext ctx){
        String nomeTabela = ctx.IDENT().getText();
        ArrayList<tabelaSimples.Field> camposTabela = new ArrayList<>();
        
        for(var declaracao: ctx.declaracao()){
            String nomeCampo = declaracao.IDENT().getText();
            
            tabelaSimples.Field campo = new tabelaSimples.Field(nomeCampo, 0, declaracao.TIPO().getText());
            camposTabela.add(campo);
        }
               
        tabelaSimples tabela = new tabelaSimples(nomeTabela, camposTabela);
        this.tabelas.add(tabela);
                  
        saida.append("CREATE TABLE " + tabela.name + "(" + "\n");
        
        for (var campo: tabela.fields){
            String campoSql = converteTipo_simplesToSql(campo.type);
            saida.append(campo.name + " " + campoSql + "," + "\n");
        }
        
        saida.append(");");
        saida.append("\n\n");
        
        
        return null;
    }
    
    // ----------  Insercao de dados ----------
    
    @Override
    public Void visitInsere(tabelaSimplesParser.InsereContext ctx){
    
        saida.append("INSERT INTO ");
        saida.append(ctx.IDENT().getText() + " (");

        String campos = "";

        for(var campo: ctx.constante()){
            campos += campo.getText();
            if(campo != ctx.constante(ctx.constante().size() - 1)){
                campos += ", ";
            } 
        }

        saida.append(campos + ");");
        saida.append("\n\n");
   
    return null;
    }
    
    // ----------  Consulta de dados ----------
    
    @Override
    public Void visitEncontra_tudo(tabelaSimplesParser.Encontra_tudoContext ctx){
     
        saida.append("SELECT * FROM ");
        saida.append(ctx.IDENT().getText());
        saida.append(";\n\n");
        
    return null;  
    }
    
    @Override
    public Void visitEncontra_em(tabelaSimplesParser.Encontra_emContext ctx){
             
    saida.append("SELECT * FROM " + ctx.IDENT(0).getText() + " WHERE ");
    saida.append(ctx.IDENT(1).getText() + " = " + ctx.constante(0).getText());
    
    String campos = "";
    
    for(int x=1; x < ctx.constante().size(); x++){
        campos += " AND ";
        campos += ctx.IDENT(x+1).getText() + " = ";
        campos += ctx.constante(x).getText();
    }
    
    saida.append(campos);
    saida.append(";\n\n");
    

    return null;
    }
    
    // ----------  Exclusao de dados ----------
    
    @Override
    public Void visitDeleta_tudo(tabelaSimplesParser.Deleta_tudoContext ctx){
     
        saida.append("DELETE FROM ");
        saida.append(ctx.IDENT().getText());
        saida.append(";\n\n");
        
    return null;  
    }
    
    @Override
    public Void visitDeleta_linhas(tabelaSimplesParser.Deleta_linhasContext ctx){
        
    saida.append("DELETE FROM " + ctx.IDENT(0).getText() + " WHERE ");
    saida.append(ctx.IDENT(1).getText() + " = " + ctx.constante(0).getText());
    
    String campos = "";
    
    for(int x=1; x < ctx.constante().size(); x++){
        campos += " AND ";
        campos += ctx.IDENT(x+1).getText() + " = ";
        campos += ctx.constante(x).getText();
    }
    
    saida.append(campos);
    saida.append(";\n\n");
    

    return null;
    }
    
}
