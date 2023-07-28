package hw_4.task_2;
//Напишите обобщенный метод printArray,
//        который принимает массив любого типа и выводит его элементы на консоль.

public class Main {
    public static void main(String[] args) {
        Integer [] numbers = {67,89,2,1,5,90,34,56};
        String [] words = {"All", "you", "need", "is", "love"};
        printArray(numbers);
        System.out.println(" ");
        printArray(words);

    }

    static <T> void printArray(T[] array) {
        for (T item: array
             ) {
            System.out.printf(item + " ");

        }
    }
}
