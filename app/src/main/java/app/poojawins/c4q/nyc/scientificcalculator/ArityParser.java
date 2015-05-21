package app.poojawins.c4q.nyc.scientificcalculator;

/**
 * Created by pooja on 5/21/15.
 */

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

public class ArityParser implements Parser{

    public String parse(String expression) {
        try {
            Symbols symbols = new Symbols();
            double result = symbols.eval(expression);
            return "" + result;
        } catch (SyntaxException ex) {
            return "ERROR: " + ex.getMessage();
        }
    }
}
