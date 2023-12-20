public class WhileStatement extends NonIfStmt implements TI {
    WhileBase whileBase;
    ScopeStatement body;

    public WhileStatement(WhileBase w, ScopeStatement s) {
        whileBase = w;
        body = s;
    }

    public String toString(int t) {
        return whileBase.toString(t) + body.toString(t);
    }

    String typeCheck() throws Exception {
        whileBase.typeCheck();
        body.typeCheck();
        return "";
    }
}
