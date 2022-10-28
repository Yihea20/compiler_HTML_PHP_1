package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Params extends Generate_Symbol_Table {
    String param;
    String name;
    String coma;

    public void AST_Params()
    {
        if(param!=null)
        {
             Add_Symbol(param);
            System.out.print("\n"+param+" ");
        }
        if(name!=null)
        {
             Add_Symbol(name);
            System.out.print(name+" ");
        }
        if(coma!=null)
        {
             Add_Symbol(coma);
            System.out.print(coma+" ");
        }
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComa() {
        return coma;
    }

    public void setComa(String coma) {
        this.coma = coma;
    }
}
