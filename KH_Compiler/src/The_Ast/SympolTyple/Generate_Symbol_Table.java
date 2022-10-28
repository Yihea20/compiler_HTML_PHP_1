package The_Ast.SympolTyple;

import The_Ast.AST_File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Generate_Symbol_Table {
    static SymbolTable symbolTable = new SymbolTable();




    public void mapset() {
        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope3 = symbolTable.getScopes().elementAt(i);
            if (!scope3.isPart()) {
                for (int j = 0; j < symbolTable.getScopes().elementAt(i).getSymbols().size(); j++) {
                    String scope = symbolTable.getScopes().elementAt(i).getSymbols().get(j).getToken();
                    String str = scope.replaceAll("\\s", "");
                    if (str.replaceAll(" ", "").equals("page")) {
                        if(map.get(symbolTable.getScopes().elementAt(i).getSymbols().get(j+1).getToken().replaceAll(" ", ""))==null){
                        map.put(symbolTable.getScopes().elementAt(i).getSymbols().get(j-1).getToken().replaceAll(" ", ""), symbolTable.getScopes().elementAt(i).getSymbols().get(j+1).getToken().replaceAll(" ", ""));
                        map.put(symbolTable.getScopes().elementAt(i).getSymbols().get(j+1).getToken().replaceAll(" ", ""), symbolTable.getScopes().elementAt(i).getSymbols().get(j-1).getToken().replaceAll(" ", ""));
                    }
                    else
                        {System.err.println("page"+" "+symbolTable.getScopes().elementAt(i).getSymbols().get(j+1).getToken().replaceAll(" ", "")+" have controller before");
                            System.exit(0);
                        }
                    }
                }
            }
        }
    }

    public Map<String, String> map = new HashMap<>();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void Add_Symbol(String s) {
        Symbol symbol = new Symbol(s);
        getSymbolTable().getScopes().lastElement().getSymbols().add(symbol);
    }

    public void Add_Scope(boolean type) {
        Scope scope = new Scope();
        scope.setPart(type);
        getSymbolTable().getScopes().add(scope);

    }


}
