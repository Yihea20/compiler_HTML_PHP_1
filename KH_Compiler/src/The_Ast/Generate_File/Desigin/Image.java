package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Image extends Generate_Symbol_Table {
    String image;
    String bracOpen;
    String bracClose;
    Url url;

    public void AST_Image()
    {
        if(image!=null)
        {
            Add_Symbol(image);
            System.out.print(image+" ");
        }
        if(url!=null)
        {
            url.AST_Url();
        }
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }
}
