class IntLit extends TypeLit implements TI {
    int intlit;

    public IntLit(int i) {
        intlit = i;
    }

    public String toString(int t) {
        return Integer.toString(intlit);
    }

    public String typeCheck() throws Exception {
        symbolTable.add("int", "intlit");

        return "";
    }
}
