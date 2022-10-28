package The_Ast.SympolTyple;

import java.util.ArrayList;
import java.util.Stack;

public class SymbolTable {
    Stack<Scope> scopes=new Stack<>();

    public Stack<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(Stack<Scope> scopes) {
        this.scopes = scopes;
    }


}
