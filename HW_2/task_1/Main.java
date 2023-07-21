package HW_2.task_1;


import static HW_2.task_1.ICat.*;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();


        String name = ICat.getName();

        System.out.println(name);
        System.out.println("..is saying now: ");
        cat.getPetCat();
        cat.getFeedCat();
        System.out.println("How many paws has cat?" + " " + PAWS);
        System.out.println(("and what about a tail? is there any?" + " " + TALE));

        cat.sayMeow();
        System.out.println("..the meaning is: ");
        cat.Greeting();
    }
}
