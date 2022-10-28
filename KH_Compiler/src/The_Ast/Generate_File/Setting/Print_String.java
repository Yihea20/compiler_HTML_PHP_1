package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Print_String extends Generate_Symbol_Table {
    String write ;
    String name;

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void AST_Print_String()
    {
        if(write!=null)
        {
            Add_Symbol(write);
            System.out.print("\n"+write+" ");
        }
        if(name!=null)
        {
            Add_Symbol(name);
            System.out.print(name+" ");
        }
    }
}
