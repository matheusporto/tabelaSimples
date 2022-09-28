
package br.ufscar.dc.compiladores.tabelaSimples;

import java.util.ArrayList;

public class tabelaSimples {
    String name;
    ArrayList<Field> fields;

    public tabelaSimples(String name, ArrayList<Field> fields) {
        this.name = name;
        this.fields = fields;
    }
    
    static public class Field{
        String name;
        String type;
        int len;

        public Field(String name, int len, String type) {
            this.name = name;
            this.len = len;
            this.type = type;
        }
    }

//    public enum Type {
//        BOOLEAN, VARCHAR, DATE, INT, REAL
//    }
}

// MUDAR AS COISAS AQUI DEPOIS