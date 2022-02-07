import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;


public class ExpVisitor<T> extends ExpresionBaseVisitor<T>{

    String finalResult = "";
    ArrayList<HashMap<String, String>> vars = new ArrayList<>();

    public ExpVisitor(ArrayList<HashMap<String, String>> vars) {
        this.vars = vars;
    }

    String getTipoVar(String var){
        for(int i = vars.size()-1; i >= 0; i--){
            for(String varComp : vars.get(i).keySet()){
                if(varComp.equals(var)){
                    return vars.get(i).get(varComp);
                }
            }
        }
        return null;
    }

    public String getFinalResult(){
        return finalResult;
    }

    public int countChar(String str, char c){
        int count = 0;

        for(int i=0; i < str.length(); i++)
        {    if(str.charAt(i) == c)
            count++;
        }

        return count;
    }

    @Override
    public T visitExp1(ExpresionParser.Exp1Context ctx) {
        if (ctx.exp2().size() == 1){
            return  null;
        } else {
            String result1 = "int";
            for (int i = 0; i < ctx.exp2().size(); i++){
                String temp = (String) visitExp2(ctx.exp2(i));
                if (temp == null){
                    finalResult = null;
                    return  null;
                } else if (temp.equals("bool")){
                    result1 = "bool";
                } else if (temp.equals("float") && !result1.equals("bool")){
                    result1 = "float";
                } else if (temp.equals("long") && result1.equals("int")){
                    result1 = "long";
                }
            }
            String result2 = "int";
            for (int i = 0; i < ctx.op().size(); i++){
                String temp = (String) visitOp(ctx.op(i));
                if (temp == null){
                    finalResult = null;
                    return  null;
                } else if (temp.equals("bool")){
                    result2 = "bool";
                } else if (temp.equals("float") && result2.equals("int")){
                    result2 = "float";
                }
            }


            if (result1.equals("bool") || result2.equals("bool")){
                finalResult = "bool";
                return (T) "bool";
            } else if (result1.equals("float") || result2.equals("float")){
                finalResult = "float";
                return (T) "float";
            } else if (result1.equals("long") || result2.equals("long")) {
                finalResult = "long";
                return (T) "long";
            } else {
                finalResult = "int";
                return (T) "int";
            }
        }
    }

    @Override
    public T visitExp2(ExpresionParser.Exp2Context ctx) {
        if (ctx.TYPE() != null){
            String result = ctx.TYPE().getText();
            if (result.equals("char") || result.equals("short") || result.equals("int")
                    || result.equals("signed") || result.equals("unsigned")){
                return (T) "int";
            }  else if (result.equals("long")){
                return (T) "long";
            } else if ( result.equals("float") || result.equals("double")){
                return (T) "float";
            } else if (result.equals("_Bool")){
                return (T) "bool";
            } else {
                return  null;
            }

        } else if (ctx.TOKEN_CHAR() != null){
            return (T)"int";
        } else if (ctx.ID() != null){
            // chequear si exite en la tabla
            String result = getTipoVar(ctx.ID().getText().replace("&", ""));
            //System.out.println("Resultado de " + ctx.ID().getText() + " :" + result);
            if(result == null){
                result = "int";
            }

            if (result.contains("char") || result.contains("short") || result.contains("int")
                    || result.equals("signed") || result.equals("unsigned")){
                if (ctx.arreglo() == null) {return (T) "int";}
                else {return  null;}
            }  else if (result.contains("long")){
                if (ctx.arreglo() == null) {return (T) "long";}
                else {return  null;}
            } else if ( result.contains("float") || result.contains("double")){
                if (ctx.arreglo() == null) {return (T) "float";}
                else {return  null;}
            } else if (result.contains("_Bool")){
                if (ctx.arreglo() == null) {return (T) "bool";}
                else {return  null;}
            } else if (result.contains("char") || result.contains("short") || result.contains("int")
                    || result.contains("signed") || result.contains("unsigned")){
                if (ctx.arreglo() != null){
                    int num = (Integer) visitArreglo(ctx.arreglo());
                    if (countChar(result,'*')==num){
                        return (T) "int";
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            }  else if (result.contains("long")){
                if (ctx.arreglo() != null){
                    int num = (Integer) visitArreglo(ctx.arreglo());
                    if (countChar(result,'*')==num){
                        return (T) "long";
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else if ( result.contains("float") || result.contains("double")){
                if (ctx.arreglo() != null){
                    int num = (Integer) visitArreglo(ctx.arreglo());
                    if (countChar(result,'*')==num){
                        return (T) "float";
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else if (result.contains("_Bool")){
                if (ctx.arreglo() != null){
                    int num = (Integer) visitArreglo(ctx.arreglo());
                    if (countChar(result,'*')==num){
                        return (T) "bool";
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }

            } else if (ctx.TOKEN_CADENA() != null){
            return null;
        } else if (ctx.TOKEN_REAL() != null){
            return  (T) "float";
        } else if (ctx.TOKEN_ENTERO() != null){
            int number = Integer.parseInt(ctx.TOKEN_ENTERO().getText());
            if (number >  -2147483648 && number < 2147483647){
                return  (T) "int";
            } else{
                return  (T) "long";
            }
        } else {
            return visitExp1(ctx.exp1());
        }
    }

    @Override
    public T visitOp(ExpresionParser.OpContext ctx) {
        if (ctx.TILDE() != null){
            return  null;
        } else if (ctx.OP_REL() != null){
            return (T) "bool";
        } else if (ctx.OP_DIV() != null){
            return (T) "float";
        } else  {
            return (T) "int";
        }
    }


    @Override
    public T visitArreglo(ExpresionParser.ArregloContext ctx) {
        return (T) (Integer)ctx.exp1().size();
    }
}
