lexer grammar MiScanner;

//Comentarios
COMMENTS            : '//' ;
COMMENT_MULTI       :'/*' ;
COMMENT_MULTICLOSE  : '*/' ;


//Simbolos
PyCOMA      : ';' ;
PUNTO       :'.';
COMILLAS    :'\'';
ASSIGN      :'=';
COMA        :',';
PIZQ        : '(';
PDER        : ')';
CUAIZQ        : '[';
CUADER        : ']';
CORIZQ        : '{';
CORDER        : '}';


//OPERADORES
SUMA            : '+' ;
RESTA           : '-' ;
MULTIPLICACION  : '*' ;
DIVISION        : '/' ;
RESIDUO         : '%' ;
AUMENTO         : '++';
DECREMENTO      : '--';


//OPERADORES LOGICOS
OO  :'||';
YY  :'&&';

//OPERACIONES RELACIONALES
COMP_IGUAL: '==';
COMP_MENOR: '<=';
COMP_MAYOR: '>=';
COMP_DIFERENTE: '!=';
MENOR: '<';
MAYOR: '>';

//palabras reservadas
CLASS   : 'class';
IF      : 'if' ;
WHILE   : 'while' ;
LET     : 'let';
THEN    : 'then';
ELSE    : 'else';
IN      : 'in';
DO      : 'do';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';
VOID    : 'void';
BREAK   : 'break';
RETURN  : 'return';
READ    : 'read';
WRITE   : 'write';
NEW     : 'new';


NUM : DIGIT DIGIT* ;
STRING: LETTER+;
FLOAT: NUM PUNTO NUM+;
INT: DIGIT+;
ID : LETTER (LETTER|DIGIT)* ;
CHAR: COMILLAS LETTER COMILLAS;
BOOL: 'true' | 'false';


fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9' ;


WS  :   [ \t\n\r]+ -> skip ;