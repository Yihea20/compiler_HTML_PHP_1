package The_Ast;

import java.io.FileWriter;
import java.io.IOException;

public class AST_File {
    FileWriter AST_Writer;

    public AST_File() throws IOException {
        this.AST_Writer = new FileWriter("ast.txt,true");
    }

    public FileWriter getAST_Writer() {
        return AST_Writer;
    }
}
