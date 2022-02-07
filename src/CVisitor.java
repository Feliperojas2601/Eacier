import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CVisitor<T> extends CGrammarBaseVisitor<T> {

    ArrayList<HashSet<String>> exprComunes = new ArrayList<>();
    ArrayList<ArrayList<String>> expr = new ArrayList<>();

    ArrayList<HashMap<String, String>> vars = new ArrayList<>();
    ArrayList<ArrayList<String>> varsTemp = new ArrayList<>();

    ArrayList<ArrayList<String>> funciones = new ArrayList<ArrayList<String>>();

    String texto = "";

    String tipoTh = "";
    String casteoTh = "";
    String unaryOperatorTh = "";
    int contexto = -1;
    boolean traduccion = false;
    int numSpace = 0;

    String getRaiz(String arbol){
        String raiz = "";
        if(!arbol.equals("{}") && !arbol.equals("{") && !arbol.equals("}") && !arbol.equals("")) {
            try {

                ArbolLexer lexer;
                lexer = new ArbolLexer(CharStreams.fromString(arbol));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ArbolParser parser = new ArbolParser(tokens);
                ParseTree tree = parser.arbol();
                ArbolVisit<Object> loader = new ArbolVisit<>();
                loader.visit(tree);

                raiz = loader.getRaiz();

            } catch (Exception e) {

            }
        }

        return raiz;
    }

    ArrayList<String> getNiveles(String arbol){
        ArrayList<String> niveles = new ArrayList<>();
        if(!arbol.equals("{}") && !arbol.equals("{") && !arbol.equals("}") && !arbol.equals("")) {
            try {
                ArbolLexer lexer;
                lexer = new ArbolLexer(CharStreams.fromString(arbol));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ArbolParser parser = new ArbolParser(tokens);
                ParseTree tree = parser.arbol();
                ArbolVisit<Object> loader = new ArbolVisit<>();
                loader.visit(tree);

                niveles = loader.getNiveles();

            } catch (Exception e) {

            }
        }

        return niveles;
    }

    HashSet<ArrayList<String>> comparar(HashSet<ArrayList<String>> matchs, int contex, ArrayList<String> niveles, ArrayList<String> niveles2){
        for(int i = 0; i < niveles.size(); i++){
            String nivel = niveles.get(i);
            for(int j = 0; j < niveles2.size(); j++){
                String nivel2 = niveles2.get(j);
                if(nivel.contains(nivel2.substring(1, nivel2.length()-1))){
                    matchs.removeIf(arbol -> nivel2.contains(arbol.get(1).substring(1, arbol.get(1).length()-1)));

                    ArrayList<String> newMatch = new ArrayList<>();
                    newMatch.add(contex + "");
                    newMatch.add(nivel2);
                    matchs.add(newMatch);

                }else if (nivel2.contains(nivel.substring(1, nivel.length()-1))) {
                    matchs.removeIf(arbol -> nivel.contains(arbol.get(1).substring(1, arbol.get(1).length()-1)));

                    ArrayList<String> newMatch = new ArrayList<>();
                    newMatch.add(contex + "");
                    newMatch.add(nivel);
                    matchs.add(newMatch);
                }
            }
        }

        return matchs;
    }

    void buscarCoincidencias(){
        if(!traduccion) {
            ArrayList<String> exprActuales = expr.get(contexto);

            for (int i = 1; i < exprActuales.size(); i++) {
                String arbolActual = exprActuales.get(i);
                ArrayList<String> niveles = getNiveles(arbolActual);
                HashSet<ArrayList<String>> matchs = new HashSet<>();

                int k = contexto;
                while(k != -1){
                    for(int j = 1; j < expr.get(k).size(); j++) {
                        ArrayList<String> niveles2 = getNiveles(expr.get(k).get(j));
                        if (k != contexto || j != i) {
                            matchs = comparar(matchs, k, niveles, niveles2);
                        }
                    }
                    k = Integer.parseInt(expr.get(k).get(0));
                }

                for(ArrayList<String> match: matchs){
                    boolean insertar = true;
                    for (String exprComun : exprComunes.get(Integer.parseInt(match.get(0)))) {
                        if(match.get(1).contains(exprComun.substring(1, exprComun.length()-1))){
                            insertar = false;
                        }
                    }
                    if(insertar){
                        exprComunes.get(Integer.parseInt(match.get(0))).add(match.get(1));
                    }
                }
            }
        }
    }

    void newExpr(String set){
        if(!traduccion){
            expr.get(contexto).add(set);
        }
    }

    void writeExpr(String set){
        if(!traduccion){
            int size = expr.get(contexto).size();
            String exprAct = expr.get(contexto).get(size-1);
            expr.get(contexto).set(size-1, exprAct + set);
        }
        return;
    }

    void entrarContex(){
        if(!traduccion){
            exprComunes.add(new HashSet<>());
        }
        expr.add(new ArrayList<>());
        expr.get(expr.size()-1).add(contexto + "");
        contexto = expr.size() - 1;
        vars.add(new HashMap<>());
    }

    void salirContex(){
        if(!traduccion){
            buscarCoincidencias();
        }
        contexto = Integer.parseInt(expr.get(contexto).get(0));
        vars.remove(vars.size()-1);
    }

    String buscarVarTemp(String raiz){
        String nomVar = "";

        boolean existe = false;
        for(int i = 0; i < varsTemp.size(); i++){
            if(varsTemp.get(i).get(1).equals(raiz)){
                nomVar = varsTemp.get(i).get(0);
                existe = existe || true;
            }
        }

        if(!existe){
            ArrayList<String> numVar = new ArrayList<>();
            nomVar = "temp_" + varsTemp.size();
            numVar.add(nomVar);
            numVar.add(raiz);
            varsTemp.add(numVar);
        }
        return nomVar;
    }

    String tipoDatoExpr(String expresion){
        expresion = expresion.replaceAll("[¿?()]", "");
        String tipoDatoExpr = "";

        //try{

            ExpresionLexer lexer = new ExpresionLexer(CharStreams.fromString(expresion));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpresionParser parser = new ExpresionParser(tokens);
            ParseTree tree = parser.exp1();
            ExpVisitor<Object> loader = new ExpVisitor<Object>(vars);
            loader.visit(tree);

            tipoDatoExpr = loader.getFinalResult();

        //} catch (Exception e){
            //System.out.println(e);
        //}

        return tipoDatoExpr;
    }

    String editarLinea(String linea){

        /*
        Matcher m = Pattern.compile("\\(.+\\)").matcher(linea);
        while(m.find()){
            String exprMul = m.group();
            String exprMulOp = "";
            try{
                ExpresionMulLexer lexer = new ExpresionLexer(CharStreams.fromString(linea));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                ExpresionMulParser parser = new ExpresionMulParser(tokens);
                ParseTree tree = parser.exp1();
                ExpMulVisitor<Object> loader = new ExpMulVisitor<Object>();
                loader.visit(tree);

                exprMulOp = loader.getChange();

            } catch (Exception e){
                System.out.println(e);
            }
            linea.replace(exprMul, exprMulOp);
        }
        */
        return linea;
    }

    String reemplazo(String linea){
        //System.out.print("LINEA: " + linea + "\n");
        int i = contexto;

        while(i != -1){
            for (String exprComun : exprComunes.get(i)) {
                String raiz = getRaiz(exprComun);
                linea = linea.replace("(", "").replace(")", "");
                //System.out.print("RAIZ: " + raiz+ "\n");
                if (linea.contains(raiz)) {
                    //System.out.print("MATCHHH\n");
                    int tam1 = varsTemp.size();
                    String nomVar = buscarVarTemp(raiz);
                    linea = linea.replace(raiz, nomVar);
                    int tam2 = varsTemp.size();
                    if (tam1 != tam2) {
                        String varTemp = varsTemp.get(varsTemp.size() - 1).get(1);
                        varTemp = editarLinea(varTemp);
                        linea = tipoDatoExpr(varTemp) + " " + nomVar + " = " + varTemp + ";\n"
                                + printSpaces() + linea;
                    }
                }
            }
            i = Integer.parseInt(expr.get(i).get(0));
        }

        linea = editarLinea(linea);
        return linea;
    }

    boolean IsPowerOfTwo(long x){
        return (x != 0) && ((x & (x-1)) == 0);
    }

    void printExpr(){
        System.out.print("EXPRESIONES\n");
        for(int i = 0; i < expr.size(); i++){
            for(int j = 0; j < expr.get(i).size(); j++){
                System.out.print(expr.get(i).get(j) + " | ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    void printExprComunes(){
        System.out.print("EXPRESIONES COMUNES\n");
        for(int i = 0; i < exprComunes.size(); i++){
            for(String e : exprComunes.get(i)){
                System.out.print(e + " | ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    void printVars(){
        for(int i = 0; i < vars.size(); i++){
            for(String var: vars.get(i).keySet()){
                System.out.print("var: " + var + "  tipo: " + vars.get(i).get(var) + " | ");
            }
            System.out.print("\n");
        }
    }

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
            writeExpr("nodo{" + unaryOperatorTh + ctx.Identifier().getText() + "}");
        } else if (ctx.Constant() != null) {
            primaryExpressionTrad += ctx.Constant().getText();
            writeExpr("nodo{" + ctx.Constant().getText() + "}");
        } else if (ctx.StringLiteral().size() != 0) {
            for (int i = 0; i < ctx.StringLiteral().size(); i++) {
                primaryExpressionTrad += ctx.StringLiteral(i).getText();
                writeExpr("nodo{" + ctx.StringLiteral(i).getText() + "}");
            }
        } else if (ctx.expression() != null) {
            primaryExpressionTrad += "(" + visitExpression(ctx.expression()) + ")";
        } else if (ctx.genericSelection() != null) {
            primaryExpressionTrad += visitGenericSelection(ctx.genericSelection());
        } else if (ctx.getText().length() >= 16 && ctx.getText().substring(0, 16) == "__builtin_va_arg" ) {
            primaryExpressionTrad += "__builtin_va_arg" + "(";
            primaryExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
            primaryExpressionTrad += ", ";
            primaryExpressionTrad += visitTypeName(ctx.typeName());
            primaryExpressionTrad += ")";
        } else if (ctx.getText().length() >= 18 && ctx.getText().substring(0, 18) == "__builtin_offsetof") {
            primaryExpressionTrad += "__builtin_offsetof" + "(";
            primaryExpressionTrad += visitTypeName(ctx.typeName());
            primaryExpressionTrad += ", ";
            primaryExpressionTrad += visitUnaryExpression(ctx.unaryExpression());
            primaryExpressionTrad += ")";
        } else {
            if (ctx.getText().length() >= 13 && ctx.getText().substring(0, 13).equals("_extension_")) {
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
            if (ctx.getText().length() >= 13 && ctx.getText().substring(0, 13).equals("_extension_")) {
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
            auxpostfixExpressionTrad += "(¿";
            if (ctx.argumentExpressionList() != null) {
                auxpostfixExpressionTrad += visitArgumentExpressionList(ctx.argumentExpressionList());
            }
            auxpostfixExpressionTrad += "?)";
        } else {
            if (ctx.getText().charAt(0) == '.') {
                auxpostfixExpressionTrad += ".";
                auxpostfixExpressionTrad += ctx.Identifier().getText();
            } else if (ctx.getText().length() >= 2 && ctx.getText().substring(0, 2).equals("->")) {
                auxpostfixExpressionTrad += "->";
                auxpostfixExpressionTrad += ctx.Identifier().getText();
            } else if (ctx.getText().length() >= 2 && ctx.getText().substring(0, 2).equals("++")) {
                auxpostfixExpressionTrad += "++";
            } else if (ctx.getText().length() >= 2 && ctx.getText().substring(0, 2).equals("--")) {
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
            unaryOperatorTh = (String) visitUnaryOperator(ctx.unaryOperator());
            unaryExpressionTrad += visitCastExpression(ctx.castExpression());
            unaryOperatorTh = "";
        } else {
            if (ctx.getText().length() >= 6 && ctx.getText().substring(0, 6).equals("sizeof")) {
                unaryExpressionTrad += "sizeof" + "(";
                unaryExpressionTrad += visitTypeName(ctx.typeName());
                unaryExpressionTrad += ")";
            } else if (ctx.getText().length() >= 8 && ctx.getText().substring(0, 8).equals("_Alignof")) {
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
            if (ctx.getText().length() >= 11 && ctx.getText().substring(0, 11).equals("_extension_")) {
                castExpressionTrad += "_extension_";
            }
            castExpressionTrad += "(";
            casteoTh = "¿" + (String) visitTypeName(ctx.typeName()) + "?";
            if(casteoTh == null){
                casteoTh = "";
            }
            castExpressionTrad += casteoTh;

            castExpressionTrad += ")";
            castExpressionTrad += visitCastExpression(ctx.castExpression());
            casteoTh = "";
        }

        return (T) castExpressionTrad;
    }

    @Override
    public T visitMultiplicativeExpression(CGrammarParser.MultiplicativeExpressionContext ctx) {
        String multiplicativeExpressionTrad = "";

        if(!traduccion) {
            if(ctx.castExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitMultiplicativeExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.castExpression().size() > 1) {
            writeExpr("{");
            multiplicativeExpressionTrad += "¿";
        }
        multiplicativeExpressionTrad += visitCastExpression(ctx.castExpression(0));
        if (ctx.castExpression().size() > 1) {
            for (int i = 1; i < ctx.castExpression().size(); i++) {
                writeExpr("nodo{" + ctx.multiplicativeOperator(i-1).getText() + "}");
                multiplicativeExpressionTrad += visitMultiplicativeOperator(ctx.multiplicativeOperator(i - 1));
                multiplicativeExpressionTrad += visitCastExpression(ctx.castExpression(i));
            }
            multiplicativeExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) multiplicativeExpressionTrad;
    }

    @Override
    public T visitMultiplicativeOperator(CGrammarParser.MultiplicativeOperatorContext ctx) {
        String multiplicativeOperatorTrad = "";
        multiplicativeOperatorTrad += ctx.getText();

        return (T) multiplicativeOperatorTrad;
    }

    @Override
    public T visitAdditiveExpression(CGrammarParser.AdditiveExpressionContext ctx) {
        String additiveExpressionTrad = "";

        if(!traduccion) {
            if(ctx.multiplicativeExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitAdditiveExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.multiplicativeExpression().size() > 1) {
            writeExpr("{");
            additiveExpressionTrad += "¿";
        }
        additiveExpressionTrad += visitMultiplicativeExpression(ctx.multiplicativeExpression(0));
        if (ctx.multiplicativeExpression().size() > 1) {
            for (int i = 1; i < ctx.multiplicativeExpression().size(); i++) {
                writeExpr("nodo{" + ctx.additiveOperator(i-1).getText() + "}");
                additiveExpressionTrad += visitAdditiveOperator(ctx.additiveOperator(i - 1));
                additiveExpressionTrad += visitMultiplicativeExpression(ctx.multiplicativeExpression(i));
            }
            additiveExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) additiveExpressionTrad;
    }

    @Override
    public T visitAdditiveOperator(CGrammarParser.AdditiveOperatorContext ctx) {
        String additiveOperatorTrad = "";
        additiveOperatorTrad += ctx.getText();

        return (T) additiveOperatorTrad;
    }

    @Override
    public T visitShiftExpression(CGrammarParser.ShiftExpressionContext ctx) {
        String shiftExpressionTrad = "";

        if(!traduccion) {
            if(ctx.additiveExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitShiftExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);;
            }
        }

        if (ctx.additiveExpression().size() > 1) {
            writeExpr("{");
            shiftExpressionTrad += "¿";
        }
        shiftExpressionTrad += visitAdditiveExpression(ctx.additiveExpression(0));
        if (ctx.additiveExpression().size() > 1) {
            for (int i = 1; i < ctx.additiveExpression().size(); i++) {
                writeExpr("nodo{" + ctx.shiftOperator(i-1).getText() + "}");
                shiftExpressionTrad += visitShiftOperator(ctx.shiftOperator(i - 1));
                shiftExpressionTrad += visitAdditiveExpression(ctx.additiveExpression(i));
            }
            shiftExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) shiftExpressionTrad;
    }

    @Override
    public T visitShiftOperator(CGrammarParser.ShiftOperatorContext ctx) {
        String shiftOperatorTrad = "";
        shiftOperatorTrad += ctx.getText();

        return (T) shiftOperatorTrad;
    }

    @Override
    public T visitRelationalExpression(CGrammarParser.RelationalExpressionContext ctx) {
        String relationalExpressionTrad = "";

        if(!traduccion) {
            if(ctx.shiftExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitRelationalExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.shiftExpression().size() > 1) {
            writeExpr("{");
            relationalExpressionTrad += "¿";
        }
        relationalExpressionTrad += visitShiftExpression(ctx.shiftExpression(0));
        if (ctx.shiftExpression().size() > 1) {
            for (int i = 1; i < ctx.shiftExpression().size(); i++) {
                writeExpr("nodo{" + ctx.relationalOperator(i-1).getText() + "}");
                relationalExpressionTrad += visitRelationalOperator(ctx.relationalOperator(i - 1));
                relationalExpressionTrad += visitShiftExpression(ctx.shiftExpression(i));
            }
            relationalExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) relationalExpressionTrad;
    }

    @Override
    public T visitRelationalOperator(CGrammarParser.RelationalOperatorContext ctx) {
        String relationalOperatorTrad = "";
        relationalOperatorTrad += ctx.getText();

        return (T) relationalOperatorTrad;
    }

    @Override
    public T visitEqualityExpression(CGrammarParser.EqualityExpressionContext ctx) {
        String equalityExpressionTrad = "";

        if(!traduccion) {
            if(ctx.relationalExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitEqualityExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.relationalExpression().size() > 1) {
            writeExpr("{");
            equalityExpressionTrad += "¿";
        }
        equalityExpressionTrad += visitRelationalExpression(ctx.relationalExpression(0));
        if (ctx.relationalExpression().size() > 1) {
            for (int i = 1; i < ctx.relationalExpression().size(); i++) {
                writeExpr("nodo{" + ctx.equilatyOperator(i-1).getText() + "}");
                equalityExpressionTrad += visitEquilatyOperator(ctx.equilatyOperator(i - 1));
                equalityExpressionTrad += visitRelationalExpression(ctx.relationalExpression(i));
            }
            equalityExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) equalityExpressionTrad;
    }

    @Override
    public T visitEquilatyOperator(CGrammarParser.EquilatyOperatorContext ctx) {
        String equilatyOperatorTrad = "";
        equilatyOperatorTrad += ctx.getText();

        return (T) equilatyOperatorTrad;
    }

    @Override
    public T visitAndExpression(CGrammarParser.AndExpressionContext ctx) {
        String andExpressionTrad = "";

        if(!traduccion) {
            if(ctx.equalityExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitAndExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.equalityExpression().size() > 1) {
            writeExpr("{");
            andExpressionTrad += "¿";
        }
        andExpressionTrad += visitEqualityExpression(ctx.equalityExpression(0));
        if (ctx.equalityExpression().size() > 1) {
            for (int i = 1; i < ctx.equalityExpression().size(); i++) {
                writeExpr("nodo{&}");
                andExpressionTrad += "&";
                andExpressionTrad += visitEqualityExpression(ctx.equalityExpression(i));
            }
            andExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) andExpressionTrad;
    }

    @Override
    public T visitExclusiveOrExpression(CGrammarParser.ExclusiveOrExpressionContext ctx) {
        String exclusiveOrExpressionTrad = "";

        if(!traduccion) {
            if(ctx.andExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitExclusiveOrExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.andExpression().size() > 1) {
            writeExpr("{");
            exclusiveOrExpressionTrad += "¿";
        }
        exclusiveOrExpressionTrad += visitAndExpression(ctx.andExpression(0));
        if (ctx.andExpression().size() > 1) {
            for (int i = 1; i < ctx.andExpression().size(); i++) {
                writeExpr("nodo{^}");
                exclusiveOrExpressionTrad += "^";
                exclusiveOrExpressionTrad += visitAndExpression(ctx.andExpression(i));
            }
            exclusiveOrExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) exclusiveOrExpressionTrad;
    }

    @Override
    public T visitInclusiveOrExpression(CGrammarParser.InclusiveOrExpressionContext ctx) {
        String inclusiveOrExpressionTrad = "";

        if(!traduccion) {
            if(ctx.exclusiveOrExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitInclusiveOrExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.exclusiveOrExpression().size() > 1) {
            writeExpr("{");
            inclusiveOrExpressionTrad += "¿";
        }
        inclusiveOrExpressionTrad += visitExclusiveOrExpression(ctx.exclusiveOrExpression(0));
        if (ctx.exclusiveOrExpression().size() > 1) {
            for (int i = 1; i < ctx.exclusiveOrExpression().size(); i++) {
                writeExpr("nodo{|}");
                inclusiveOrExpressionTrad += "|";
                inclusiveOrExpressionTrad += visitExclusiveOrExpression(ctx.exclusiveOrExpression(i));
            }
            inclusiveOrExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) inclusiveOrExpressionTrad;
    }

    @Override
    public T visitLogicalAndExpression(CGrammarParser.LogicalAndExpressionContext ctx) {
        String logicalAndExpressionTrad = "";

        if(!traduccion) {
            if(ctx.inclusiveOrExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitLogicalAndExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.inclusiveOrExpression().size() > 1) {
            writeExpr("{");
            logicalAndExpressionTrad += "¿";
        }
        logicalAndExpressionTrad += visitInclusiveOrExpression(ctx.inclusiveOrExpression(0));
        if (ctx.inclusiveOrExpression().size() > 1) {
            for (int i = 1; i < ctx.inclusiveOrExpression().size(); i++) {
                writeExpr("nodo{&&}");
                logicalAndExpressionTrad += "&&";
                logicalAndExpressionTrad += visitInclusiveOrExpression(ctx.inclusiveOrExpression(i));
            }
            logicalAndExpressionTrad += "?";
            writeExpr("}");
        }

        return (T) logicalAndExpressionTrad;
    }

    @Override
    public T visitLogicalOrExpression(CGrammarParser.LogicalOrExpressionContext ctx) {
        String logicalOrExpressionTrad = "";

        if(!traduccion){
            if(ctx.logicalAndExpression().size() > 1){
                String expr = "nodo{" + casteoTh;
                traduccion = true;
                expr += visitLogicalOrExpression(ctx);
                traduccion = false;
                expr += "}";
                writeExpr(expr);
            }
        }

        if (ctx.logicalAndExpression().size() > 1) {
            writeExpr("{");
            logicalOrExpressionTrad += "¿";
        }
        logicalOrExpressionTrad += visitLogicalAndExpression(ctx.logicalAndExpression(0));
        if (ctx.logicalAndExpression().size() > 1) {
            for (int i = 1; i < ctx.logicalAndExpression().size(); i++) {
                writeExpr("nodo{||}");
                logicalOrExpressionTrad += "||";
                logicalOrExpressionTrad += visitLogicalAndExpression(ctx.logicalAndExpression(i));
            }
            logicalOrExpressionTrad += "?";
            writeExpr("}");
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
        } else if (ctx.Identifier() != null) {
            conditionalExpressionTrad += ctx.Identifier().getText();
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
        String linea = "";

        declarationTrad += printSpaces();
        if (ctx.declarationSpecifiers() != null) {
            linea += visitDeclarationSpecifiers(ctx.declarationSpecifiers());
            if (ctx.initDeclaratorList() != null) {
                linea += visitInitDeclaratorList(ctx.initDeclaratorList());
            }
            linea += ";\n";
        } else if (ctx.staticAssertDeclaration() != null) {
            linea += visitStaticAssertDeclaration(ctx.staticAssertDeclaration());
        }
        linea = reemplazo(linea).replace("¿", "(").replace("?", ")");
        Matcher m = Pattern.compile("\\(temp_\\d\\)").matcher(linea);
        while(m.find()){
            String var = m.group();
            linea = linea.replace(var, var.substring(1, var.length()-1));
        }
        declarationTrad += linea;


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

        if(ctx.typedefName() != null){
            typeSpecifierTrad += visitTypedefName(ctx.typedefName());
        }else{
            typeSpecifierTrad += ctx.getText();
            tipoTh = typeSpecifierTrad;
        }

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
            vars.get(vars.size()-1).put(ctx.Identifier().getText(), tipoTh);
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
        vars.get(vars.size()-1).put(ctx.Identifier().getText(), tipoTh);
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
            statementTrad += printSpaces() + visitLabeledStatement(ctx.labeledStatement());
        } else if (ctx.compoundStatement() != null){
            statementTrad += printSpaces() + visitCompoundStatement(ctx.compoundStatement());
        } else if (ctx.expressionStatement() != null){
            statementTrad += printSpaces();
            String linea = (String) visitExpressionStatement(ctx.expressionStatement());
            statementTrad += reemplazo(linea).replace("¿", "(").replace("?", ")");
        } else if (ctx.selectionStatement() != null){
            statementTrad += printSpaces() + visitSelectionStatement(ctx.selectionStatement());
        } else if (ctx.iterationStatement() != null){
            statementTrad+= printSpaces() + visitIterationStatement(ctx.iterationStatement());
        } else if (ctx.jumpStatement() != null){
            statementTrad += printSpaces() + visitJumpStatement(ctx.jumpStatement());
        }  else {
            statementTrad += printSpaces() + (String)visitAsm(ctx.asm()) +  visitVolatileText(ctx.volatileText()) + "(" ;
            if (ctx.auxStatement() != null){
                statementTrad += visitAuxStatement(ctx.auxStatement());
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
        } else if (ctx.getText().length() >= 4 && ctx.getText().substring(0,4).equals("case")){
            labeledStatementTrad += "case "+  visitConstantExpression(ctx.constantExpression()) + ":\n";
            numSpace++;
            labeledStatementTrad += visitStatement(ctx.statement());
        } else {
            labeledStatementTrad += "default: \n";
            numSpace++;
            labeledStatementTrad += visitStatement(ctx.statement());
        }
        return (T)  labeledStatementTrad;
    }


    @Override
    public T visitCompoundStatement (CGrammarParser.CompoundStatementContext ctx) {
        String compoundStatementTrad = "";
        compoundStatementTrad += "{\n";
        numSpace++;
        if (ctx.blockItemList() != null){
            compoundStatementTrad += visitBlockItemList(ctx.blockItemList());
        }
        numSpace--;
        compoundStatementTrad += printSpaces() + "}\n";
        return (T) compoundStatementTrad;
    }

    @Override
    public T visitBlockItemList (CGrammarParser.BlockItemListContext ctx) {
        String blockItemListTrad = "";

        for (int i = 0; i < ctx.blockItem().size(); i++){
            newExpr("{");
            blockItemListTrad += (String) visitBlockItem(ctx.blockItem(i));
            writeExpr("}");
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

        if (ctx.getText().length() >= 2 && ctx.getText().substring(0,2).equals("if")){
            String linea = "if (¿";

            newExpr("{");
            linea += visitExpression(ctx.expression()) + "?)\n";
            selectionStatementTrad += reemplazo(linea).replace("¿", "(").replace("?", ")");
            writeExpr("}");

            newExpr("");

            entrarContex();
            selectionStatementTrad += visitStatement(ctx.statement(0));
            salirContex();

            if(ctx.statement().size() > 1){
                selectionStatementTrad += printSpaces() + "else\n";
                entrarContex();
                for (int i = 1; i < ctx.statement().size(); i++){
                    selectionStatementTrad += visitStatement(ctx.statement(i));
                }
                salirContex();
            }

        } else {
            newExpr("{");
            selectionStatementTrad += "switch (" + visitExpression(ctx.expression()) + ")";
            writeExpr("}");

            newExpr("");

            entrarContex();
            selectionStatementTrad += visitStatement(ctx.statement(0));
            salirContex();
        }

        return (T) selectionStatementTrad;
    }

    public T visitIterationStatement (CGrammarParser.IterationStatementContext ctx) {
        String iterationStatementTrad = "";

        if (ctx.Do() != null){
            entrarContex();
            iterationStatementTrad += ctx.Do().getText() +  visitStatement(ctx.statement());
            iterationStatementTrad += this.printSpaces() + ctx.While().getText() +" (";
            String expresion = (String) visitExpression(ctx.expression());
            iterationStatementTrad += expresion.replace("¿", "(").replace("?", ")") + ");\n";
            salirContex();
        } else if (ctx.While() != null){
            entrarContex();
            iterationStatementTrad +=  ctx.While().getText() + " (" + visitExpression(ctx.expression()) + ")" + visitStatement(ctx.statement()) ;
            salirContex();
        } else {
            newExpr("{");
            String linea = ctx.For().getText() + " (¿" + visitForCondition(ctx.forCondition()) + "?)";
            iterationStatementTrad += reemplazo(linea).replace("¿", "(").replace("?", ")"); ;
            writeExpr("}");

            newExpr("");

            entrarContex();
            iterationStatementTrad += visitStatement(ctx.statement());
            salirContex();
        }

        return (T) iterationStatementTrad;
    }

    @Override
    public T visitForCondition (CGrammarParser.ForConditionContext ctx) {
        String forConditionTrad = "";
        String linea = "";

        if (ctx.forDeclaration() != null){
            forConditionTrad  +=  visitForDeclaration(ctx.forDeclaration());
        } else {
            forConditionTrad +=  visitExpression(ctx.expression());
        }

        forConditionTrad += "; ";
        if (ctx.forExpression(0) != null){
            forConditionTrad += visitForExpression(ctx.forExpression(0));
        }
        forConditionTrad += "; ";
        if (ctx.forExpression(1) != null){
            forConditionTrad +=  visitForExpression(ctx.forExpression(1));
        }
        forConditionTrad = forConditionTrad.replace("¿", "(").replace("?", ")");;

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
            numSpace--;
        }  else if (ctx.getText().contains("return") ) {
            compilationUnitTrad += "return ";
            if (ctx.expression() != null){
                String linea = (String) visitExpression(ctx.expression());
                linea = reemplazo(linea).replace("¿", "(").replace("?", ")");
                compilationUnitTrad += linea;
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
        texto = compilationUnitTrad;
        //System.out.print(compilationUnitTrad);

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
        if (ctx.ComplexDefine() != null){
            for (int i= 0; i < ctx.ComplexDefine().size(); i++){
                translationUnitTrad += ctx.ComplexDefine(i).getText() + "\n";
            }
            translationUnitTrad += "\n";
        }
        String auxTrad = "";

        for (int i = ctx.externalDeclaration().size()-1; i >= 0; i--) {
            traduccion = false;
            contexto = -1;
            expr.clear();
            vars.clear();
            exprComunes.clear();
            varsTemp.clear();

            entrarContex();
            visitExternalDeclaration(ctx.externalDeclaration(i));
            buscarCoincidencias();

            //printExpr();
            //printExprComunes();

            traduccion = true;
            contexto = -1;
            expr.clear();
            vars.clear();
            varsTemp.clear();

            entrarContex();
            auxTrad = visitExternalDeclaration(ctx.externalDeclaration(i)) + auxTrad;
        }
        translationUnitTrad += auxTrad;

        return (T) translationUnitTrad;
    }

    @Override
    public T visitExternalDeclaration(CGrammarParser.ExternalDeclarationContext ctx) {
        String externalDeclarationTrad = "";
        if (ctx.functionDefinition() != null){
            externalDeclarationTrad += visitFunctionDefinition(ctx.functionDefinition());
        } else if (ctx.declaration() != null){
            externalDeclarationTrad += visitDeclaration(ctx.declaration());
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