class VoidFunctionExpr extends FunctionExpr implements TI {
    public VoidFunctionExpr(String i) {
        super(i);
    }

    public String toString(int t) {
        return (id + "()");
    }

    public String typeCheck() throws Exception {
        return "";
    }
}
