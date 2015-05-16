package app.poojawins.c4q.nyc.scientificcalculator;

/**
 * Created by pooja on 5/16/15.
 */

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class Parser {

    public static String parse(String expression){
        DoubleEvaluator evaluator = new DoubleEvaluator();
        Double result = evaluator.evaluate(expression);
        return "" + result;
    }

}
