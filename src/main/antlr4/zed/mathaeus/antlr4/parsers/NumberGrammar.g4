grammar NumberGrammar;

val     : CNUM
        | NUM
        | DECI;
NUM     : DIGIT1(DIGIT)* | DIGIT;
DECI    : NUM '.' (DIGIT)+;
CNUM    : DIGIT1 (',' DIGIT DIGIT DIGIT)+ ('.' (DIGIT)*)?
        | DIGIT1 DIGIT (',' DIGIT DIGIT DIGIT)+ ('.' (DIGIT)*)?
        | DIGIT1 DIGIT DIGIT (',' DIGIT DIGIT DIGIT)+ ('.' (DIGIT)*)?;

fragment DIGIT    : '0' | DIGIT1;   // Specifies a terminal of 0 to 9;
fragment DIGIT1   : '1'..'9';       // Specifies a terminal of 1 to 9;