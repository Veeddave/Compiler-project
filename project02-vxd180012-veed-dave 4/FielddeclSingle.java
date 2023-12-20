class FielddeclSingle extends Fielddecl implements TI {
    Boolean isFinal;
    Optionalexpression optionalexpression;

    public FielddeclSingle(Optionalfinal of, FielddeclBase f, Optionalexpression oe) {
        super(f);
        isFinal = true;
        optionalexpression = oe;
    }

    public FielddeclSingle(FielddeclBase f, Optionalexpression oe) {
        super(f);
        isFinal = false;
        optionalexpression = oe;
    }

    public String toString(int t) {
        return (getTabs(t) + (isFinal ? "final" : "") + super.toString(t) +
                (optionalexpression != null ? optionalexpression.toString(t) : "") + ";\n");
    }

}
