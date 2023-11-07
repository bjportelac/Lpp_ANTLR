grammar LPP_grammar;
//Program
program:  NEWLINE*
                (register)*
                subprograms
                variables
                mainCode; //done

//Registers
register: Register ID NEWLINE+ variables End Register NEWLINE+; //done

//Subprograms
subprograms: (procedure | function)*; //done

//Procedures
procedure: Procedure ID ( OPAR parameters CPAR )? NEWLINE+ variables subroutineCode; //done

//Functions
function: Function ID ( OPAR parameters CPAR)? COL varType NEWLINE+ variables subroutineCode; //done

//Parameters (Auxiliar) //done
parameters: singlePar(COM singlePar)*;
singlePar: Var? varType ID;

//Variables //done
variables: singleVar*;
singleVar: varType idList NEWLINE+;
varType: Integer
        | Double
        | Boolean
        | Character
        | String ( OBRA INT_VAL CBRA )?
        | Array OBRA intList CBRA Of varType
        | ID ;

//auxiliar lists
idList : ID (COM ID)*; //done
intList: INT_VAL (COM INT_VAL)*;

//Main code and subroutines
mainCode: programCode;
//subroutineCode: subroutineCode NEWLINE+;
/*simpleRoutine: Begin
                    NEWLINE+
                    sentences
                    End;*/
subroutineCode: Begin
                    NEWLINE+
                    sentences
                End NEWLINE+;
programCode: Begin
                NEWLINE+
                sentences
             End NEWLINE* EOF;

//Sentences
sentences: singleSentence*;

singleSentence: read
              | write
              | assign
              | call
              | if
              | switch
              | while
              | for
              | repeat
              | return;

read: Read exprList NEWLINE+;

write: Write exprList NEWLINE+;

assign: expr ASG expr NEWLINE+;

call: Call ProcNewLine NEWLINE+
    | Call ID ( OPAR exprList? CPAR )? NEWLINE+;

if: If expr
        NEWLINE*
    Then
        NEWLINE+
        sentences
    else?
    End If NEWLINE+;

else: Else if
    | Else NEWLINE+ sentences;

switch: Case expr
            NEWLINE+
            caseOpt+
            defaultCase?
            End Case NEWLINE+;

caseOpt: exprList COL NEWLINE+ sentences;

defaultCase: Else COL NEWLINE* sentences;

while: While expr
            NEWLINE*
            Do
            NEWLINE+
            sentences
            End While NEWLINE+;

for: For expr ASG expr Until expr
            NEWLINE*
            Do
            NEWLINE+
            sentences
            End For NEWLINE+;


repeat: Repeat
            NEWLINE+
            sentences Until expr NEWLINE+;

return: Return expr NEWLINE+;

//Expresions lists and posible expressions:
exprList: expr( COM expr )*;

expr: OPAR expr CPAR
    | literal //done
    | ID //done
    | expr PER ID // done
    | expr OBRA exprList CBRA //done
    | ID OPAR exprList? CPAR //done
    | SUB expr //done
    | expr POW expr
    | expr ( SUM | SUB ) expr //done
    | expr ( TMS | DIV | IDV | MOD ) expr //done
    | expr ( EQU | NEQ | LEQ | GEQ | LES | GRT) expr
    | expr AND expr
    | expr OR expr
    | NOT expr;

//literals
literal: INT_VAL | DOUBLE_VAL | CHAR_VAL | STRING_VAL | (TRUE_VAL | FALSE_VAL);

//Reserved Words
Procedure: P R O C E D I M I E N T O;
Boolean: B O O L E A N O;
Then: E N T O N C E S;
While: M I E N T R A S;
Register: R E G I S T R O;
Character: C A R A C T E R;
Write: E S C R I B A;
Function: F U N C I O N;
Array: A R R E G L O;
Return: R E T O R N E;
String: C A D E N A;
Repeat: R E P I T A;
Call: L L A M A R;
Begin: I N I C I O;
Integer: E N T E R O;
Until: H A S T A;
Do: H A G A;
Double: R E A L;
Else: S I N O;
For: P A R A;
Case: C A S O;
Read: L E A;
End: F I N;
Var: V A R;
Of: D E;
If: S I;

//New line procedure
ProcNewLine: N U E V A '_' L I N E A;

//Parenthesis,brackets,punctuation and assign tokens
PER: '.';
COM: ',';
COL: ':';

OBRA:'[';
CBRA: ']';
OPAR: '(';
CPAR: ')';

ASG : '<-';

//Arithmetic and logic Operators
GEQ: '>=';
GRT: '>';
LEQ: '<=';
LES: '<';
NEQ: '<>';
EQU: '=';

SUM: '+';
SUB: '-';
TMS: '*';
DIV: '/';
IDV: D I V;
MOD: M O D;
POW: '^';

AND: Y;
OR: O;
NOT: N O;

//Data objects
INT_VAL: [0-9]+;
DOUBLE_VAL: '.'[0-9]+ | [0-9]+'.'[0-9]*;
CHAR_VAL: '\''(~['] | '\\\'' | '\\\\')'\'';
STRING_VAL: '"'(~["] | '\\"' | '\\\\')*'"';
TRUE_VAL: V E R D A D E R O;
FALSE_VAL: F A L S O;


//Fragments to match tokens ignoring case on Reserved Words
//Ñ is missing as the reserved words do not contain this character
//https://stackoverflow.com/questions/6487593/what-does-fragment-mean-in-antlr
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

//Identifiers RegEx: Must be the last Item to appear after the reserved words
//so it wont catch a reserved word as an identifier
ID : [a-zA-Z$_] [a-zA-Z0-9$_]* ;

//NewLine , White spaces and comments:
NEWLINE : '\r'? '\n';

SPACE: [ \t] -> skip;
SLC: '//' ~[\r\n]* -> skip;
MLC: '/*' .*? '*/' -> skip;