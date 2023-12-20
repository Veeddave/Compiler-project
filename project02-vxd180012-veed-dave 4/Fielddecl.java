class Fielddecl extends Token implements TI {

    FielddeclBase fielddeclBase;

    public Fielddecl(FielddeclBase f) {
        fielddeclBase = f;
    }

    public String toString(int t) {
        return fielddeclBase.toString(t);
    }

    public String typeCheck() throws Exception {
        fielddeclBase.typeCheck();
        return "";
    }

}
