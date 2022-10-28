package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Side  extends Generate_Symbol_Table {
    String name;
    String number;

    public void AST_Side()
    {
        if(name!=null)
        {
            Add_Symbol(name);
            System.out.print("\n"+name+" ");
        }
        else if(number!=null)
        {
            Add_Symbol(number);
            System.out.print(number+" ");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
