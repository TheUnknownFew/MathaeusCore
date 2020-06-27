// Generated from zed\mathaeus\antlr4\parsers\SimpleExpression.g4 by ANTLR 4.8
package zed.mathaeus.antlr4.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleExpressionParser}.
 */
public interface SimpleExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleExpressionParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(SimpleExpressionParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExpressionParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(SimpleExpressionParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleExpressionParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(SimpleExpressionParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleExpressionParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(SimpleExpressionParser.ValContext ctx);
}