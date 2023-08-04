package seminar2.task7;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

        Dog dog = (Dog) animal;//downcasting
        dog.eat();
        dog.bark();


    }
}

class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}