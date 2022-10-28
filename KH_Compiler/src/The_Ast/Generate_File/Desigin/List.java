package The_Ast.Generate_File.Desigin;

import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.util.ArrayList;

public class List extends Generate_Symbol_Table {
    String list;
   ArrayList<Element> element=new ArrayList<>();

    public void AST_List(){
        if(list!=null)
        {
           Add_Symbol(list);
            System.out.print(list+"\n");
        }
        if(element!=null)
        {
            for (int i = 0; i < element.size(); i++) {
                element.get(i).AST_Element();
            }
        }
    }


    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public ArrayList<Element> getElement() {
        return element;
    }

    public void setElement(ArrayList<Element> element) {
        this.element = element;
    }
}
