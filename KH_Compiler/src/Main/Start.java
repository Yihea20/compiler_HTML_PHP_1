package Main;

import The_Ast.Code_Generate.Code_Generate;
import The_Ast.Error.Syntex_Error;
import The_Ast.Gen_Visitor.Visitor;
import The_Ast.Generate_File.Common.Start_Compile;
import The_Ast.SympolTyple.Generate_Symbol_Table;
import The_Ast.Visitor_File.LEXER;
import The_Ast.Visitor_File.PARSER;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Start {
    public static void main(String[] args) {
        try {
            Generate_Symbol_Table generate_symbol_table=new Generate_Symbol_Table();
            System.out.println();
            String source = "text.txt";
            CharStream cs = fromFileName(source);
            LEXER lexer = new LEXER(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            PARSER parser = new PARSER(token);
            parser.removeErrorListeners();
            parser.addErrorListener(new Syntex_Error());
            ParseTree tree = parser.start_compile();
            if (Syntex_Error.hasError) {
            }else{
            Visitor visitor = new Visitor();
            Start_Compile start_compile = (Start_Compile) visitor.visit(tree);
            start_compile.AST_StartCompiler();
                System.out.println();
           // System.out.println(generate_symbol_table);
                Code_Generate code_generate=new Code_Generate();
                code_generate.Generate(code_generate.getSymbolTable());

           }} catch (IOException e) {
            e.getMessage();

        }
    }
}
