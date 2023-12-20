class ArgStatement extends FunctionStatement implements TI {
    Args args;

    public ArgStatement(String i, Args a) {
        super(i);
        args = a;
    }

    public String toString(int t) {
        return (getTabs(t) + id + "(" + args.toString(t) + ");\n");
    }
}
