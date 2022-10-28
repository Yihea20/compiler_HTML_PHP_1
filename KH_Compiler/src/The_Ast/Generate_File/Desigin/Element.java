package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Element extends Generate_Symbol_Table {
    String li;
    String name;
    String bracOpen;
    String bracClose;

    public void AST_Element()
    {
        if(li!=null)
        {
            Add_Symbol(li);

            System.out.print(li + " ");
        }
        if(name!=null)
        {
            Add_Symbol(name);

            System.out.print(name+" ");
        }

    }

    public String getLi() {
        return li;
    }

    public void setLi(String li) {
        this.li = li;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBracOpen() {
        return bracOpen;
    }

    public void setBracOpen(String bracOpen) {
        this.bracOpen = bracOpen;
    }

    public String getBracClose() {
        return bracClose;
    }

    public void setBracClose(String bracClose) {
        this.bracClose = bracClose;
    }
}
