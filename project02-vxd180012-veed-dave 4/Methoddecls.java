class Methoddecls extends Token implements TI {
    Methoddecl methoddecl;
    Methoddecls methoddecls;

    public Methoddecls(Methoddecl m, Methoddecls mm) {
        methoddecl = m;
        methoddecls = mm;
    }

    public Methoddecls(Methoddecl m) {
        methoddecl = m;
        methoddecls = null;
    }

    public String toString(int t) {
        return (methoddecl.toString(t) +
                (methoddecls != null ? methoddecls.toString(t) : "") );
    }

    String typeCheck() throws Exception {
        methoddecls.typeCheck();
        methoddecl.typeCheck();
        return "";
    }


}
