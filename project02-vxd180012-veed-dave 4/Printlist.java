class Printlist extends Token implements TI {
    Expr expr;
    Printlist printlist;

    public Printlist(Expr e) {
        expr = e;
        printlist = null;
    }

    public Printlist(Expr e, Printlist p) {
        expr = e;
        printlist = p;
    }

    public String toString(int t) {
        return(expr.toString(t) + (printlist != null ? ", " + printlist.toString(t) : ""));
    }

    public String typeCheck() throws Exception {
        expr.typeCheck();
        printlist.typeCheck();
        return "";
    }
}
