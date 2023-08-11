package model;

/**
 * @apiNote Model отвечает за реализацию  логики приложения.

 */

public class Model {

    private Calculator calculator;

    public Model() {
        calculator = new Calculator();
    }

    public Value summ(Double value1, Double value2) {
        return calculator.summ(new Value(value1), new Value(value2));
    }

    public Value subtraction(Double value1, Double value2) {
        return calculator.subtraction(new Value(value1), new Value(value2));
    }

    public Value multiply(Double value1, Double value2) {
        return calculator.multiply(new Value(value1), new Value(value2));
    }

    public Value division(Double value1, Double value2) {
        if (value2 != 0) {
            return calculator.division(new Value(value1), new Value(value2));
        } else throw new ArithmeticException("Деление на 0 недопустимо!");
    }

    public Value exponent(Double value1, Double value2) {
        return calculator.exponent(new Value(value1), new Value(value2));
    }


}
