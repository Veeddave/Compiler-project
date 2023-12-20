class IfBase extends Token implements TI {
    Expr expr;

    public IfBase(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return ("if (" + expr.toString(t) + ")\n");
    }

    String typeCheck() throws Exception {
        expr.typeCheck();

        return "";
    }
}
