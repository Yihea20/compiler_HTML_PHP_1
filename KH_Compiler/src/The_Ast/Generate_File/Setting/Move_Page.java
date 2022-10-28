package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Move_Page extends Generate_Symbol_Table {
    String page;
    String name;

    public void AST_Move_Page()
    {
        if(page!=null)
        {
             Add_Symbol(page);
            System.out.print("\n"+page+" ");
        }
        if(name!=null)
        {
           Add_Symbol(name);
            System.out.print(name+" ");
        }
    }


    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
