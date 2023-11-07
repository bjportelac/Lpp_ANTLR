import java.util.ArrayList;
import java.util.List;

public class LppTranslator<T> extends  LPP_grammarBaseVisitor<T>{

    public static StringBuilder translatedCode = new StringBuilder();

    public void addNewLines(int lines){
        for(int i = 0; i < lines; i++){
            translatedCode.append("\n");
        }
    }
    public void addTabulations(int tabs){
        for(int i = 0; i < tabs; i++){
            translatedCode.append("\t");
        }
    }
    public void addSpaces(int spaces){
        for(int i = 0; i < spaces; i++){
            translatedCode.append(" ");
        }
    }

    //Added the library for the main program
    @Override
    public T visitProgram(LPP_grammarParser.ProgramContext ctx) {
        translatedCode.append("import java.util.Scanner;");
        addNewLines(2);
        translatedCode.append("public class Main{");
        if(ctx.register() != null){
            for(int i = 0; i < ctx.register().size(); i++){
                visitRegister(ctx.register(i));
            }
        }
        addNewLines(1);
        if(ctx.variables() != null && !ctx.variables().isEmpty() && !ctx.variables().getText().equalsIgnoreCase("")){
            addTabulations(1);
            translatedCode.append("public ");
            visitVariables(ctx.variables());
        }
        if(ctx.subprograms() != null){
            visitSubprograms(ctx.subprograms());
        }
        if(ctx.mainCode() != null){
            visitMainCode(ctx.mainCode());
        }
        addNewLines(1);
        translatedCode.append("}");
        return null;
    }

    //adding registers as Java Classes
    @Override
    public T visitRegister(LPP_grammarParser.RegisterContext ctx) {
        if(ctx != null){
            addNewLines(1);
            addTabulations(1);
            if(ctx.Register() != null){
                translatedCode.append("public static class");
                addSpaces(1);
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
                translatedCode.append("{");
                addNewLines(1);
                addTabulations(2);
            }
            if(ctx.variables() != null){
                //translatedCode.append("static");
                visitVariables(ctx.variables());
            }
            if(ctx.End() != null){
                translatedCode.append("}");
            }
        }
        addNewLines(1);
        return null;
    }

    //Visiting variables
    @Override
    public T visitVariables(LPP_grammarParser.VariablesContext ctx) {
        if(ctx != null){
            if(ctx.singleVar() != null){
                for(int i = 0; i < ctx.singleVar().size(); i++){
                    visitSingleVar(ctx.singleVar(i));
                }
            }
        }
        return null;
    }

    @Override
    public T visitSingleVar(LPP_grammarParser.SingleVarContext ctx) {
        if(ctx != null){
            if(ctx.varType() != null){
                visitVarType(ctx.varType());
                addSpaces(1);
            }
            if(ctx.idList() != null){
                visitIdList(ctx.idList());
                translatedCode.append(";");
                addNewLines(1);
                addTabulations(2);
            }
        }
        return null;
    }

    List<String> arrayDimensions = new ArrayList<>();
    @Override
    public T visitVarType(LPP_grammarParser.VarTypeContext ctx) {
        if(ctx != null){
            if(ctx.Integer() != null){
                translatedCode.append("Integer");
            }
            if(ctx.Double() != null){
                translatedCode.append("Double");
            }
            if(ctx.Boolean() != null){
                translatedCode.append("Boolean");
            }
            if(ctx.Character() != null){
                translatedCode.append("Character");
            }
            if(ctx.String() != null){
                translatedCode.append("String");
            }
            if(ctx.Array() != null){
                if(ctx.varType() != null){
                    visitVarType(ctx.varType());
                }
                if(ctx.intList() != null){
                    visitIntList(ctx.intList());
                    if(!arrayDimensions.isEmpty()){
                        for(String s: arrayDimensions){
                            translatedCode.append("[").append(s).append("]");
                        }
                    }
                }
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
            }
        }
        return null;
    }

    //Visiting lists of identifiers
    @Override
    public T visitIdList(LPP_grammarParser.IdListContext ctx) {
        if(ctx != null){
            translatedCode.append(ctx.getText());
        }
        return null;
    }

    //Visit list of integers
    @Override
    public T visitIntList(LPP_grammarParser.IntListContext ctx) {
        if(ctx != null){
            if(ctx.INT_VAL() != null){
                for(int i = 0; i < ctx.INT_VAL().size(); i++){
                    if(ctx.INT_VAL(i) != null){
                        arrayDimensions.add(ctx.INT_VAL(i).getText());
                    }
                }
            }
        }
        return null;
    }

    //Visiting subprograms
    @Override
    public T visitSubprograms(LPP_grammarParser.SubprogramsContext ctx) {
        if(ctx != null){
            addNewLines(1);
            addTabulations(1);

            if(ctx.function() != null){
                for(int i = 0; i < ctx.function().size(); i++){
                    visitFunction(ctx.function(i));
                }
            }
            if(ctx.procedure() != null){
                for(int i = 0; i < ctx.procedure().size(); i++){
                    visitProcedure(ctx.procedure(i));
                }
            }
        }
        return null;
    }

