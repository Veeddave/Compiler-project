class BinaryExpr extends NonTypeCastExpr implements TI {
    Expr expr1;
    Expr expr2;
    String operator;

    public BinaryExpr(Expr e1, String o, Expr e2) {
        expr1 = e1;
        operator = o;
        expr2 = e2;
    }

    public String toString(int t)
    {
        return ("(" + expr1.toString(t) + " " + operator + " " + expr2.toString(t) + ")");
    }

    public String typeCheck() throws Exception {
        String lhs = expr1.typeCheck();
        String rhs = expr2.typeCheck();

        if (!lhs.equals(rhs)) {
            throw new Exception("Error: both types must be Expr");

        }
        return "";
    }
}
