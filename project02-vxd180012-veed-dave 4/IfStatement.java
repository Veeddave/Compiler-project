class IfStatement extends Stmt implements TI {
    IfBase ifbase;
    Stmt stmt1;
    Stmt stmt2;

    public IfStatement(IfBase i, ScopeStatement s1) {
        ifbase = i;
        stmt1 = s1;
        stmt2 = null;
    }

    public IfStatement(IfBase i, ScopeStatement s1, ScopeStatement s2) {
        ifbase = i;
        stmt1 = s1;
        stmt2 = s2;
    }

    public String toString(int t) {
        if (stmt2 == null)
            return ( getTabs(t) + ifbase.toString(t) + stmt1.toString(t));
        else
            return ( getTabs(t) + ifbase.toString(t) + stmt1.toString(t) + getTabs(t) + "else\n"
                    + stmt2.toString(t));
    }

    String typeCheck() throws Exception {
        ifbase.typeCheck();
        stmt1.typeCheck();
        stmt2.typeCheck();
        return "";
    }

}
