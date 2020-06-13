// Generated from C:/Users/zedla/ZDocs/Local/Programming/Personal Projects/Mathaeus/src/zed/maetheus/api/grammars\NumberGrammar.g4 by ANTLR 4.8
package zed.maetheus.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NumberGrammarParser}.
 */
public interface NumberGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(NumberGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(NumberGrammarParser.StartContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#cnum}.
	 * @param ctx the parse tree
	 */
	void enterCnum(NumberGrammarParser.CnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#cnum}.
	 * @param ctx the parse tree
	 */
	void exitCnum(NumberGrammarParser.CnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#cnum1}.
	 * @param ctx the parse tree
	 */
	void enterCnum1(NumberGrammarParser.Cnum1Context ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#cnum1}.
	 * @param ctx the parse tree
	 */
	void exitCnum1(NumberGrammarParser.Cnum1Context ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(NumberGrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(NumberGrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#cont}.
	 * @param ctx the parse tree
	 */
	void enterCont(NumberGrammarParser.ContContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#cont}.
	 * @param ctx the parse tree
	 */
	void exitCont(NumberGrammarParser.ContContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#cap}.
	 * @param ctx the parse tree
	 */
	void enterCap(NumberGrammarParser.CapContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#cap}.
	 * @param ctx the parse tree
	 */
	void exitCap(NumberGrammarParser.CapContext ctx);
	/**
	 * Enter a parse tree produced by {@link NumberGrammarParser#d}.
	 * @param ctx the parse tree
	 */
	void enterD(NumberGrammarParser.DContext ctx);
	/**
	 * Exit a parse tree produced by {@link NumberGrammarParser#d}.
	 * @param ctx the parse tree
	 */
	void exitD(NumberGrammarParser.DContext ctx);
}