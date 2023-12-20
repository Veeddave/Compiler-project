JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
		$(JAVAC) -cp $(CP) $*.java

FILE=    Lexer.java      parser.java    sym.java \
    LexerTest.java	ScannerTest.java SymbolTable.java TypeCheckingTest.java Pair.java ActionExpr.java Argdecl.java ArgdeclArray.java Argdecls.java ArgdeclSingle.java ArgFunctionExpr.java Args.java NonArgStatement.java ArgStatement.java AssmntStatement.java BinaryExpr.java BoolLit.java BoolType.java CharLit.java	 CharType.java Expr.java Fielddecl.java FielddeclArray.java FielddeclBase.java Fielddecls.java FielddeclSingle.java FielddeclsStatement.java FieldsBase.java FloatLit.java FloatType.java FunctionExpr.java FunctionStatement.java IfBase.java IfStatement.java IntLit.java IntType.java Memberdecls.java Methoddecl.java MethoddeclBase.java Methoddecls.java Name.java NameArray.java NameStatement.java NonIfStmt.java NonTypeCastExpr.java NonWhileStmt.java Optionalexpression.java Optionalfinal.java Optionalsemi.java ParenExpr.java Printlinelist.java Printlist.java PrintStatement.java Program.java Readlist.java ReadStatement.java ReturnStatement.java ReturnType.java ReturnValueStmt.java ScopeStatement.java TI.java Stmt.java Stmts.java StrLit.java TernaryExpr.java Token.java Type.java TypecastExpr.java TypeLit.java UnaryExpr.java VoidFunctionExpr.java VoidType.java WhileBase.java WhileStatement.java

run: badDec.as	badInc.as	badNegation.as	badString.as	badTernaryCond.as	badTernaryTypes.as	boolToFloat.as boolToInt.as	callNonExistFunc.as	charToFloat.as	charToInt.as	floatToInt.as	fullValidProgram.as	incompatBinary.as	intArrayToBoolArray.as	noReturn.as	reassignFinal.as	redefMethod.as	redefVar.as	redefVarAsMethod.as	returnTypeBad.as

all: Lexer.java parser.java $(FILE:java=class)

Phase2_empty.txt: all
		$(JAVA) -cp $(CP) ScannerTest Phase2_empty.txt > Phase2_empty-output.txt
		cat Phase2_empty.txt
		cat -n Phase2_empty-output.txt

Phase2_fields.txt: all
		$(JAVA) -cp $(CP) ScannerTest Phase2_fields.txt > Phase2_fields-output.txt
		cat Phase2_fields.txt
		cat -n Phase2_fields-output.txt

Phase2_full.txt: all
		$(JAVA) -cp $(CP) ScannerTest Phase2_full.txt > Phase2_full-output.txt
		cat Phase2_full.txt
		cat -n Phase2_full-output.txt

Phase2_methods.txt: all
		$(JAVA) -cp $(CP) ScannerTest Phase2_methods.txt > Phase2_methods-output.txt
		cat Phase2_methods.txt
		cat -n Phase2_methods-output.txt

badDec.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badDec.as 2> badDec-output.txt
		cat badDec.as
		cat -n badDec-output.txt

badInc.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badInc.as 2> badInc-output.txt
		cat badInc.as
		cat -n badInc-output.txt\

badNegation.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badNegation.as 2> badNegation-output.txt
		cat badNegation.as
		cat -n badNegation-output.txt

badString.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badString.as 2> badString-output.txt
		cat badString.as
		cat -n badString-output.txt

badTernaryCond.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badTernaryCond.as 2> badTernaryCond-output.txt
		cat badTernaryCond.as
		cat -n badTernaryCond-output.txt

badTernaryTypes.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest badTernaryTypes.as 2> badTernaryTypes-output.txt
		cat badTernaryTypes.as
		cat -n badTernaryTypes-output.txt

boolToFloat.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest boolToFloat.as 2> boolToFloat-output.txt
		cat boolToFloat.as
		cat -n boolToFloat-output.txt

boolToInt.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest boolToInt.as 2> boolToInt-output.txt
		cat boolToInt.as
		cat -n boolToInt-output.txt

callNonExistFunc.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest callNonExistFunc.as 2> callNonExistFunc-output.txt
		cat callNonExistFunc.as
		cat -n callNonExistFunc-output.txt

charToFloat.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest charToFloat.as 2> charToFloat-output.txt
		cat charToFloat.as
		cat -n charToFloat-output.txt

charToInt.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest charToInt.as 2> charToInt-output.txt
		cat charToInt.as
		cat -n charToInt-output.txt

floatToInt.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest floatToInt.as 2> floatToInt-output.txt
		cat floatToInt.as
		cat -n floatToInt-output.txt

fullValidProgram.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest fullValidProgram.as 2> fullValidProgram-output.txt
		cat fullValidProgram.as
		cat -n fullValidProgram-output.txt

incompatBinary.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest incompatBinary.as 2> incompatBinary-output.txt
		cat incompatBinary.as
		cat -n incompatBinary-output.txt

intArrayToBoolArray.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest intArrayToBoolArray.as 2> intArrayToBoolArray-output.txt
		cat intArrayToBoolArray.as
		cat -n intArrayToBoolArray-output.txt

noReturn.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest noReturn.as 2> noReturn-output.txt
		cat noReturn.as
		cat -n noReturn-output.txt

reassignFinal.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest reassignFinal.as 2> reassignFinal-output.txt
		cat reassignFinal.as
		cat -n reassignFinal-output.txt

redefMethod.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest redefMethod.as 2> redefMethod-output.txt
		cat redefMethod.as
		cat -n redefMethod-output.txt

redefVar.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest redefVar.as 2> redefVar-output.txt
		cat redefVar.as
		cat -n redefVar-output.txt

redefVarAsMethod.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest redefVarAsMethod.as 2> redefVarAsMethod-output.txt
		cat redefVarAsMethod.as
		cat -n redefVarAsMethod-output.txt

returnTypeBad.as: all
		$(JAVA) -cp $(CP) TypeCheckingTest returnTypeBad.as 2> returnTypeBad-output.txt
		cat returnTypeBad.as
		cat -n returnTypeBad-output.txt

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: tokens.jflex
		$(JFLEX) tokens.jflex

parser.java: grammar.cup
		$(CUP) -interface < grammar.cup

parserD.java: grammar.cup
		$(CUP) -interface -dump < grammar.cup
