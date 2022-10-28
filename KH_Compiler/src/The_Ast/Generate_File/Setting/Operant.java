package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Operant extends Generate_Symbol_Table {
    String SIGNAL ,NAME, NUMBER;
public void AST_Oerant()
{
    if(SIGNAL!=null)
    {
       Add_Symbol(SIGNAL);
        System.out.print(SIGNAL+" ");
    }
    if(NAME!=null)
    {
       Add_Symbol(NAME);
        System.out.print(NAME+"  ");
    }
    else if(NUMBER!=null)
    {
       Add_Symbol(NUMBER);
        System.out.print(NUMBER+" ");
    }

}

    public String getSIGNAL() {
        return SIGNAL;
    }

    public void setSIGNAL(String SIGNAL) {
        this.SIGNAL = SIGNAL;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void setNUMBER(String NUMBER) {
        this.NUMBER = NUMBER;
    }
}
