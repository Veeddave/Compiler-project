public class MethoddeclBase extends Token implements TI {
    Returntype returntype;
    String id;

    public MethoddeclBase(Returntype r, String i) {
        returntype = r;
        id = i;
    }

    public String toString(int t) {
        return (returntype.toString(t) + " " + id);
    }

    public String typeCheck() throws Exception {
        returntype.typeCheck();
        return "";
    }
}
