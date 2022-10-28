package The_Ast.Gen_Visitor;

import The_Ast.Generate_File.Common.Name;
import The_Ast.Generate_File.Common.Start_Compile;
import The_Ast.Generate_File.Desigin.*;

import The_Ast.Generate_File.Setting.*;
import The_Ast.Semantic_Check.Controller_pageCheck;
import The_Ast.Visitor_File.PARSER;
import The_Ast.Visitor_File.PARSERBaseVisitor;

import java.io.IOException;

public class Visitor extends PARSERBaseVisitor {
    @Override public Start_Compile visitStart_compile(PARSER.Start_compileContext ctx) {
        Start_Compile start_compile=new Start_Compile();
        if(ctx.the_setting()!=null)
        {
            for (int i = 0; i < ctx.the_setting().size(); i++) {
                start_compile.getThe_settings().add(visitThe_setting(ctx.the_setting(i)));
            }
        }
        if(ctx.the_desigin()!=null)
        {
            for (int i = 0; i < ctx.the_desigin().size(); i++) {
                start_compile.getThe_desigins().add(visitThe_desigin(ctx.the_desigin(i)));
            }
        }
        return start_compile; }
    @Override public The_Desigin visitThe_desigin(PARSER.The_desiginContext ctx) {
        The_Desigin the_desigin=new The_Desigin();
        if(ctx.DESIGIN()!=null)
        {
            the_desigin.setDesigin(ctx.DESIGIN().getText());
        }
        if(ctx.INTERFACE()!=null)
        {
            the_desigin.setInterface(ctx.INTERFACE().getText());
        }
        if(ctx.color()!=null)
        {
            the_desigin.setColor(visitColor(ctx.color()));
        }
        if(ctx.name()!=null)
        {
            System.out.println(ctx.name().getChild(0).getText());

            controller_pageCheck.pages.add(ctx.name().getChild(0).getText().replaceAll(" ",""));
            System.out.println(controller_pageCheck.pages);
            the_desigin.setName(visitName(ctx.name()));
controller_pageCheck.check_error();
        }
        if(ctx.CURLYOPEN()!=null)
        {
            the_desigin.setCurlyOpen(ctx.CURLYOPEN().getText());
        }
        if(ctx.combonent()!=null)
        {
            for (int i = 0; i < ctx.combonent().size(); i++) {
                the_desigin.getCombonent().add(visitCombonent(ctx.combonent(i)));
            }
        }
        if(ctx.CURLYCLOSE()!=null)
        {
            the_desigin.setCurlyClose(ctx.CURLYCLOSE().getText());
        }
        return the_desigin; }
    @Override public Color visitColor(PARSER.ColorContext ctx) {
        Color color=new Color();
        if(ctx.PAINT()!=null)
        {
            color.setPaint(ctx.PAINT().getText());
        }
        if(ctx.COLOR_NAME()!=null)
        {
            color.setColor_Name(ctx.COLOR_NAME().getText());
        }
        return color; }
    @Override public Name visitName(PARSER.NameContext ctx)  {
        Name name=new Name();
        if(ctx.NAME()!=null)
        {
            name.setName(ctx.NAME().getText());
        }
        return name; }
    @Override public Combonent visitCombonent(PARSER.CombonentContext ctx) {
        Combonent combonent=new Combonent();
        if(ctx.enter()!=null)
        {
            combonent.setEnter(visitEnter(ctx.enter()));
        }
        if(ctx.display()!=null)
        {
            combonent.setDisplay(visitDisplay(ctx.display()));
        }
        if(ctx.link()!=null)
        {
            combonent.setLink(visitLink(ctx.link()));
        }
        return combonent; }
    @Override public Enter visitEnter(PARSER.EnterContext ctx) {
        Enter enter=new Enter();
        if(ctx.ENTER()!=null)
        {
            enter.setEnter(ctx.ENTER().getText());
        }
        if(ctx.NAME()!=null)
        {
            enter.setName(ctx.NAME().getText());
        }
        if(ctx.COLOMN()!=null)
        {
            enter.setColomn(ctx.COLOMN().getText());
        }
        if(ctx.CHECK_BOX()!=null)
        {
            enter.setCheck_Box(ctx.CHECK_BOX().getText());
        }
        if(ctx.RADIO()!=null)
        {
            enter.setRadio(ctx.RADIO().getText());
        }
        if(ctx.FIELD()!=null)
        {
            enter.setField(ctx.FIELD().getText());
        }
        if(ctx.SUBMIT()!=null)
        {
            enter.setSubmit(ctx.SUBMIT().getText());
        }
        if(ctx.BRACOPEN()!=null)
        {
            enter.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.string()!=null)
        {
            enter.setStr(visitString(ctx.string()));
        }
        if(ctx.BRACCLOSE()!=null)
        {
            enter.setBracClose(ctx.BRACCLOSE().getText());
        }
        return enter; }
    @Override public Display visitDisplay(PARSER.DisplayContext ctx) {
        Display display=new Display();
        if(ctx.DISPLAY()!=null)
        {
            display.setDisplay(ctx.DISPLAY().getText());
        }
        if(ctx.NAME()!=null)
        {
            display.setName(ctx.NAME().getText());
        }
        if(ctx.COLOMN()!=null)
        {
            display.setColomn(ctx.COLOMN().getText());
        }
        if(ctx.image()!=null)
        {
            display.setImage(visitImage(ctx.image()));
        }
        if(ctx.text()!=null)
        {
            display.setText(visitText(ctx.text()));
        }
        if(ctx.list()!=null)
        {
            display.setList(visitList(ctx.list()));
        }
        return display; }
    @Override public List visitList(PARSER.ListContext ctx) {
        List list=new List();
        if(ctx.LIST()!=null)
        {
            list.setList(ctx.LIST().getText());
        }
        if(ctx.elements()!=null)
        {
            for (int i = 0; i < ctx.elements().size(); i++) {
                list.getElement().add(visitElements(ctx.elements(i)));
            }
        }
        return list; }
    @Override public Element visitElements(PARSER.ElementsContext ctx) {
        Element element=new Element();
        if(ctx.LI()!=null)
        {
            element.setLi(ctx.LI().getText());
        }
        if(ctx.BRACOPEN()!=null)
        {
            element.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.NAME()!=null)
        {
            element.setName(ctx.NAME().getText());
        }
        if(ctx.BRACCLOSE()!=null)
        {
            element.setBracClose(ctx.BRACCLOSE().getText());
        }
        return element; }
    @Override public Text visitText(PARSER.TextContext ctx) {
        Text text=new Text();
        if(ctx.TEXT()!=null)
        {
            text.setText(ctx.TEXT().getText());
        }

        if(ctx.BRACOPEN()!=null)
        {
            text.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.string()!=null)
        {
            text.setStr(visitString(ctx.string()));
        }
        if(ctx.BRACCLOSE()!=null)
        {
            text.setBracClose(ctx.BRACCLOSE().getText());
        }

        return text; }
    @Override public Image visitImage(PARSER.ImageContext ctx) {
        Image image=new Image();
        if(ctx.IMAGE()!=null)
        {
            image.setImage(ctx.IMAGE().getText());
        }

        if(ctx.BRACOPEN()!=null)
        {
            image.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.url()!=null)
        {
            image.setUrl(visitUrl(ctx.url()));
        }
        if(ctx.BRACCLOSE()!=null)
        {
            image.setBracClose(ctx.BRACCLOSE().getText());
        }
        return image; }
    @Override public Link visitLink(PARSER.LinkContext ctx) {
        Link link=new Link();
        if(ctx.LINK()!=null)
        {
            link.setLink(ctx.LINK().getText());
        }
        if(ctx.NAME()!=null)
        {
            link.setName(ctx.NAME().getText());
        }
        if(ctx.COLOMN()!=null)
        {
            link.setColomn(ctx.COLOMN().getText());
        }
        if(ctx.url()!=null)
        {
            link.setUrl(visitUrl(ctx.url()));
        }
        return link; }
    @Override public Str visitString(PARSER.StringContext ctx) {
        Str str=new Str();
        if(ctx.String()!=null)
        {
            str.setString(ctx.String().getText());
        }
        return str; }
    @Override public Url visitUrl(PARSER.UrlContext ctx) {
        Url url=new Url();
        if(ctx.URL()!=null)
        {
            url.setUrl(ctx.URL().getText());
        }
        return url; }
    //Semantic_Error semantic_error=new Semantic_Error();
    @Override public The_Setting visitThe_setting(PARSER.The_settingContext ctx)  {
        The_Setting the_setting=new The_Setting();
        if(ctx.SETTING()!=null)
        {
            the_setting.setSetting(ctx.SETTING().getText());
        }
        if(ctx.CONTROLLER()!=null)
        {
            the_setting.setController(ctx.CONTROLLER().getText());
        }
        if(ctx.name()!=null)
        {

            the_setting.setName(visitName(ctx.name()));
        }
        if(ctx.CONTROL()!=null)
        {
            the_setting.setControl(ctx.CONTROL().getText());
        }
        if(ctx.PAGE()!=null)
        {
            the_setting.setPage(ctx.PAGE().getText());
        }
        if(ctx.NAME()!=null)
        {
            controller_pageCheck.controller_page.add
                    (ctx.NAME().getText().replaceAll(" ",""));

            the_setting.setNamee(ctx.NAME().getText());
//            controller_pageCheck.check_error();
        }
        if(ctx.CURLYOPEN()!=null)
        {
            the_setting.setCurlyOpen(ctx.CURLYOPEN().getText());
        }
        if(ctx.control_body()!=null)
        {
            for (int i = 0; i < ctx.control_body().size(); i++) {
                the_setting.getControl_bodies().add(visitControl_body(ctx.control_body(i)));
            }
        }
        if(ctx.CURLYCLOSE()!=null)
        {
            the_setting.setCurlyClose(ctx.CURLYCLOSE().getText());
        }return the_setting; }
    Controller_pageCheck controller_pageCheck=new Controller_pageCheck();
    @Override public Control_Body visitControl_body(PARSER.Control_bodyContext ctx) {
        Control_Body control_body=new Control_Body();
        if(ctx.condetion()!=null)
        {
            control_body.setCondetion(visitCondetion(ctx.condetion()));
        }
       else if(ctx.cull_func()!=null)
        {
            control_body.setCull_function((visitCull_func(ctx.cull_func())));
        }
       else if(ctx.function()!=null)
        {
            control_body.setFunction(visitFunction(ctx.function()));
        }
       else if(ctx.move_page()!=null)
        {
            control_body.setMove_page(visitMove_page(ctx.move_page()));
        }
       else if(ctx.loop()!=null)
        {
            control_body.setLoop(visitLoop(ctx.loop()));
        }
       else if(ctx.equality()!=null)
        {
            control_body.setEquality(visitEquality(ctx.equality()));
        }
        else if(ctx.equality_value()!=null)
        {
            control_body.setEquality_value(visitEquality_value(ctx.equality_value()));
        }
       else if(ctx.print()!=null)
        {
            control_body.setPrint(visitPrint(ctx.print()));
        }
       else if(ctx.printSTRING()!=null)
        {
            control_body.setPrint_string(visitPrintSTRING(ctx.printSTRING()));
        }
        return control_body; }
    @Override public Print_String visitPrintSTRING(PARSER.PrintSTRINGContext ctx) {
        Print_String print_string=new Print_String();
        if (ctx.WRITEE()!=null)
        {
            print_string.setWrite(ctx.WRITEE().getText());
        }
        if (ctx.NAME()!=null)
        {
            print_string.setName(ctx.NAME().getText());
        }
        return print_string; }
    @Override public Move_Page visitMove_page(PARSER.Move_pageContext ctx) {
        Move_Page move_page=new Move_Page();
        if(ctx.PAGE()!=null)
        {
            move_page.setPage(ctx.PAGE().getText());
        }
        if(ctx.NAME()!=null)
        {
            move_page.setName(ctx.NAME().getText());
        }
        return move_page; }
    @Override public Print visitPrint(PARSER.PrintContext ctx) {
        Print print=new Print();
        if(ctx.WRITE()!=null)
        {
            print.setPrint(ctx.WRITE().getText());
        }
        if(ctx.NAME()!=null)
        {
            print.setName(ctx.NAME().getText());
        }
        return print; }
    @Override public Cull_Function visitCull_func(PARSER.Cull_funcContext ctx) {
        Cull_Function cull_function=new Cull_Function();
        if(ctx.CULL()!=null)
        {
            cull_function.setCull(ctx.CULL().getText());
        }
        if(ctx.NAME()!=null)
        {
            cull_function.setName(ctx.NAME().getText());
        }
        if(ctx.BRACOPEN()!=null)
        {
            cull_function.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.parameters()!=null)
        {
            for (int i = 0; i < ctx.parameters().size(); i++) {
                cull_function.getParameters().add(visitParameters(ctx.parameters(i)));
            }
        }
        if(ctx.BRACCLOSE()!=null)
        {
            cull_function.setBracClose(ctx.BRACCLOSE().getText());
        }
        return cull_function; }
    @Override public Loop visitLoop(PARSER.LoopContext ctx) {
        Loop loop=new Loop();
        if(ctx.FOR()!=null)
        {
            loop.setFore(ctx.FOR().getText());
        }
        if(ctx.BRACOPEN()!=null)
        {
            loop.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.part1()!=null)
        {
            loop.setPart1(visitPart1(ctx.part1()));
        }
        if(ctx.part2()!=null)
        {
            loop.setPart2(visitPart2(ctx.part2()));
        }
        if(ctx.part3()!=null)
        {
            loop.setPart3(visitPart3(ctx.part3()));
        }
        if(ctx.BRACCLOSE()!=null)
        {
            loop.setBracClose(ctx.BRACCLOSE().getText());
        }
        if(ctx.CURLYOPEN()!=null)
        {
            loop.setCurlyOpen(ctx.CURLYOPEN().getText());
        }
        if(ctx.control_body()!=null)
        {
            for (int i = 0; i < ctx.control_body().size(); i++) {
                loop.getControl_bodies().add(visitControl_body(ctx.control_body(i)));
            }
        }
        if(ctx.CURLYCLOSE()!=null)
        {
            loop.setCurlyClose(ctx.CURLYCLOSE().getText());
        }
        return loop; }
    @Override public Part1 visitPart1(PARSER.Part1Context ctx) {
        Part1 part1=new Part1();
        if(ctx.PART1()!=null)
        {
            part1.setPart1(ctx.PART1().getText());
        }
        if(ctx.equality()!=null) {
            part1.setEquality(visitEquality(ctx.equality()));
        }
        return part1; }
    @Override public Part2 visitPart2(PARSER.Part2Context ctx) {
        Part2 part2=new Part2();
        if(ctx.PART2()!=null)
        {
            part2.setPart2(ctx.PART2().getText());
        }
        if(ctx.condetion_stetment()!=null)
        {
            part2.setCondetion_stetment(visitCondetion_stetment(ctx.condetion_stetment()));
        }

        return part2; }
    @Override public Part3 visitPart3(PARSER.Part3Context ctx) {
        Part3 part3=new Part3();
        if(ctx.PART3()!=null)
        {
            part3.setPart3(ctx.PART3().getText());
        }
        if(ctx.equality_value()!=null)
        {
            part3.setEquality_value(visitEquality_value(ctx.equality_value()));
        }
        return part3; }
    @Override public Equality_Value visitEquality_value(PARSER.Equality_valueContext ctx) {
        Equality_Value equality_value=new Equality_Value();
        if(ctx.NAME()!=null)
        {
            equality_value.setName(ctx.NAME().getText());
        }
        if(ctx.SIGNAL()!=null)
        {
            equality_value.setSignal(ctx.SIGNAL().getText());
        }
        return equality_value; }
    @Override public Equality visitEquality(PARSER.EqualityContext ctx) {
        Equality equality=new Equality();
        if(ctx.DECLER()!=null)
        {
            equality.setDecler(ctx.DECLER().getText());
        }
        if(ctx.NAME()!=null)
        {
            equality.setName(ctx.NAME().getText());
        }
        if(ctx.EQUAL()!=null)
        {
            equality.setEqual(ctx.EQUAL().getText());
        }
        if(ctx.NUMBER()!=null)
        {
            equality.setNumber(ctx.NUMBER().getText());
        }
        if(ctx.operant()!=null)
        {
            equality.setOperant(visitOperant(ctx.operant()));
        }
        return equality; }
    @Override public Condetion visitCondetion(PARSER.CondetionContext ctx) {
        Condetion condition=new Condetion();
        if(ctx.IF()!=null)
        {
            condition.setIff(ctx.IF().getText());
        }
        if(ctx.BRACOPEN()!=null)
        {
            condition.setBracOpen(ctx.BRACOPEN().getText());
        }
        if(ctx.condetion_stetment()!=null)
        {
            condition.setCondetion_stetment(visitCondetion_stetment(ctx.condetion_stetment()));
        }
        if(ctx.BRACCLOSE()!=null)
        {
            condition.setBracClose(ctx.BRACCLOSE().getText());
        }
        if(ctx.CURLYOPEN()!=null)
        {
            condition.setCurlyOpen(ctx.CURLYOPEN().getText());
        }
        if(ctx.control_body()!=null)
        {
            for (int i = 0; i < ctx.control_body().size(); i++) {
                condition.getControl_bodies().add(visitControl_body(ctx.control_body(i)));
            }
        }
        if(ctx.CURLYCLOSE()!=null)
        {
            condition.setCurlyClose(ctx.CURLYCLOSE().getText());
        }
        return condition; }
    @Override public Function visitFunction(PARSER.FunctionContext ctx) {
        Function function=new Function();
        if(ctx.FUNCTION()!=null)
        {
            function.setFun(ctx.FUNCTION().getText());
        }
        if(ctx.name()!=null)
        {
            function.setName(visitName(ctx.name()));
        }
        if(ctx.BRACOPEN()!=null)
        {
            function.setBracOpen(ctx.BRACOPEN().getText());
        }
            if(ctx.parameters()!=null)
            {
                for (int i = 0; i < ctx.parameters().size(); i++) {
                    function.getParameters().add(visitParameters(ctx.parameters(i)));
                }
            }
            if(ctx.BRACCLOSE()!=null)
            {
                function.setBracClose(ctx.BRACCLOSE().getText());
            }
            if(ctx.CURLYOPEN()!=null)
            {
                function.setCurlyOpen(ctx.CURLYOPEN().getText());
            }
            if(ctx.control_body()!=null)
            {
                for (int i = 0; i < ctx.control_body().size(); i++) {
                    function.getControl_bodies().add(visitControl_body(ctx.control_body(i)));
                }
            }
            if(ctx.CURLYCLOSE()!=null)
            {
                function.setCurlyClose(ctx.CURLYCLOSE().getText());
            }
        return function; }
    @Override public Condetion_Stetment visitCondetion_stetment(PARSER.Condetion_stetmentContext ctx) {
        Condetion_Stetment condetion_stetment=new Condetion_Stetment();
        if(ctx.side()!=null)
        {
            condetion_stetment.setSide1(visitSide(ctx.side(0)));
        }
        if(ctx.cond_att()!=null)
        {
            condetion_stetment.setCond_att(visitCond_att(ctx.cond_att()));
        }
        if(ctx.side()!=null)
        {
            condetion_stetment.setSide2(visitSide(ctx.side(1)));
        }
        return condetion_stetment; }
    @Override public Side visitSide(PARSER.SideContext ctx) {
        Side side=new Side();
        if(ctx.NAME()!=null)
        {
            side.setName(ctx.NAME().getText());
        }
        if(ctx.NUMBER()!=null)
        {
            side.setNumber(ctx.NUMBER().getText());
        }
        return side; }
    @Override public Cond_Att visitCond_att(PARSER.Cond_attContext ctx) {
        Cond_Att cond_att=new Cond_Att();
        if(ctx.COMPARISON()!=null)
        {
            cond_att.setComparison(ctx.COMPARISON().getText());
        }
        return cond_att; }
    @Override public Parameters visitParameters(PARSER.ParametersContext ctx) {
        Parameters parameters=new Parameters();
        if(ctx.param()!=null)
        {
            parameters.setParam(visitParam(ctx.param()));
        }
        if(ctx.params()!=null)
        {
            parameters.setParams(visitParams(ctx.params()));
        }
        return parameters; }
    @Override public Param visitParam(PARSER.ParamContext ctx) {
        Param param=new Param();
        if(ctx.PARAM()!=null)
        {
            param.setParem(ctx.PARAM().getText());
        }
        if(ctx.NAME()!=null)
        {
            param.setName(ctx.NAME().getText());
        }
        return param; }
    @Override public Params visitParams(PARSER.ParamsContext ctx) {
        Params params=new Params();
        if(ctx.PARAM()!=null)
        {
            params.setParam(ctx.PARAM().getText());
        }
        if(ctx.NAME()!=null)
        {
            params.setName(ctx.NAME().getText());
        }
        if(ctx.COMA()!=null)
        {
            params.setComa(ctx.COMA().getText());
        }
        return params; }
    @Override public Operant visitOperant(PARSER.OperantContext ctx) {
        Operant operant=new Operant();
        if (ctx.SIGNAL()!=null)
        {
            operant.setSIGNAL(ctx.SIGNAL().getText());
        }
        if(ctx.NAME()!=null)
        {
            operant.setNAME(ctx.NAME().getText());
        }
        else if (ctx.NUMBER()!=null)
        {
            operant.setNUMBER(ctx.NUMBER().getText());
        }
        return operant; }
}