    //Visiting function
    @Override
    public T visitFunction(LPP_grammarParser.FunctionContext ctx) {
        if(ctx != null){
            if(ctx.Function() != null){
                translatedCode.append("public static");
                addSpaces(1);
                addTabulations(1);
            }
            if(ctx.varType() != null){

                visitVarType(ctx.varType());
                addSpaces(1);
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
                translatedCode.append("(");
            }
            if(ctx.parameters() != null){
                visitParameters(ctx.parameters());
            }
            if(ctx.COL() != null){
                translatedCode.append("){");
            }
            if(ctx.variables() != null){
                addNewLines(1);
                addTabulations(2);
                visitVariables(ctx.variables());
            }
            if(ctx.subroutineCode() != null){
                visitSubroutineCode(ctx.subroutineCode());
            }
            addNewLines(1);
            addTabulations(1);
            translatedCode.append("}");
            addNewLines(2);
        }
        return null;
    }

    //Visiting procedures
    @Override
    public T visitProcedure(LPP_grammarParser.ProcedureContext ctx) {
        if(ctx != null){
            if(ctx.Procedure() != null){
                translatedCode.append("public static void");
                addSpaces(1);
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
                translatedCode.append("(");
            }
            if(ctx.parameters() != null){
                visitParameters(ctx.parameters());
            }
            if(ctx.variables() != null){
                translatedCode.append("){");
                addNewLines(1);
                addTabulations(2);
                visitVariables(ctx.variables());
            }
            if(ctx.subroutineCode() != null){
                visitSubroutineCode(ctx.subroutineCode());
            }
            addNewLines(1);
            addTabulations(1);
            translatedCode.append("}");
        }
        return null;
    }

    //Visiting the parameters
    @Override
    public T visitParameters(LPP_grammarParser.ParametersContext ctx) {
        if(ctx != null){
            for(int i = 0; i < ctx.singlePar().size(); i++){
                visitSinglePar(ctx.singlePar(i));
                if(i < ctx.singlePar().size()-1){
                    translatedCode.append(", ");
                }
            }
        }
        return null;
    }

    @Override
    public T visitSinglePar(LPP_grammarParser.SingleParContext ctx) {
        if(ctx != null){
            if(ctx.varType() != null){
                visitVarType(ctx.varType());
                addSpaces(1);
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
            }
        }
        return null;
    }

    //Visited main code
    @Override
    public T visitMainCode(LPP_grammarParser.MainCodeContext ctx) {
        if(ctx != null){
            if(ctx.programCode() != null){
                visitProgramCode(ctx.programCode());
            }
        }

        return null;
    }

    //Visit program code
    @Override
    public T visitProgramCode(LPP_grammarParser.ProgramCodeContext ctx) {
        if(ctx != null){
            addNewLines(2);
            addTabulations(1);
            translatedCode.append("public static void main(String args[]) {");
            addNewLines(2);
            addTabulations(2);
            translatedCode.append("Scanner scanner = new Scanner(System.in);");
            addNewLines(2);

            if(ctx.sentences() != null){
                addTabulations(2);
                visitSentences(ctx.sentences());
            }
            addNewLines(1);
            addTabulations(1);
            translatedCode.append("}");
        }
        return null;
    }

    //Visit Subroutines
    @Override
    public T visitSubroutineCode(LPP_grammarParser.SubroutineCodeContext ctx) {
        if(ctx != null){
            if(ctx.sentences() != null){
                visitSentences(ctx.sentences());
            }
        }
        return null;
    }

    //Visit Sentences
    @Override
    public T visitSentences(LPP_grammarParser.SentencesContext ctx) {
        if(ctx != null){
            if(ctx.singleSentence() != null){
                for(int i = 0; i < ctx.singleSentence().size(); i++){
                    visitSingleSentence(ctx.singleSentence(i));
                }
            }
        }
        return null;
    }

    @Override
    public T visitSingleSentence(LPP_grammarParser.SingleSentenceContext ctx) {
        if(ctx != null){
            if(ctx.read() != null){
                visitRead(ctx.read());
            }
            if(ctx.write() != null){
                visitWrite(ctx.write());
            }
            if(ctx.assign() != null){
                visitAssign(ctx.assign());
            }
            if(ctx.call() != null){
                visitCall(ctx.call());
            }
            if(ctx.if_() != null){
                addNewLines(1);
                addTabulations(2);
                visitIf(ctx.if_());
            }
            if(ctx.switch_() != null){
                addNewLines(1);
                visitSwitch(ctx.switch_());
            }
            if(ctx.while_() != null){
                addNewLines(1);
                visitWhile(ctx.while_());
            }
            if(ctx.for_() != null){
                addNewLines(1);
                visitFor(ctx.for_());
            }
            if(ctx.repeat() != null){
                addNewLines(1);
                visitRepeat(ctx.repeat());
            }
            if(ctx.return_() != null){
                addNewLines(1);
                visitReturn(ctx.return_());
            }
        }
        return null;
    }

    //Visiting read/user input sentence
    @Override
    public T visitRead(LPP_grammarParser.ReadContext ctx) {
        if(ctx != null){
            if(ctx.exprList() != null){
                visitExprList(ctx.exprList());
            }
            if(ctx.Read() != null){
                translatedCode.append(" = scanner.nextLine();");
            }
        }
        return null;
    }

    //Visiting write sentences
    Boolean comesFromPrintLn = null;
    @Override
    public T visitWrite(LPP_grammarParser.WriteContext ctx) {
        if(ctx != null){
            if(ctx.Write() != null){
                addNewLines(1);
                addTabulations(2);
                translatedCode.append("System.out.println(");
                comesFromPrintLn = true;
                visitExprList(ctx.exprList());
                comesFromPrintLn = false;
                translatedCode.append(");");
                addNewLines(1);
            }
        }
        return null;
    }

