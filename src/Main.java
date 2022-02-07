import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{

            CGrammarLexer lexer;
            if (args.length>0) {
                lexer = new CGrammarLexer(CharStreams.fromFileName(args[0]));
            }else {
                lexer = new CGrammarLexer(CharStreams.fromStream(System.in));
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CGrammarParser parser = new CGrammarParser(tokens);
            ParseTree tree = parser.compilationUnit();
            //System.out.println(tree.toStringTree(parser));
            CVisitor<Object> loader = new CVisitor<>();
            loader.visit(tree);
            String texto = loader.texto;
            //System.out.println(texto);
            //System.exit(0);

            CGrammarLexer lexer_1;
            lexer_1 = new CGrammarLexer(CharStreams.fromString(texto));
            CommonTokenStream tokens_1 = new CommonTokenStream(lexer_1);
            CGrammarParser parser_1 = new CGrammarParser(tokens_1);
            ParseTree tree_1 = parser_1.compilationUnit();
            CVisitor2<Object> loader_1 = new CVisitor2<Object>();
            loader_1.visit(tree_1);

        } catch (NullPointerException e){

        }
    }
}