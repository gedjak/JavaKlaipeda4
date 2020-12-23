package FundamentalsTesting.advanced.inheritance.animalExample;

import java.util.Arrays;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        Cat cat = new Cat(true, "Miau", "grey");
        Dog dog = new Dog(true, "whaf", "Doberman");

        System.out.println(dog.yieldVoice());
        System.out.println(cat.yieldVoice());

        List<Animal> animals = Arrays.asList(
                cat,
                dog,
                new Dog (true, "whuf", "Shephard"),
                new Cat (true, "meu", "Ginger")
        );

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.yieldVoice());
        }

    }
}
