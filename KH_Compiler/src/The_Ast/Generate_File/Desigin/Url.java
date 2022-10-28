package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Url extends Generate_Symbol_Table {
    String url;

   public void AST_Url(){
       if (url!=null)
       {
           Add_Symbol(url);
           System.out.print(url+" ");
       }
   }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
