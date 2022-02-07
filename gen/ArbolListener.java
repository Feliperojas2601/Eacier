// Generated from C:/Users/PERSONAL/Documents/Proyectos/Independientes/Lenguajes de Programación/Eacier/grammar\Arbol.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArbolParser}.
 */
public interface ArbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArbolParser#arbol}.
	 * @param ctx the parse tree
	 */
	void enterArbol(ArbolParser.ArbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArbolParser#arbol}.
	 * @param ctx the parse tree
	 */
	void exitArbol(ArbolParser.ArbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArbolParser#raiz}.
	 * @param ctx the parse tree
	 */
	void enterRaiz(ArbolParser.RaizContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArbolParser#raiz}.
	 * @param ctx the parse tree
	 */
	void exitRaiz(ArbolParser.RaizContext ctx);
}