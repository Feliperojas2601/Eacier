// Generated from C:/Users/julia/Documents/Eacier/grammar\Expresion.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpresionParser}.
 */
public interface ExpresionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpresionParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(ExpresionParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(ExpresionParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionParser#exp2}.
	 * @param ctx the parse tree
	 */
	void enterExp2(ExpresionParser.Exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionParser#exp2}.
	 * @param ctx the parse tree
	 */
	void exitExp2(ExpresionParser.Exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ExpresionParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ExpresionParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void enterArreglo(ExpresionParser.ArregloContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionParser#arreglo}.
	 * @param ctx the parse tree
	 */
	void exitArreglo(ExpresionParser.ArregloContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpresionParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(ExpresionParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpresionParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(ExpresionParser.FuncionContext ctx);
}