class NonArgStatement extends FunctionStatement implements TI {
    public NonArgStatement(String i) {
        super(i);
    }

    public String toString(int t) {
        return (getTabs(t) + id + "();\n");
    }
}
