grammar SimpleExpression;
import NumberGrammar;

test : val (' ')? PLUS (' ')? val EOF;
PLUS : '+';