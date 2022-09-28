grammar tabelaSimples;

// comentario - qualquer coisa entre chaves (na mesma linha)  
COMENTARIO: '{' ~('\n'|'\r'|'}')* '}'-> skip;

// comentario errado - não ocorre o fechamento do comentario 
COMENTARIO_ERRADO: '{' ~('\n'|'\r'|'}')* '\n';

// ignorar \r\t\n 
TABULACAO : ( ' '| '\t'| '\r'| '\n') -> skip;

//Palavras especiais e símbolos

ONDE: 'onde';
ABRE_PARENTESES: '(';
FECHA_PARENTESES: ')';
ABRE_CHAVE: '[';
FECHA_CHAVE: ']';

//Funções
CRIA_TABELA: 'criaTabela';
INSERIR_EM: 'inserirEm';
ENCONTRA_TUDO: 'encontraTudo';
ENCONTRA_EM: 'encontraEm';
DELETA_TUDO: 'deletaTudoEm';
DELETA_LINHAS: 'deletaLinhas';
DEFINIR: 'definir';

//Tipos

TIPO:  'cadeia' | 'data' | 'inteiro' | 'real';

CADEIA: '"'(~('"'|'\n'))*'"';
DATA: '\'' '0'..'9' '0'..'9' '0'..'9' '0'..'9' '-' // ANO
      ('0' | '1') '0'..'9' '-'  // MES
      '0'..'3' '0'..'9' '\''; // DIA
INTEIRO: ('0'..'9')+;
REAL: ('0'..'9')+ '.' ('0'..'9')+;         
CADEIA_NFECHADA: '"'(~('"'|'\n'))* '\n';
            
// Identificador       
IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

// Simbolos não reconhecidos pela linguagem        
SIMBOLO_NAO_CONHECIDO: '!' | ';' | '@' | '$' | '¨' | '}' |'~' | '%' | '?' | '|';  


// Regras sintáticas
programa: define_variavel* cria_tabela+ instrucao* ;

instrucao: cria_tabela | insere | encontra_tudo | encontra_em 
           | deleta_tudo | deleta_linhas;

define_variavel: DEFINIR TIPO IDENT '=' constante;

cria_tabela: CRIA_TABELA IDENT ABRE_PARENTESES declaracao (',' declaracao)* FECHA_PARENTESES;

insere: INSERIR_EM IDENT ABRE_PARENTESES constante ( ',' constante )* FECHA_PARENTESES;

encontra_tudo: ENCONTRA_TUDO IDENT;

encontra_em: ENCONTRA_EM IDENT ONDE ABRE_PARENTESES IDENT '=' constante (',' IDENT '=' constante)* FECHA_PARENTESES;

deleta_tudo: DELETA_TUDO IDENT;

deleta_linhas: DELETA_LINHAS IDENT ONDE ABRE_PARENTESES IDENT '=' constante (',' IDENT '=' constante)* FECHA_PARENTESES;


//Regras auxiliaress
declaracao: TIPO ':' IDENT tamanho?;
tamanho: ABRE_CHAVE INTEIRO FECHA_CHAVE;
constante : CADEIA | DATA | INTEIRO | REAL;

  