// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrefParser}.
 */
public interface PrefListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code expresionVal}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionVal(PrefParser.ExpresionValContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expresionVal}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionVal(PrefParser.ExpresionValContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operaciones}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(PrefParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operaciones}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(PrefParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NUMERO}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 */
	void enterNUMERO(PrefParser.NUMEROContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NUMERO}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 */
	void exitNUMERO(PrefParser.NUMEROContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 */
	void enterParens(PrefParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 */
	void exitParens(PrefParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(PrefParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(PrefParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrefParser#signo}.
	 * @param ctx the parse tree
	 */
	void enterSigno(PrefParser.SignoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrefParser#signo}.
	 * @param ctx the parse tree
	 */
	void exitSigno(PrefParser.SignoContext ctx);
}