// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrefParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrefVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code expresionVal}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionVal(PrefParser.ExpresionValContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operaciones}
	 * labeled alternative in {@link PrefParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(PrefParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NUMERO}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNUMERO(PrefParser.NUMEROContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link PrefParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(PrefParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(PrefParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrefParser#signo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigno(PrefParser.SignoContext ctx);
}