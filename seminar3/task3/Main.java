package seminar3.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal implements Comparable<Animal> {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Lion", 5));
        animals.add(new Animal("Elephant", 10));
        animals.add(new Animal("Giraffe", 7));

        // Используем компаратор для сортировки по имени
        Comparator<Animal> nameComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().compareTo(animal2.getName());
            }
        };

        // Сортировка по имени
        Collections.sort(animals, nameComparator);

        // Вывод отсортированного списка
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}