    //Visit assign
    @Override
    public T visitAssign(LPP_grammarParser.AssignContext ctx) {
        if(ctx != null){
            addNewLines(1);
            addTabulations(2);
            if(ctx.expr()!=null && ctx.expr().size() == 2){
                visitExpr(ctx.expr(0));
                if(ctx.ASG() != null){
                    translatedCode.append(" = ");
                }
                visitExpr(ctx.expr(1));

            }
            translatedCode.append(";");
        }
        return null;
    }

    //visit Call
    @Override
    public T visitCall(LPP_grammarParser.CallContext ctx) {
        if(ctx != null){
            if(ctx.ProcNewLine()!= null){
                translatedCode.append("System.out.println();");
            }
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
                translatedCode.append("(");
                if(ctx.OPAR() != null && ctx.exprList() != null && ctx.CPAR() != null){
                    visitExprList(ctx.exprList());
                }
                translatedCode.append(");");
            }
            addNewLines(1);
        }
        return null;
    }

    //visit If
    @Override
    public T visitIf(LPP_grammarParser.IfContext ctx) {
        if(ctx != null){
            if(ctx.If() != null){
                translatedCode.append("if(");
            }
            if(ctx.expr() != null){
                visitExpr(ctx.expr());
            }
            if(ctx.Then() != null){
                translatedCode.append("){");
            }
            if(ctx.sentences() != null){
                visitSentences(ctx.sentences());
            }
            if(ctx.else_() != null){
                translatedCode.append("}");
                visitElse(ctx.else_());
            }else{
                translatedCode.append("}");
            }
        }
        return null;
    }

    @Override
    public T visitElse(LPP_grammarParser.ElseContext ctx) {
        if(ctx != null){
            if(ctx.Else() != null){
                translatedCode.append("else");
            }
            if(ctx.if_() != null){
                addSpaces(1);
                visitIf(ctx.if_());
            }else{
                translatedCode.append("{");
            }
            if(ctx.sentences() != null){
                visitSentences(ctx.sentences());
                translatedCode.append("}");
            }

        }
        return null;
    }

    //visit Switch
    @Override
    public T visitSwitch(LPP_grammarParser.SwitchContext ctx) {
        if(ctx != null){
            if(ctx.Case() != null){
                translatedCode.append("switch (");
            }
            if(ctx.expr() != null ){
                visitExpr(ctx.expr());
                translatedCode.append("){");
                addNewLines(1);
            }
            if(ctx.caseOpt() != null){
                for(int i = 0; i < ctx.caseOpt().size(); i++){
                    if(ctx.caseOpt(i) != null){
                        visitCaseOpt(ctx.caseOpt(i));
                    }
                }
            }
            if(ctx.defaultCase() != null ){
                visitDefaultCase(ctx.defaultCase());
            }
            if(ctx.End() != null) {
                addTabulations(1);
                translatedCode.append("}");
                addNewLines(1);
            }
        }
        return null;
    }

    @Override
    public T visitCaseOpt(LPP_grammarParser.CaseOptContext ctx) {
        if(ctx != null){
            if(ctx.exprList() != null){
                if(ctx.exprList().expr().size() != 1){
                    for(int i = 0; i < ctx.exprList().expr().size(); i++){
                        addTabulations(1);
                        translatedCode.append("case ");
                        visitExpr(ctx.exprList().expr(i));
                        translatedCode.append(":");
                        addNewLines(1);
                    }
                }else{
                    addTabulations(1);
                    translatedCode.append("case ");
                    visitExprList(ctx.exprList());
                    translatedCode.append(":");
                    addNewLines(1);
                }
            }
            if(ctx.sentences() != null){
                addTabulations(1);
                visitSentences(ctx.sentences());
                addTabulations(2);
                translatedCode.append("break;");
                addNewLines(1);
            }
        }
        return null;
    }

    @Override
    public T visitDefaultCase(LPP_grammarParser.DefaultCaseContext ctx) {
        if(ctx != null){
            if(ctx.Else() != null){
                addTabulations(1);
                translatedCode.append("default:");
            }
            if(ctx.sentences() != null){
                addNewLines(1);
                addTabulations(2);
                visitSentences(ctx.sentences());
                addTabulations(2);
                translatedCode.append("break;");
                addNewLines(1);
            }
        }
        return null;
    }

    //Visit while
    @Override
    public T visitWhile(LPP_grammarParser.WhileContext ctx) {
        if(ctx != null){
            if(ctx.While() != null){
                addNewLines(1);
                addTabulations(1);
                translatedCode.append("while(");
            }
            if(ctx.expr() != null){
                visitExpr(ctx.expr());
                translatedCode.append("){");
                addNewLines(1);
            }
            if(ctx.sentences() != null){
                addTabulations(2);
                visitSentences(ctx.sentences());
                addNewLines(1);
            }
            if(ctx.End() != null){
                addTabulations(1);
                translatedCode.append("}");
            }
        }
        return null;
    }

    //Visit For
    @Override
    public T visitFor(LPP_grammarParser.ForContext ctx) {
        if(ctx != null){
            String forVariable = "";
            if(ctx.For() != null){
                addTabulations(1);
                translatedCode.append("for(");
            }
            if(ctx.expr(0) != null){
                visitExpr(ctx.expr(0));
                forVariable = ctx.expr(0).getText();
                translatedCode.append(" = ");
            }
            if(ctx.expr(1) != null){
                visitExpr(ctx.expr(1));
                translatedCode.append(";");
                addSpaces(1);
            }
            if(ctx.Until() != null){
                translatedCode.append(forVariable);
            }
            if(ctx.expr(2) != null){
                translatedCode.append(" < ");
                visitExpr(ctx.expr(2));
                translatedCode.append("; "+ forVariable+"++){");
            }
            if(ctx.sentences() != null){
                addNewLines(1);
                addTabulations(1);
                visitSentences(ctx.sentences());
                addNewLines(1);
            }
            if(ctx.End() != null){
                addTabulations(1);
                translatedCode.append("}");
            }
        }
        return null;
    }

    //visiting ExprList
    @Override
    public T visitExprList(LPP_grammarParser.ExprListContext ctx) {
        if(ctx != null){
            for(int i = 0; i < ctx.expr().size(); i++){
                visitExpr(ctx.expr(i));
                if(i < ctx.expr().size()-1){
                    if(comesFromPrintLn != null && comesFromPrintLn){
                        translatedCode.append(" + ");
                    }else{
                        translatedCode.append(", ");
                    }
                }
            }
        }
        return null;
    }

    //visiting Expr
    @Override
    public T visitExpr(LPP_grammarParser.ExprContext ctx) {
        if(ctx != null){

            //OPAR expr? CPAR
            if(ctx.OPAR() != null && ctx.expr().size() == 1 && ctx.CPAR() != null){
                if(ctx.OPAR() != null){
                    translatedCode.append("(");
                }
                if(ctx.expr() != null){
                    visitExpr(ctx.expr(0));
                }
                if(ctx.CPAR() != null){
                    translatedCode.append(")");
                }
            }

            //Rule Literal
            if(ctx.literal() != null){
                visitLiteral(ctx.literal());
            }

            //rules ID
            if(ctx.ID() != null){
                translatedCode.append(ctx.ID().getText());
            }

            //rule expr.Id
            if(ctx.expr().size() == 1  && ctx.PER() != null && ctx.ID() != null){
                visitExpr(ctx.expr(0));
                if(ctx.PER() != null){
                    translatedCode.append(".");
                }
                if(ctx.ID() != null){
                    translatedCode.append(ctx.ID().getText());

                }
            }

            // Rule expr OBRA exprList CBRA
            if(ctx.expr().size() == 1 && ctx.OBRA() != null && ctx.exprList() != null && ctx.CBRA() != null){
                visitExpr(ctx.expr(0));
                if(ctx.OBRA() != null){
                    translatedCode.append("[");
                }
                if(ctx.exprList() != null){
                    visitExprList(ctx.exprList());
                }
                if(ctx.CBRA() != null){
                    translatedCode.append("]");
                }
            }

            //ID OPAR exprList? CPAR
            if(ctx.ID() != null && ctx.OPAR() != null && ctx.exprList() != null && ctx.CPAR() != null){
                if(ctx.OPAR() != null){
                    translatedCode.append("(");
                }
                if(ctx.exprList() != null){
                    visitExprList(ctx.exprList());
                }
                if(ctx.CPAR() != null){
                    translatedCode.append(")");
                }
            }

            //Rule SUB expr
            if(ctx.SUB() != null && ctx.expr().size() == 1){
                if(ctx.SUB() != null){
                    translatedCode.append("-");
                }
                if(ctx.expr()!=null){
                    for(int i = 0; i<ctx.expr().size(); i++){
                        visitExpr(ctx.expr(i));
                    }
                }
            }

            //Rule expr POW expr
            if(ctx.expr().size() == 2 && ctx.POW() != null && ctx.expr() != null){
                translatedCode.append("(int) Math.pow(");
                visitExpr(ctx.expr(0));
                translatedCode.append(",");
                visitExpr(ctx.expr(1));
                translatedCode.append(")");
            }

            // Rule expr ( SUM | SUB ) expr
            if(ctx.expr().size() == 2  && (ctx.SUM() != null || ctx.SUB() != null)){
                if(ctx.expr()!=null){
                    visitExpr(ctx.expr(0));
                    if(ctx.SUB() != null && ctx.SUM() == null){
                        translatedCode.append(" - ");
                    }
                    if(ctx.SUB() == null && ctx.SUM() != null){
                        translatedCode.append(" + ");
                    }
                    visitExpr(ctx.expr(1));

                }
            }

            //rule expr ( TMS | DIV | IDV | MOD ) expr
            if(ctx.expr().size() == 2 && (ctx.TMS() != null || ctx.DIV() != null || ctx.IDV() != null || ctx.MOD() != null)){

                visitExpr(ctx.expr(0));
                if(ctx.TMS() != null && ctx.DIV() == null && ctx.IDV() == null && ctx.MOD() == null){
                    translatedCode.append(" * ");
                }
                if(ctx.TMS() == null && ctx.DIV() != null && ctx.IDV() == null && ctx.MOD() == null){
                    translatedCode.append(" / ");
                }
                if(ctx.TMS() == null && ctx.DIV() == null && ctx.IDV() != null && ctx.MOD() == null){
                    translatedCode.append(" / ");
                }
                if(ctx.TMS() == null && ctx.DIV() == null && ctx.IDV() == null && ctx.MOD() != null){
                    translatedCode.append(" % ");
                }
                visitExpr(ctx.expr(1));
            }

            //expr ( EQU | NEQ | LEQ | GEQ | LES | GRT) expr
            if(ctx.expr().size() == 2 && (ctx.EQU() != null
                    || ctx.NEQ() != null
                    || ctx.LEQ() != null
                    || ctx.GEQ() != null
                    || ctx.LES() != null
                    || ctx.GRT() != null)){

                visitExpr(ctx.expr(0));
                if(ctx.EQU() != null){
                    translatedCode.append(" == ");
                }
                if(ctx.NEQ() != null){
                    translatedCode.append(" != ");
                }
                if(ctx.LEQ() != null){
                    translatedCode.append(" <= ");
                }
                if(ctx.GEQ() != null){
                    translatedCode.append(" >= ");
                }
                if(ctx.LES() != null){
                    translatedCode.append(" < ");
                }
                if(ctx.GRT() != null){
                    translatedCode.append(" > ");
                }
                visitExpr(ctx.expr(1));
            }

            //expr AND | OR expr
            if(ctx.expr().size() == 2  && (ctx.AND() != null || ctx.OR() != null)){
                visitExpr(ctx.expr(0));
                if(ctx.AND() != null){
                    translatedCode.append(" && ");
                }
                if(ctx.OR() != null){
                    translatedCode.append(" || ");
                }
                visitExpr(ctx.expr(1));
            }

            // Not expr
            if(ctx.NOT() != null && ctx.expr().size() == 1){
                if(ctx.NOT() != null){
                    translatedCode.append("!");
                }
                visitExpr(ctx.expr(0));

            }

        }
        return null;
    }

    //visit Listerals
    @Override
    public T visitLiteral(LPP_grammarParser.LiteralContext ctx) {
        if(ctx != null){
            if(ctx.FALSE_VAL() != null){
                translatedCode.append("false");
            }
            if(ctx.TRUE_VAL() != null){
                translatedCode.append("true");
            }
            if(ctx.INT_VAL() != null || ctx.DOUBLE_VAL() != null || ctx.CHAR_VAL() != null || ctx.STRING_VAL() != null){
                translatedCode.append(ctx.getText());
            }
        }
        return null;
    }

    //Visit Repeat
    @Override
    public T visitRepeat(LPP_grammarParser.RepeatContext ctx) {
        if(ctx != null){
            if(ctx.Repeat() != null){
                addTabulations(1);
                translatedCode.append("do{");
                addNewLines(1);
            }
            if(ctx.sentences() != null){
                addTabulations(1);
                visitSentences(ctx.sentences());
                addNewLines(1);
            }
            if(ctx.Until() != null){
                addTabulations(1);
                translatedCode.append("} while (");
            }
            if (ctx.expr() != null){
                visitExpr(ctx.expr());
                translatedCode.append(");");
                addNewLines(1);
            }
        }
        return null;
    }

    //Visit Return
    @Override
    public T visitReturn(LPP_grammarParser.ReturnContext ctx) {
        if(ctx != null){
            if(ctx.Return() != null){
                addTabulations(1);
                translatedCode.append("return");
                addSpaces(1);
            }
            if(ctx.expr() != null){
                visitExpr(ctx.expr());
                translatedCode.append(";");
                addNewLines(1);
            }else{
                translatedCode.append("null;");
                addNewLines(1);
            }
        }
        return null;
    }

    /*
    public static StringBuilder translatedCode = new StringBuilder();
    public static int indentationControl = 0;

    public void addNewLines(int lines){
        translatedCode.append("\n".repeat(Math.max(0, lines)));
    }

    public void addTabulations(int tabs){
        translatedCode.append("\t".repeat(Math.max(0, tabs)));
    }

    public void addSpaces(int lines){
        translatedCode.append(" ".repeat(Math.max(0, lines)));
    }

    public String generateGetter(String attributeType, String attributeName){
        StringBuilder getter = new StringBuilder();
        String fl = attributeName.substring(0,1).toUpperCase();
        String remain = attributeName.substring(1);

        getter.append("public ").append(attributeType).append(" ").append("get").append(fl).append(remain).append(" (){");
        getter.append("\n");
        getter.append("\t");
        getter.append("return this.").append(attributeName).append(";");
        getter.append("\n");
        getter.append("}");
        return getter.toString();
    }

    //Program ==================================================================================
    @Override public void enterProgram(LPP_grammarParser.ProgramContext ctx) {
        //must add import java.util.Scanner; import java.util.Math; and an Object from Scanner
        if(ctx.NEWLINE() != null && !ctx.NEWLINE().isEmpty()){
            int newLinesAmount = ctx.NEWLINE().size();
            addNewLines(newLinesAmount);
        }
    }

    //Declaring registers ======================================================================
    String attributeType;
    String attributeIdentifier;
    @Override public void enterRegister(LPP_grammarParser.RegisterContext ctx) {
        addNewLines(1);
        translatedCode.append("public class ");
        if(!ctx.ID().getText().isEmpty()){
            String identifier = ctx.ID().getText();
            attributeIdentifier = identifier;
            translatedCode.append(identifier)
                    .append(" {");
        }
        if(ctx.NEWLINE() != null && !ctx.NEWLINE().isEmpty()){
            addNewLines(0);
        }
    }

    @Override public void exitRegister(LPP_grammarParser.RegisterContext ctx) {
        if(attributeType != null){
            addNewLines(1);
            String getter = generateGetter(attributeType,attributeIdentifier);
            translatedCode.append(getter);
            addNewLines(1);
        }

        addNewLines(1);
        translatedCode.append("}");
        addNewLines(2);
    }

    //Variables
    @Override public void enterVariables(LPP_grammarParser.VariablesContext ctx) {
    }

    @Override public void enterSingleVar(LPP_grammarParser.SingleVarContext ctx) {
        if (ctx.NEWLINE() != null){
            addNewLines( ctx.NEWLINE().size());
            addTabulations(1);
        }
    }

    @Override public void enterVarType(LPP_grammarParser.VarTypeContext ctx) {
        if(ctx.Integer() != null && !ctx.Integer().getText().isEmpty()){
            translatedCode.append("Integer");
            lastDataTypeRegistered = "Integer".length();
            functionReturn = "Integer";
            attributeType = "Integer";
            translatedCode.append(" ");
        }
        if(ctx.Double() != null && !ctx.Double().getText().isEmpty()){
            translatedCode.append("Double");
            lastDataTypeRegistered = "Double".length();
            functionReturn = "Double";
            attributeType = "Double";
            translatedCode.append(" ");
        }
        if(ctx.Character() != null && !ctx.Character().getText().isEmpty()){
            translatedCode.append("Character");
            lastDataTypeRegistered = "Character".length();
            functionReturn = "Character";
            attributeType = "Character";
            translatedCode.append(" ");
        }
        if(ctx.String() != null && !ctx.String().getText().isEmpty()){
            translatedCode.append("String");
            lastDataTypeRegistered = "String".length();
            functionReturn = "String";
            attributeType = "String";
            translatedCode.append(" ");
        }
        if(ctx.Boolean() != null && !ctx.Boolean().getText().isEmpty()) {
            translatedCode.append("Boolean");
            lastDataTypeRegistered = "Boolean".length();
            functionReturn = "Boolean";
            attributeType = "Boolean";
            translatedCode.append(" ");
        }
    }

    //Identifiers list
    @Override public void enterIdList(LPP_grammarParser.IdListContext ctx) {
        StringBuilder V = new StringBuilder();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof TerminalNode terminal) {
                if (terminal.getSymbol().getType() == LPP_grammarParser.ID) {
                    V.append(terminal.getText());
                } else if (terminal.getSymbol().getType() == LPP_grammarParser.COM) {
                    V.append(",");
                }
            }
        }
        translatedCode.append(V);
    }

    @Override public void exitIdList(LPP_grammarParser.IdListContext ctx) {
        translatedCode.append(";");
    }

    //Procedures
    int lastDataTypeRegistered = 0;
    @Override public void enterProcedure(LPP_grammarParser.ProcedureContext ctx) {
        addNewLines(2);
        translatedCode.append("public static void ");
        if(!ctx.ID().getText().isEmpty()){
            String identifier = ctx.ID().getText();
            translatedCode.append(identifier).append("( ");
        }
    }

    @Override public void exitProcedure(LPP_grammarParser.ProcedureContext ctx) {
        addNewLines(1);
        if(!ctx.ID().getText().isEmpty()){
            translatedCode.append("}");
        }
    }

    //Parameters
    @Override public void enterSinglePar(LPP_grammarParser.SingleParContext ctx) {
        if(ctx.varType() != null){
            enterVarType(ctx.varType());
        }
        if(ctx.ID().getText()!=null){
            translatedCode.append(ctx.ID().getText());
        }
    }

    int parVarCount = 0;
    @Override public void exitSinglePar(LPP_grammarParser.SingleParContext ctx) {
        String s = translatedCode.substring(0, translatedCode.length()-(lastDataTypeRegistered+1));
        translatedCode = new StringBuilder(s);
        translatedCode.append(", ");
        parVarCount++;
        if(parVarCount == ctx.getChildCount()){
            String t = translatedCode.substring(0, translatedCode.length()-2);
            translatedCode = new StringBuilder(t);
            translatedCode.append("){");
        }
    }

    //functions
    String functionReturn = "";
    @Override public void enterFunction(LPP_grammarParser.FunctionContext ctx) {
        addNewLines(2);
        translatedCode.append("public static @ ");
        if(!ctx.ID().getText().isEmpty()){
            String identifier = ctx.ID().getText();
            translatedCode.append(identifier).append("( ");
        }
        if(ctx.parameters() == null){
            translatedCode.append("){");
            addSpaces(20);
        }
    }

    @Override public void exitFunction(LPP_grammarParser.FunctionContext ctx) {
        String sp = translatedCode.toString().replace("@",functionReturn);
        translatedCode = new StringBuilder(sp);

        addNewLines(2);
        translatedCode.append("}");
    }

    //Subroutine and Simple Routine
    @Override public void enterSubroutineCode(LPP_grammarParser.SubroutineCodeContext ctx) {
        if(ctx.NEWLINE() != null){
            addNewLines(ctx.NEWLINE().size());
        }
    }

    @Override public void enterSimpleRoutine(LPP_grammarParser.SimpleRoutineContext ctx) {
        addTabulations(1);

        if(ctx.NEWLINE() != null){
            addNewLines(ctx.NEWLINE().size());
        }
    }

    //Write Sentence
    @Override public void enterWrite(LPP_grammarParser.WriteContext ctx) {
        if(ctx != null && !ctx.isEmpty()){
            addTabulations(1);
            translatedCode.append("System.out.print(");
        }
    }

    @Override public void exitWrite(LPP_grammarParser.WriteContext ctx) {
        super.exitWrite(ctx);
        if(ctx != null && !ctx.isEmpty()){
            translatedCode.append(");       ");
            addNewLines(1);
        }
    }

    //Read Sentence
    @Override public void exitRead(LPP_grammarParser.ReadContext ctx) {
        if(ctx.exprList() != null && !ctx.exprList().expr().isEmpty()){
            for(int i = 0; i < ctx.exprList().expr().size(); i++){
                if(ctx.exprList().expr(i).ID() != null){
                    addTabulations(1);
                    translatedCode.append(ctx.exprList().expr(i).ID());
                    translatedCode.append(" = ");
                    translatedCode.append("scanner.nextLine();");
                    addNewLines(1);
                }
            }
        }

        if(ctx.NEWLINE() != null && !ctx.NEWLINE().isEmpty()){
            int newLinesAmount = ctx.NEWLINE().size();
            addNewLines(newLinesAmount);
        }
    }

    //Assign sentence
    @Override public void enterAssign(LPP_grammarParser.AssignContext ctx) {
        if(ctx.expr() != null && !ctx.expr().isEmpty()){
            for(int i = 0; i < ctx.expr().size(); i++){
                if(ctx.expr(i).ID() != null){
                    addTabulations(1);
                    translatedCode.append(ctx.expr(i).ID());
                    translatedCode.append(" = ");
                }
            }
        }
    }

    @Override public void exitAssign(LPP_grammarParser.AssignContext ctx) {
        if(ctx.NEWLINE() != null && !ctx.NEWLINE().isEmpty()){
            translatedCode.append(";");
            int newLinesAmount = ctx.NEWLINE().size();
            addNewLines(newLinesAmount);
        }
    }

    //Call procedure
    @Override public void enterCall(LPP_grammarParser.CallContext ctx) {
        if(ctx.ProcNewLine() != null){
            addTabulations(1);
            translatedCode.append("System.out.println();");
        }
        if(ctx.ID() != null){
            addTabulations(1);
            translatedCode.append(ctx.ID().getText());
            translatedCode.append("(");

        }

    }

    @Override public void exitCall(LPP_grammarParser.CallContext ctx) {
        if(ctx.ID() != null){
            translatedCode.append(")");
            translatedCode.append(";");
        }
        if(ctx.NEWLINE() != null && !ctx.NEWLINE().isEmpty()){
            int newLinesAmount = ctx.NEWLINE().size();
            addNewLines(newLinesAmount);
        }
    }

    //If sentence
    @Override public void enterIf(LPP_grammarParser.IfContext ctx) {
        if(ctx.If() != null){
            translatedCode.append("if(");
        }
        if(ctx.Then() != null){
            translatedCode.append("){");
            addNewLines(1);
            addTabulations(1);
        }
        if(ctx.else_() == null){
            addNewLines(1);
        }
    }

    @Override public void exitIf(LPP_grammarParser.IfContext ctx) {
        if(ctx.else_() != null){
            translatedCode.append("}");
        }
        addNewLines(1);
    }

    //Else Sentence
    @Override public void enterElse(LPP_grammarParser.ElseContext ctx) {
        if(ctx.Else() != null){
            translatedCode.append("} else ");
        }
        if(ctx.if_() == null){
            translatedCode.append("{ ");
            addNewLines(1);
        }
    }

    //Switch Sentence
    @Override public void enterSwitch(LPP_grammarParser.SwitchContext ctx) {
        if(ctx.Case() != null){
            translatedCode.append("switch (");
        }
        if(ctx.NEWLINE()!= null){
            translatedCode.append("){");
            addNewLines(1);
        }

    }

    @Override public void enterCaseOpt(LPP_grammarParser.CaseOptContext ctx) {
        translatedCode.append("case(");
        if(ctx.COL() != null){
            translatedCode.append("):");
            addNewLines(1);
        }
    }

    @Override public void exitCaseOpt(LPP_grammarParser.CaseOptContext ctx) {
        addTabulations(1);
        if(ctx.sentences() != null){
            translatedCode.append("break;");
        }
        addNewLines(1);
    }

    @Override public void enterDefaultCase(LPP_grammarParser.DefaultCaseContext ctx) {
        if(ctx.Else() != null){
            translatedCode.append("default");
        }
        if(ctx.COL() != null){
            translatedCode.append(":");
            addNewLines(1);
        }
    }

    @Override public void exitDefaultCase(LPP_grammarParser.DefaultCaseContext ctx) {
        addTabulations(1);
        if(ctx.sentences() != null){
            translatedCode.append("break;");
        }
        addNewLines(1);
    }

    @Override public void exitSwitch(LPP_grammarParser.SwitchContext ctx) {
        translatedCode.append("}");
        addNewLines(1);
    }

    //While Sentence
    @Override public void enterWhile(LPP_grammarParser.WhileContext ctx) {
        super.enterWhile(ctx);
        if(ctx.While() != null){
            translatedCode.append("while(");
        }
        if(ctx.Do() != null){
            translatedCode.append("){");
            addNewLines(1);
        }
    }

    @Override
    public void exitWhile(LPP_grammarParser.WhileContext ctx) {
        if(ctx.End() != null){
            translatedCode.append("}");
        }
    }

    //For Sentence
    @Override public void enterFor(LPP_grammarParser.ForContext ctx) {
        if(ctx.For()!= null){
            translatedCode.append("for(");
        }
        if(ctx.ASG() != null) {
            translatedCode.append(" = ");
        }
        if(ctx.Until()!= null){
            translatedCode.append(";");
            if(ctx.expr()!=null){
                translatedCode.append(" ;");
            }
        }
        if(ctx.Do()!= null){
            translatedCode.append(" ){");
            addNewLines(1);
        }
    }

    @Override public void exitFor(LPP_grammarParser.ForContext ctx) {
        addNewLines(1);
        translatedCode.append("}");
    }

    //Do Sentence
    @Override public void enterRepeat(LPP_grammarParser.RepeatContext ctx) {
        if(ctx.Repeat() != null){
            translatedCode.append("do{");
            addNewLines(1);
        }
    }

    @Override public void exitRepeat(LPP_grammarParser.RepeatContext ctx) {
        if(ctx.Until() != null){
            translatedCode.append("}while(");
        }
        if(ctx.NEWLINE() != null){
            translatedCode.append(");");
            addNewLines(1);
        }

    }

    //return Sentence

    @Override
    public void enterReturn(LPP_grammarParser.ReturnContext ctx) {
        if(ctx.Return() != null){
            translatedCode.append("return ");
        }
    }

    @Override
    public void exitReturn(LPP_grammarParser.ReturnContext ctx) {
        translatedCode.append(";");
    }

    //Expressions
    @Override public void enterExpr(LPP_grammarParser.ExprContext ctx) {
        if(ctx.expr().size() == 1 && ctx.SUB() != null){
            translatedCode.append("-");
            translatedCode.append(ctx.expr(0).getText());
        }
        if(ctx.expr().size() == 1 && ctx.NOT() != null){
            translatedCode.append("!");
            translatedCode.append(ctx.expr(0).getText());
        }

        if(ctx.expr().size() == 2 && ctx.POW() != null){
            translatedCode.append(" Math.pow(");
            translatedCode.append(ctx.expr(0).getText());
            translatedCode.append(",");
            translatedCode.append(ctx.expr(1).getText());
            translatedCode.append(") ");
        }

        if(ctx.expr().size() == 2 && (ctx.SUM() != null || ctx.SUB() != null)){
            translatedCode.append(ctx.expr(0).getText());
            translatedCode.append(ctx.SUM() != null ? " + " : " - ");
            translatedCode.append(ctx.expr(1).getText());
        }

        if(ctx.expr().size() == 2 && (ctx.TMS() != null || ctx.DIV() != null || ctx.IDV() != null || ctx.MOD() != null)){
            translatedCode.append(ctx.expr(0).getText());
            if(ctx.TMS() != null){
                translatedCode.append(" * ");
            }if(ctx.IDV() != null || ctx.DIV() != null){
                translatedCode.append(" / ");
            }
            if(ctx.MOD() != null){
                translatedCode.append(" % ");
            }
            translatedCode.append(ctx.expr(1).getText());
        }

        if(ctx.expr().size() == 2 && (ctx.EQU() != null || ctx.NEQ() != null || ctx.LEQ() != null || ctx.GEQ() != null || ctx.LES() != null || ctx.GRT() != null)){
            translatedCode.append(ctx.expr(0).getText());
            if(ctx.EQU() != null){
                translatedCode.append(" == ");
            }
            if(ctx.NEQ() != null){
                translatedCode.append(" != ");
            }
            if(ctx.LEQ() != null){
                translatedCode.append(" <= ");
            }
            if(ctx.GEQ() != null){
                translatedCode.append(" >= ");
            }
            if(ctx.LES() != null){
                translatedCode.append(" < ");
            }
            if(ctx.GRT() != null){
                translatedCode.append(" > ");
            }

            translatedCode.append(ctx.expr(1).getText());
        }

        if(ctx.expr().size() == 2 && (ctx.AND() != null || ctx.OR() != null)){
            translatedCode.append(ctx.expr(0).getText());
            translatedCode.append(ctx.AND() != null ? " && " : " || ");
            translatedCode.append(ctx.expr(1).getText());
        }

        if(ctx.expr().size() == 1 && ctx.PER() != null){
            translatedCode.append(ctx.expr(0).getText());
            translatedCode.append(".");
            translatedCode.append(ctx.ID().getText());
        }

        if(ctx.literal() != null){
            if(ctx.literal().TRUE_VAL() != null){
                translatedCode.append("true ");
            }
            if(ctx.literal().FALSE_VAL() != null){
                translatedCode.append("false  me hab");
            }
            if(ctx.literal().STRING_VAL() != null || ctx.literal().CHAR_VAL() != null || ctx.literal().DOUBLE_VAL() != null || ctx.literal().INT_VAL() != null){
                translatedCode.append(ctx.literal().getText());
            }
        }

    }

    @Override
    public void enterLiteral(LPP_grammarParser.LiteralContext ctx) {
        if(ctx.TRUE_VAL() != null){
            translatedCode.append("true ");
        }
        if(ctx.FALSE_VAL() != null){
            translatedCode.append("false");
        }
    }*/
}