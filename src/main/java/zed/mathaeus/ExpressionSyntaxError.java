package zed.mathaeus;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.atn.ErrorInfo;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class ExpressionSyntaxError extends BaseErrorListener {
    private final String EOF = "eof";
    private boolean errorOccurred;
    private final List<String> syntaxErrors = new ArrayList<>();

    public ExpressionSyntaxError () {}

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        this.errorOccurred = true;
        String error = "Error At: " + line + ":" + charPositionInLine + ":" + offendingSymbol.toString();
        syntaxErrors.add(error);
        System.out.println(error);
    }

    @Override
    public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        super.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    public List<String> getSyntaxErrors() {
        return this.syntaxErrors;
    }
}
