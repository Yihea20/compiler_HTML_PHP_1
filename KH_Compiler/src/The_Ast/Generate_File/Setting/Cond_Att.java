package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Cond_Att extends Generate_Symbol_Table {
    String comparison;

   public void AST_Cond_ATT()
   {
       Add_Symbol(comparison);
       System.out.print(comparison+" ");
   }

    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }
}
