package model;

/**
 * @apiNote ICalculator - это интерфейс для работы с калькулятором.
 * @param <T> - Параметр типа.
 */
public interface ICalculator<T> {

    T summ(T value1, T value2);

    T multiply(T value1, T value2);

    T division(T value1, T value2);

    T subtraction(T value1, T value2);

    T exponent(T value1, T value2);
}
