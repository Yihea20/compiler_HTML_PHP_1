package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;

public class Display extends Generate_Symbol_Table {
    String display;
    String name;
    String colomn;
    Text text;
    Image image;
    List list;

    public void AST_Display() {
      if(display!=null)
      {
          Add_Symbol(display);

          System.out.print(display+" ");
      }
      if(name!=null)
      {
          Add_Symbol(name);
          System.out.print(name+" ");
      }

      if(text!=null)
      {
          text.AST_Text();
      }
      else if(image!=null)
      {
          image.AST_Image();
      }
      else if(list!=null)
      {
          list.AST_List();
      }
  }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
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

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}
