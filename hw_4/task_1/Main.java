package hw_4.task_1;

public class Main {
    public static void main(String[] args) {
        printElements(3);
        printElements("Hello world!");
        printElements(10.8);

    }

    static <T> void printElements(T element) {
        System.out.println(element);
    }
}
