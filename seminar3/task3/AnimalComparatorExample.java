package seminar3.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalComparatorExample {

        public static void main(String[] args) {
            // Создаем список животных
            List<Animal> animals = new ArrayList<>();
            animals.add(new Animal("Lion", 5));
            animals.add(new Animal("Elephant", 10));
            animals.add(new Animal("Giraffe", 7));

            // Сортируем животных с использованием интерфейса Comparable
            Collections.sort(animals);
            System.out.println("Сортировка с использованием Comparable (по возрасту):");
            for (Animal animal : animals) {
                System.out.println(animal);
            }

            // Создаем компаратор для сравнения животных по их именам
            Comparator<Animal> nameComparator = new Comparator<Animal>() {
                @Override
                public int compare(Animal animal1, Animal animal2) {
                    return animal1.getName().compareTo(animal2.getName());
                }
            };

            // Сортируем животных с использованием компаратора
            Collections.sort(animals, nameComparator);
            System.out.println("\nСортировка с использованием Comparator (по имени):");
            for (Animal animal : animals) {
                System.out.println(animal);
            }
        }
    }


