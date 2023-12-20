public class Argdecls extends Token implements TI {
    Argdecl argdecl;
    Argdecls argdecls;

    public Argdecls(Argdecl a, Argdecls as) {
        argdecl = a;
        argdecls = as;
    }

    public Argdecls(Argdecl a) {
        argdecl = a;
        argdecls = null;
    }

    public String toString(int t) {
        return (argdecl.toString(t) + (argdecls != null ? ", " + argdecls.toString(t) : ""));
    }

    String typeCheck() throws Exception {
        argdecls.typeCheck();
        argdecl.typeCheck();
        return "";
    }
}
