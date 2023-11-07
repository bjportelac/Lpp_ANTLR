import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> code = new ArrayList<>();

            while (scanner.hasNextLine()) {
                String line= scanner.nextLine();
                code.add(line);
            }

            String stringProgram = String.join("\n", code);

            System.out.println(stringProgram);

            scanner.close();
            code.clear();

            LPP_grammarLexer lexer = new LPP_grammarLexer(CharStreams.fromString(stringProgram));

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            LPP_grammarParser parser = new LPP_grammarParser(tokenStream);
            ParseTree tree = parser.program();

            LppTranslator loader = new LppTranslator();
            loader.visit(tree);

            System.out.println(LppTranslator.translatedCode);

            StringBuilder traslated = LppTranslator.translatedCode;
            String str = traslated.toString();

            System.out.println(str);
        }catch (Exception e){
            System.err.println("Error (Main): " + e);
            throw e;
        }
    }
}