package hw_4.task_3;

public class Main {
    public static void main(String[] args) {
        getMax(23,89);
        getMax(45.98, 34.71);
        getMax(10, 10);
        getMax("Hello world!","All you need is love!");

    }

    static <T extends Comparable<T>> void getMax(T el1, T el2) {
        if(el1.compareTo(el2) > 0) {
            System.out.println("Element 1 is bigger then element 2");
        }

        if(el1.compareTo(el2) < 0) {
            System.out.println("Element 2 is bigger then element 1");
        }

        if(el1.compareTo(el2) == 0) {
            System.out.println("Elements are equal");
        }
    }
}
