package zed.mathaeus;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import zed.mathaeus.antlr4.parsers.SimpleExpressionLexer;
import zed.mathaeus.antlr4.parsers.SimpleExpressionParser;

public class Main {
    public static void main(final String[] args) {
        SimpleExpressionLexer lexer = new SimpleExpressionLexer(CharStreams.fromString("+232 + 123"));
        SimpleExpressionParser parser = new SimpleExpressionParser(new CommonTokenStream(lexer));
        ExpressionSyntaxError errorListener = new ExpressionSyntaxError();
        //parser.addErrorListener(errorListener);
        parser.test();
        //for (String s : errorListener.getSyntaxErrors()) {
        //    System.out.println(s);
        //}
    }
}
