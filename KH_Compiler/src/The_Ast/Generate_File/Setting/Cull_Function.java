package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.util.ArrayList;

public class Cull_Function extends Generate_Symbol_Table {
    String cull;
    String name;
    String bracOpen;
    String bracClose;
    ArrayList<Parameters> parameters=new ArrayList<>();

    public void AST_Cull_Function()
    {
        if (cull!=null)
        {
           Add_Symbol(cull);
            System.out.print("\n"+cull+" ");
        }
        if (name!=null)
        {
            Add_Symbol(name);
            System.out.print(name+" ");
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

    }

    public String getCull() {
        return cull;
    }

    public void setCull(String cull) {
        this.cull = cull;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
}
