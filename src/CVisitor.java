import java.util.ArrayList;
import java.util.HashMap;

public class MyVisitor<T> extends CGrammarBaseVisitor<T> {
    HashMap<String, HashMap<String, String>> funReturn = new HashMap<>();

    @Override
    public T visitCompilationUnit(CGrammarParser.CompilationUnitContext ctx) {

    }
}