package model;
import logger.Logger;


/**
 * @apiNote Calculator производит вычисления с вещественными числами.

 */

public class Calculator implements ICalculator<Value> {

    private Logger logger;

    public Calculator() {
        logger = new Logger();

    }
    @Override
    public Value summ(Value value1, Value value2) {
        Value result = new Value(value1.getValue() + value2.getValue());
        logger.logStep("The User chose Summing of " + value1.getValue() + " and " + value2.getValue() + '\n');
        logger.logStep("The Output is: " + result);
        return result;
    }

    @Override
    public Value multiply(Value value1, Value value2) {
        Value result = new Value(value1.getValue() * value2.getValue());
        logger.logStep("The User chose Multiplying of " + value1.getValue() + " and " + value2.getValue() + '\n');
        logger.logStep("The Output is: " + result);
        return result;
    }

    @Override
    public Value division(Value value1, Value value2) {
        Value result = new Value(value1.getValue() / value2.getValue());
        logger.logStep("The User chose Division of " + value1.getValue() + " and " + value2.getValue() + '\n' );
        logger.logStep("The Output is: " + result);
        return result;
    }

    @Override
    public Value subtraction(Value value1, Value value2) {
        Value result = new Value(value1.getValue() - value2.getValue());
        logger.logStep("The User chose Subtraction of " + value1.getValue() + " and " + value2.getValue() + '\n' );
        logger.logStep("The Output is: " + result);
        return result;
    }

    @Override
    public Value exponent(Value value1, Value value2) {
        Value result = new Value(Math.pow(value1.getValue(), value2.getValue()));
        logger.logStep("The User chose Exponential of " + value1.getValue() + " and " + value2.getValue() /'n' );
        logger.logStep("The Output is: " + result);
        return result;

    }
}
