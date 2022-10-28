package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Part1 extends Generate_Symbol_Table {
    String part1;
    Equality equality;

   public void AST_Part1()
   {
       if (part1!=null)
       {
            Add_Symbol(part1);
           System.out.print(part1+" ");
       }
       if(equality!=null)
       {

           equality.AST_Equality();
       }
   }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public Equality getEquality() {
        return equality;
    }

    public void setEquality(Equality equality) {
        this.equality = equality;
    }
}
