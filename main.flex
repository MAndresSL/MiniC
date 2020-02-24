%%
%unicode
%class Lexar
%line
%column
%int
%standalone
%states line_comment,comment,includes, whileLoops


//OPERADORES
relationalOperators = ("!=" | "==" | "<" | "<=" | ">" | ">=")
different = "!="
comparisson = "="

logicalOperators = ("&&" | "||" | "!")
and = "&&"
or = "or"

//Preguntarle al ingeniero si estos pueden ir en una sola variable
arithmeticOperators = ("+" | "-" | "*" | "/")
plus = "+"
minus = "-"
//Asterisk ya esta
slash = "/"

asignationOperators = ("=")
equal = "="

counters = ("++" | "--")
plusPlus = "++"
minusMinus = "--" 

//MISC
letters = [a-z A-Z]
numbers =  [0-9]
spaces = [\n\r\t]+ 

comma = ","
colon = ":"
semicolon =";"
period = "."
apostrophe = "\'"
exclamation = "!"
question = "?"
underscore = "_"
open_brace = "{"
close_brace= "}"
open_bracket= "["
close_bracket="]"
at = "@"
hash = "#"
percent= "%"
hat = "^"
ampersand = "&"
asterisk = "*"


line_commentary= "//" {whiteSpace}+{anyChar}
commentary_start="/*" {whiteSpace}+{anyChar}
commentary_end = "*/"
hash = "#"
standard_libraries = ("assert.h"|"complex.h"|"ctype.h"|"errno.h"|"float.h"|"inttypes.h"|"iso646.h"|"limits.h"|"locale.h"|"math.h"|"setjmp.h"| "signal.h" | "stdalign.h" | "stdarg.h"| "stdatomic.h"| "stdbool.h" |"stddef.h"| "stdint.h" | "stdio.h" | "stdlib.h"|"stdnoreturn.h"|"string.h"|"tgmath.h"|"threads.h" | "time.h" | "uchar.h" | "wchar.h" | "wctype.h" ) 
start_system_include = "<"
end_system_include = ">"
new_line= [\n]+

//PALABRAS RESERVADAS
include = ("include")
closing = "}"
pragma = ("pragma")
struct = ("struct")
union = ("union")
main = "main"
for = "for"
while = "while"


//Data Types
int = ("int")
long = ("long")
double = ("double")
char = ("char")
bool = ("bool")
void = ("void")
signed = "signed" 
short = "short" 
unsigned = "unsigned" 
long = "long"
float = "float"
string = "string"


//Decisiones
while = ("while")
for = ("for")
if = ("if")
return = ("return")

