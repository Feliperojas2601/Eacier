// Generated from C:/Users/julia/Documents/Eacier/grammar\Expresion.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpresionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpresionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ExpresionParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(ExpresionParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionParser#exp2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp2(ExpresionParser.Exp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ExpresionParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionParser#arreglo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArreglo(ExpresionParser.ArregloContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpresionParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(ExpresionParser.FuncionContext ctx);
}