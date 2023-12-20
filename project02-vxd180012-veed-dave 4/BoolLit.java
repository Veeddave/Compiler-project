class BoolLit extends TypeLit implements TI {
    String bool;

    public BoolLit(String b) {
        bool = b;
    }

    public String toString(int t) {
        return bool;
    }

    String typeCheck() throws Exception {
        String boolCheck = symbolTable.get(bool);
        symbolTable.add("boolean", "boollit");

        if(boolCheck.equals("")) {
            throw new Exception("Error: Undeclared variable");
        }

        return "";
    }
}
