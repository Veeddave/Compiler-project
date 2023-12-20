class TernaryExpr extends Expr implements TI {
    Expr condition;
    Expr whenTrue;
    Expr whenFalse;

    public TernaryExpr(Expr e1, Expr e2, Expr e3) {
        condition = e1;
        whenTrue = e2;
        whenFalse = e3;
    }

    public String toString(int t)
    {
        return ("(" + condition.toString(t) + " ? "  + whenTrue.toString(t) + " : " + whenFalse.toString(t) + ")");
    }

    String typeCheck() throws Exception {
        condition.typeCheck();
        whenFalse.typeCheck();
        whenTrue.typeCheck();
        return "";
    }
}
