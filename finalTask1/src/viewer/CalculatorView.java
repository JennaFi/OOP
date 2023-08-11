package viewer;

/**
 * @apiNote CalculatorView демонстрирует пользователю результат выполнения работы.
 */

import presenter.Presenter;

import java.util.Scanner;

public class CalculatorView implements IView{
    Scanner scanner = new Scanner(System.in);

    public Presenter presenter;
    public Menu menu;

    public CalculatorView() {
        menu = new Menu();
        presenter = new Presenter();
        scanner = new Scanner(System.in);

    }



    @Override
    public void calculatorMenu() {

            System.out.println(menu.getMenu());
            System.out.print("Choose your operation: ");

            switch (scanner.nextLine()) {
                case "+":
                    System.out.println("The output is: " + presenter.summ(inputValue1(), inputValue2()));
                    break;
                case "-":
                    System.out.println("The output is: " + presenter.subtraction(inputValue1(), inputValue2()));
                    break;
                case "*":
                    System.out.println("The output is: " + presenter.multiply(inputValue1(), inputValue2()));
                    break;
                case "/":
                    System.out.println("The output is: " + presenter.division(inputValue1(), inputValue2()));
                    break;
                case "**":
                    System.out.println("Результат: " + presenter.exponent(inputValue1(), inputValue2()));
                    break;
                default:
                    System.out.println("Change your choose of operations");
                    break;
            }

        }

    @Override
    public Double inputValue1() {
        System.out.print("Input the first value: ");
        return scanner.nextDouble();
    }

    @Override
    public Double inputValue2() {
        System.out.print("Input the second value: ");
        return scanner.nextDouble();
    }





}
