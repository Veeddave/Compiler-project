class ScopeStatement extends NonWhileStmt implements TI {
    Fielddecls fielddecls;
    Stmts stmts;
    Boolean hasSemi;

    public ScopeStatement(Fielddecls f, Stmts s) {
        fielddecls = f;
        stmts = s;
        hasSemi = false;
    }

    public ScopeStatement addOptionalSemi(Optionalsemi o) {
        hasSemi = o != null;
        return this;
    }

    public String toString(int t) {
        return(getTabs(t) + "{\n" +
                (fielddecls != null ? fielddecls.toString(t+1) : "") +
                (stmts != null ? stmts.toString(t+1) : "") +
                getTabs(t) + "}" + (hasSemi ? ";\n" : "\n"));
    }

    public String typeCheck() throws Exception {
        fielddecls.typeCheck();
        stmts.typeCheck();

        if(!hasSemi) {
            throw new Exception ("Error: Does not contain semi");
        }

        return"";
    }
}
