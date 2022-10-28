package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.util.ArrayList;

public class Condetion extends Generate_Symbol_Table {
    String iff;
    String bracOpen;
    String bracClose;
    String curlyOpen;
    String curlyClose;
    Condetion_Stetment condetion_stetment;
    ArrayList<Control_Body> control_bodies=new ArrayList<>();

  public void AST_Condetion()
  {
      if(iff!=null) {
         Add_Symbol(iff);
          System.out.print("\n" + iff + " ");
      }
      if(condetion_stetment!=null)
      {
        condetion_stetment.AST_Condetion_Stetment();
      }
      if (control_bodies!=null)
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


    public String getIff() {
        return iff;
    }

    public void setIff(String iff) {
        this.iff = iff;
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

    public Condetion_Stetment getCondetion_stetment() {
        return condetion_stetment;
    }

    public void setCondetion_stetment(Condetion_Stetment condetion_stetment) {
        this.condetion_stetment = condetion_stetment;
    }

    public ArrayList<Control_Body> getControl_bodies() {
        return control_bodies;
    }

    public void setControl_bodies(ArrayList<Control_Body> control_bodies) {
        this.control_bodies = control_bodies;
    }
}
