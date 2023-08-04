package hw_2.task_1;

public class Cat implements ICat{

    @Override
    public void getPetCat() {
        System.out.println("Pet me!");

    }

    @Override
    public void getFeedCat(){
        System.out.println("Feed me!");
    }

    @Override
    public void sayMeow() {
        System.out.println("Meeeeeooooww!");
    }

    @Override
    public void Greeting(){
        System.out.println("My name is " + NAME + " and I'm " + AGE);
    }

}
