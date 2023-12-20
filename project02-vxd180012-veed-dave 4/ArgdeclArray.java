class ArgdeclArray extends Argdecl implements TI {
    public ArgdeclArray(Type t, String i) {
        super(t, i);
    }

    public String toString(int t) {
        return super.toString(t) + "[]";
    }
}
