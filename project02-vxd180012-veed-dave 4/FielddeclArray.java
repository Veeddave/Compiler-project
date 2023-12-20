class FielddeclArray extends Fielddecl implements TI {
    int intlit;

    public FielddeclArray(FielddeclBase f, int i) {
        super(f);
        intlit = i;
    }

    public String toString(int t) {
        return ( getTabs(t) + super.toString(t) + "[" + intlit + "];\n");
    }
}
