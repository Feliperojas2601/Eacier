import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class CVisitor<T> extends CGrammarBaseVisitor<T> {

    HashMap<String, String> expresiones = new HashMap<>();

    ArrayList<String> vars = new ArrayList<String>();

    int numSpace = 0;

    String printSpaces(){
        String spaces  = "";
        for(int i = 0; i < numSpace; i++){
            spaces += "\t";
        }
        return spaces;
    }

    @Override
    public T visitPrimaryExpression(CGrammarParser.PrimaryExpressionContext ctx) {
        String primaryExpressionTrad = "";

        if (ctx.Identifier() != null) {
            primaryExpressionTrad += ctx.Identifier().getText();
        } else if (ctx.Constant() != null) {
            primaryExpressionTrad += ctx.Constant().getText();
        } else if (ctx.StringLiteral().size() != 0) {
            for (int i = 0; i < ctx.StringLiteral().size(); i++) {
                primaryExpressionTrad += ctx.StringLiteral(i).getText();
            }
        } else if (ctx.expression() != null) {
            primaryExpressionTrad += "(" + visitExpression(ctx.expression()) + ")";
        } else if (ctx.genericSelection() != null) {
            primaryExpressionTrad += visitGenericSelection(ctx.genericSelection());
        } else if (ctx.getText().substring(0, 16) == "__builtin_va_arg" ) {
            primaryExpressionTrad += "__builtin_va_arg" + "(";
            primaryExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
            primaryExpressionTrad += ", ";
            primaryExpressionTrad += visitTypeName(ctx.typeName());
            primaryExpressionTrad += ")";
        } else if (ctx.getText().substring(0, 18) == "__builtin_offsetof") {
            primaryExpressionTrad += "__builtin_offsetof" + "(";
            primaryExpressionTrad += visitTypeName(ctx.typeName());
            primaryExpressionTrad += ", ";
            primaryExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
            primaryExpressionTrad += ")";
        } else {
            if (ctx.getText().substring(0, 13).equals("_extension_")) {
                primaryExpressionTrad += "_extension_";
            }
            primaryExpressionTrad += "(";
            primaryExpressionTrad += visitCompoundStatement(ctx.compoundStatement());
            primaryExpressionTrad += ")";
        }

        return (T) primaryExpressionTrad;
    }

    @Override
    public T visitGenericSelection(CGrammarParser.GenericSelectionContext ctx) {
        String genericSelectionTrad = "";
        genericSelectionTrad += "_Generic" + "(";
        genericSelectionTrad += visitAssignmentExpression(ctx.assignmentExpression());
        genericSelectionTrad += ", ";
        genericSelectionTrad += visitGenericAssocList(ctx.genericAssocList());
        genericSelectionTrad += ")";

        return (T) genericSelectionTrad;
    }

    @Override
    public T visitGenericAssocList(CGrammarParser.GenericAssocListContext ctx) {
        String genericAssocListTrad = "";
        genericAssocListTrad += visitGenericAssociation(ctx.genericAssociation(0));
        for (int i = 1; i <= ctx.genericAssociation().size(); i++) {
            genericAssocListTrad += ", ";
            genericAssocListTrad += visitGenericAssociation(ctx.genericAssociation(i));
        }
        return (T) genericAssocListTrad;
    }

    @Override
    public T visitGenericAssociation(CGrammarParser.GenericAssociationContext ctx) {
        String genericAssociationTrad = "";
        if (ctx.typeName() != null) {
            genericAssociationTrad += visitTypeName(ctx.typeName());
        } else {
            genericAssociationTrad += "default";
        }
        genericAssociationTrad += ":";
        genericAssociationTrad += visitAssignmentExpression(ctx.assignmentExpression());

        return (T) genericAssociationTrad;
    }

    @Override
    public T visitPostfixExpression(CGrammarParser.PostfixExpressionContext ctx) {
        String postfixExpressionTrad = "";

        if (ctx.primaryExpression() != null) {
            postfixExpressionTrad += visitPrimaryExpression(ctx.primaryExpression());
        } else {
            if (ctx.getText().substring(0, 13).equals("_extension_")) {
                postfixExpressionTrad += "_extension_";
            }
            postfixExpressionTrad += "(";
            postfixExpressionTrad += visitTypeName(ctx.typeName());
            postfixExpressionTrad += ")" + "{\n";
            postfixExpressionTrad += visitInitializerList(ctx.initializerList());
            postfixExpressionTrad += "}\n";
        }
        if (ctx.auxpostfixExpression() != null) {
            for (int i = 0; i < ctx.auxpostfixExpression().size(); i++) {
                postfixExpressionTrad += visitAuxpostfixExpression(ctx.auxpostfixExpression(i));
            }
        }
        return (T) postfixExpressionTrad;
    }

    @Override
    public T visitAuxpostfixExpression(CGrammarParser.AuxpostfixExpressionContext ctx) {
        String auxpostfixExpressionTrad = "";

        if (ctx.getText().charAt(0) == '[') {
            auxpostfixExpressionTrad += "[";
            auxpostfixExpressionTrad += visitExpression(ctx.expression());
            auxpostfixExpressionTrad += "]";
        } else if (ctx.getText().charAt(0) == '(') {
            auxpostfixExpressionTrad += "(";
            if (ctx.argumentExpressionList() != null) {
                auxpostfixExpressionTrad += visitArgumentExpressionList(ctx.argumentExpressionList());
            }
            auxpostfixExpressionTrad += ")";
        } else {
            if (ctx.getText().charAt(0) == '.') {
                auxpostfixExpressionTrad += ".";
                auxpostfixExpressionTrad += ctx.Identifier().getText();
            } else if (ctx.getText().substring(0, 2).equals("->")) {
                auxpostfixExpressionTrad += "->";
                auxpostfixExpressionTrad += ctx.Identifier().getText();
            } else if (ctx.getText().substring(0, 2).equals("++")) {
                auxpostfixExpressionTrad += "++";
            } else if (ctx.getText().substring(0, 2).equals("--")) {
                auxpostfixExpressionTrad += "--";
            }
        }
        return (T) auxpostfixExpressionTrad;
    }

    @Override
    public T visitArgumentExpressionList(CGrammarParser.ArgumentExpressionListContext ctx) {
        String argumentExpressionListTrad = "";
        argumentExpressionListTrad += visitAssignmentExpression(ctx.assignmentExpression(0));
        if (ctx.assignmentExpression().size() > 1) {
            for (int i = 1; i < ctx.assignmentExpression().size(); i++) {
                argumentExpressionListTrad += ", ";
                argumentExpressionListTrad += visitAssignmentExpression(ctx.assignmentExpression(i));
            }
        }

        return (T) argumentExpressionListTrad;
    }

    @Override
    public T visitUnaryExpression(CGrammarParser.UnaryExpressionContext ctx) {
        String unaryExpressionTrad = "";
        if (ctx.auxunaryExpression() != null){
            for (int i = 0; i < ctx.auxunaryExpression().size(); i++) {
                unaryExpressionTrad += visitAuxunaryExpression(ctx.auxunaryExpression(i));
            }
        }

        if (ctx.postfixExpression() != null) {
            unaryExpressionTrad += visitPostfixExpression(ctx.postfixExpression());
        } else if (ctx.unaryOperator() != null) {
            unaryExpressionTrad += visitUnaryOperator(ctx.unaryOperator());
            unaryExpressionTrad += visitCastExpression(ctx.castExpression());
        } else {
            if (ctx.getText().substring(0, 6).equals("sizeof")) {
                unaryExpressionTrad += "sizeof" + "(";
                unaryExpressionTrad += visitTypeName(ctx.typeName());
                unaryExpressionTrad += ")";
            } else if (ctx.getText().substring(0, 8).equals("_Alignof")) {
                unaryExpressionTrad += "_Alignof" + "(";
                unaryExpressionTrad += visitTypeName(ctx.typeName());
                unaryExpressionTrad += ")";
            } else {
                unaryExpressionTrad += "&&";
                unaryExpressionTrad += ctx.Identifier();
            }
        }

        return (T) unaryExpressionTrad;
    }

    @Override
    public T visitAuxunaryExpression(CGrammarParser.AuxunaryExpressionContext ctx) {
        String auxunaryExpressionTrad = "";
        auxunaryExpressionTrad += ctx.getText();

        return (T) auxunaryExpressionTrad;
    }

    @Override
    public T visitUnaryOperator(CGrammarParser.UnaryOperatorContext ctx) {
        String unaryOperatorTrad = "";
        unaryOperatorTrad += ctx.getText();

        return (T) unaryOperatorTrad;
    }

    @Override
    public T visitCastExpression(CGrammarParser.CastExpressionContext ctx) {
        String castExpressionTrad = "";
        if (ctx.unaryExpression() != null) {
            castExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
        } else if (ctx.DigitSequence() != null) {
            castExpressionTrad += ctx.DigitSequence();
        } else {
            if (ctx.getText().substring(0, 13).equals("_extension_")) {
                castExpressionTrad += "_extension_";
            }
            castExpressionTrad += "(";
            castExpressionTrad += visitTypeName(ctx.typeName());
            castExpressionTrad += ")";
            castExpressionTrad += visitCastExpression(ctx.castExpression());
        }

        return (T) castExpressionTrad;
    }

    @Override
    public T visitMultiplicativeExpression(CGrammarParser.MultiplicativeExpressionContext ctx) {
        String multiplicativeExpressionTrad = "";
        multiplicativeExpressionTrad += visitCastExpression(ctx.castExpression(0));
        if (ctx.castExpression().size() > 1) {
            for (int i = 1; i < ctx.castExpression().size(); i++) {
                multiplicativeExpressionTrad += visitMultiplicativeOperator(ctx.multiplicativeOperator(i-1));
                multiplicativeExpressionTrad += visitCastExpression(ctx.castExpression(i));
            }
        }

        return (T) multiplicativeExpressionTrad;
    }

    @Override
    public T visitMultiplicativeOperator(CGrammarParser.MultiplicativeOperatorContext ctx) {
        String multiplicativeOperatorTrad = "";
        multiplicativeOperatorTrad += " " + ctx.getText() +" ";

        return (T) multiplicativeOperatorTrad;
    }

    @Override
    public T visitAdditiveExpression(CGrammarParser.AdditiveExpressionContext ctx) {
        String additiveExpressionTrad = "";
        additiveExpressionTrad += visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
        if (ctx.multiplicativeExpression().size() > 1) {
            for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
                additiveExpressionTrad += visitAdditiveOperator(ctx.additiveOperator(i-1));
                additiveExpressionTrad += visitMultiplicativeExpression(ctx.multiplicativeExpression(i));
            }
        }
        return (T) additiveExpressionTrad;
    }

    @Override
    public T visitAdditiveOperator(CGrammarParser.AdditiveOperatorContext ctx) {
        String additiveOperatorTrad = "";
        additiveOperatorTrad += " "+ ctx.getText()+" ";

        return (T) additiveOperatorTrad;
    }

    @Override
    public T visitShiftExpression(CGrammarParser.ShiftExpressionContext ctx) {
        String shiftExpressionTrad = "";
        shiftExpressionTrad += visitAdditiveExpression(ctx.additiveExpression(0));
        if (ctx.additiveExpression().size() > 1){
            for (int i = 1; i < ctx.additiveExpression().size(); i++) {
                shiftExpressionTrad += visitShiftOperator(ctx.shiftOperator(i-1));
                shiftExpressionTrad += visitAdditiveExpression(ctx.additiveExpression(i));
            }
        }

        return (T) shiftExpressionTrad;
    }

    @Override
    public T visitShiftOperator(CGrammarParser.ShiftOperatorContext ctx) {
        String shiftOperatorTrad = "";
        shiftOperatorTrad += " " + ctx.getText() + " ";

        return (T) shiftOperatorTrad;
    }

    @Override
    public T visitRelationalExpression(CGrammarParser.RelationalExpressionContext ctx) {
        String relationalExpressionTrad = "";
        relationalExpressionTrad += visitShiftExpression(ctx.shiftExpression(0));
        if (ctx.shiftExpression().size() > 1) {
            for (int i = 1; i < ctx.shiftExpression().size(); i++) {
                relationalExpressionTrad += visitRelationalOperator(ctx.relationalOperator(i-1));
                relationalExpressionTrad += visitShiftExpression(ctx.shiftExpression(i));
            }
        }
        return (T) relationalExpressionTrad;
    }

    @Override
    public T visitRelationalOperator(CGrammarParser.RelationalOperatorContext ctx) {
        String relationalOperatorTrad = "";
        relationalOperatorTrad += " " + ctx.getText() + " ";

        return (T) relationalOperatorTrad;
    }

    @Override
    public T visitEqualityExpression(CGrammarParser.EqualityExpressionContext ctx) {
        String equalityExpressionTrad = "";
        equalityExpressionTrad += visitRelationalExpression(ctx.relationalExpression(0));
        if (ctx.relationalExpression().size() > 1 ){
            for (int i = 1; i < ctx.relationalExpression().size(); i++) {
                equalityExpressionTrad += visitEquilatyOperator(ctx.equilatyOperator(i-1));
                equalityExpressionTrad += visitRelationalExpression(ctx.relationalExpression(i));
            }
        }

        return (T) equalityExpressionTrad;
    }

    @Override
    public T visitEquilatyOperator(CGrammarParser.EquilatyOperatorContext ctx) {
        String equilatyOperatorTrad = "";
        equilatyOperatorTrad += " "+ ctx.getText()+ " ";

        return (T) equilatyOperatorTrad;
    }

    @Override
    public T visitAndExpression(CGrammarParser.AndExpressionContext ctx) {
        String andExpressionTrad = "";
        andExpressionTrad += visitEqualityExpression(ctx.equalityExpression(0));
        if (ctx.equalityExpression().size() > 1){
            for (int i = 1; i < ctx.equalityExpression().size(); i++) {
                andExpressionTrad += "&";
                andExpressionTrad += visitEqualityExpression(ctx.equalityExpression(i));
            }
        }


        return (T) andExpressionTrad;
    }

    @Override
    public T visitExclusiveOrExpression(CGrammarParser.ExclusiveOrExpressionContext ctx) {
        String exclusiveOrExpressionTrad = "";
        exclusiveOrExpressionTrad += visitAndExpression(ctx.andExpression(0));
        if (ctx.andExpression().size() > 1){
            for (int i = 1; i < ctx.andExpression().size(); i++) {
                exclusiveOrExpressionTrad += "^";
                exclusiveOrExpressionTrad += visitAndExpression(ctx.andExpression(i));
            }
        }
        return (T) exclusiveOrExpressionTrad;
    }

    @Override
    public T visitInclusiveOrExpression(CGrammarParser.InclusiveOrExpressionContext ctx) {
        String inclusiveOrExpressionTrad = "";
        inclusiveOrExpressionTrad += visitExclusiveOrExpression(ctx.exclusiveOrExpression(0));
        if (ctx.exclusiveOrExpression().size() >1){
            for (int i = 1; i < ctx.exclusiveOrExpression().size(); i++) {
                inclusiveOrExpressionTrad += "|";
                inclusiveOrExpressionTrad += visitExclusiveOrExpression(ctx.exclusiveOrExpression(i));
            }
        }
        return (T) inclusiveOrExpressionTrad;
    }

    @Override
    public T visitLogicalAndExpression(CGrammarParser.LogicalAndExpressionContext ctx) {
        String logicalAndExpressionTrad = "";
        logicalAndExpressionTrad += visitInclusiveOrExpression(ctx.inclusiveOrExpression(0));
        if (ctx.inclusiveOrExpression().size() > 1) {
            for (int i = 1; i < ctx.inclusiveOrExpression().size(); i++) {
                logicalAndExpressionTrad += "&&";
                logicalAndExpressionTrad += visitInclusiveOrExpression(ctx.inclusiveOrExpression(i));
            }
        }

        return (T) logicalAndExpressionTrad;
    }

    @Override
    public T visitLogicalOrExpression(CGrammarParser.LogicalOrExpressionContext ctx) {
        String logicalOrExpressionTrad = "";
        logicalOrExpressionTrad += visitLogicalAndExpression(ctx.logicalAndExpression(0));
        if (ctx.logicalAndExpression().size() > 1){
            for (int i = 1; i < ctx.logicalAndExpression().size(); i++) {
                logicalOrExpressionTrad += "||";
                logicalOrExpressionTrad += visitLogicalAndExpression(ctx.logicalAndExpression(i));
            }
        }

        return (T) logicalOrExpressionTrad;
    }

    @Override
    public T visitConditionalExpression(CGrammarParser.ConditionalExpressionContext ctx) {
        String conditionalExpressionTrad = "";
        conditionalExpressionTrad += visitLogicalOrExpression(ctx.logicalOrExpression());
        if (ctx.expression() != null) {
            conditionalExpressionTrad += "?";
            conditionalExpressionTrad += visitExpression(ctx.expression());
            conditionalExpressionTrad += ":";
            conditionalExpressionTrad += visitConditionalExpression(ctx.conditionalExpression());
        }

        return (T) conditionalExpressionTrad;
    }

    @Override
    public T visitAssignmentExpression(CGrammarParser.AssignmentExpressionContext ctx) {
        String conditionalExpressionTrad = "";
        if (ctx.conditionalExpression() != null) {
            conditionalExpressionTrad += visitConditionalExpression(ctx.conditionalExpression());
        } else if (ctx.unaryExpression() != null) {
            conditionalExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
            conditionalExpressionTrad += visitAssignmentOperator(ctx.assignmentOperator());
            conditionalExpressionTrad += visitAssignmentExpression(ctx.assignmentExpression());
        } else {
            conditionalExpressionTrad += ctx.DigitSequence().getText();
        }

        return (T) conditionalExpressionTrad;
    }

    @Override
    public T visitAssignmentOperator(CGrammarParser.AssignmentOperatorContext ctx) {
        String assignmentOperatorTrad = "";
        assignmentOperatorTrad += " " + ctx.getText()+ " ";

        return (T) assignmentOperatorTrad;
    }

    @Override
    public T visitExpression(CGrammarParser.ExpressionContext ctx) {
        String expressionTrad = "";
        expressionTrad += visitAssignmentExpression(ctx.assignmentExpression(0));
        if (ctx.assignmentExpression().size() > 1){
            for (int i = 1; i < ctx.assignmentExpression().size(); i++) {
                expressionTrad += ", ";
                expressionTrad += visitAssignmentExpression(ctx.assignmentExpression(i));
            }
        }

        return (T) expressionTrad;
    }

    @Override
    public T visitConstantExpression(CGrammarParser.ConstantExpressionContext ctx) {
        String constantExpressionTrad = "";
        constantExpressionTrad += visitConditionalExpression(ctx.conditionalExpression());

        return (T) constantExpressionTrad;
    }

    @Override
    public T visitDeclaration(CGrammarParser.DeclarationContext ctx) {
        String declarationTrad = "";
        if (ctx.declarationSpecifiers() != null) {
            declarationTrad += visitDeclarationSpecifiers(ctx.declarationSpecifiers());
            if (ctx.initDeclaratorList() != null) {
                declarationTrad += visitInitDeclaratorList(ctx.initDeclaratorList());
            }
            declarationTrad += ";\n";
        } else if (ctx.staticAssertDeclaration() != null) {
            declarationTrad += visitStaticAssertDeclaration(ctx.staticAssertDeclaration());
        }

        return (T) declarationTrad;
    }

    @Override
    public T visitDeclarationSpecifiers(CGrammarParser.DeclarationSpecifiersContext ctx) {
        String declarationSpecifiersTrad = "";
        for (int i = 0; i < ctx.declarationSpecifier().size(); i++) {
            declarationSpecifiersTrad += visitDeclarationSpecifier(ctx.declarationSpecifier(i));
        }
        return (T) declarationSpecifiersTrad;
    }

    @Override
    public T visitDeclarationSpecifiers2(CGrammarParser.DeclarationSpecifiers2Context ctx) {
        String declarationSpecifiers2Trad = "";
        for (int i = 0; i < ctx.declarationSpecifier().size(); i++) {
            declarationSpecifiers2Trad += visitDeclarationSpecifier(ctx.declarationSpecifier(i));
        }
        return (T) declarationSpecifiers2Trad;
    }

    @Override
    public T visitDeclarationSpecifier(CGrammarParser.DeclarationSpecifierContext ctx) {
        String declarationSpecifierTrad = "";
        if (ctx.storageClassSpecifier() != null) {
            declarationSpecifierTrad += visitStorageClassSpecifier(ctx.storageClassSpecifier());
        } else if (ctx.typeSpecifier() != null) {
            declarationSpecifierTrad += visitTypeSpecifier(ctx.typeSpecifier()) + " ";
        } else if (ctx.typeQualifier() != null) {
            declarationSpecifierTrad += visitTypeQualifier(ctx.typeQualifier());
        } else if (ctx.functionSpecifier() != null) {
            declarationSpecifierTrad += visitFunctionSpecifier(ctx.functionSpecifier());
        } else if (ctx.alignmentSpecifier() != null) {
            declarationSpecifierTrad += visitAlignmentSpecifier(ctx.alignmentSpecifier());
        }

        return (T) declarationSpecifierTrad;
    }

    @Override
    public T visitInitDeclaratorList(CGrammarParser.InitDeclaratorListContext ctx) {
        String initDeclaratorListTrad = "";
        initDeclaratorListTrad += visitInitDeclarator(ctx.initDeclarator(0));
        if (ctx.initDeclarator().size() > 1){
            for (int i = 1; i < ctx.initDeclarator().size(); i++) {
                initDeclaratorListTrad += ", ";
                initDeclaratorListTrad += visitInitDeclarator(ctx.initDeclarator(i));
            }
        }
        return (T) initDeclaratorListTrad;
    }

    @Override
    public T visitInitDeclarator(CGrammarParser.InitDeclaratorContext ctx) {
        String initDeclaratorTrad = "";
        initDeclaratorTrad += visitDeclarator(ctx.declarator());
        if (ctx.initializer() != null) {
            initDeclaratorTrad += " = ";
            initDeclaratorTrad += visitInitializer(ctx.initializer());
        }

        return (T) initDeclaratorTrad;
    }

    @Override
    public T visitStorageClassSpecifier(CGrammarParser.StorageClassSpecifierContext ctx) {
        String storageClassSpecifierTrad = "";
        storageClassSpecifierTrad += ctx.getText();

        return (T) storageClassSpecifierTrad;
    }

    @Override
    public T visitTypeSpecifier(CGrammarParser.TypeSpecifierContext ctx) {
        String typeSpecifierTrad = "";
        typeSpecifierTrad += ctx.getText();

        return (T) typeSpecifierTrad;
    }

    @Override
    public T visitTypeQualifier(CGrammarParser.TypeQualifierContext ctx) {
        String typeQualifierTrad = "";
        typeQualifierTrad += ctx.getText();

        return (T) typeQualifierTrad;
    }

    @Override
    public T visitFunctionSpecifier(CGrammarParser.FunctionSpecifierContext ctx) {
        String functionSpecifierTrad = "";
        if (ctx.auxfuntionSpecifier() != null) {
            functionSpecifierTrad += visitAuxfuntionSpecifier(ctx.auxfuntionSpecifier());
        } else if (ctx.gccAttributeSpecifier() != null) {
            functionSpecifierTrad += visitGccAttributeSpecifier(ctx.gccAttributeSpecifier());
        } else {
            functionSpecifierTrad += "__declspec" + "(" + ctx.Identifier().getText() + ")";
        }

        return (T) functionSpecifierTrad;
    }

    @Override
    public T visitAuxfuntionSpecifier(CGrammarParser.AuxfuntionSpecifierContext ctx) {
        String auxfuntionSpecifierTrad = "";
        auxfuntionSpecifierTrad += ctx.getText();

        return (T) auxfuntionSpecifierTrad;
    }

    @Override
    public T visitAlignmentSpecifier(CGrammarParser.AlignmentSpecifierContext ctx) {
        String alignmentSpecifierTrad = "";
        alignmentSpecifierTrad += "_Alignas" + "(";
        if (ctx.typeName() != null) {
            alignmentSpecifierTrad += visitTypeName(ctx.typeName());
        } else if (ctx.constantExpression() != null) {
            alignmentSpecifierTrad += visitConstantExpression(ctx.constantExpression());
        }
        alignmentSpecifierTrad += ")";

        return (T) alignmentSpecifierTrad;
    }

    @Override
    public T visitDeclarator(CGrammarParser.DeclaratorContext ctx) {
        String declaratorTrad = "";
        if (ctx.pointer() != null) {
            declaratorTrad += visitPointer(ctx.pointer());
        }
        declaratorTrad += visitDirectDeclarator(ctx.directDeclarator());
        for (int i = 0; i < ctx.gccDeclaratorExtension().size(); i++) {
            declaratorTrad += visitGccDeclaratorExtension(ctx.gccDeclaratorExtension(i));
        }

        return (T) declaratorTrad;
    }

    @Override
    public T visitDirectDeclarator(CGrammarParser.DirectDeclaratorContext ctx) {
        String directDeclaratorTtrad = "";
        if (ctx.Identifier() != null) {
            directDeclaratorTtrad += ctx.Identifier().getText();
        } else if (ctx.declarator() != null) {
            directDeclaratorTtrad += "(";
            directDeclaratorTtrad += visitDeclarator(ctx.declarator());
            directDeclaratorTtrad += ")";
        } else if (ctx.auxdirectDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAuxdirectDeclarator(ctx.auxdirectDeclarator());
        } else if (ctx.aux1directDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAux1directDeclarator(ctx.aux1directDeclarator());
        } else if (ctx.aux2directDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAux2directDeclarator(ctx.aux2directDeclarator());
        } else if (ctx.aux3directDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAux3directDeclarator(ctx.aux3directDeclarator());
        } else if (ctx.aux4directDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAux4directDeclarator(ctx.aux4directDeclarator());
        } else if (ctx.aux5directDeclarator() != null) {
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += visitAux5directDeclarator(ctx.aux5directDeclarator());
        } else if (ctx.DigitSequence() != null) {
            directDeclaratorTtrad += ctx.DigitSequence().getText();
        } else {
            directDeclaratorTtrad += "(";
            if (ctx.typeSpecifier() != null) {
                directDeclaratorTtrad += visitTypeSpecifier(ctx.typeSpecifier());
            }
            directDeclaratorTtrad += visitPointer(ctx.pointer());
            directDeclaratorTtrad += visitDirectDeclarator(ctx.directDeclarator());
            directDeclaratorTtrad += ")";
        }

        return (T) directDeclaratorTtrad;
    }

    @Override
    public T visitAuxdirectDeclarator(CGrammarParser.AuxdirectDeclaratorContext ctx) {
        String auxdirectDeclaratorTrad = "";
        auxdirectDeclaratorTrad += "[";
        if (ctx.typeQualifierList() != null) {
            auxdirectDeclaratorTrad += visitTypeQualifierList(ctx.typeQualifierList());
        }
        if (ctx.assignmentExpression() != null) {
            auxdirectDeclaratorTrad += visitAssignmentExpression(ctx.assignmentExpression());
        }
        auxdirectDeclaratorTrad += "]";

        return (T) auxdirectDeclaratorTrad;
    }

    @Override
    public T visitAux1directDeclarator(CGrammarParser.Aux1directDeclaratorContext ctx) {
        String aux1directDeclaratorTrad = "";
        aux1directDeclaratorTrad += "[" + "static";
        if (ctx.typeQualifierList() != null) {
            aux1directDeclaratorTrad += visitTypeQualifierList(ctx.typeQualifierList());
        }
        if (ctx.assignmentExpression() != null) {
            aux1directDeclaratorTrad += visitAssignmentExpression(ctx.assignmentExpression());
        }
        aux1directDeclaratorTrad += "]";

        return (T) aux1directDeclaratorTrad;
    }

    @Override
    public T visitAux2directDeclarator(CGrammarParser.Aux2directDeclaratorContext ctx) {
        String aux2directDeclaratorTrad = "";
        aux2directDeclaratorTrad += "[";
        aux2directDeclaratorTrad += visitTypeQualifierList(ctx.typeQualifierList());
        aux2directDeclaratorTrad += "static";
        aux2directDeclaratorTrad += visitAssignmentExpression(ctx.assignmentExpression());
        aux2directDeclaratorTrad += "]";

        return (T) aux2directDeclaratorTrad;
    }

    @Override
    public T visitAux3directDeclarator(CGrammarParser.Aux3directDeclaratorContext ctx) {
        String aux3directDeclaratorTrad = "";
        aux3directDeclaratorTrad += "[";
        if (ctx.typeQualifierList() != null) {
            aux3directDeclaratorTrad += visitTypeQualifierList(ctx.typeQualifierList());
        }
        aux3directDeclaratorTrad += "*";
        aux3directDeclaratorTrad += "]";

        return (T) aux3directDeclaratorTrad;
    }

    @Override
    public T visitAux4directDeclarator(CGrammarParser.Aux4directDeclaratorContext ctx) {
        String aux4directDeclaratorTrad = "";
        aux4directDeclaratorTrad += "(";
        aux4directDeclaratorTrad += visitParameterTypeList(ctx.parameterTypeList());
        aux4directDeclaratorTrad += ")";

        return (T) aux4directDeclaratorTrad;
    }

    @Override
    public T visitAux5directDeclarator(CGrammarParser.Aux5directDeclaratorContext ctx) {
        String aux5directDeclaratorTrad = "";
        aux5directDeclaratorTrad += "(";
        if (ctx.identifierList() != null) {
            aux5directDeclaratorTrad += visitIdentifierList(ctx.identifierList());
        }
        aux5directDeclaratorTrad += ")";

        return (T) aux5directDeclaratorTrad;
    }

    @Override
    public T visitGccDeclaratorExtension(CGrammarParser.GccDeclaratorExtensionContext ctx) {
        String gccDeclaratorExtensionTrad = "";
        if (ctx.gccAttributeSpecifier() != null) {
            gccDeclaratorExtensionTrad += visitGccAttributeSpecifier(ctx.gccAttributeSpecifier());
        } else {
            gccDeclaratorExtensionTrad += "__asm" + "(";
            for (int i = 0; i < ctx.StringLiteral().size(); i++) {
                gccDeclaratorExtensionTrad += ctx.StringLiteral(i).getText();
            }
            gccDeclaratorExtensionTrad += ")";
        }

        return (T) gccDeclaratorExtensionTrad;
    }

    @Override
    public T visitGccAttributeSpecifier(CGrammarParser.GccAttributeSpecifierContext ctx) {
        String gccAttributeSpecifierTrad = "";
        gccAttributeSpecifierTrad += "_attribute_" + "(" + "(";
        gccAttributeSpecifierTrad += visitGccAttributeList(ctx.gccAttributeList());
        gccAttributeSpecifierTrad += ")" + ")";

        return (T) gccAttributeSpecifierTrad;
    }

    @Override
    public T visitGccAttributeList(CGrammarParser.GccAttributeListContext ctx) {
        String gccAttributeListTrad = "";
        if (ctx.gccAttribute() != null) {
            gccAttributeListTrad += visitGccAttribute(ctx.gccAttribute());
        }
        if (ctx.auxgccAttributeList() != null) {
            for (int i = 0; i < ctx.auxgccAttributeList().size(); i++) {
                gccAttributeListTrad += visitAuxgccAttributeList(ctx.auxgccAttributeList(i));
            }
        }

        return (T) gccAttributeListTrad;
    }

    @Override
    public T visitAuxgccAttributeList(CGrammarParser.AuxgccAttributeListContext ctx) {
        String auxgccAttributeListTrad = "";
        auxgccAttributeListTrad += ", ";
        if (ctx.gccAttribute() != null) {
            auxgccAttributeListTrad += visitGccAttribute(ctx.gccAttribute());
        }

        return (T) auxgccAttributeListTrad;
    }

    @Override
    public T visitGccAttribute(CGrammarParser.GccAttributeContext ctx) {
        String gccAttributeTrad = "";
        if (ctx.argumentExpressionList() != null) {
            gccAttributeTrad += "(";
            if (ctx.argumentExpressionList() != null) {
                gccAttributeTrad += visitArgumentExpressionList(ctx.argumentExpressionList());
            }
            gccAttributeTrad += ")";
        } else {
            gccAttributeTrad += ctx.getText();
        }

        return (T) gccAttributeTrad;
    }

    @Override
    public T visitNestedParenthesesBlock(CGrammarParser.NestedParenthesesBlockContext ctx) {
        String nestedParenthesesBlockTrad = "";
        if (ctx.auxnestedParenthesesBlock() != null){
            for (int i = 0; i < ctx.auxnestedParenthesesBlock().size(); i++) {
                nestedParenthesesBlockTrad += visitAuxnestedParenthesesBlock(ctx.auxnestedParenthesesBlock(i));
            }
        }

        return (T) nestedParenthesesBlockTrad;
    }

    @Override
    public T visitAuxnestedParenthesesBlock(CGrammarParser.AuxnestedParenthesesBlockContext ctx) {
        String auxnestedParenthesesBlockTrad = "";
        if (ctx.nestedParenthesesBlock() != null) {
            auxnestedParenthesesBlockTrad += "(";
            auxnestedParenthesesBlockTrad += visitNestedParenthesesBlock(ctx.nestedParenthesesBlock());
            auxnestedParenthesesBlockTrad += ")";
        } else {
            auxnestedParenthesesBlockTrad += ctx.getText();
        }

        return (T) auxnestedParenthesesBlockTrad;
    }

    @Override
    public T visitPointer(CGrammarParser.PointerContext ctx) {
        String pointerTrad = "";
        if (ctx.auxpointer() != null){
            for (int i = 0; i < ctx.auxpointer().size(); i++) {
                pointerTrad += visitAuxpointer(ctx.auxpointer(i));
            }
        }
        return (T) pointerTrad;
    }

    @Override
    public T visitAuxpointer(CGrammarParser.AuxpointerContext ctx) {
        String auxpointerTrad = "";
        if (ctx.getText().charAt(0) == '*') {
            auxpointerTrad += "*";
        } else {
            auxpointerTrad += "^";
        }
        if (ctx.typeQualifierList() != null) {
            auxpointerTrad += visitTypeQualifierList(ctx.typeQualifierList());
        }
        return (T) auxpointerTrad;
    }

    @Override
    public T visitTypeQualifierList(CGrammarParser.TypeQualifierListContext ctx) {
        String typeQualifierListTrad = "";
        for (int i = 0; i < ctx.typeQualifier().size(); i++) {
            typeQualifierListTrad += visitTypeQualifier(ctx.typeQualifier(i));
        }

        return (T) typeQualifierListTrad;
    }

    @Override
    public T visitParameterTypeList(CGrammarParser.ParameterTypeListContext ctx) {
        String parameterTypeListTrad = "";
        parameterTypeListTrad += visitParameterList(ctx.parameterList());
        if (ctx.auxparameterTypeList() != null) {
            parameterTypeListTrad += visitAuxparameterTypeList(ctx.auxparameterTypeList());
        }
        return (T) parameterTypeListTrad;
    }

    @Override
    public T visitAuxparameterTypeList(CGrammarParser.AuxparameterTypeListContext ctx) {
        String auxparameterTypeListTrad = "";
        auxparameterTypeListTrad += ctx.getText();

        return (T) auxparameterTypeListTrad;
    }

    @Override
    public T visitParameterList(CGrammarParser.ParameterListContext ctx) {
        String parameterListTrad = "";
        parameterListTrad += visitParameterDeclaration(ctx.parameterDeclaration(0));
        if (ctx.parameterDeclaration().size() > 1){
            for (int i = 1; i < ctx.parameterDeclaration().size(); i++) {
                parameterListTrad += ", ";
                parameterListTrad += visitParameterDeclaration(ctx.parameterDeclaration(i));
            }
        }

        return (T) parameterListTrad;
    }

    @Override
    public T visitParameterDeclaration(CGrammarParser.ParameterDeclarationContext ctx) {
        String parameterDeclarationTrad = "";
        if (ctx.declarationSpecifiers() != null) {
            parameterDeclarationTrad += visitDeclarationSpecifiers(ctx.declarationSpecifiers());
            parameterDeclarationTrad += visitDeclarator(ctx.declarator());
        } else {
            parameterDeclarationTrad += visitDeclarationSpecifiers2(ctx.declarationSpecifiers2());
            if (ctx.abstractDeclarator() != null){
                parameterDeclarationTrad += visitAbstractDeclarator(ctx.abstractDeclarator());
            }
        }

        return (T) parameterDeclarationTrad;
    }

    @Override
    public T visitIdentifierList(CGrammarParser.IdentifierListContext ctx) {
        String identifierListTrad = "";
        identifierListTrad += ctx.Identifier(0);
        if (ctx.Identifier().size() >1 ){
            for (int i = 1; i < ctx.Identifier().size(); i++) {
                identifierListTrad += ", ";
                identifierListTrad += ctx.Identifier(i);
            }
        }

        return (T) identifierListTrad;
    }

    @Override
    public T visitTypeName(CGrammarParser.TypeNameContext ctx) {
        String typeNameTrad = "";
        typeNameTrad += visitSpecifierQualifierList(ctx.specifierQualifierList());
        if (ctx.abstractDeclarator() != null) {
            typeNameTrad += visitAbstractDeclarator(ctx.abstractDeclarator());
        }

        return (T) typeNameTrad;
    }

    @Override
    public T visitAbstractDeclarator(CGrammarParser.AbstractDeclaratorContext ctx) {
        String abstractDeclaratorTrad = "";
        if (ctx.directAbstractDeclarator() != null){
            if (ctx.pointer() != null){
                abstractDeclaratorTrad +=   visitPointer(ctx.pointer());
            }
            abstractDeclaratorTrad +=   visitDirectAbstractDeclarator(ctx.directAbstractDeclarator());
            if (ctx.gccDeclaratorExtension() != null){
                for (int i= 0; i< ctx.gccDeclaratorExtension().size() ; i++){
                    abstractDeclaratorTrad +=  visitGccDeclaratorExtension(ctx.gccDeclaratorExtension(i));
                }
            }
        } else {
            abstractDeclaratorTrad +=   visitPointer(ctx.pointer());
        }
        return (T) abstractDeclaratorTrad;
    }

    @Override
    public T visitDirectAbstractDeclarator (CGrammarParser.DirectAbstractDeclaratorContext ctx) {
        String abstractTrad = "";
        if (ctx.auxAbstract1() != null){
            abstractTrad +=  visitAuxAbstract1(ctx.auxAbstract1());
        } else if (ctx.auxAbstract2() != null && ctx.directAbstractDeclarator() == null){
            abstractTrad +=  visitAuxAbstract2(ctx.auxAbstract2());
        } else if (ctx.auxAbstract3() != null && ctx.directAbstractDeclarator() == null){
            abstractTrad +=  visitAuxAbstract3(ctx.auxAbstract3());
        } else if (ctx.auxAbstract4() != null && ctx.directAbstractDeclarator() == null){
            abstractTrad +=  visitAuxAbstract4(ctx.auxAbstract4());
        } else if (ctx.auxAbstract5() != null && ctx.directAbstractDeclarator() == null){
            abstractTrad +=  visitAuxAbstract5(ctx.auxAbstract5());
        }else if (ctx.auxAbstract6() != null && ctx.directAbstractDeclarator() == null){
            abstractTrad +=  visitAuxAbstract6(ctx.auxAbstract6());
        } else if (ctx.auxAbstract2() != null && ctx.directAbstractDeclarator() != null){
            abstractTrad +=  (String) visitDirectAbstractDeclarator(ctx.directAbstractDeclarator()) +  visitAuxAbstract2(ctx.auxAbstract2());
        } else if (ctx.auxAbstract3() != null && ctx.directAbstractDeclarator() != null){
            abstractTrad +=  (String)visitDirectAbstractDeclarator(ctx.directAbstractDeclarator()) +  visitAuxAbstract3(ctx.auxAbstract3());
        } else if (ctx.auxAbstract4() != null && ctx.directAbstractDeclarator() != null){
            abstractTrad +=  (String)visitDirectAbstractDeclarator(ctx.directAbstractDeclarator()) +  visitAuxAbstract4(ctx.auxAbstract4());
        } else if (ctx.auxAbstract5() != null && ctx.directAbstractDeclarator() != null){
            abstractTrad +=  (String)visitDirectAbstractDeclarator(ctx.directAbstractDeclarator()) +  visitAuxAbstract5(ctx.auxAbstract5());
        }else if (ctx.auxAbstract6() != null && ctx.directAbstractDeclarator() != null){
            abstractTrad +=  (String)visitDirectAbstractDeclarator(ctx.directAbstractDeclarator()) +  visitAuxAbstract6(ctx.auxAbstract6());
        }
        return (T)  abstractTrad;
    }

    @Override
    public T visitAuxAbstract1(CGrammarParser.AuxAbstract1Context ctx) {
        String auxAbstractTrad = "(" +   visitAbstractDeclarator(ctx.abstractDeclarator()) + ")";
        if (ctx.gccDeclaratorExtension() != null){
            for (int i= 0; i< ctx.gccDeclaratorExtension().size() ; i++){
                auxAbstractTrad +=  visitGccDeclaratorExtension(ctx.gccDeclaratorExtension(i));
            }
        }
        return (T) auxAbstractTrad;
    }

    @Override
    public T visitAuxAbstract2(CGrammarParser.AuxAbstract2Context ctx) {
        String auxAbstractTrad = "[";
        if (ctx.typeQualifierList() != null){
            auxAbstractTrad +=  visitTypeQualifierList(ctx.typeQualifierList());
        }
        if (ctx.assignmentExpression() != null){
            auxAbstractTrad +=  visitAssignmentExpression(ctx.assignmentExpression());
        }
        auxAbstractTrad += "]";
        return (T) auxAbstractTrad;
    }

    @Override
    public T visitAuxAbstract3(CGrammarParser.AuxAbstract3Context ctx) {
        String auxAbstractTrad = "[static ";
        if (ctx.typeQualifierList() != null){
            auxAbstractTrad +=  visitTypeQualifierList(ctx.typeQualifierList());
        }
        auxAbstractTrad +=  visitAssignmentExpression(ctx.assignmentExpression()) + "]";
        return (T) auxAbstractTrad;
    }

    @Override
    public T visitAuxAbstract4(CGrammarParser.AuxAbstract4Context ctx) {
        String auxAbstractTrad = "[";
        auxAbstractTrad +=  visitTypeQualifierList(ctx.typeQualifierList()) + " static " +  visitAssignmentExpression(ctx.assignmentExpression()) + "]";
        return (T) auxAbstractTrad;
    }

    @Override
    public T visitAuxAbstract5(CGrammarParser.AuxAbstract5Context ctx) {
        return (T) ctx.getText();
    }

    @Override
    public T visitAuxAbstract6(CGrammarParser.AuxAbstract6Context ctx) {
        String auxAbstractTrad = "(";
        if (ctx.parameterTypeList() != null){
            auxAbstractTrad +=   visitParameterTypeList(ctx.parameterTypeList()) + ")";
        }

        if (ctx.gccDeclaratorExtension() != null){
            for (int i= 0; i< ctx.gccDeclaratorExtension().size() ; i++){
                auxAbstractTrad +=  visitGccDeclaratorExtension(ctx.gccDeclaratorExtension(i));
            }
        }
        return (T) auxAbstractTrad;
    }

    @Override
    public T visitTypedefName (CGrammarParser.TypedefNameContext ctx) {
        return (T)  ctx.Identifier().getText();
    }

    @Override
    public T visitInitializer (CGrammarParser.InitializerContext ctx) {
        String initializerTrad = "";
        if (ctx.assignmentExpression() != null){
            initializerTrad +=  visitAssignmentExpression(ctx.assignmentExpression());
        } else {
            initializerTrad += "{\n" + visitInitializerList(ctx.initializerList()) + "}\n";
        }

        return (T)  initializerTrad;
    }

    @Override
    public T visitInitializerList (CGrammarParser.InitializerListContext ctx) {
        String initializerListTrad = "";
        if (ctx.designation() != null){
            initializerListTrad +=  visitDesignation(ctx.designation());
        }
        initializerListTrad +=  visitInitializer(ctx.initializer());
        if (ctx.auxInitializer().size() > 1){
            for (int i=0; i < ctx.auxInitializer().size(); i++){
                initializerListTrad +=  visitAuxInitializer(ctx.auxInitializer(i));
            }
        }
        return (T)  initializerListTrad;
    }

    @Override
    public T visitAuxInitializer (CGrammarParser.AuxInitializerContext ctx) {
        String auxInitializerTrad = "";
        auxInitializerTrad += ", ";
        if (ctx.designation() != null){
            auxInitializerTrad  +=  visitDesignation(ctx.designation());
        }
        auxInitializerTrad +=  visitInitializer(ctx.initializer());
        return  (T) auxInitializerTrad;
    }



    @Override
    public T visitDesignation (CGrammarParser.DesignationContext ctx) {
        String designationTrad =  visitDesignatorList(ctx.designatorList())+" = ";
        return (T)  designationTrad;
    }

    @Override
    public T visitDesignatorList (CGrammarParser.DesignatorListContext ctx) {
        String designatorListTrad = "";
        for (int i = 0; i < ctx.designator().size() ; i++){
            designatorListTrad +=  visitDesignator(ctx.designator(i));
        }
        return (T)  designatorListTrad;
    }

    @Override
    public T visitDesignator (CGrammarParser.DesignatorContext ctx) {
        String designatorTrad = "";
        if (ctx.constantExpression() != null) {
            designatorTrad += "[" +  visitConstantExpression(ctx.constantExpression()) + "]";
        } else {
            designatorTrad += "." + ctx.Identifier().getText();
        }
        return (T)  designatorTrad;
    }

    @Override
    public T visitStaticAssertDeclaration (CGrammarParser.StaticAssertDeclarationContext ctx) {
        String staticAssertTrad = "";
        staticAssertTrad += "_Static_assert (";
        staticAssertTrad +=  visitConstantExpression(ctx.constantExpression()) + ", " ;
        for (int i =0 ; i < ctx.StringLiteral().size() ; i++){
            staticAssertTrad += ctx.StringLiteral(i).getText();
        }
        staticAssertTrad += ");\n";

        return (T)  staticAssertTrad;
    }

    @Override
    public T visitStatement (CGrammarParser.StatementContext ctx) {
        String statementTrad = "";
        if (ctx.labeledStatement() != null){
            statementTrad +=    visitLabeledStatement(ctx.labeledStatement());
        } else if (ctx.compoundStatement() != null){
            statementTrad +=  visitCompoundStatement(ctx.compoundStatement());
        } else if (ctx.expressionStatement() != null){
            statementTrad +=  visitExpressionStatement(ctx.expressionStatement());
        } else if (ctx.selectionStatement() != null){
            statementTrad +=  visitSelectionStatement(ctx.selectionStatement());
        } else if (ctx.iterationStatement() != null){
            statementTrad+=  visitIterationStatement(ctx.iterationStatement());
        } else if (ctx.jumpStatement() != null){
            statementTrad +=  visitJumpStatement(ctx.jumpStatement());
        }  else {
            statementTrad +=   (String)visitAsm(ctx.asm()) +  visitVolatileText(ctx.volatileText()) + "(" ;
            if (ctx.auxStatement() != null){
                statementTrad +=  visitAuxStatement(ctx.auxStatement());
            }
            if (ctx.auxStatement() != null){
                for (int i = 0; i < ctx.auxStatement2().size() ;i++){
                    statementTrad += visitAuxStatement2(ctx.auxStatement2(i));
                }
            }
            statementTrad += ");\n";
        }

        return (T)  statementTrad;
    }

    @Override
    public T visitAsm(CGrammarParser.AsmContext ctx) {
        String asmTrad = "";
        asmTrad += printSpaces();
        asmTrad += ctx.getText();

        return (T) asmTrad;
    }

    @Override
    public T visitVolatileText(CGrammarParser.VolatileTextContext ctx) {
        return (T)  ctx.getText();
    }

    @Override
    public T visitAuxStatement (CGrammarParser.AuxStatementContext ctx) {
        String auxStatementTrad = "";
        auxStatementTrad +=  visitLogicalOrExpression(ctx.logicalOrExpression(0));
        if(ctx.logicalOrExpression().size() > 1){
            for (int i = 1; i < ctx.logicalOrExpression().size(); i++){
                auxStatementTrad += ", " + visitLogicalOrExpression(ctx.logicalOrExpression(i));
            }
        }
        return (T)  auxStatementTrad;
    }

    @Override
    public T visitAuxStatement2 (CGrammarParser.AuxStatement2Context ctx) {
        String auxStatement2Trad = "";
        auxStatement2Trad += ":";
        if(ctx.auxStatement() != null){
            auxStatement2Trad +=  visitAuxStatement(ctx.auxStatement());
        }
        return (T)  auxStatement2Trad;
    }

    @Override
    public T visitLabeledStatement (CGrammarParser.LabeledStatementContext ctx) {
        String labeledStatementTrad = "";
        if (ctx.Identifier() != null){
            labeledStatementTrad += ctx.Identifier() +":" +   visitStatement(ctx.statement());
        } else if (ctx.getText().substring(0,4).equals("case")){
            labeledStatementTrad += "case "+  visitConstantExpression(ctx.constantExpression()) + ":\n" +  visitStatement(ctx.statement());
        } else {
            labeledStatementTrad += "default: \n" +   visitStatement(ctx.statement());
        }
        return (T)  labeledStatementTrad;
    }


    @Override
    public T visitCompoundStatement (CGrammarParser.CompoundStatementContext ctx) {
        String compoundStatetmentTrad = "";
        compoundStatetmentTrad += printSpaces() + "{\n";
        numSpace++;
        if (ctx.blockItemList() != null){
            compoundStatetmentTrad += visitBlockItemList(ctx.blockItemList());
        }
        numSpace--;
        compoundStatetmentTrad += printSpaces() + "}\n";
        return (T) compoundStatetmentTrad;
    }

    @Override
    public T visitBlockItemList (CGrammarParser.BlockItemListContext ctx) {
        String blockItemListTrad = "";
        for (int i = 0; i < ctx.blockItem().size(); i++){
            blockItemListTrad += printSpaces() + visitBlockItem(ctx.blockItem(i));
        }
        return (T) blockItemListTrad;
    }


    @Override
    public T visitBlockItem (CGrammarParser.BlockItemContext ctx) {
        String blockItemTrad = "";
        if (ctx.statement() != null){
            blockItemTrad+=  visitStatement(ctx.statement()) ;
        } else {
            blockItemTrad+=  visitDeclaration(ctx.declaration()) ;
        }
        return (T) blockItemTrad;
    }


    @Override
    public T visitExpressionStatement (CGrammarParser.ExpressionStatementContext ctx) {
        String expressionStatementTrad = "";
        if (ctx.expression() != null){
            expressionStatementTrad +=  visitExpression(ctx.expression())  ;
        }
        expressionStatementTrad += ";\n";
        return (T) expressionStatementTrad;
    }


    @Override
    public T visitSelectionStatement (CGrammarParser.SelectionStatementContext ctx) {
        String selectionStatementTrad = "";
        if (ctx.getText().substring(0,2).equals("if")){
            selectionStatementTrad += "if (" +  visitExpression(ctx.expression()) + ")\n";
            selectionStatementTrad += visitStatement(ctx.statement(0));
            if(ctx.statement().size() > 1){
                selectionStatementTrad += printSpaces() + "else\n";
                for (int i = 1; i < ctx.statement().size(); i++){
                    selectionStatementTrad += visitStatement(ctx.statement(i));
                }
            }
        } else {
            selectionStatementTrad += "switch (" +  visitExpression(ctx.expression()) + ")";
            selectionStatementTrad += visitStatement(ctx.statement(0));
        }
        return (T) selectionStatementTrad;
    }
    @Override
    public T visitIterationStatement (CGrammarParser.IterationStatementContext ctx) {
        String iterationStatementTrad = "";
        if (ctx.Do() != null){
            iterationStatementTrad += ctx.Do().getText() + " (" +  visitStatement(ctx.statement()) + ")" +   visitExpression(ctx.expression());
        } else if (ctx.While() != null){
            iterationStatementTrad +=  ctx.While().getText() + " (" + visitExpression(ctx.expression()) + ")" + visitStatement(ctx.statement()) ;
        } else {
            iterationStatementTrad += ctx.For().getText() + " (" + visitForCondition(ctx.forCondition()) + ")" + visitStatement(ctx.statement());
        }
        return (T) iterationStatementTrad;
    }

    @Override
    public T visitForCondition (CGrammarParser.ForConditionContext ctx) {
        String forConditionTrad = "";
        if (ctx.forDeclaration() != null){
            forConditionTrad  +=  visitForDeclaration(ctx.forDeclaration());
        } else {
            forConditionTrad +=  visitExpression(ctx.expression());
        }
        forConditionTrad += "; ";
        if (ctx.forExpression(0) != null){
            forConditionTrad +=  visitForExpression(ctx.forExpression(0));
        }
        forConditionTrad += "; ";
        if (ctx.forExpression(1) != null){
            forConditionTrad +=  visitForExpression(ctx.forExpression(1));
        }
        return (T) forConditionTrad;
    }

    @Override
    public T visitForDeclaration (CGrammarParser.ForDeclarationContext ctx) {
        String forDeclarationTrad = "";
        forDeclarationTrad  +=   visitDeclarationSpecifiers(ctx.declarationSpecifiers());
        if (ctx.initDeclaratorList() != null){
            forDeclarationTrad  +=  visitInitDeclaratorList(ctx.initDeclaratorList());
        }
        return (T) forDeclarationTrad;
    }

    @Override
    public T visitForExpression (CGrammarParser.ForExpressionContext ctx) {
        String forExpressionTrad = "";
        forExpressionTrad  +=   visitAssignmentExpression(ctx.assignmentExpression(0));
        if (ctx.assignmentExpression().size() > 1){
            for (int i = 1; i < ctx.assignmentExpression().size(); i++) {
                forExpressionTrad +=  visitAssignmentExpression(ctx.assignmentExpression(i));
            }
        }
        return (T) forExpressionTrad;
    }

    @Override
    public T visitJumpStatement (CGrammarParser.JumpStatementContext ctx) {
        String compilationUnitTrad = "";
        if (ctx.Identifier() != null) {
            compilationUnitTrad += "goto " + ctx.Identifier().getText();
        }  else if (ctx.unaryExpression() != null) {
            compilationUnitTrad += "goto " +  visitUnaryExpression(ctx.unaryExpression());
        } else if (ctx.getText().contains("continue") ) {
            compilationUnitTrad += "continue";
        } else if (ctx.getText().contains("break") ) {
            compilationUnitTrad += "break";
        }  else if (ctx.getText().contains("return") ) {
            compilationUnitTrad += "return ";
            if (ctx.expression() != null){
                compilationUnitTrad +=  visitExpression(ctx.expression());
            }
        }
        compilationUnitTrad += ";\n";
        return  (T) compilationUnitTrad;
    }

    @Override
    public T visitCompilationUnit(CGrammarParser.CompilationUnitContext ctx) {
        String compilationUnitTrad = "";
        if (ctx.translationUnit() != null) {
            compilationUnitTrad +=  visitTranslationUnit(ctx.translationUnit());
        }
        System.out.print(compilationUnitTrad);

        return (T) compilationUnitTrad;
    }

    @Override
    public T visitTranslationUnit(CGrammarParser.TranslationUnitContext ctx) {
        String translationUnitTrad = "";
        if (ctx.IncludeDirective() != null){
            for (int i= 0; i < ctx.IncludeDirective().size(); i++){
                translationUnitTrad += ctx.IncludeDirective(i).getText();
            }
            translationUnitTrad += "\n";
        }
        for (int i = 0; i < ctx.externalDeclaration().size(); i++) {
            translationUnitTrad +=  visitExternalDeclaration(ctx.externalDeclaration(i));
        }
        return (T) translationUnitTrad;
    }

    @Override
    public T visitExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx) {
        String externalDeclarationTrad = "";
        if (ctx.functionDefinition() != null){
            externalDeclarationTrad +=  visitFunctionDefinition(ctx.functionDefinition());
        } else if (ctx.declaration() != null){
            externalDeclarationTrad +=  visitDeclaration(ctx.declaration());
        } else {
            externalDeclarationTrad += ";\n";
        }
        return (T) externalDeclarationTrad;
    }

    @Override
    public T visitFunctionDefinition(CGrammarParser.FunctionDefinitionContext ctx) {
        String functionDefinitionTrad = "";
        if (ctx.declarationSpecifiers() != null) {
            functionDefinitionTrad +=  visitDeclarationSpecifiers(ctx.declarationSpecifiers());
        }
        functionDefinitionTrad +=  visitDeclarator(ctx.declarator());
        if (ctx.declarationList() != null) {
            functionDefinitionTrad +=  visitDeclarationList(ctx.declarationList());
        }
        functionDefinitionTrad +=  visitCompoundStatement(ctx.compoundStatement());
        return (T) functionDefinitionTrad;
    }

    @Override
    public T visitDeclarationList(CGrammarParser.DeclarationListContext ctx) {
        String declarationTrad = "";
        for (int i = 0; i < ctx.declaration().size(); i++) {
            declarationTrad +=  visitDeclaration(ctx.declaration(i));
        }
        return (T) declarationTrad;
    }

}