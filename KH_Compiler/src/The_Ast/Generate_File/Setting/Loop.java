package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.util.ArrayList;

public class Loop extends Generate_Symbol_Table {
    String fore;
    String bracOpen;
    String bracClose;
    String curlyOpen;
    String curlyClose;
    Part1 part1;
    Part2 part2;
    Part3 part3;
    ArrayList<Control_Body> control_bodies=new ArrayList<>();

    public void AST_Loop()
    {
        if (fore!=null)
        {
             Add_Symbol(fore);
            System.out.print("\n"+fore+" ");
        }
        if(part1!=null)
        {
            part1.AST_Part1();
        }
        if (part2!=null)
        {
            part2.AST_Part2();
        }
        if (part3!=null)
        {
            part3.AST_Part3();
        }
        if(control_bodies!=null)
        {
            for (int i = 0; i < control_bodies.size(); i++) {
                control_bodies.get(i).AST_Control_Body();
            }
        }
        if(curlyClose!=null)
        {
            Add_Symbol(curlyClose);
        }
    }

    public String getFore() {
        return fore;
    }

    public void setFore(String fore) {
        this.fore = fore;
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

    public String getCurlyOpen() {
        return curlyOpen;
    }

    public void setCurlyOpen(String curlyOpen) {
        this.curlyOpen = curlyOpen;
    }

    public String getCurlyClose() {
        return curlyClose;
    }

    public void setCurlyClose(String curlyClose) {
        this.curlyClose = curlyClose;
    }

    public Part1 getPart1() {
        return part1;
    }

    public void setPart1(Part1 part1) {
        this.part1 = part1;
    }

    public Part2 getPart2() {
        return part2;
    }

    public void setPart2(Part2 part2) {
        this.part2 = part2;
    }

    public Part3 getPart3() {
        return part3;
    }

    public void setPart3(Part3 part3) {
        this.part3 = part3;
    }

    public ArrayList<Control_Body> getControl_bodies() {
        return control_bodies;
    }

    public void setControl_bodies(ArrayList<Control_Body> control_bodies) {
        this.control_bodies = control_bodies;
    }
}
