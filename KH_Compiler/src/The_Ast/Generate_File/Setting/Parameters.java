package The_Ast.Generate_File.Setting;

public class Parameters {
    Param param;
    Params params;

    public void AST_Parameter()
    {
        if(param!=null)
        {
            param.AST_Param();
        }
        else if(params!=null)
        {
            params.AST_Params();
        }
    }

    public Param getParam() {
        return param;
    }

    public void setParam(Param param) {
        this.param = param;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }
}
