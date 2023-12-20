class Args extends Token implements TI {
    Expr expr;
    Args args;

    public Args(Expr e, Args a) {
        expr = e;
        args = a;
    }

    public Args(Expr e) {
        expr = e;
        args = null;
    }

    public String toString(int t) {
        return (expr.toString(t) + (args != null ? ", " + args.toString(t) : ""));
    }

    public String typeCheck() throws Exception {
        expr.typeCheck();
        args.typeCheck();

        return "";
    }
}