package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Str extends Generate_Symbol_Table {
    String string;

    public void AST_Str()
    {
        if(string!=null)
        {
           Add_Symbol(string);
            System.out.print(string+" ");
        }
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
