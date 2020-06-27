// Generated from zed\mathaeus\antlr4\parsers\NumberGrammar.g4 by ANTLR 4.8
package zed.mathaeus.antlr4.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberGrammarParser}.
 */
public interface NumberGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(NumberGrammarParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(NumberGrammarParser.ValContext ctx);
}