class Program extends Token implements TI {

    String id;
    Memberdecls memberdecls;


    public Program(String i, Memberdecls m) {

       id = i;
        memberdecls = m;
    }

    public String toString(int t) {
        return("class " + id + "\n{\n" + memberdecls.toString(t + 1) + "}\n");
    }

    public String typeCheck() throws Exception {
        memberdecls.typeCheck();
        return "";
    }
}
