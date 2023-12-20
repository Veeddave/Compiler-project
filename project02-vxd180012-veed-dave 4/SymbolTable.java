import java.util.HashMap;
import java.util.LinkedList;

class SymbolTable {

    LinkedList<HashMap<String, String>> symbolTable;

    public SymbolTable() {
        symbolTable = new LinkedList<HashMap<String, String>>();
    }

    public boolean add(String type, String ref) {
        if (symbolTable.getFirst().containsKey(type))
            return false;
        symbolTable.getFirst().put(type, String.valueOf(new Pair<String, String>(type, ref)));
        return true;
    }

    public String get(String varName) throws Exception {
        for (HashMap<String, String> scope: symbolTable)
            if (scope.containsKey(varName))
                return scope.get(varName);
        throw new Exception(varName+" not defined in the SymbolTable.");
    }

    public void createScope() {
        symbolTable.addFirst(new HashMap<String, String>());
    }
    public void destroyScope() {
        symbolTable.removeFirst();
    }

}
