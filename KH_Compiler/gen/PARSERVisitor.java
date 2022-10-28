// Generated from C:/Users/yihea/IdeaProjects/KH_Compiler\PARSER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PARSER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PARSERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PARSER#start_compile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_compile(PARSER.Start_compileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#the_desigin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_desigin(PARSER.The_desiginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(PARSER.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(PARSER.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#combonent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombonent(PARSER.CombonentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#enter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnter(PARSER.EnterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(PARSER.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(PARSER.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(PARSER.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PARSER.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(PARSER.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(PARSER.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PARSER.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(PARSER.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#the_setting}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThe_setting(PARSER.The_settingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#control_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_body(PARSER.Control_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#move_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_page(PARSER.Move_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PARSER.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#cull_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCull_func(PARSER.Cull_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(PARSER.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#part1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart1(PARSER.Part1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#part2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart2(PARSER.Part2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#part3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPart3(PARSER.Part3Context ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#equality_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_value(PARSER.Equality_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(PARSER.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#condetion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondetion(PARSER.CondetionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(PARSER.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#condetion_stetment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondetion_stetment(PARSER.Condetion_stetmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSide(PARSER.SideContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#cond_att}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_att(PARSER.Cond_attContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PARSER.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PARSER.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PARSER.ParamsContext ctx);
}