package The_Ast.Semantic_Check;

import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Semantic_Error {

    public static Set<String> getImportant() {
        return important;
    }

    public static void setImportant(Set<String> important) {
        Semantic_Error.important = important;
    }

    public static  Set<String> important=new HashSet<String>();

    public static Map<String, String> getController_Pages() {
        return controller_Pages;
    }

    public static void setController_Pages(Map<String, String> controller_Pages) {
        Semantic_Error.controller_Pages = controller_Pages;
    }

    public static Map<String,String> controller_Pages=new HashMap<>();

}
