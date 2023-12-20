public class FielddeclBase extends Token implements TI {
    Type type;
    String id;

    public FielddeclBase(Type t, String i) {
        type = t;
        id = i;
    }

    public String toString(int t) {
        return (type.toString(t) + " " + id);
    }

    public String typeCheck() throws Exception {
        symbolTable.add(id, type.toString().toLowerCase());
        return "";
    }
}
