package zed.maetheus.api.parsers;

/*  Number Parsing Grammar:
    1. <val>    ->  <first>
                |   <first>.<deci>
    2. <first>  ->  <num>
                |   <digit>
                |   epsilon
    3. <num>    ->  <cnum> | <ncnum>
    4. <cnum>   ->  <cap>
                |   <cap><digit>
                |   <cap><digit><digit>
                |   <cap>,<digit><digit><digit>
    5. <ncnum>  ->  <cap>
                |   <num><digit>
    6. <deci>   ->  <digit><deci>
                |   epsilon
    7. <cap>    -> 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
    7. <digit>  -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9
 */
public class NumberParser {
}
