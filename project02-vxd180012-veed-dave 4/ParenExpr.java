public class ParenExpr extends Expr implements TI {
    Expr expr;

    public ParenExpr(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return("(" + expr.toString(t) + ")");
    }

    String typeCheck() throws Exception {
        return expr.typeCheck();
    }
}
