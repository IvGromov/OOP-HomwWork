package ru.Ivan.OOP2;

import ru.Ivan.OOP2.Animals.Animal;
import ru.Ivan.OOP2.Animals.Cat;
import ru.Ivan.OOP2.Animals.Dog;
import ru.Ivan.OOP2.Animals.Horse;

public class OOP2 {
    public static void main(String[] args) {
        Animal a1 = new Cat("Barsik");
        Animal a2 = new Dog("Rex");
        Animal a3 = new Horse("Alice");

        a1.info();
        a2.info();
        a3.info();

        a1.run(5);
        a2.run(5);
        a3.run(5);

        a1.swim(5);
        a2.swim(5);
        a3.swim(5);

        a1.info();
        a2.info();
        a3.info();
    }
}
