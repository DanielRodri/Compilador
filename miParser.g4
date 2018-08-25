parser grammar miParser;

options {
  tokenVocab = MiScanner;
}

program : CLASS ID (constDec1 | varDec1 | classDec1)*
            CORIZQ (methodDec1)* CORDER EOF;
constDec1: CONST type ID ASSIGN (NUM | CHAR)PyCOM;
varDec1: type ID (COMA ID)* PyCOMA;
classDec1: CLASS ID CORIZQ (varDec1)* CORDER;
methodDec1: (type | VOID) ID PIZQ (formPars)? PDER (varDec1)* block;
formPars: type ID (COMA type ID)*;
type: ID(CUAIZQ CUADER)?;
statement: designator (ASSIGN expr | PIZQ (actPars)? PDER | AUMENTO | DECREMENTO) PyCOMA
            | IF PIZQ condition PDER statement (ELSE statement)?
            | FOR (PIZQ expr PyCOMA (condition)? PyCOMA (statement)?) statement
            | WHILE PIZQ condition PDER statement
            | BREAK PyCOMA
            | RETURN (expr)? PyComa
            | READ PIZQ designator PDER PyComa
            | WRITE PIZQ expr (COMA NUM)? PDER PyCOMA
            | block
            |PyCOMA;
block: CORIZQ (statement)* CORDER;
actPars: expr (COMA expr)*;
condition: condTerm (OO condTerm)*;
condTerm: condFact (YY condFact)*;
condFact: expr relop expr;
expr: (RESTA)? term (addop term)*;
term: factor (mulop factor)*;
factor: designator (PIZQ (actPars)? PDER)?
        | NUM
        | CHAR
        | BOOL
        | NEW ID
        | PIZQ expr PDER;
designator: ID (PUNTO ID | CUAIZQ expr CUADER)*;
relop: COMP_IGUAL | COMP_DIFERENTE | MAYOR | COMP_MAYOR | MENOR | COMP_MENOR;
addop: SUMA | RESTA;
mulop: MULTIPLICACION | DIVISION | RESIDUO;