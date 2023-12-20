class StrLit extends TypeLit implements TI {
    String strlit;

    public StrLit(String s) {
        strlit = s;
    }

    public String toString(int t) {
        return strlit;
    }

    String typeCheck() throws Exception {
        symbolTable.add("string", "strlit");
        return "";
    }
}
