grammar Pref;

expresion :                        
    val                            #expresionVal
    | signo expresion expresion    #operaciones
    ;

val : 
    num                            #NUMERO
    | '(' expresion ')'            #parens
    ;

num: INT+('.'INT+)?;
signo : '+' | '-' | '*' | '/' | '^';

INT : [0-9]+;
WS: [ \t\n]+ -> skip ;