import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        GrammaLexer lex = new GrammaLexer(new ANTLRFileStream("/home/uml/Pulpit/rpdc/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GrammaParser g = new GrammaParser(tokens, 49100, null);
        try {
            g.plik();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}