package The_Ast.Generate_File.Setting;

import The_Ast.Generate_File.Common.Name;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;
import java.util.ArrayList;

public class The_Setting extends Generate_Symbol_Table {
    String setting ;
    String controller;
    Name name;
    String control;
    String page;
    String namee;
    String curlyOpen;
    String curlyClose;
    ArrayList<Control_Body> control_bodies=new ArrayList<>();


    public void AST_The_Setting()  {
        if(setting!=null)
        {
            System.out.print("\n"+setting+" ");
        }
        if (controller!=null)
        {
            //Add_Scope("controller");
            Add_Symbol(controller);

            System.out.print(controller+" ");
        }
        if (name!=null)
        {
            name.AST_Name();
        }
        if(control!=null)
        {

            System.out.print(control+" ");
        }
        if (page!=null)
        {
            Add_Symbol(page);
            System.out.print(page+" ");
        }
        if (namee!=null)
        {
            Add_Symbol(namee);
            System.out.print(namee+" ");
        }
        if (control_bodies!=null)
        {
            for (int i = 0; i < control_bodies.size(); i++) {
                control_bodies.get(i).AST_Control_Body();
            }
        }
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
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
