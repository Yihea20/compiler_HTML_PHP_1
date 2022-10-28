package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Print extends Generate_Symbol_Table {
    String print ;
    String name;

    public void AST_Print()
    {
        if(print!=null)
        {
            Add_Symbol(print);
            System.out.print("\n"+print+" ");
        }
        if(name!=null)
        {
            Add_Symbol(name);
            System.out.print(name+" ");
        }
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
