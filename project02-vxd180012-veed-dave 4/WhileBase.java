class WhileBase extends Token implements TI {
    Expr expr;

    public WhileBase(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return (getTabs(t) + "while(" + expr.toString(t) + ")\n");
    }

    String typeCheck() throws Exception {
        return expr.typeCheck();
    }
}
