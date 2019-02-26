grammar Gramma;

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

  plik 
    : (expr {System.out.println("Result: "+$expr.text+"="+$expr.wy);} NL+)* EOF
    ;
  expr 
    : term (PLUS term 
    | MINUS term)* 
    ;
  term 
    : atom (MUL atom 
    | DIV atom)*
    ;
  atom 
    : INT
    |  (LP expr RP)
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;
    
PLUS	:  '+'
	;

MINUS	:  '-'
	;

MUL	:  '*'
	;

DIV	:  '/'
	;

NL	:  '\n'
	;

LP	:  '('
	;

RP	:  ')'
	;

