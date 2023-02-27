
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class TestPrefija {
    public static void main(String[] args) {
        try {
            String expresion = "(* 2 + 4.2 2 )";
            Double resultado = 0.0;
            ANTLRInputStream input = new ANTLRInputStream(expresion);
            PrefLexer lexer = new PrefLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PrefParser parser = new PrefParser(tokens);
            ParseTree tree = parser.expresion(); // valida primero que esté bien sintácticamente
            VsitorPrefijo p = new VsitorPrefijo();
           // System.out.println(tree.getText());
            expresion=expresion.replaceAll(" ","");
            //System.out.println(expresion);
            if(tree.getText().equals(expresion.replaceAll(" +"," "))){
                resultado = p.visit(tree);
                System.out.println("Resultado: " + resultado);
            }else{
                System.out.println("Error en la expresion");
            }
            
        } catch (Exception e) {
            System.out.println("Error en la expresion");
        }

    }
}
