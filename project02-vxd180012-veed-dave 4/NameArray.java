class NameArray extends Name implements TI {
    Expr expr;

    public NameArray(String i, Expr e) {
        super(i);
        expr = e;
    }

    public String toString(int t) {
        return(id + "[" + expr.toString(t) + "]");
    }
}
