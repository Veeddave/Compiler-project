public class Methoddecl extends Token implements TI {

    MethoddeclBase methoddeclBase;
    Argdecls argdecls;
    Fielddecls fielddecls;
    Stmts stmts;
    Boolean hasSemicolon;
	
    public Methoddecl(MethoddeclBase m, Argdecls a, Fielddecls f, Stmts s, Optionalsemi o) {
        methoddeclBase = m;
        argdecls = a;
        fielddecls = f;
        stmts = s;
        hasSemicolon = o != null;
    }

    public Methoddecl(MethoddeclBase m, Fielddecls f, Stmts s, Optionalsemi o) {
        methoddeclBase = m;
        argdecls = null;
        fielddecls = f;
        stmts = s;
        hasSemicolon = o != null;
    }

    public String toString(int t) {
        return (getTabs(t) + methoddeclBase.toString(t) + "(" +
                ( argdecls != null ? argdecls.toString(t) : "")
                + ")\n" + getTabs(t) +"{\n" +
                (fielddecls != null ? fielddecls.toString(t + 1) : "")
                + (stmts != null ? stmts.toString(t + 1) : "")
                + getTabs(t) + "}" + (hasSemicolon ? ";\n" : "\n") );

     }

    String typeCheck() throws Exception {
        argdecls.typeCheck();
        fielddecls.typeCheck();
        stmts.typeCheck();
        return "";
    }
}
