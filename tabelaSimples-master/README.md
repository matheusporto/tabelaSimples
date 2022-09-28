# Compilador tabelaSimples
#### Projeto final da disciplina Construção de Compiladores (DC - UFSCar)

## Grupo
- [Matheus Porto](https://github.com/matheusporto), RA: 744348
_____________________________________________________________________________________

## O Compilador

O compilador do tabelaSimples foi construído com o auxílio da ferramenta [ANTLR](https://www.antlr.org/)
versão 4.7.2., que é um poderoso gerador de parser baseado em LL(*). Além disso, foi utilizada a linguagem
Java e o framework [Apache Maven](https://maven.apache.org/)

## A linguagem tabelaSimples

A ideia da linguagem é possibilitar para alunos do ensino fundamental/médio um primeiro contato com
conceitos de bancos de dados e linguagens de consulta. A linguagem é declarativa, projetada em língua
portuguesa para simplificar o aprendizado, e conta com as funções básicas de bancos de dados. 


## Como utilizar a linguagem

O primeiro passo para utilizar a linguagem é baixar o executável do compilador ou compilar o projeto você mesmo.

Caso queira utilizar o executável, basta baixá-lo aqui

Caso opte por compilar o projeto, siga os passos:


Para compilar o projeto, utilize o Apache NetBeans IDE 11.2 ou superior.
É necessário que durante a instalação do NetBeans selecione a opção de instalar o plugin do Apache Maven
Agora basta abrir o projeto e apertar F11 (Build Project) ou clicar com o botão direito no ícone do projeto (la-semantico) e selecionar a opção build


1. Clone o projeto ou baixe-o atráves da opção Download Zip do GitHub.
2. Utilize o IDE Apache NetBeans IDE na versão 11.2 ou superior, e em sua instalação selecione a opção de instalar o plugin do Apache Maven.
3. Agora basta abrir o projeto e apertar F11 (Build Project) ou clicar com o botão direito no ícone do projeto (tabelaSimples) e selecionar a opção build

OBS: Pode usar também outra IDE de preferência

Com o executável em mãos, basta executar no terminal
```
java -jar tabelaSimples-1.0-SNAPSHOT-jar-with-dependencies.jar arg1 arg2
```
Sendo arg1 o caminho do arquivo de entrada na linguagem tabelaSimples e arg2 o caminho do arquivo de saida.


## Para modificar o projeto

Caso queira contribuir com novas funcionalidades para linguagem, é preciso compreender principalmente os dois arquivos abaixo.

- \src\main\antlr4\br\ufscar\dc\compiladores\tabelaSimples\tabelaSimples.g4
- \src\main\java\br\ufscar\dc\compiladores\tabelaSimples\tabelaSimplesSemantico.java

O primeiro deles é a gramática da linguagem. É ele que vai definir os tokens que serão gerados e as regras sintáticas da linguagem.
O segundo é a classe responsável por tratar os erros semânticos da linguagem. Caso queira implementar uma nova tratativa de erros é esse arquivo que precisa ser editado.

## Casos de teste

No diretório principal do projeto existe uma pasta chamada **casos-de-teste**. Nela você deve encontrar exemplos de código na linguagem tabelaSimples e as respectivas
saídas do compilador quando os processa. Para fins didáticos, os casos de teste possuem códigos com erros léxicos, sintáticos e semânticos, para mostrar como o compilador
lida com esses erros e guia o programador a solucioná-los. Além disso, existem 2 casos de teste em que o compilador não encontra nenhum erro,e consequentemente a saída
é o código gerado em SQL.

_____________________________________________________________________________________

## Exemplos de código na linguagem tabelaSimples

Segue alguns exemplos de código em tabelaSimples e seu respectivo código gerado em SQL

- Criação de tabela
```
criaTabela pessoas(
	cadeia: nome,
	inteiro: idade,
	data: dataNascimento,
	real: altura
)
```

```
CREATE TABLE pessoas(
nome VARCHAR(50),
idade int,
dataNascimento date,
altura float,
);
```

- Inserção de dados
```
inserirEm pessoas("Matheus", 23, '1998-11-06', 1.78)
```

```
INSERT INTO pessoas ("Matheus", 23, '1998-11-06', 1.78);
```


- Consulta de dados
```
encontraTudo pessoas

encontraEm pessoas onde (nome= "Matheus", idade = 20)
```

```
SELECT * FROM pessoas;

SELECT * FROM pessoas WHERE nome = "Matheus" AND idade = 20;

```

- Exclusão de dados

```
deletaLinhas filmes onde (idadeMinima = 16)
```

```
DELETE FROM filmes WHERE idadeMinima = 16;
```

******************************************************

## Video 
