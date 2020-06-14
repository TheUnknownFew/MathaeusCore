grammar NumberGrammar;
start   : val EOF;
val     : cnum '.' d cont
        | num '.' d cont
        | cnum
        | num;
cnum    : cap ',' d d d cnum1
        | cap d ',' d d d cnum1
        | cap d d ',' d d d cnum1;
cnum1   : (',' d d d cnum1)*;
num     : cap cont | '0';
cont    : (d cont)*;
cap     : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
d       : '0' | cap;