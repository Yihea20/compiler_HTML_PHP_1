package The_Ast.Generate_File.Desigin;

public class Combonent {
    Enter enter;
    Display display;
    Link link;

    public void AST_Combonent()
    {
        if(enter!=null)
        {
            System.out.println();
            enter.AST_Enter();
        }
        if(display!=null)
        {
            System.out.println();
            display.AST_Display();
        }
        if(link!=null)
        {
            System.out.println();
            link.AST_Link();
        }
    }

    public Enter getEnter() {
        return enter;
    }

    public void setEnter(Enter enter) {
        this.enter = enter;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
