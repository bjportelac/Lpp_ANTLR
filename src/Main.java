import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        try {
            LPP_grammarLexer lexer;
            if(args.length > 0){
                System.out.println("\nUsando el archivo input.txt de la carpeta /input del proyecto: \n");
                lexer = new LPP_grammarLexer(CharStreams.fromFileName(args[0]));
            }else{
                System.out.println("\nUsando Codigo por consola: \n");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                lexer = new LPP_grammarLexer(CharStreams.fromString(input));
            }

            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            LPP_grammarParser parser = new LPP_grammarParser(tokenStream);
            ParseTree tree = parser.program();

            LppTranslator loader = new LppTranslator();
            loader.visit(tree);

            System.out.println(LppTranslator.translatedCode);

            StringBuilder traslated = LppTranslator.translatedCode;
            String str = traslated.toString();

            /*try(FileWriter writer = new FileWriter("output/Main.java",true)) {
                writer.write(str);
            } catch(IOException e) {
                e.getCause();
            }*/

        }catch (Exception e){
            System.err.println("Error (Translate): " + e);
        }
    }
}