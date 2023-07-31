package hw_5;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        int value1 = view.getUserInput();
        int value2 = view.getUserInput();

        char operation = view.getUserOperation();

        switch (operation) {
            case '+':
                model.sum(value1, value2);
                break;
            case '-':
                model.sub(value1, value2);
                break;
            case '*':
                model.multiply(value1, value2);
                break;
            case '/':
                model.div(value1, value2);
                break;
            default:
                System.out.println("Введена неверная операция");
                break;

        }
        int result = model.getResult();
        view.displayResult(result);

    }
}