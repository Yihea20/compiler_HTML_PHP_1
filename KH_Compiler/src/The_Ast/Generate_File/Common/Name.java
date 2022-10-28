package The_Ast.Generate_File.Common;

import The_Ast.Semantic_Check.Semantic_Error;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;

public class Name extends Generate_Symbol_Table {
    String name;

    public void AST_Name()  {
        if (name != null) {


            if (!Semantic_Error.getImportant().add(name)) {

                System.err.println("\n error duplicate at "+name);
                System.exit(0);
            }
            else{
                Add_Symbol(name);
            System.out.print(" " + name + "\n");
        }}

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
