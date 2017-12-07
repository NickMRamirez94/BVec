grammar BitVec;  // Grammar for BitVec Language

@header {
    import wci.intermediate.*;
    import wci.intermediate.symtabimpl.*;
}

program   : header mainBlock '.' ;
header    : PROGRAM IDENTIFIER ';' ;
mainBlock : block;
block     : declarations* funcdeclarations* compoundStmt ;

funcdeclarations : FUNCTION IDENTIFIER '(' formalParmList* ')' ':' typeId ';' block ';' #functionDeclar 
				 ;

declarations : VAR declList ';' #varDeclar ;
declList     : decl ( ';' decl )* ;
decl         : varList ':' typeId ;
varList      : varId ( ',' varId )* ;
varId        locals [ String type = null , Integer slot = -1] : IDENTIFIER ;
typeId       : IDENTIFIER ;
formalParmList : formalParm ( ',' formalParm )* ;
formalParm	 locals [ TypeSpec type = null ]
			 : varId ':' typeId		#valueParm
			 | '&' varId ':' typeId	#refParm 
			 ;
				
compoundStmt : OBRACK stmtList CBRACK ;

stmt : compoundStmt
     | assignmentStmt
     | if_stat
     | match_stat
     | dowhile_stat
     | while_stat
     | print_stat
     | println_stat
     | return_stat
     | function_call
     | 
     ;
     
stmtList       : stmt ( ';' stmt )* ;
assignmentStmt : variable ':=' expr ;
if_stat		   : IF expr THEN stmt ( ELSE stmt )? ;
match_stat	   : MATCH expr WITH ( number ':' stmt )* ; 
dowhile_stat   : DO stmtList WHILE expr ;
while_stat	   : WHILE expr DO stmt ;
print_stat	   : 'print' '(' expr ')' ;
println_stat   : 'println' '(' expr ')' ;
return_stat	   : RETURN expr ;
function_call  : IDENTIFIER '(' expr* (',' expr )* ')' ; 

variable : IDENTIFIER ;

expr locals [ TypeSpec type = null, Integer slot = -1 ]
    : expr mulDivOp expr   # mulDivExpr
    | expr addSubOp expr   # addSubExpr
    | expr relOp expr	   # relOpExpr
    | number               # unsignedNumberExpr
    | signedNumber         # signedNumberExpr
    | variable             # variableExpr
    | '(' expr ')'         # parenExpr
    | STRING			   # stringExpr
    | BOOL			       # booleanExpr
    ;
     
mulDivOp : MUL_OP | DIV_OP ;
addSubOp : ADD_OP | SUB_OP ;
relOp	 : EQ | NE | LT | GT ;
     
signedNumber locals [ TypeSpec type = null ] 
    : sign number 
    ;
sign : ADD_OP | SUB_OP ;

number locals [ TypeSpec type = null ]
    : INTEGER    # integerConst
    | FLOAT      # floatConst
    ;
    
PROGRAM : 'PROGRAM' ;
VAR     : 'VARIABLES' ;
FUNCTION: 'FUNCTION' ;
OBRACK  : '{' ;
CBRACK  : '}' ;
IF		: 'IF' ;
THEN	: 'THEN' ;
ELSE	: 'ELSE' ;
DO	 	: 'DO' ;
WHILE 	: 'WHILE' ;
RETURN  : 'RETURN' ;
MATCH	: 'MATCH' ;
WITH	: 'WITH' ;

STRING	: '"' .*? '"' ;

BOOL	: 'true' | 'false' ;

IDENTIFIER : [a-zA-Z][a-zA-Z0-9]* ;
INTEGER    : [0-9]+ ;
FLOAT      : [0-9]+ '.' [0-9]+ ;

MUL_OP :   '*' ;
DIV_OP :   '/' ;
ADD_OP :   '+' ;
SUB_OP :   '-' ;

EQ :  '==' ;
NE :  '!=' ;
LT :  '<'  ;
GT :  '>'  ;

NEWLINE : '\r'? '\n' -> skip  ;
WS      : [ \t]+ -> skip ; 
