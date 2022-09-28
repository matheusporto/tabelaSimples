package br.ufscar.dc.compiladores.tabelaSimples;

import br.ufscar.dc.compiladores.tabelaSimples.tabelaSimplesParser.ProgramaContext;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {

    public static void main(String[] args) throws IOException {
        try {
            CharStream cs = CharStreams.fromFileName(args[0]);
            FileOutputStream saida = new FileOutputStream(args[1]);
      
            // Análise Léxica
            tabelaSimplesLexer lexer = new tabelaSimplesLexer(cs);
            boolean erroLexico = false;
            
////          //Descomentar para depurar o Léxico
//            Token tk = null;
//            while( (tk = lexer.nextToken()).getType() != Token.EOF) {
//               System.out.println("<" + tabelaSimplesLexer.VOCABULARY.getDisplayName(tk.getType()) + "," + tk.getText() + ">");
//            }
                              
            Token t = null;
            while ((t = lexer.nextToken()).getType() != Token.EOF) {
                
                // String que será impressa do lado direito do token
                String token = "'" + t.getText() + "'";

                switch (tabelaSimplesLexer.VOCABULARY.getDisplayName(t.getType())) {
                // Testa os casos de erro
 
                case "COMENTARIO_ERRADO":
                    saida.write(("Linha " + t.getLine() + ": comentario nao fechado\n").getBytes());
                    erroLexico = true;
                    break;
                    
                case "CADEIA_NFECHADA":
                    saida.write(("Linha " + t.getLine() + ": cadeia literal nao fechada\n").getBytes());
                    erroLexico = true;
                    break;
                    
                case "SIMBOLO_NAO_CONHECIDO":
                saida.write(("Linha " + t.getLine() + ": símbolo indefinido na linguagem\n").getBytes());
                erroLexico = true;
                break;
                
                }
            }
        
            if (erroLexico == false){  
                
                // Análise Sintática
                lexer.reset();
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tabelaSimplesParser parser = new tabelaSimplesParser(tokens);

                tabelaSimplesErrorListener tabelaSimplesEL = new tabelaSimplesErrorListener(saida);
                parser.removeErrorListeners();
                parser.addErrorListener(tabelaSimplesEL);
                ProgramaContext arvore = parser.programa();
                
                if(tabelaSimplesEL.auxCont == 0){ // testa se não ocorreram erros sintáticos
                    
                    // Análise Semantica
                    tabelaSimplesSemantico tss = new tabelaSimplesSemantico();
                    tss.visitPrograma(arvore);

                    // Geração de SQL
                    if (tabelaSimplesSemantico.errosSemanticos.isEmpty()){// testa se não ocorreram erros semânticos
                        
                        GeradorDeCodigo sql = new GeradorDeCodigo();
                        sql.visitPrograma(arvore);
                        try(PrintWriter pw = new PrintWriter(args[1]))
                        {
                            pw.print(sql.saida.toString());
                        }
                    }
                    else{// se contém erros semânticos, coloca as mensagens na saida
                        List<String> listaErrosSemanticos = tabelaSimplesSemantico.errosSemanticos;
                        for (var erroSemantico : listaErrosSemanticos) {
                            saida.write((erroSemantico + "\n").getBytes());
                        }
                        saida.write(("Fim da compilacao\n").getBytes());
                    }
                    }
            }
            saida.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
