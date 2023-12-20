class ReturnValueStmt extends NonWhileStmt implements TI {

    Expr expr;

    public ReturnValueStmt(Expr e) {
        expr = e;
    }

    public String toString(int t) {
        return (getTabs(t) + "return " + expr.toString(t) + ";\n");
    }

    String typeCheck() throws Exception {
        return expr.typeCheck();
    }
}
