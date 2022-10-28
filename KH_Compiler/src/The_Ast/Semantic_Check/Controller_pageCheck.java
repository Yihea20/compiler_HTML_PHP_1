package The_Ast.Semantic_Check;

import java.util.ArrayList;
import java.util.Map;

public class Controller_pageCheck {
    public ArrayList<String> pages = new ArrayList<>();
    public ArrayList<String> controller_page = new ArrayList<>();

    public void check_error() {
        System.out.println(pages);
        for (String p : controller_page
        ) {
            if (!pages.contains(p)
            ) {

                System.err.println("controller for page not define" );
                System.exit(0);
            }
        }

    }

}
