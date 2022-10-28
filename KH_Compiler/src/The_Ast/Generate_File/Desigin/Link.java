package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Link extends Generate_Symbol_Table {
    String link;
    String colomn;
    String name;
    Url url;

    public void AST_Link()
    {
        if(link!=null)
    {
        Add_Symbol(link);
        System.out.print(link+" ");
    }
        if(name!=null)
        {
           Add_Symbol(name);
            System.out.print(name+" ");
        }

        if(url!=null)
        {
            url.AST_Url();
        }
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getColomn() {
        return colomn;
    }

    public void setColomn(String colomn) {
        this.colomn = colomn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }
}
