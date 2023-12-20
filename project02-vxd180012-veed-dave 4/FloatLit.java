class FloatLit extends TypeLit implements TI {
    double floatingPoint;

    public FloatLit(double f) {
        floatingPoint = f;
    }

    public String toString(int t) {
        return Double.toString(floatingPoint);
    }

    public String typeCheck() throws Exception {
        symbolTable.add("double", "floatlit");
        return "";
    }
}
