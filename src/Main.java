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

            CVisitor<Object> loader = new CVisitor<Object>();
            loader.visit(tree);

        } catch (NullPointerException e){

        }
    }
}