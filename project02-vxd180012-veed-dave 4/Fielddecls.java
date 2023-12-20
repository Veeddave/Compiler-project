public class Fielddecls extends Token {
    Fielddecl fielddecl;
    Fielddecls fielddecls;

    public Fielddecls(Fielddecl f, Fielddecls ff) {
        fielddecl = f;
        fielddecls = ff;
    }

    public Fielddecls(Fielddecl f) {
        fielddecl = f;
        fielddecls = null;
    }

    public String toString(int t) {
        return (fielddecl.toString(t) + (fielddecls != null ? fielddecls.toString(t) : "") );
    }

    String typeCheck() throws Exception {
        fielddecls.typeCheck();
        fielddecl.typeCheck();
        return "";
    }
}
