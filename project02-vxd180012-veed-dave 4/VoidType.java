class VoidType extends Returntype implements TI {

    public VoidType() {

    }

    public String toString(int t) {
        return "void";
    }

    public String typeCheck() throws Exception {
        symbolTable.add("void", "voidtype");
        return "";
    }
}
