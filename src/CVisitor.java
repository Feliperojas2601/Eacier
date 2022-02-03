import java.util.ArrayList;
import java.util.HashMap;

public class MyVisitor<T> extends CGrammarBaseVisitor<T> {

    HashMap<String, String> expresiones = new HashMap<>();
    ArrayList<String> vars = new ArrayList<String>();

    @Override
    public T visitCompilationUnit(CGrammarParser.CompilationUnitContext ctx) {
        if(ctx.translationUnit() != null){
            visitTranslationUnit(ctx.translationUnit());
        }
        return null;
    }

    @Override
    public T visitTranslationUnit(CGrammarParser.TranslationUnitContext ctx) {
        for(int i = 0; i < ctx.externalDeclaration().size(); i++) {
            visitExternalDeclaration(ctx.externalDeclaration(i));
        }
        return null;
    }

    @Override
    public T visitExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx) {
        if(ctx.functionDefinition() != null){
            visitFunctionDefinition(ctx.functionDefinition());
        }else if(ctx.declaration() != null){
            visitDeclaration(ctx.declaration());
        }else{
            System.out.print(";");
        }
        return null;
    }


    /////// -------------------

    @Override
    public T visitFunctionDefinition(CGrammarParser.FunctionDefinitionContext ctx) {
        if(ctx.declarationSpecifiers() != null){
            visitDeclarationSpecifiers(ctx.declarationSpecifiers());
        }
        visitDeclarator(ctx.declarator());
        if(ctx.declarationList() != null){
            visitDeclarationList(ctx.declarationList());
        }
        visitCompoundStatement(ctx.compoundStatement());
        return null;
    }

    @Override
    public T visitDeclaration(CGrammarParser.DeclarationContext ctx) {
        if(ctx.declarationSpecifiers() != null){
            visitDeclarationSpecifiers(ctx.declarationSpecifiers());
            if(ctx.initDeclaratorList() != null){
                visitInitDeclaratorList(ctx.initDeclaratorList());
            }
            System.out.print(";");
        }else if(ctx.staticAssertDeclaration() != null){
            visitStaticAssertDeclaration(ctx.staticAssertDeclaration());
        }
        return null;
    }

    @Override
    public T visitDeclarationSpecifiers(CGrammarParser.DeclarationSpecifiersContext ctx){
        for(int i = 0; i <  ctx.declarationSpecifier().size(); i++){
            visitDeclarationSpecifier(ctx.declarationSpecifier(i));
        }
        return null;
    }


    // declarator
    //    :   pointer? directDeclarator gccDeclaratorExtension*
    //    ;
    @Override
    public T visitDeclarator(CGrammarParser.DeclaratorContext ctx) {
        if(ctx.pointer() != null){
            visitPointer(ctx.pointer());
        }
        visitDirectDeclarator(ctx.directDeclarator());
        for(int i = 0; i < ctx.gccDeclaratorExtension().size(); i++){
            visit
        }
        return null;
    }
}