public class PrintStatement extends NonWhileStmt implements TI {
    Printlist printlist;

    public PrintStatement(Printlist p) {
        printlist = p;
    }

    public String toString(int t) {
        return (getTabs(t) + "print(" + printlist.toString(t) + ");\n");
    }

    public String typeCheck() throws Exception {
        return printlist.typeCheck();
    }
}
