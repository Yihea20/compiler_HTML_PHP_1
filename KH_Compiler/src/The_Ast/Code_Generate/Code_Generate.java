package The_Ast.Code_Generate;

import The_Ast.Semantic_Check.Semantic_Error;
import The_Ast.SympolTyple.Generate_Symbol_Table;

import The_Ast.SympolTyple.Scope;
import The_Ast.SympolTyple.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code_Generate extends Generate_Symbol_Table {
    FileWriter myWriter;
    ArrayList<String> list = new ArrayList<>();
    List<String> decler = new ArrayList<>();
    List<String> funName = new ArrayList<>();

    boolean hasControl = false;
    public List<String> word = new ArrayList<>();
    public List<String> page = new ArrayList<>();

    public void Generate(SymbolTable symbolTable) {
        mapset();

        for (int i = 0; i < symbolTable.getScopes().size(); i++) {
            Scope scope3 = symbolTable.getScopes().elementAt(i);
            if (scope3.isPart()) {
                try {


                    for (int j = 0; j < symbolTable.getScopes().elementAt(i).getSymbols().size(); j++) {
                        String scope = symbolTable.getScopes().elementAt(i).getSymbols().get(j).getToken();
                        String str = scope.replaceAll("\\s", "");
                        if (str.equals("interface")) {

                            String str1 = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "");


                            if (str1.equals("paint")) {
                                myWriter = new FileWriter(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + ".html");
                                String w = "<!DOCTYPE html>\n" +
                                        "<html>\n" +
                                        "<body>\n" +
                                        "\n" +
                                        "<h1" + " " + "style=" + "\"color:" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + "\"" +
                                        ";>" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + "</h1>\n" +
                                        "\n";
                                page.add(w);
                                String stre = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken();
                                String stre1 = stre.replaceAll("\"", "");
//                                String www = "<form action=\"http://" + "localhost/ProjectF/" + map.get(stre1.replaceAll(" ", "")) + ".php\"" + "method=" + "\"get\"" + ">"
//                                        + "\n";
//                                page.add(www);

                                if (map.get(stre1.replaceAll(" ", "")) != null) {
                                    hasControl = true;
                                    String f = "<form action=\"http://" + "localhost/ProjectF/" + map.get(stre1.replaceAll(" ", "")) + ".php\"" + "method=" + "\"get\"" + ">"
                                            + "\n";
                                    page.add(f);
                                }
                            } else {
                                myWriter = new FileWriter(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + ".html");
                                String w = "<!DOCTYPE html>\n" +
                                        "<html>\n" +
                                        "<body>\n" +
                                        "\n" +
                                        "<h1>" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "</h1>\n";
                                page.add(w);
                                String stre = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken();
                                String stre1 = stre.replaceAll("\"", "");
//                                String www = "<form action=\"http://" + "localhost/ProjectF/" + map.get(stre1.replaceAll(" ", "")) + ".php\"" + "method=" + "\"get\"" + ">"
//                                        + "\n";
//                                page.add(www);
                                if (map.get(stre1.replaceAll(" ", "")) != null) {
                                    hasControl = true;
                                    String f = "<form action=\"http://" + "localhost/ProjectF/" + map.get(stre1.replaceAll(" ", "")) + ".php\"" + "method=" + "\"get\"" + ">"
                                            + "\n";
                                    page.add(f);
                                }
////                                if (Semantic_Error.controller_Pages.get(stre1) != null) {
//
//                                    String www = "<form action=\"/" + "localhost/ProjectF/" + Semantic_Error.controller_Pages.get(stre1) + ".php\"" + "method=" + "\"get\"" + ">"
//                                            + "\n";
//                                    page.add(www);
//                                }
                            }
                        }


                        if (str.equals("link")) {

                            String n = "<p><a href=https://" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll("\'", "") +
                                    ">" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "</a></p>" + "\n";
                            page.add(n);

                        }
                        if (str.equals("list")) {

                            String n = "<ol>";
                        }
                        if (str.equals("#")) {

                            String nn = "<li>" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "") + "</li>";
                            page.add(nn);
                            if (j <= symbolTable.getScopes().elementAt(i).getSymbols().size() - 3) {
                                String sp1 = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "");
                                if (!sp1.equals("#")) {
                                    String nnn = "</ol>";
                                    page.add(nnn);
                                }
                            }
                        }
                        if (str.equals("check")) {
                            String n = " <input type=\"checkbox\" id=\"vehicle1\" name=\"vehicle1\" value=\"Bike\">\n" +
                                    "  <label >" +
                                    " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\'", "") + "</label><br>";
                            page.add(n);
                        }
                        if (str.equals("image")) {
                            String n = "<img src=\"" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\'", "") + "\"" +
                                    "/>" + "\n";
                            page.add(n);
                        }
                        if (str.equals("text")) {
                            String n = "<b>" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\"", "") +
                                    "</b>" + "\n";
                            page.add(n);

                        }
                        if (str.equals("field")) {

                            list.add(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\"", "").replaceAll(" ", ""));
                            String n =
                                    "<input type=\"text\" id=" + "\"" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll("\"", "") + "\""
                                            + " " + "name=" + "\"" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\"", "") + "\"" + "><br>";
                            page.add(n);

                        }
                        if (str.equals("radio")) {

                            String n = "<input type=\"radio\">\n" +
                                    " <label >" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\"", "") +
                                    "</label><br>" + "\n";
                            page.add(n);

                        }
                        if (str.equals("submit")) {
                            String www = "<input type=submit" + " value=" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll("\"", "") + ">";
                            page.add(www);
                        }

                    }
                    if (hasControl) {
                        String ww = "</form>" + "</body>" + "</html>";
                        page.add(ww);
                    } else {
                        String ww = "</body>" + "</html>";
                        page.add(ww);
                    }
                    for (String s : page
                    ) {
                        myWriter.write(s);
                    }
                    myWriter.close();
                    hasControl = false;
                    page.clear();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            if (!scope3.isPart()) {
                try {
                    for (int j = 0; j < symbolTable.getScopes().elementAt(i).getSymbols().size(); j++) {
                        String scope = symbolTable.getScopes().elementAt(i).getSymbols().get(j).getToken();
                        String str = scope.replaceAll("\\s", "");

                        if (str.equals("page")) {
                            String scope1 = symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken();
                            String str1 = scope1.replaceAll("\\s", "");

//                            if (Semantic_Error.controller_Pages.get(str1) != null) {
                            myWriter = new FileWriter("C:\\xampp\\htdocs\\ProjectF/" + str1 + ".php");
                            //}
                            String ww =
                                    "<html>\n" +
                                            "<body>\n" + "<?php\n";
                            word.add(ww);
                        }
                        if (str.equals("param")) {
                            if (j <= symbolTable.getScopes().elementAt(i).getSymbols().size() - 3) {
                                String com = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "");
                                if (com.equals(",")) {
                                    if (!decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""))) {
                                        System.err.println("\n" + "vareable not decler before" + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken());
                                        System.exit(0);
                                    } else {
                                        String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","")
                                                + " " + ",";
                                        word.add(ww);
                                    }
                                } else {
                                    if (!decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""))) {
                                        System.err.println("\n" + "variable not decler before" + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken());
                                        System.exit(0);
                                    } else {
                                        String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","");
                                        word.add(ww);
                                    }
                                }
                            }
                        }
                        if (str.replaceAll(" ", "").equals("=")) {
                            if (!symbolTable.getScopes().elementAt(i).
                                    getSymbols().get(j - 2).getToken().replaceAll(" ", "").equals("part1")) {
                                if (!symbolTable.getScopes().elementAt(i).
                                        getSymbols().get(j - 2).getToken().replaceAll(" ", "").equals("decler")) {


                                    if (!decler.contains(
                                            symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ", ""))
                                    ) {
                                        System.err.println("error use variable not decler" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken());
                                        System.exit(0);
                                    } else {
                                        if (j <= symbolTable.getScopes().elementAt(i).getSymbols().size() - 4) {
                                            if (symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("+")
                                                    || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("-")
                                                    || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("*")
                                                    || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("/")) {
                                                if(!symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").matches("[0-9]+"))
                                                {
                                                    if(decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "")))
                                                    {String ww =
                                                        "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ","")
                                                                + " " + str + " "
                                                                + "$"+symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","") + " " +
                                                                symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " " +
                                                                symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + ";";
                                                word.add(ww);}
                                                else{
                                                        System.err.println("vareable not decler before "+symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken());
                                                        System.exit(0);

                                                    }
                                                }
                                                else if(!symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken().replaceAll(" ", "").matches("[0-9]+"))
                                                {
                                                    if(decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken().replaceAll(" ", ""))){
                                                        String ww =
                                                        "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ","")
                                                                + " " + str + " "
                                                                + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + " " +
                                                                symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " " +
                                                                "$"+symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken().replaceAll(" ","") + ";";
                                                    word.add(ww);}
                                                else
                                                    {System.err.println("vareable not decler before "+symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken());
                                               System.exit(0);
                                                    }
                                                }
                                                else
                                                {
                                                    String ww =
                                                            "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ","")
                                                                    + " " + str + " "
                                                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + " " +
                                                                    symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " " +
                                                                    symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + ";";
                                                    word.add(ww);
                                                }

                                            } else {
                                                String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ","")
                                                        + " " + str + " "
                                                        + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + " " + ";";
                                                word.add(ww);
                                            }
                                        }
                                    }


                                }


                            }
                        }
                        if (str.equals("decler")) {
                            decler.add(
                                    symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "")
                            );
                            if (j < symbolTable.getScopes().elementAt(i).getSymbols().size() - 3) {
                                if (symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("=")) {
                                    if (j <= symbolTable.getScopes().elementAt(i).getSymbols().size() - 6) {
                                        if (symbolTable.getScopes().elementAt(i).getSymbols().get(j + 4).getToken().replaceAll(" ", "").equals("+")
                                                || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 4).getToken().replaceAll(" ", "").equals("-")
                                                || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 4).getToken().replaceAll(" ", "").equals("*")
                                                || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 4).getToken().replaceAll(" ", "").equals("/")) {
                                            String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","")
                                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " "
                                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + " "
                                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 4).getToken()
                                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 5).getToken() + ";";
                                            word.add(ww);
                                        } else {
                                            String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","")
                                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " "
                                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + " " + ";";
                                            word.add(ww);
                                        }
                                    }
                                } else {
                                    String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","") + ";" + "\n";
                                    word.add(ww);
                                }
                            }
                            System.out.println("$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","") + ";" + "\n"
                            );

                        }
                        if (str.equals("part3")) {

                            String ww = ";" + "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","")
                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + ")" + "{";
                            word.add(ww);
                        }
                        if (str.equals("part2")) {
                            String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","") + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken()
                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken();
                            word.add(ww);
                        }
                        if (str.equals("part1")) {
                            decler.add(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ",""));
                            String ww = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken()
                                    + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken() + " "
                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + " " + ";";
                            word.add(ww);

                        }
                        if (str.equals("if")) {
                            if (decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""))) {

                                String ww = "if(" + "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","")
                                        + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken()
                                        + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 3).getToken() + "){";
                                word.add(ww);

                            } else {
                                System.out.println("error vareable not exist" + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken());
                                System.exit(0);
                            }
                        }
                        if (str.equals("print")) {

                            System.out.println(list);
                                if (list.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""))) {
                                    String www = "echo" + " " + "$" + "_GET[" + "\""
                                            + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "\"" + "]" + ";"
                                            + "\n"
                                            + "echo" + " " + "\"<br>\"" + ";";
                                    word.add(www);
                                } else {
                                    String ww = "echo" + " " + "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ","") + ";" + "\n"
                                            + "echo" + " " + "\"<br>\"" + ";";

                                    word.add(ww);
                                }


                        }
                        if (str.equals("write")) {
                            String ww = "echo" + " " + "\"" + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "<br>\"" + ";";
                            word.add(ww);
                        }
                        if (str.equals("for")) {

                            String ww = "for(";
                            word.add(ww);
                        }
                        if (str.equals("function")) {
                            funName.add(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""));
                            String ww = "function" + " "
                                    + symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "(";
                            word.add(ww);
                        }
                        if ((str.replaceAll(" ", "").equals("++") || str.replaceAll(" ", "").equals("--")) &&
                                !symbolTable.getScopes().elementAt(i).getSymbols().get(j - 2).getToken().replaceAll(" ", "").equals("part3")) {
                            if (decler.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ", ""))
                            ) {
                                String s = "$" + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken().replaceAll(" ","") + " " + str + " " + ";" +
                                        "\n" + "echo \"<br>\"" + ";";
                                word.add(s);
                            } else {
                                System.err.println("variable not decler before" + " " + symbolTable.getScopes().elementAt(i).getSymbols().get(j - 1).getToken());
                                System.exit(0);
                            }
                        }
                        if (str.equals("cull")) {
                            if (funName.contains(symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", ""))) {
                                String ww = symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken() + "(";
                                word.add(ww);
                            } else {
                                System.out.println("error function is not exist");
                                System.exit(0);
                            }
                        }
                        if (str.equals("}")) {

                            String ww = "}";
                            word.add(ww);
                        }
                        if (str.equals(")")) {

                            if (j == symbolTable.getScopes().elementAt(i).getSymbols().size() - 1) {
                                String ww = ")" + ";";
                                word.add(ww);
                            } else {
                                if (symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("{")
                                        || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("decler")
                                        || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("print")
                                        || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("write")
                                        || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("if")
                                        || symbolTable.getScopes().elementAt(i).getSymbols().get(j + 1).getToken().replaceAll(" ", "").equals("for")
                                        || ((j <= symbolTable.getScopes().elementAt(i).getSymbols().size() - 3)
                                        && symbolTable.getScopes().elementAt(i).getSymbols().get(j + 2).getToken().replaceAll(" ", "").equals("=")
                                )) {
                                    String ww = ")" + "{";
                                    word.add(ww);
                                } else {
                                    String ww = ")" + ";";
                                    word.add(ww);
                                }
                            }
                        }
                    }
                    String ww = "?>";
                    word.add(ww);
                    ww = "</body>" + "</html>";
                    word.add(ww);
                    for (String s : word
                    ) {
                        myWriter.write(s);
                    }
                    myWriter.close();
                    word.clear();

                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }

}
