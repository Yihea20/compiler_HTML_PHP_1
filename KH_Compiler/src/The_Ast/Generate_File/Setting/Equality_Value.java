package The_Ast.Generate_File.Setting;

import The_Ast.SympolTyple.Generate_Symbol_Table;

public class Equality_Value extends Generate_Symbol_Table {
    String name;
    String signal;

  public void AST_Equality_Value(){
      if (name!=null)
      {
          Add_Symbol(name);
          System.out.print(name+" ");
      }
      if (signal!=null)
      {
          Add_Symbol(signal);
          System.out.print(signal+" ");
      }
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }
}
