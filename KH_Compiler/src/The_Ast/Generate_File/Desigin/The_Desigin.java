package The_Ast.Generate_File.Desigin;

import The_Ast.Generate_File.Common.Name;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;
import java.util.ArrayList;

public class The_Desigin extends Generate_Symbol_Table {
    String desigin;
    String Interface;
    Color color;
    Name name;
    String curlyOpen;
    ArrayList<Combonent> combonent=new ArrayList<>();
    String curlyClose;

   public void AST_The_Desigin() throws IOException {
       if(desigin!=null)
       {
           System.out.print("\n"+desigin+" ");
       }
       if(Interface!=null)
       {
           //Add_Scope("page");
           System.out.println(getSymbolTable().getScopes().size());
          Add_Symbol(Interface);

           System.out.print(Interface+" ");
       }
       if(color!=null)
       {
           color.AST_Color();
       }
       if (name!=null)
       {

           name.AST_Name();
       }
       if (combonent!=null)
       {
           for (int i = 0; i < combonent.size(); i++) {
               combonent.get(i).AST_Combonent();
           }
       }
   }

    public String getDesigin() {
        return desigin;
    }

    public void setDesigin(String desigin) {
        this.desigin = desigin;
    }

    public String getInterface() {
        return Interface;
    }

    public void setInterface(String anInterface) {
        Interface = anInterface;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCurlyOpen() {
        return curlyOpen;
    }

    public void setCurlyOpen(String curlyOpen) {
        this.curlyOpen = curlyOpen;
    }

    public ArrayList<Combonent> getCombonent() {
        return combonent;
    }

    public void setCombonent(ArrayList<Combonent> combonent) {
        this.combonent = combonent;
    }

    public String getCurlyClose() {
        return curlyClose;
    }

    public void setCurlyClose(String curlyClose) {
        this.curlyClose = curlyClose;
    }
}
