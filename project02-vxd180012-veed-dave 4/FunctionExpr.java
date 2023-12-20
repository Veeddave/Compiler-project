abstract class FunctionExpr extends Expr implements TI {
    String id;

    public FunctionExpr(String i) {
        id = i;
    }

    public String typeCheck() throws Exception {
        String s = symbolTable.get(id);
        if(s.equals("") || s.startsWith(":")) {
            throw new Exception("Error: undeclared value");
        }
        return "";
    }
}
