package HW_2.task_1;

public interface ICat {

    int PAWS = 4;
    int TALE = 1;
    String NAME = "Kitty";

    int AGE = 2;

    default void getPetCat() {
        System.out.println("Погладь меня!");
    }

    default void getFeedCat() {
        System.out.println("Покорми меня!");
    }

    static String getName() {

        return NAME;
    };

    void sayMeow();

    void Greeting ();

    public default int getAge() {

        return AGE;
    };
}
