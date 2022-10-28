package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Enter extends Generate_Symbol_Table {


    public String getEnter() {
        return enter;
    }

    public void setEnter(String enter) {
        this.enter = enter;
    }

    String name;
    String colomn;
    String check_Box;
    String radio;
    String field;
    String submit;
    String bracOpen;
    String bracClose;
    String enter;
    public void AST_Enter()
    {
        if(enter!=null)
        {
           Add_Symbol(enter);

            System.out.print(enter +" ");
        }
        if(name!=null)
        {
           Add_Symbol(name);

            System.out.print(name+" ");
        }
        if(check_Box!=null)
        {
           Add_Symbol(check_Box);

            System.out.print(check_Box+" ");
        }
        else if(radio!=null)
        {
           Add_Symbol(radio);
            System.out.print(radio+" ");
        }
        else if(submit!=null)
        {
           Add_Symbol(submit);
            System.out.print(submit+" ");
        }
        else if (field!=null)
        {
           Add_Symbol(field);
            System.out.print(field+" ");
        }
        if(str!=null)
        {
            str.AST_Str();
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColomn() {
        return colomn;
    }

    public void setColomn(String colomn) {
        this.colomn = colomn;
    }

    public String getCheck_Box() {
        return check_Box;
    }

    public void setCheck_Box(String check_Box) {
        this.check_Box = check_Box;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
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
Str str;

    public The_Ast.Generate_File.Desigin.Str getStr() {
        return str;
    }

    public void setStr(The_Ast.Generate_File.Desigin.Str str) {
        this.str = str;
    }
}
