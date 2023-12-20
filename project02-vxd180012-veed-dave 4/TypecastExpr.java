public class TypecastExpr extends ActionExpr implements TI {
    Type type;
    Expr expr;

    public TypecastExpr(Type t, Expr e) {
        type = t;
        expr = e;
    }

    public String toString(int t)
    {
        return("((" + type.toString(t) + ")" + expr.toString(t) + ")");
    }

    public String typeCheck() throws Exception {
        type.typeCheck();
        expr.typeCheck();
        return "";
    }
}
