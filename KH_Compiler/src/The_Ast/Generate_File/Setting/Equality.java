package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Equality extends Generate_Symbol_Table {
    String decler;
    String name;
    String equal;
    String number;
    Operant operant;

    public Operant getOperant() {
        return operant;
    }

    public void setOperant(Operant operant) {
        this.operant = operant;
    }

    public void AST_Equality(){
        if(decler!=null)
        {
            Add_Symbol(decler);
            System.out.print("\n"+decler+" ");
        }
        if(name!=null)
        {
            Add_Symbol(name);
            System.out.print(name+" ");
        }
        if (equal!=null)
        {
            Add_Symbol(equal);
            System.out.print(equal+" ");
        }
        if (number!=null)
        {
            Add_Symbol(number);
            System.out.print(number+" ");
        }
        if (operant!=null)
        {
            operant.AST_Oerant();
        }
    }

    public String getDecler() {
        return decler;
    }

    public void setDecler(String decler) {
        this.decler = decler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
