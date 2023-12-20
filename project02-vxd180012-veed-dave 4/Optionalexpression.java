class Optionalexpression extends Token implements TI {
    Expr expr;

    public Optionalexpression(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return ( " = " + expr.toString(t));
    }

    public String typeCheck() throws Exception {
        return expr.typeCheck();
    }
}
