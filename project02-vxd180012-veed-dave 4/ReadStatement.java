class ReadStatement extends NonWhileStmt implements TI {
    Readlist readlist;

    public ReadStatement(Readlist r) {
        readlist = r;
    }

    public String toString(int t) {
        return (getTabs(t) + "read(" + readlist.toString(t) + ");\n");
    }

    String typeCheck() throws Exception {
        return readlist.typeCheck();
    }
}
