class ReturnStatement extends NonWhileStmt implements TI {
    public ReturnStatement() {

    }

    public String toString(int t) {
        return(getTabs(t) + "return;\n");
    }

    public String typeCheck() throws Exception {
        return "";
    }
}
