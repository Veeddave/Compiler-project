class UnaryExpr extends NonTypeCastExpr implements TI {
    String operator;
    Expr expr;

    public UnaryExpr(String o, Expr e) {
        operator = o;
        expr = e;
    }

    public String toString(int t) {
        return("(" + operator + expr.toString(t) + ")");
    }

    String typeCheck() throws Exception {
        expr.typeCheck();
        String operatorCheck = symbolTable.get(operator);

        if(!operatorCheck.contains("+") || !operatorCheck.contains("~") || !operatorCheck.contains("-")) {
            throw new Exception("Error: Incorrect unary operator");
        }

        return "";
    }
}
