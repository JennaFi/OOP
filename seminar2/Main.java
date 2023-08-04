package seminar2;

public class Main {
    public static void main(String[] args) {
        Test textOb1 = new Test();

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textOb1);
        }
        System.out.println("Сброс");
        textOb1.reset();

        System.out.println("Начальное значение 100");
        textOb1.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textOb1.getNext());
        }

        Test2 textObj2 = new Test2();
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj2.getNext());
        }
        System.out.println("Сброс!");
        textObj2.reset();

        System.out.println("Начальное значение: 200");
        textObj2.setStart(200);
        for (int i = 0; i < 5; i++) {
            System.out.println("Следующее значение: " + textObj2.getNext());
        }
    }

}
