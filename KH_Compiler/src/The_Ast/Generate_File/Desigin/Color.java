package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;

public class Color extends Generate_Symbol_Table {
    String paint;


    public void AST_Color(){
       if(paint!=null)
       {
          Add_Symbol(paint);
           System.out.print(paint+" ");
       }
       if(color_Name!=null)
       {
          Add_Symbol(color_Name);
           System.out.println(color_Name);
       }
   }

    public String getPaint() {
        return paint;
    }

    public void setPaint(String paint) {
        this.paint = paint;
    }

    public String getColor_Name() {
        return color_Name;
    }

    public void setColor_Name(String color_Name) {
        this.color_Name = color_Name;
    }

    String color_Name;
}
