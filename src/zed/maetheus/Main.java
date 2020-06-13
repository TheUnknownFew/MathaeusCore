package zed.maetheus;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import zed.maetheus.parsers.NumberGrammarLexer;
import zed.maetheus.parsers.NumberGrammarParser;

public class Main {
    public static void main(final String[] args) {
        NumberGrammarLexer lexer = new NumberGrammarLexer(CharStreams.fromString("10,00"));
        if(!lexer._hitEOF) {
            System.out.println("Err");
        }
        NumberGrammarParser parser = new NumberGrammarParser(new CommonTokenStream(lexer));
        parser.start();
        System.out.println(" : Checking parser!\n");
    }
}
