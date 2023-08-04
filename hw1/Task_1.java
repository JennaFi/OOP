package hw_1;



public class Task_1 {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", 2);
        cat.setOwner("Jonny");


        System.out.println("Give cat a name: " + cat.getName());
        System.out.println("How old is your cat? " + cat.getAge());
//        System.out.println("What is the name of an owner? " + owner.getName());
        System.out.println(cat.getOwner());
        cat.Greeting();
    }
}

class Cat {

    private String name;
    private int age;

    public String owner;

    public Cat (String name, int age) {
        this.name = name;
        this.age = age;
        String owner;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void Greeting () {
        System.out.println("Мяу! Меня зовут " + name + ". Мне "+ age + " лет. Мой владелец " + owner );

    }
}

