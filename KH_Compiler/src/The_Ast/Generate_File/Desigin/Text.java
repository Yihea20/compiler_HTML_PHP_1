package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Text extends Generate_Symbol_Table {
    String text;
    String bracOpen;
    String bracClose;
    Str str;

    public void AST_Text()
    {
        if (text!=null)
        {
           Add_Symbol(text);
            System.out.print(text+" ");
        }
        if(str!=null)
        {
            str.AST_Str();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Str getStr() {
        return str;
    }

    public void setStr(Str str) {
        this.str = str;
    }
}
