abstract class FunctionStatement extends NonWhileStmt implements TI {
    String id;
    public FunctionStatement(String id) {
        this.id = id;
    }

    public String typeCheck() throws Exception {
        String s = symbolTable.get(id);

        if(s.equals("")) {
            throw new Exception("Error: Undeclared variable");
        }
        return "";
    }
}
