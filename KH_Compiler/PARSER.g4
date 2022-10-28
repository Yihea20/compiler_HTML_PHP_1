parser grammar PARSER;
options{ tokenVocab=LEXER; }
start_compile:the_desigin+the_setting*;
the_desigin:DESIGIN INTERFACE color? name CURLYOPEN combonent* CURLYCLOSE;
color:PAINT COLOR_NAME;
name:NAME;
combonent:enter|display|link;
enter:ENTER NAME COLOMN (CHECK_BOX|RADIO|FIELD|SUBMIT) BRACOPEN string BRACCLOSE;
display:DISPLAY NAME COLOMN (text|image|list) ;
list:LIST  elements*;
elements:LI BRACOPEN NAME BRACCLOSE ;
text:TEXT BRACOPEN string BRACCLOSE;
image:IMAGE BRACOPEN url BRACCLOSE;
link:LINK NAME COLOMN url;
string:String;
url:URL;


the_setting:SETTING CONTROLLER name CONTROL PAGE NAME CURLYOPEN control_body* CURLYCLOSE;
control_body:(condetion
    |loop
    |equality_value
    |equality

    |cull_func|print
    |function
    |move_page|printSTRING
    );
move_page:PAGE NAME;
print:WRITE NAME;
printSTRING:WRITEE NAME;
cull_func:CULL NAME BRACOPEN parameters* BRACCLOSE ;
loop:FOR BRACOPEN part1 part2  part3 BRACCLOSE
 CURLYOPEN control_body* CURLYCLOSE;
part1:PART1 equality;
part2:PART2 condetion_stetment;
part3:PART3 equality_value;
equality_value:NAME SIGNAL;
equality: DECLER? NAME EQUAL? NUMBER?operant?;
 operant:SIGNAL (NAME|NUMBER);
condetion:IF BRACOPEN condetion_stetment BRACCLOSE CURLYOPEN control_body* CURLYCLOSE;
function:FUNCTION name BRACOPEN parameters* BRACCLOSE CURLYOPEN control_body* CURLYCLOSE;
condetion_stetment:side cond_att side;
side:(NUMBER|NAME);
cond_att: COMPARISON;
parameters:param|params;
param:PARAM NAME;
params:PARAM NAME COMA;