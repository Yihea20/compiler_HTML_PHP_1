package The_Ast.Generate_File.Setting;

import The_Ast.Generate_File.Common.Name;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;
import java.util.ArrayList;

public class Function extends Generate_Symbol_Table {
    String fun;
    Name name;
    String bracOpen;
    String bracClose;
    ArrayList<Parameters>parameters=new ArrayList<>();
    String curlyOpen;
    String curlyClose;ArrayList<Control_Body>control_bodies=new ArrayList<>();

 public void AST_Function()  {
     if (fun!=null)
     {
         Add_Symbol(fun);
         System.out.print(fun+" ");
     }
     if (name!=null)
     {

         name.AST_Name();
     }
     if (parameters!=null)
     {
         for (int i = 0; i < parameters.size(); i++) {
             parameters.get(i).AST_Parameter();
         }
     }
     if(bracClose!=null)
     {
         Add_Symbol(bracClose);
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

    public String getFun() {
        return fun;
    }

    public void setFun(String fun) {
        this.fun = fun;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
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

    public ArrayList<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<Parameters> parameters) {
        this.parameters = parameters;
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

    public ArrayList<Control_Body> getControl_bodies() {
        return control_bodies;
    }

    public void setControl_bodies(ArrayList<Control_Body> control_bodies) {
        this.control_bodies = control_bodies;
    }
}
