package The_Ast.Generate_File.Common;

import The_Ast.Generate_File.Desigin.The_Desigin;
import The_Ast.Generate_File.Setting.The_Setting;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import java.io.IOException;
import java.util.ArrayList;

public class Start_Compile extends Generate_Symbol_Table {
ArrayList<The_Setting> the_settings=new ArrayList<>();
ArrayList<The_Desigin>the_desigins=new ArrayList<>();



    public void AST_StartCompiler () throws IOException {
        if(the_desigins!=null)
        {
            for (int i = 0; i < the_desigins.size(); i++) {
               Add_Scope(true);
                the_desigins.get(i).AST_The_Desigin();

            }
        }
        if(the_settings!=null)
        {
            for (int i = 0; i < the_settings.size(); i++) {
                Add_Scope(false);
                the_settings.get(i).AST_The_Setting();

            }
        }

    }

    public ArrayList<The_Setting> getThe_settings() {
        return the_settings;
    }

    public void setThe_settings(ArrayList<The_Setting> the_settings) {
        this.the_settings = the_settings;
    }

    public ArrayList<The_Desigin> getThe_desigins() {
        return the_desigins;
    }

    public void setThe_desigins(ArrayList<The_Desigin> the_desigins) {
        this.the_desigins = the_desigins;
    }
}
