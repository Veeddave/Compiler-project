class ArgFunctionExpr extends FunctionExpr implements TI {
    Args args;

    public ArgFunctionExpr(String i, Args a) {
        super(i);
        args = a;
    }

    public String toString(int t) {
        return(id + "(" + args.toString(t) + ")");
    }
}
