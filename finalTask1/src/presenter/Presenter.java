package presenter;


import logger.Logger;
import model.Value;
import model.Model;


/**
 * @apiNote Presenter осуществляет связь с моделью.
 */

public class Presenter {
    Model model;
    Logger logger;

    public Presenter() {
        model = new Model();
    }

    public Value summ(Double value1, Double value2) {

        return model.summ(value1, value2);
    }

    public Value subtraction(Double value1, Double value2) {

        return model.subtraction(value1, value2);
    }

    public Value multiply(Double value1, Double value2) {

        return model.multiply(value1, value2);
    }

    public Value division(Double value1, Double value2) {

            return model.division(value1, value2);

    }

    public Value exponent(Double value1, Double value2) {

        return model.exponent(value1, value2);
    }


}
