package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Param extends Generate_Symbol_Table {
    String parem;
    String name;

   public void AST_Param()
   {
       if(parem!=null)
       {
            Add_Symbol(parem);
           System.out.print("\n"+parem+" ");
       }
       if(name!=null)
       {
           Add_Symbol(name);
           System.out.print(name+" ");
       }
   }

    public String getParem() {
        return parem;
    }

    public void setParem(String parem) {
        this.parem = parem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
