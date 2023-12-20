abstract class Argdecl extends Token implements TI {
    Type type;
    String id;

    public Argdecl(Type t, String i) {
        type = t;
        id = i;
    }

    public String toString(int t) {
        return (type.toString(t) + " " + id);
    }

    public String typeCheck() throws Exception {
        String idtype = symbolTable.get(id);
        if(idtype.equals("") || idtype.startsWith(":")) {
            throw new Exception("Error: Variable cannot be found");
        }
        return "";
    }
}
