class Name extends Expr implements TI {
    String id;

    public Name(String i) {
        id = i;
    }

    public String toString(int t) {
        return(id);
    }

    String typeCheck() throws Exception {
        String idCheck = symbolTable.get(id);
        if(idCheck.equals("") || idCheck.startsWith(";")) {
            throw new Exception("Error: Variable cannot be found");
        }
        return "";
    }
}
