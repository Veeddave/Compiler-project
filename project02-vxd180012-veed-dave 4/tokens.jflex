/*-***
 *
 * This file defines a stand-alone lexical analyzer for a subset of the Pascal
 * programming language.  This is the same lexer that will later be integrated
 * with a CUP-based parser.  Here the lexer is driven by the simple Java test
 * program in ./PascalLexerTest.java, q.v.  See 330 Lecture Notes 2 and the
 * Assignment 2 writeup for further discussion.
 *
 */


import java_cup.runtime.*;


%%
/*-*
 * LEXICAL FUNCTIONS:
 */

%cup
%line
%column
%unicode
%class Lexer

%{

/**
 * Return a new Symbol with the given token id, and with the current line and
 * column numbers.
 */
Symbol newSym(int tokenId) {
    return new Symbol(tokenId, yyline, yycolumn);
}

/**
 * Return a new Symbol with the given token id, the current line and column
 * numbers, and the given token value.  The value is used for tokens such as
 * identifiers and numbers.
 */
Symbol newSym(int tokenId, Object value) {
    return new Symbol(tokenId, yyline, yycolumn, value);
}

%}


/*-*
 * PATTERN DEFINITIONS:
 */
 
 letter              = [A-Za-z]
 digit               = [0-9]+
 digitsingular       = [0-9]
 id                  = ({letter})({letter}|{digitsingular})*
 comment             = \\\\.*
 multilinecomment    = \\\*(.*[\n\r\t]*)*\*\\
 whitespace          = [ \n\r\t]*
 char = \'([^\'\\])({letter}|{digitsingular}|(\\t)|(\\n))*\'
 floating = {digitsingular}+\.{digitsingular}+
 string = \"([^\\\"\t\n])([{letter}\,\ ]+|{digitsingular}+)\"




%%
/**
 * LEXICAL RULES:
 */


class			{return newSym(sym.CLASS, "class");}
final                   {return newSym(sym.FINAL, "final");}
void                    {return newSym(sym.VOID, "void");}
int                     {return newSym(sym.INT, "int");}
char                    {return newSym(sym.CHAR, "char");}
bool                    {return newSym(sym.BOOLEAN, "bool");}
float                   {return newSym(sym.FLOAT, "float");}
else                    {return newSym(sym.ELSE, "else");}
if                      {return newSym(sym.IF, "if");}
while                   {return newSym(sym.WHILE, "while");}
return                  {return newSym(sym.RETURN, "return");}
read                    {return newSym(sym.READ, "read");}
print                   {return newSym(sym.PRINT, "print");}
printline               {return newSym(sym.PRINTLINE, "printline");}
"&&"                    {return newSym(sym.AND, "&&");}
"||"                    {return newSym(sym.OR, "||");}
"*"                     {return newSym(sym.ASTERISK, "*");}
"+"                     {return newSym(sym.PLUS, "+");}
"-"                     {return newSym(sym.MINUS, "-");}
"/"                     {return newSym(sym.FSLASH, "/");}
";"			{return newSym(sym.SEMI,";");}
"="   			{return newSym(sym.EQUALS, "=");}
","			{return newSym(sym.COMMA, ",");}
"("			{return newSym(sym.LPAREN, "(");}
")"			{return newSym(sym.RPAREN, ")");}
"["			{return newSym(sym.LSQR, "[");}
"]"			{return newSym(sym.RSQR, "]");}
"{"			{return newSym(sym.LCURLY, "{");}
"}"			{return newSym(sym.RCURLY, "}");}
"++"                    {return newSym(sym.INCREMENT, "++");}
"--"                    {return newSym(sym.DECREMENT, "--");}
"~"			{return newSym(sym.NOT, "~");}
"?"			{return newSym(sym.QUESTION, "?");}
":"			{return newSym(sym.COLON, ":");}
">"                     {return newSym(sym.GT, ">");}
"<"                     {return newSym(sym.LT, "<");}
"<="                    {return newSym(sym.LTE, "<=");}
">="                    {return newSym(sym.GTE, ">=");}
"=="                    {return newSym(sym.EQ, "==");}
"<>"                    {return newSym(sym.NEQ, "<>");}
"true"                  {return newSym(sym.TRUE, "true");}
"false"                 {return newSym(sym.FALSE, "false");}



{id}       	        {return newSym(sym.ID, yytext());}
{digit}                 {return newSym(sym.NUMBERLIT, new Integer(yytext()));}
{char}                  {return newSym(sym.CHARLIT, yytext());}
{letter}                {return newSym(sym.LETTER, yytext());}
{floating}              {return newSym(sym.FLOATLIT, new Double(yytext()));}
{string}                {return newSym(sym.STRING,yytext());}
{comment}               {return newSym(sym.COMMENT, yytext());}
{multilinecomment}      {return newSym(sym.MULTILINE, yytext());}

{whitespace}    { /* Ignore whitespace. */ }
.               { System.out.println("Illegal char, '" + yytext() +
                    "' line: " + yyline + ", column: " + yychar); } 

