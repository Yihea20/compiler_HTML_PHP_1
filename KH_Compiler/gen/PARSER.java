// Generated from C:/Users/yihea/IdeaProjects/KH_Compiler\PARSER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PARSER extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DESIGIN=1, INTERFACE=2, PAINT=3, COLOR_NAME=4, ENTER=5, PAGE=6, CULL=7, 
		PARAM=8, PART1=9, PART2=10, PART3=11, IF=12, FOR=13, DECLER=14, SETTING=15, 
		FUNCTION=16, CONTROLLER=17, CONTROL=18, DISPLAY=19, SUBMIT=20, FIELD=21, 
		CHECK_BOX=22, RADIO=23, TEXT=24, IMAGE=25, LINK=26, LIST=27, COLOMN=28, 
		COMA=29, CURLYOPEN=30, CURLYCLOSE=31, BRACOPEN=32, BRACCLOSE=33, String=34, 
		URL=35, TAG_WHITESPACE=36, NAME=37, LI=38, NUMBER=39, SIGNAL=40, EQUAL=41, 
		COMPARISON=42, WRITE=43;
	public static final int
		RULE_start_compile = 0, RULE_the_desigin = 1, RULE_color = 2, RULE_name = 3, 
		RULE_combonent = 4, RULE_enter = 5, RULE_display = 6, RULE_list = 7, RULE_elements = 8, 
		RULE_text = 9, RULE_image = 10, RULE_link = 11, RULE_string = 12, RULE_url = 13, 
		RULE_the_setting = 14, RULE_control_body = 15, RULE_move_page = 16, RULE_print = 17, 
		RULE_cull_func = 18, RULE_loop = 19, RULE_part1 = 20, RULE_part2 = 21, 
		RULE_part3 = 22, RULE_equality_value = 23, RULE_equality = 24, RULE_condetion = 25, 
		RULE_function = 26, RULE_condetion_stetment = 27, RULE_side = 28, RULE_cond_att = 29, 
		RULE_parameters = 30, RULE_param = 31, RULE_params = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_compile", "the_desigin", "color", "name", "combonent", "enter", 
			"display", "list", "elements", "text", "image", "link", "string", "url", 
			"the_setting", "control_body", "move_page", "print", "cull_func", "loop", 
			"part1", "part2", "part3", "equality_value", "equality", "condetion", 
			"function", "condetion_stetment", "side", "cond_att", "parameters", "param", 
			"params"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DESIGIN", "INTERFACE", "PAINT", "COLOR_NAME", "ENTER", "PAGE", 
			"CULL", "PARAM", "PART1", "PART2", "PART3", "IF", "FOR", "DECLER", "SETTING", 
			"FUNCTION", "CONTROLLER", "CONTROL", "DISPLAY", "SUBMIT", "FIELD", "CHECK_BOX", 
			"RADIO", "TEXT", "IMAGE", "LINK", "LIST", "COLOMN", "COMA", "CURLYOPEN", 
			"CURLYCLOSE", "BRACOPEN", "BRACCLOSE", "String", "URL", "TAG_WHITESPACE", 
			"NAME", "LI", "NUMBER", "SIGNAL", "EQUAL", "COMPARISON", "WRITE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PARSER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PARSER(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_compileContext extends ParserRuleContext {
		public List<The_desiginContext> the_desigin() {
			return getRuleContexts(The_desiginContext.class);
		}
		public The_desiginContext the_desigin(int i) {
			return getRuleContext(The_desiginContext.class,i);
		}
		public List<The_settingContext> the_setting() {
			return getRuleContexts(The_settingContext.class);
		}
		public The_settingContext the_setting(int i) {
			return getRuleContext(The_settingContext.class,i);
		}
		public Start_compileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_compile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitStart_compile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_compileContext start_compile() throws RecognitionException {
		Start_compileContext _localctx = new Start_compileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_compile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				the_desigin();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DESIGIN );
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SETTING) {
				{
				{
				setState(71);
				the_setting();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class The_desiginContext extends ParserRuleContext {
		public TerminalNode DESIGIN() { return getToken(PARSER.DESIGIN, 0); }
		public TerminalNode INTERFACE() { return getToken(PARSER.INTERFACE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public List<CombonentContext> combonent() {
			return getRuleContexts(CombonentContext.class);
		}
		public CombonentContext combonent(int i) {
			return getRuleContext(CombonentContext.class,i);
		}
		public The_desiginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the_desigin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitThe_desigin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final The_desiginContext the_desigin() throws RecognitionException {
		The_desiginContext _localctx = new The_desiginContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_the_desigin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(DESIGIN);
			setState(78);
			match(INTERFACE);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAINT) {
				{
				setState(79);
				color();
				}
			}

			setState(82);
			name();
			setState(83);
			match(CURLYOPEN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTER) | (1L << DISPLAY) | (1L << LINK))) != 0)) {
				{
				{
				setState(84);
				combonent();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode PAINT() { return getToken(PARSER.PAINT, 0); }
		public TerminalNode COLOR_NAME() { return getToken(PARSER.COLOR_NAME, 0); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PAINT);
			setState(93);
			match(COLOR_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CombonentContext extends ParserRuleContext {
		public EnterContext enter() {
			return getRuleContext(EnterContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public CombonentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combonent; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCombonent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombonentContext combonent() throws RecognitionException {
		CombonentContext _localctx = new CombonentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_combonent);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				enter();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				display();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				link();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnterContext extends ParserRuleContext {
		public TerminalNode ENTER() { return getToken(PARSER.ENTER, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CHECK_BOX() { return getToken(PARSER.CHECK_BOX, 0); }
		public TerminalNode RADIO() { return getToken(PARSER.RADIO, 0); }
		public TerminalNode FIELD() { return getToken(PARSER.FIELD, 0); }
		public TerminalNode SUBMIT() { return getToken(PARSER.SUBMIT, 0); }
		public EnterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEnter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnterContext enter() throws RecognitionException {
		EnterContext _localctx = new EnterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ENTER);
			setState(103);
			match(NAME);
			setState(104);
			match(COLOMN);
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUBMIT) | (1L << FIELD) | (1L << CHECK_BOX) | (1L << RADIO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(106);
			match(BRACOPEN);
			setState(107);
			string();
			setState(108);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(PARSER.DISPLAY, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DISPLAY);
			setState(111);
			match(NAME);
			setState(112);
			match(COLOMN);
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				{
				setState(113);
				text();
				}
				break;
			case IMAGE:
				{
				setState(114);
				image();
				}
				break;
			case LIST:
				{
				setState(115);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(PARSER.LIST, 0); }
		public List<ElementsContext> elements() {
			return getRuleContexts(ElementsContext.class);
		}
		public ElementsContext elements(int i) {
			return getRuleContext(ElementsContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(LIST);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LI) {
				{
				{
				setState(119);
				elements();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementsContext extends ParserRuleContext {
		public TerminalNode LI() { return getToken(PARSER.LI, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(LI);
			setState(126);
			match(BRACOPEN);
			setState(127);
			match(NAME);
			setState(128);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PARSER.TEXT, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(TEXT);
			setState(131);
			match(BRACOPEN);
			setState(132);
			string();
			setState(133);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(PARSER.IMAGE, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_image);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IMAGE);
			setState(136);
			match(BRACOPEN);
			setState(137);
			url();
			setState(138);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(PARSER.LINK, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COLOMN() { return getToken(PARSER.COLOMN, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(LINK);
			setState(141);
			match(NAME);
			setState(142);
			match(COLOMN);
			setState(143);
			url();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(PARSER.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(PARSER.URL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(URL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class The_settingContext extends ParserRuleContext {
		public TerminalNode SETTING() { return getToken(PARSER.SETTING, 0); }
		public TerminalNode CONTROLLER() { return getToken(PARSER.CONTROLLER, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CONTROL() { return getToken(PARSER.CONTROL, 0); }
		public TerminalNode PAGE() { return getToken(PARSER.PAGE, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Control_bodyContext> control_body() {
			return getRuleContexts(Control_bodyContext.class);
		}
		public Control_bodyContext control_body(int i) {
			return getRuleContext(Control_bodyContext.class,i);
		}
		public The_settingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the_setting; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitThe_setting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final The_settingContext the_setting() throws RecognitionException {
		The_settingContext _localctx = new The_settingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_the_setting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(SETTING);
			setState(150);
			match(CONTROLLER);
			setState(151);
			name();
			setState(152);
			match(CONTROL);
			setState(153);
			match(PAGE);
			setState(154);
			match(NAME);
			setState(155);
			match(CURLYOPEN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAGE) | (1L << CULL) | (1L << IF) | (1L << FOR) | (1L << DECLER) | (1L << FUNCTION) | (1L << NAME) | (1L << WRITE))) != 0)) {
				{
				{
				setState(156);
				control_body();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Control_bodyContext extends ParserRuleContext {
		public CondetionContext condetion() {
			return getRuleContext(CondetionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public Equality_valueContext equality_value() {
			return getRuleContext(Equality_valueContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Cull_funcContext cull_func() {
			return getRuleContext(Cull_funcContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Move_pageContext move_page() {
			return getRuleContext(Move_pageContext.class,0);
		}
		public Control_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_control_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitControl_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Control_bodyContext control_body() throws RecognitionException {
		Control_bodyContext _localctx = new Control_bodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_control_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164);
				condetion();
				}
				break;
			case 2:
				{
				setState(165);
				loop();
				}
				break;
			case 3:
				{
				setState(166);
				equality_value();
				}
				break;
			case 4:
				{
				setState(167);
				equality();
				}
				break;
			case 5:
				{
				setState(168);
				cull_func();
				}
				break;
			case 6:
				{
				setState(169);
				print();
				}
				break;
			case 7:
				{
				setState(170);
				function();
				}
				break;
			case 8:
				{
				setState(171);
				move_page();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_pageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(PARSER.PAGE, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public Move_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_page; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitMove_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_pageContext move_page() throws RecognitionException {
		Move_pageContext _localctx = new Move_pageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_move_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(PAGE);
			setState(175);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(PARSER.WRITE, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(WRITE);
			setState(178);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cull_funcContext extends ParserRuleContext {
		public TerminalNode CULL() { return getToken(PARSER.CULL, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public Cull_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cull_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCull_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cull_funcContext cull_func() throws RecognitionException {
		Cull_funcContext _localctx = new Cull_funcContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cull_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(CULL);
			setState(181);
			match(NAME);
			setState(182);
			match(BRACOPEN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM) {
				{
				{
				setState(183);
				parameters();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(BRACCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PARSER.FOR, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public Part1Context part1() {
			return getRuleContext(Part1Context.class,0);
		}
		public Part2Context part2() {
			return getRuleContext(Part2Context.class,0);
		}
		public Part3Context part3() {
			return getRuleContext(Part3Context.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Control_bodyContext> control_body() {
			return getRuleContexts(Control_bodyContext.class);
		}
		public Control_bodyContext control_body(int i) {
			return getRuleContext(Control_bodyContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOR);
			setState(192);
			match(BRACOPEN);
			setState(193);
			part1();
			setState(194);
			part2();
			setState(195);
			part3();
			setState(196);
			match(BRACCLOSE);
			setState(197);
			match(CURLYOPEN);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAGE) | (1L << CULL) | (1L << IF) | (1L << FOR) | (1L << DECLER) | (1L << FUNCTION) | (1L << NAME) | (1L << WRITE))) != 0)) {
				{
				{
				setState(198);
				control_body();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part1Context extends ParserRuleContext {
		public TerminalNode PART1() { return getToken(PARSER.PART1, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Part1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part1; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPart1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part1Context part1() throws RecognitionException {
		Part1Context _localctx = new Part1Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_part1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(PART1);
			setState(207);
			equality();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part2Context extends ParserRuleContext {
		public TerminalNode PART2() { return getToken(PARSER.PART2, 0); }
		public Condetion_stetmentContext condetion_stetment() {
			return getRuleContext(Condetion_stetmentContext.class,0);
		}
		public Part2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPart2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part2Context part2() throws RecognitionException {
		Part2Context _localctx = new Part2Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_part2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(PART2);
			setState(210);
			condetion_stetment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Part3Context extends ParserRuleContext {
		public TerminalNode PART3() { return getToken(PARSER.PART3, 0); }
		public Equality_valueContext equality_value() {
			return getRuleContext(Equality_valueContext.class,0);
		}
		public Part3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_part3; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitPart3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Part3Context part3() throws RecognitionException {
		Part3Context _localctx = new Part3Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_part3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(PART3);
			setState(213);
			equality_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equality_valueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode SIGNAL() { return getToken(PARSER.SIGNAL, 0); }
		public Equality_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEquality_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equality_valueContext equality_value() throws RecognitionException {
		Equality_valueContext _localctx = new Equality_valueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equality_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(NAME);
			setState(216);
			match(SIGNAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualityContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode DECLER() { return getToken(PARSER.DECLER, 0); }
		public TerminalNode EQUAL() { return getToken(PARSER.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLER) {
				{
				setState(218);
				match(DECLER);
				}
			}

			setState(221);
			match(NAME);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(222);
				match(EQUAL);
				}
			}

			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(225);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondetionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PARSER.IF, 0); }
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public Condetion_stetmentContext condetion_stetment() {
			return getRuleContext(Condetion_stetmentContext.class,0);
		}
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<Control_bodyContext> control_body() {
			return getRuleContexts(Control_bodyContext.class);
		}
		public Control_bodyContext control_body(int i) {
			return getRuleContext(Control_bodyContext.class,i);
		}
		public CondetionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condetion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCondetion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondetionContext condetion() throws RecognitionException {
		CondetionContext _localctx = new CondetionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condetion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IF);
			setState(229);
			match(BRACOPEN);
			setState(230);
			condetion_stetment();
			setState(231);
			match(BRACCLOSE);
			setState(232);
			match(CURLYOPEN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAGE) | (1L << CULL) | (1L << IF) | (1L << FOR) | (1L << DECLER) | (1L << FUNCTION) | (1L << NAME) | (1L << WRITE))) != 0)) {
				{
				{
				setState(233);
				control_body();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PARSER.FUNCTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode BRACOPEN() { return getToken(PARSER.BRACOPEN, 0); }
		public TerminalNode BRACCLOSE() { return getToken(PARSER.BRACCLOSE, 0); }
		public TerminalNode CURLYOPEN() { return getToken(PARSER.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(PARSER.CURLYCLOSE, 0); }
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<Control_bodyContext> control_body() {
			return getRuleContexts(Control_bodyContext.class);
		}
		public Control_bodyContext control_body(int i) {
			return getRuleContext(Control_bodyContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(FUNCTION);
			setState(242);
			name();
			setState(243);
			match(BRACOPEN);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARAM) {
				{
				{
				setState(244);
				parameters();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(250);
			match(BRACCLOSE);
			setState(251);
			match(CURLYOPEN);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAGE) | (1L << CULL) | (1L << IF) | (1L << FOR) | (1L << DECLER) | (1L << FUNCTION) | (1L << NAME) | (1L << WRITE))) != 0)) {
				{
				{
				setState(252);
				control_body();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condetion_stetmentContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public Cond_attContext cond_att() {
			return getRuleContext(Cond_attContext.class,0);
		}
		public Condetion_stetmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condetion_stetment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCondetion_stetment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condetion_stetmentContext condetion_stetment() throws RecognitionException {
		Condetion_stetmentContext _localctx = new Condetion_stetmentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condetion_stetment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			side();
			setState(261);
			cond_att();
			setState(262);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SideContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PARSER.NUMBER, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_side);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_attContext extends ParserRuleContext {
		public TerminalNode COMPARISON() { return getToken(PARSER.COMPARISON, 0); }
		public Cond_attContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_att; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitCond_att(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_attContext cond_att() throws RecognitionException {
		Cond_attContext _localctx = new Cond_attContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cond_att);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(COMPARISON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameters);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				params();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(PARSER.PARAM, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(PARAM);
			setState(273);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(PARSER.PARAM, 0); }
		public TerminalNode NAME() { return getToken(PARSER.NAME, 0); }
		public TerminalNode COMA() { return getToken(PARSER.COMA, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(PARAM);
			setState(276);
			match(NAME);
			setState(277);
			match(COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0118\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0004\u0000D\b\u0000"+
		"\u000b\u0000\f\u0000E\u0001\u0000\u0005\u0000I\b\u0000\n\u0000\f\u0000"+
		"L\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Q\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001V\b\u0001\n\u0001\f\u0001Y\t"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004e\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006u\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u009e\b\u000e\n\u000e\f\u000e\u00a1\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u00ad\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00b9\b\u0012\n\u0012\f\u0012\u00bc"+
		"\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00c8"+
		"\b\u0013\n\u0013\f\u0013\u00cb\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0003\u0018\u00dc\b\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00e0\b"+
		"\u0018\u0001\u0018\u0003\u0018\u00e3\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00eb\b\u0019\n"+
		"\u0019\f\u0019\u00ee\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00f6\b\u001a\n\u001a\f\u001a"+
		"\u00f9\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u00fe\b"+
		"\u001a\n\u001a\f\u001a\u0101\t\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u010f\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0000\u0000"+
		"!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@\u0000\u0002\u0001\u0000\u0014\u0017\u0002"+
		"\u0000%%\'\'\u0110\u0000C\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000"+
		"\u0000\u0004\\\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000"+
		"\bd\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000\u0000\fn\u0001\u0000"+
		"\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000"+
		"\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000"+
		"\u0016\u008c\u0001\u0000\u0000\u0000\u0018\u0091\u0001\u0000\u0000\u0000"+
		"\u001a\u0093\u0001\u0000\u0000\u0000\u001c\u0095\u0001\u0000\u0000\u0000"+
		"\u001e\u00ac\u0001\u0000\u0000\u0000 \u00ae\u0001\u0000\u0000\u0000\""+
		"\u00b1\u0001\u0000\u0000\u0000$\u00b4\u0001\u0000\u0000\u0000&\u00bf\u0001"+
		"\u0000\u0000\u0000(\u00ce\u0001\u0000\u0000\u0000*\u00d1\u0001\u0000\u0000"+
		"\u0000,\u00d4\u0001\u0000\u0000\u0000.\u00d7\u0001\u0000\u0000\u00000"+
		"\u00db\u0001\u0000\u0000\u00002\u00e4\u0001\u0000\u0000\u00004\u00f1\u0001"+
		"\u0000\u0000\u00006\u0104\u0001\u0000\u0000\u00008\u0108\u0001\u0000\u0000"+
		"\u0000:\u010a\u0001\u0000\u0000\u0000<\u010e\u0001\u0000\u0000\u0000>"+
		"\u0110\u0001\u0000\u0000\u0000@\u0113\u0001\u0000\u0000\u0000BD\u0003"+
		"\u0002\u0001\u0000CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FJ\u0001\u0000\u0000"+
		"\u0000GI\u0003\u001c\u000e\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0001"+
		"\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000MN\u0005\u0001\u0000"+
		"\u0000NP\u0005\u0002\u0000\u0000OQ\u0003\u0004\u0002\u0000PO\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0003"+
		"\u0006\u0003\u0000SW\u0005\u001e\u0000\u0000TV\u0003\b\u0004\u0000UT\u0001"+
		"\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u001f\u0000\u0000[\u0003\u0001\u0000\u0000\u0000\\]\u0005"+
		"\u0003\u0000\u0000]^\u0005\u0004\u0000\u0000^\u0005\u0001\u0000\u0000"+
		"\u0000_`\u0005%\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ae\u0003\n\u0005"+
		"\u0000be\u0003\f\u0006\u0000ce\u0003\u0016\u000b\u0000da\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000\u0000\u0000e\t\u0001\u0000"+
		"\u0000\u0000fg\u0005\u0005\u0000\u0000gh\u0005%\u0000\u0000hi\u0005\u001c"+
		"\u0000\u0000ij\u0007\u0000\u0000\u0000jk\u0005 \u0000\u0000kl\u0003\u0018"+
		"\f\u0000lm\u0005!\u0000\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005\u0013"+
		"\u0000\u0000op\u0005%\u0000\u0000pt\u0005\u001c\u0000\u0000qu\u0003\u0012"+
		"\t\u0000ru\u0003\u0014\n\u0000su\u0003\u000e\u0007\u0000tq\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\r\u0001"+
		"\u0000\u0000\u0000vz\u0005\u001b\u0000\u0000wy\u0003\u0010\b\u0000xw\u0001"+
		"\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"z{\u0001\u0000\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|z\u0001\u0000"+
		"\u0000\u0000}~\u0005&\u0000\u0000~\u007f\u0005 \u0000\u0000\u007f\u0080"+
		"\u0005%\u0000\u0000\u0080\u0081\u0005!\u0000\u0000\u0081\u0011\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0005\u0018\u0000\u0000\u0083\u0084\u0005 \u0000"+
		"\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085\u0086\u0005!\u0000\u0000"+
		"\u0086\u0013\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0019\u0000\u0000"+
		"\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0003\u001a\r\u0000\u008a"+
		"\u008b\u0005!\u0000\u0000\u008b\u0015\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u001a\u0000\u0000\u008d\u008e\u0005%\u0000\u0000\u008e\u008f\u0005"+
		"\u001c\u0000\u0000\u008f\u0090\u0003\u001a\r\u0000\u0090\u0017\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005\"\u0000\u0000\u0092\u0019\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005#\u0000\u0000\u0094\u001b\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u0097\u0005\u0011\u0000\u0000"+
		"\u0097\u0098\u0003\u0006\u0003\u0000\u0098\u0099\u0005\u0012\u0000\u0000"+
		"\u0099\u009a\u0005\u0006\u0000\u0000\u009a\u009b\u0005%\u0000\u0000\u009b"+
		"\u009f\u0005\u001e\u0000\u0000\u009c\u009e\u0003\u001e\u000f\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005\u001f\u0000\u0000\u00a3\u001d\u0001\u0000\u0000\u0000\u00a4"+
		"\u00ad\u00032\u0019\u0000\u00a5\u00ad\u0003&\u0013\u0000\u00a6\u00ad\u0003"+
		".\u0017\u0000\u00a7\u00ad\u00030\u0018\u0000\u00a8\u00ad\u0003$\u0012"+
		"\u0000\u00a9\u00ad\u0003\"\u0011\u0000\u00aa\u00ad\u00034\u001a\u0000"+
		"\u00ab\u00ad\u0003 \u0010\u0000\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a5\u0001\u0000\u0000\u0000\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a7\u0001\u0000\u0000\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ad\u001f\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0006\u0000\u0000\u00af\u00b0\u0005%\u0000\u0000\u00b0!\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005+\u0000\u0000\u00b2\u00b3\u0005%\u0000"+
		"\u0000\u00b3#\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000"+
		"\u00b5\u00b6\u0005%\u0000\u0000\u00b6\u00ba\u0005 \u0000\u0000\u00b7\u00b9"+
		"\u0003<\u001e\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005!\u0000\u0000\u00be%\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\r\u0000\u0000\u00c0\u00c1\u0005 \u0000\u0000"+
		"\u00c1\u00c2\u0003(\u0014\u0000\u00c2\u00c3\u0003*\u0015\u0000\u00c3\u00c4"+
		"\u0003,\u0016\u0000\u00c4\u00c5\u0005!\u0000\u0000\u00c5\u00c9\u0005\u001e"+
		"\u0000\u0000\u00c6\u00c8\u0003\u001e\u000f\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u001f"+
		"\u0000\u0000\u00cd\'\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\t\u0000"+
		"\u0000\u00cf\u00d0\u00030\u0018\u0000\u00d0)\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005\n\u0000\u0000\u00d2\u00d3\u00036\u001b\u0000\u00d3+\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0005\u000b\u0000\u0000\u00d5\u00d6\u0003"+
		".\u0017\u0000\u00d6-\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005%\u0000"+
		"\u0000\u00d8\u00d9\u0005(\u0000\u0000\u00d9/\u0001\u0000\u0000\u0000\u00da"+
		"\u00dc\u0005\u000e\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd"+
		"\u00df\u0005%\u0000\u0000\u00de\u00e0\u0005)\u0000\u0000\u00df\u00de\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e3\u0005\'\u0000\u0000\u00e2\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e31\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005\f\u0000\u0000\u00e5\u00e6\u0005 \u0000\u0000"+
		"\u00e6\u00e7\u00036\u001b\u0000\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u00ec"+
		"\u0005\u001e\u0000\u0000\u00e9\u00eb\u0003\u001e\u000f\u0000\u00ea\u00e9"+
		"\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f0"+
		"\u0005\u001f\u0000\u0000\u00f03\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0010\u0000\u0000\u00f2\u00f3\u0003\u0006\u0003\u0000\u00f3\u00f7\u0005"+
		" \u0000\u0000\u00f4\u00f6\u0003<\u001e\u0000\u00f5\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000"+
		"\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005!\u0000\u0000"+
		"\u00fb\u00ff\u0005\u001e\u0000\u0000\u00fc\u00fe\u0003\u001e\u000f\u0000"+
		"\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\u001f\u0000\u0000\u01035\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u00038\u001c\u0000\u0105\u0106\u0003:\u001d\u0000\u0106\u0107\u0003"+
		"8\u001c\u0000\u01077\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0001\u0000"+
		"\u0000\u01099\u0001\u0000\u0000\u0000\u010a\u010b\u0005*\u0000\u0000\u010b"+
		";\u0001\u0000\u0000\u0000\u010c\u010f\u0003>\u001f\u0000\u010d\u010f\u0003"+
		"@ \u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f=\u0001\u0000\u0000\u0000\u0110\u0111\u0005\b\u0000\u0000"+
		"\u0111\u0112\u0005%\u0000\u0000\u0112?\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005\b\u0000\u0000\u0114\u0115\u0005%\u0000\u0000\u0115\u0116\u0005"+
		"\u001d\u0000\u0000\u0116A\u0001\u0000\u0000\u0000\u0012EJPWdtz\u009f\u00ac"+
		"\u00ba\u00c9\u00db\u00df\u00e2\u00ec\u00f7\u00ff\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}