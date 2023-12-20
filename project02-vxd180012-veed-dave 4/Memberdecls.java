class Memberdecls extends Token implements TI {
    FieldsBase fieldsBase;

    public Memberdecls(FieldsBase m) {
        fieldsBase = m;
    }

    public String toString(int t) {
        return (fieldsBase != null ? fieldsBase.toString(t) : "");
    }

    public String typeCheck() throws Exception {
        return fieldsBase.typeCheck();
    }
}
