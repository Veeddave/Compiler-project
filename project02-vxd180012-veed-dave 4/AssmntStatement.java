public class AssmntStatement extends NonWhileStmt implements TI {
    Name name;
    Expr expr;

    public AssmntStatement(Name n, Expr e) {
        name = n;
        expr = e;
    }

    public String toString(int t) {
        return (getTabs(t) + name.toString(t) + " = " + expr.toString(t) + ";\n");
    }

    String typeCheck() throws Exception {
        name.typeCheck();
        expr.typeCheck();
        return "";
    }

}