//COMBINACIONES
anyChar = ({letters}*{numbers}*)*
variables = {letters}+|{letters}+{numbers}+|{numbers}+
numberType = {int} | {float} | {double}
whiteSpace = (\s | "")
system_header = {start_system_include}+{standard_libraries}+{end_system_include}
program_header = (\")+{anyChar}+(\")
varTypes = {int} | {double} | {float} | {long} | {char} | {bool}
numTypes = {int} | {double} | {float}
nonNumTypes = {char} | {bool}
functions = {void} | {int} | {double} | {float} | {long} | {char} | {bool}

commentary = {commentary_start}+ (.*?)+ {commentary_end}


//findMain = {int}\s{whiteSpace}+("main"){whiteSpace}+("("){whiteSpace}+(")"){whiteSpace}+("{")

//findWhile = while{whiteSpace}+("("){whiteSpace}+{variables}+{whiteSpace}+{relationalOperators}{whiteSpace}+{variables}+{whiteSpace}+(")"){whiteSpace}+("{")

/*findFor = for{whiteSpace}+("("){varTypes}\s
            {variables}+{whiteSpace}+{asignationOperators}{whiteSpace}+{numbers}+{whiteSpace}+(";")
            {whiteSpace}+{variables}+{whiteSpace}+{relationalOperators}{whiteSpace}+{numbers}+{whiteSpace}+(";")
            {whiteSpace}+({variables}+{counters} | 
            {variables}+{whiteSpace}+{asignationOperators}{whiteSpace}+{numbers}+ | 
            {variables}+{whiteSpace}+{asignationOperators}{whiteSpace}+{variables}+{numbers}+)
            {whiteSpace}+(")"){whiteSpace}+("{")
*/

findIf = if("("){variables}+{relationalOperators}{variables}+(")")("{")
findStruct = {struct}{spaces}{anyChar}{spaces}+("{")
findFunctions = {functions}\s{variables}+{whiteSpace}+
                    ("("){whiteSpace}+({varTypes}\s {variables}+ | {void} | "")
                    {whiteSpace}+(")"){whiteSpace}+("{")
findInclude = {hash}{include}{whiteSpace}+({system_header}|{program_header})

//Esto no está funcionando
findDeclarations = (/*({signed} | {unsigned})?\s({short} | {long})?\s{numTypes} |*/ {varTypes})\s{whiteSpace}+(variables)+{whiteSpace}+(";")

nonNumDeclareAssign = ({char}\s{variables}+{whiteSpace}+{asignationOperators}{whiteSpace}+("\""){whiteSpace}+{anyChar}{whiteSpace}+("\"") 
                        | {bool}\s{variables}+{whiteSpace}+{asignationOperators}{whiteSpace}+(true | false)){whiteSpace}+(";")


numDeclareAssign = ({signed} | {unsigned})?\s({short} | {long})?\s
                    {whiteSpace}{numTypes}\s{variables}+{whiteSpace}+{asignationOperators}
                    {whiteSpace}+{numbers}+{whiteSpace}+(";")

%%

<YYINITIAL> {

    //Queriendolo hacer con expresiones / De la manera antigua

/*
    {relationalOperators} {
        System.out.println("Relational operator found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    {findInclude} {
        System.out.print("import found:\n" + yytext() + " => at (" +yyline + ","+ yycolumn+")");
    }

    {findMain} {
        System.out.println("Main: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")");
        //yybegin(rules);
    }

    {findStruct} {
        System.out.print(" Struct found:\n" + yytext()  + " => at (" +yyline + ","+ yycolumn+")");
    }

    //<rules>{
    {findDeclarations} {
        System.out.println("Declaration: " + yytext() + "\n"  + " => at (" +yyline + ","+ yycolumn+")");
    }

    {findWhile} {
        System.out.println("While found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
        yybegin(whileLoops);
    }

    {findFor} {
        System.out.println("For found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {findIf} {
        System.out.println("if was found:\n" + yytext()  + " => at (" +yyline + ","+ yycolumn+")");
    }

    {findFunctions} {
        System.out.println("Function found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {nonNumDeclareAssign} {
        System.out.println("Bool or char Asignation and declaration: " + yytext() +  " => at (" +yyline + ","+ yycolumn+")");
    }

    {numDeclareAssign} {
        System.out.println("Number declaration found: " + yytext()  + " => at (" +yyline + ","+ yycolumn + ")" );
    }

    {arithmeticOperators} {
        System.out.println("Aritmethic operator found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    
    {counters} {
        System.out.println("Increment or decrement found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    
    {asignationOperators} {
        System.out.println("Assignation operator found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
    }
*/
    
    
    {commentary} {
        System.out.print("Comentario encontrado: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" + "\n");

    }

    {line_commentary} {
        System.out.print("Comentario en linea encontrado:"  + " => at (" +yyline + ","+ yycolumn+")" +yytext() );
        yybegin(line_comment);
    }

    {commentary_start} {
        System.out.print("Comentario encontrado: \n"+ yytext()); yybegin(comment);
    } 

    //-----------------------------------------------------------------------------------------------------------------------
    //De la nueva manera / Encontrando cada token

    {colon} {
        System.out.println("colon symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {comma} {
        System.out.println("comma symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {semicolon} {
        System.out.println("semicolon symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {comma} {
        System.out.println("comma symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {period} {
        System.out.println("period symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {apostrophe} {
        System.out.println("apostrophe symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {exclamation} {
        System.out.println("exclamation symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    {question} {
        System.out.println("question symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    {underscore} {
        System.out.println("underscore symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    {open_brace} {
        System.out.println("opening brace symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
    }

    {close_brace} {
        System.out.println("closing brace symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    {open_bracket} {
        System.out.println("opening bracket symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
    }

    {close_bracket} {
        System.out.println("closing bracket symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {at} {
        System.out.println("at (@) symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {hash} {
        System.out.println("hash symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {percent} {
        System.out.println("percent symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }
    {hat} {
        System.out.println("hat symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
    }
    {ampersand} {
        System.out.println("ampersand symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");

    }

    //Probablemente para aritmetica
    {asterisk} {
        System.out.println("asterisk symbol found: " + yytext() + " => at (" + yyline +"," + yycolumn +")");
    }

    {slash} {
        System.out.println("slash symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {plusPlus} {
        System.out.println("plus plus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {minusMinus} {
        System.out.println("minus minus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {plus} {
        System.out.println("plus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {minus} {
        System.out.println("minus symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {equal} {
        System.out.println("equal symbol found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }



    {while} {
        System.out.println("while found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }
    

    {for} {
        System.out.println("For found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {if} {
        System.out.println("if found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {int} {
        System.out.println("int found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {long} {
        System.out.println("long found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );
    }

    {double} {
        System.out.println("double found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {char} {
        System.out.println("char found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {bool} {
        System.out.println("bool found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {void} {
        System.out.println("void found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    {signed} {
        System.out.println("signed found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );

    }

    {unsigned} {
        System.out.println("unsigned found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );

    }

    {short} {
        System.out.println("short found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );

    }

    {long} {
        System.out.println("long found: " + yytext()  + " => at (" + yyline + ","+ yycolumn+")" );

    }

    {float} {
        System.out.println("float found: " + yytext()  + " => at (" + yyline + "," + yycolumn + ")" );

    }

    {string} {
        System.out.println("string found: " + yytext()  + " => at (" +yyline + ","+ yycolumn+")" );

    }

    <line_comment>{
        {new_line} {
            System.out.print(yytext()+"\n"); yybegin(1);
        }
        . {  } 
        {spaces} {    }
    }
    <comment>{
        {commentary_end} {System.out.print(yytext()+"\n"); yybegin(1);}
        . {  } 
        {spaces} {    }

    }

//}

    <whileLoops> {
        {closing} {
            System.out.println("While end found at line: " + " => at (" +yyline + ","+ yycolumn+")" );
            yybegin(YYINITIAL);
        }
        
        {spaces} { }
        . { }
    }

    {spaces} {    }

    . {    }

}