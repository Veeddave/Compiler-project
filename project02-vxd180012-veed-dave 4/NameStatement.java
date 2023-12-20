class NameStatement extends NonWhileStmt implements TI {
     Name name;
     String operator;

     public NameStatement(Name n, String o) {
         name = n;
         operator = o;
     }

     public String toString(int t) {
         return (getTabs(t) + name.toString(t) + operator + ";\n");
     }

    String typeCheck() throws Exception {
        name.typeCheck();
        String operatorCheck = symbolTable.get(operator);
        if(!operatorCheck.contains("++") || !operatorCheck.contains("--")) {
            throw new Exception("Error: incorrect operator");
        }
        return "";
    }
}
