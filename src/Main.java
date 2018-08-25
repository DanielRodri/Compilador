import org.antlr.v4.runtime.*;

import java.util.List;

public class Main {

    public static void main (String [] args){
        MiScanner inst = null;
        miParser parser = null;

        CharStream input=null;
        CommonTokenStream tokens = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new MiScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new  miParser(tokens);

            parser.program();
        }
        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
        inst.reset();
        List<Token> lista = (List<Token>) inst.getAllTokens();

        for (Token t : lista)

            System.out.println(MiScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n");


    }
}