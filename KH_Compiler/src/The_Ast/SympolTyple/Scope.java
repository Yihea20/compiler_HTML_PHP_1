package The_Ast.SympolTyple;

import java.util.ArrayList;
import java.util.Stack;

public class Scope {
    Stack<Symbol> symbols=new Stack<>();
    boolean part;



    public Stack<Symbol> getSymbols() {
        return symbols;
    }

    public void setSymbols(Stack<Symbol> symbols) {
        this.symbols = symbols;
    }

    public boolean isPart() {
        return part;
    }

    public void setPart(boolean part) {
        this.part = part;
    }
}
