public class FielddeclsStatement extends Stmt {
    Fielddecls fielddecls;
    Stmts stmts;
    Optionalsemi optionalsemi;

    public FielddeclsStatement(Fielddecls f, Stmts s, Optionalsemi o) {
        fielddecls = f;
        stmts = s;
        optionalsemi = o;
    }


    public String toString(int t) {
        return getTabs(t) + "{" + fielddecls.toString() + " " + stmts.toString(0) + "}" + optionalsemi.toString(t+1);
    }

    String typeCheck() throws Exception {
        fielddecls.typeCheck();
        stmts.typeCheck();
        optionalsemi.typeCheck();
        return "";
    }

}
