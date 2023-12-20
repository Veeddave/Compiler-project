class FieldsBase extends Token implements TI {
    Fielddecl fielddecl;
    FieldsBase fieldsBase;
    Methoddecl methoddecl;
    Methoddecls methoddecls;

    public FieldsBase(Fielddecl f, FieldsBase m) {
        fielddecl = f;
        fieldsBase = m;
    }

    public FieldsBase(Methoddecl m, Methoddecls ms) {
        fielddecl = null;
        fieldsBase = null;
        methoddecl = m;
        methoddecls = ms;
    }

    public String toString(int t) {
        if(methoddecl != null) {
            return (methoddecl.toString(t) + (methoddecls != null ? methoddecls.toString(t) : "" ));
        }
        return (fielddecl.toString(t) + (fieldsBase != null ? fieldsBase.toString(t) : "") );
    }

    public String typeCheck() throws Exception {
        symbolTable.createScope();
        if(fielddecl != null) {
            return fielddecl.typeCheck();
        }
        else if(methoddecl != null) {
            return methoddecl.typeCheck();
        }
        symbolTable.destroyScope();
        throw new Exception("Error: Methoddecl Not Found");
    }

}
