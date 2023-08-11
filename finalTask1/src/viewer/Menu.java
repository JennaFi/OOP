package viewer;

import java.util.Scanner;
/**
 * @apiNote - Menu обеспечивает взаимодействие с пользователем
 */
public class Menu {
    private String menu;

    public Menu() {
        menu = """
                "+" - get summ of two values;
                "-" - get subtraction of two values;
                "*" - get multiplication of two values;
                "/" - get division of two values;
                "**" - get exponent of two values;
                """;

    }

    public String getMenu() {
        return menu;
    }
}
