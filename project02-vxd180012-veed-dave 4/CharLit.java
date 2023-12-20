class CharLit extends TypeLit implements TI {
    String charlit;

    public CharLit(String c) {
        charlit = c;
    }

    public String toString(int t) {
        return charlit;
    }

    String typeCheck() throws Exception {
        String charlitCheck = symbolTable.get(charlit);

        if(charlitCheck.equals("")) {
            throw new Exception("Error: Variable Not Found");
        }

        return "";
    }
}
