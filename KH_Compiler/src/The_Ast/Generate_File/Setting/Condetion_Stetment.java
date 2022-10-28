package The_Ast.Generate_File.Setting;

public class Condetion_Stetment {
    Side side1;
    Cond_Att cond_att;
    Side side2;

    public void AST_Condetion_Stetment()
    {
        if(side1!=null)
        {
            side1.AST_Side();
        }
        if(cond_att!=null)
        {
            cond_att.AST_Cond_ATT();
        }
        if (side2!=null){
            side2.AST_Side();
        }
    }

    public Side getSide1() {
        return side1;
    }

    public void setSide1(Side side1) {
        this.side1 = side1;
    }

    public Cond_Att getCond_att() {
        return cond_att;
    }

    public void setCond_att(Cond_Att cond_att) {
        this.cond_att = cond_att;
    }

    public Side getSide2() {
        return side2;
    }

    public void setSide2(Side side2) {
        this.side2 = side2;
    }
}
