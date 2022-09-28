
package br.ufscar.dc.compiladores.tabelaSimples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;


public class tabelaSimplesErrorListener extends BaseErrorListener{
    
    FileOutputStream saida;
    int auxCont = 0; //contador auxiliar para limitar o numero de erros printados
    
    public tabelaSimplesErrorListener(FileOutputStream saida){
        this.saida=saida;
    }
    
    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
       
        Token t = (Token) offendingSymbol; //token que gerou erro
//        System.out.println(t.getText());
    
        while (auxCont < 1){ //número máximo de erros sintáticos permitidos = 1
            try {
                saida.write(("Linha "+line+": erro sintatico proximo a "+t.getText()+"\n").getBytes());
                auxCont = auxCont + 1;
            } catch (IOException ex) {
                Logger.getLogger(tabelaSimplesErrorListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
