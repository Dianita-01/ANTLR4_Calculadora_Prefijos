
import java.util.List;

public class VsitorPrefijo extends PrefBaseVisitor<Double>{

    @Override
    public Double visitExpresionVal(PrefParser.ExpresionValContext ctx) {
        return visit(ctx.val());
    }

    @Override
    public Double visitOperaciones(PrefParser.OperacionesContext ctx) {
        String op = ctx.signo().getText();
        List<PrefParser.ExpresionContext> exprs = ctx.expresion();
        Double result = visit(exprs.get(0));
        for (int i = 1; i < exprs.size(); i++) {
            Double operand = visit(exprs.get(i));
            switch (op) {
                case "+":
                    result = result + operand;
                    break;
                case "-":
                    result = result - operand;
                    break;
                case "*":
                    result = result * operand;
                    break;
                case "/":
                    result = result / operand;
                    break;
                case "^":
                    result = Math.pow(result, operand);
                    break;
                default:
                    System.out.println("error");
            }
        }
        return result;
    }

    @Override
    public Double visitParens(PrefParser.ParensContext ctx) {
        return visit(ctx.expresion());
    }

    @Override
    public Double visitSigno(PrefParser.SignoContext ctx) {
        return 0.0;
    }

    @Override
    public Double visitNUMERO(PrefParser.NUMEROContext ctx) {
        return visit(ctx.num());
    }

    @Override
    public Double visitNum(PrefParser.NumContext ctx) {
       // System.out.println(ctx.getText());
        return Double.parseDouble(ctx.getText());
    }

}