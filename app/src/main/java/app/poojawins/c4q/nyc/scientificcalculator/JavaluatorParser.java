package app.poojawins.c4q.nyc.scientificcalculator;

/**
 * Created by pooja on 5/21/15.
 */

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class JavaluatorParser implements Parser {

    public String parse(String expression){
        try {
            DoubleEvaluator evaluator = new DoubleEvaluator();
            Double result = evaluator.evaluate(expression);
            return "" + result;
        } catch (Exception ex) {
            return "ERROR";
        }
    }

}
