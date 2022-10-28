package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Part2 extends Generate_Symbol_Table {
    String part2;
    Condetion_Stetment condetion_stetment;

    public void AST_Part2()
    {
        if (part2!=null)
        {
              Add_Symbol(part2);
            System.out.print(part2+" ");
        }
        if(condetion_stetment!=null)
        {
            condetion_stetment.AST_Condetion_Stetment();
        }
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public Condetion_Stetment getCondetion_stetment() {
        return condetion_stetment;
    }

    public void setCondetion_stetment(Condetion_Stetment condetion_stetment) {
        this.condetion_stetment = condetion_stetment;
    }
}
