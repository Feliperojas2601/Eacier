import java.util.ArrayList;

public class ArbolVisit<T> extends ArbolBaseVisitor<T> {

    ArrayList<String> niveles = new ArrayList<>();
    String raiz = "";

    ArrayList<String> getNiveles(){
        return niveles;
    }

    String getRaiz(){
        return raiz;
    }

    @Override
    public T visitArbol(ArbolParser.ArbolContext ctx) {
        String arbolTrad = "";
        arbolTrad += "{";
        for(int i = 0; i < ctx.raiz().size(); i++){
            arbolTrad += visitRaiz(ctx.raiz(i));
            raiz += ctx.raiz(i).Expresion().getText();
        }
        arbolTrad += "}";

        return (T) arbolTrad;
    }

    @Override
    public T visitRaiz(ArbolParser.RaizContext ctx) {
        String raizTrad = "";
        raizTrad += "nodo" + "{";
        raizTrad += ctx.Expresion().getText();
        raizTrad += "}";
        if(ctx.raiz().size() != 0){
            String nivel = "{";
            for(int i = 0; i < ctx.raiz().size(); i++){
                nivel += visitRaiz(ctx.raiz(i));
            }
            nivel += "}";
            niveles.add(nivel);
            raizTrad += nivel;
        }
        return (T) raizTrad;
    }

}