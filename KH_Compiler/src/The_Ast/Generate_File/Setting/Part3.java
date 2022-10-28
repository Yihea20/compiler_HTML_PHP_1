package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Part3 extends Generate_Symbol_Table {
    String part3;
    Equality_Value equality_value;

    public void AST_Part3()
    {
        if (part3!=null)
        {
                 Add_Symbol(part3);
            System.out.print(part3+" ");
        }
        if(equality_value!=null)
        {
            equality_value.AST_Equality_Value();
        }
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3;
    }

    public Equality_Value getEquality_value() {
        return equality_value;
    }

    public void setEquality_value(Equality_Value equality_value) {
        this.equality_value = equality_value;
    }
}
