class PrintlineStatement extends NonWhileStmt implements TI {
    Printlinelist printlinelist;

    public PrintlineStatement(Printlinelist pl) {
        printlinelist = pl;
    }

    public String toString(int t) {
        return (getTabs(t) + "printline(" + printlinelist.toString(t) + ");\n");
    }

    public String typeCheck() throws Exception {
        printlinelist.typeCheck();
        return "";
    }
}
