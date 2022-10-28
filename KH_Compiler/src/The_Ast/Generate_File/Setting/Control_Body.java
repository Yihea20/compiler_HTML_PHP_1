package The_Ast.Generate_File.Setting;

public class Control_Body {
    Condetion condetion;
    Loop loop;
    Equality equality;
    Equality_Value equality_value;
    Cull_Function cull_function;
    Print print;
    Function function;
    Move_Page move_page;
    Print_String print_string;

    public Print_String getPrint_string() {
        return print_string;
    }

    public void setPrint_string(Print_String print_string) {
        this.print_string = print_string;
    }

    public void AST_Control_Body()
{
    if (condetion!=null)
    {
        condetion.AST_Condetion();
    }
    else if(loop!=null)
    {
        loop.AST_Loop();
    }
    else if (equality!=null)
    {
        equality.AST_Equality();
    }
    else if(equality_value!=null)
    {
        equality_value.AST_Equality_Value();
    }
    else if(cull_function!=null)
    {
        cull_function.AST_Cull_Function();
    }
    else if(print!=null)
    {
        print.AST_Print();
    }
    else if(function!=null)
    {
        function.AST_Function();
    }
    else if(move_page!=null)
    {
        move_page.AST_Move_Page();
    }
    else if (print_string!=null)
    {
        print_string.AST_Print_String();
    }
}

    public Condetion getCondetion() {
        return condetion;
    }

    public void setCondetion(Condetion condetion) {
        this.condetion = condetion;
    }

    public Loop getLoop() {
        return loop;
    }

    public void setLoop(Loop loop) {
        this.loop = loop;
    }

    public Equality getEquality() {
        return equality;
    }

    public void setEquality(Equality equality) {
        this.equality = equality;
    }

    public Equality_Value getEquality_value() {
        return equality_value;
    }

    public void setEquality_value(Equality_Value equality_value) {
        this.equality_value = equality_value;
    }

    public Cull_Function getCull_function() {
        return cull_function;
    }

    public void setCull_function(Cull_Function cull_function) {
        this.cull_function = cull_function;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    public Move_Page getMove_page() {
        return move_page;
    }

    public void setMove_page(Move_Page move_page) {
        this.move_page = move_page;
    }
}
