class Readlist extends Token implements TI {
    Name name;
    Readlist readlist;

    public Readlist(Name n) {
        name = n;
        readlist = null;
    }

    public Readlist(Name n, Readlist r) {
        name = n;
        readlist = r;
    }

    public String toString(int t) {
        return(name.toString(t) + (readlist != null ? ", " + readlist.toString(t) : ""));
    }

    String typeCheck() throws Exception {
        name.typeCheck();
        readlist.typeCheck();
        return "";
    }
}
