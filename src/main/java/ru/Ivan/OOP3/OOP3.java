package ru.Ivan.OOP3;

import ru.Ivan.OOP1.Box;
import ru.Ivan.OOP3.Objects.Cat;
import ru.Ivan.OOP3.Objects.Plate;

public class OOP3 {
    public static void main(String[] args) {
        Cat[] cats =
                {
                        new Cat("Yasha"),
                        new Cat("Barsik"),
                        new Cat("Luna"),
                        new Cat("Smoky"),
                        new Cat("Berry"),
                        new Cat("Boris")
                };
        Plate plate1 = new Plate(50);
        Plate plate2 = new Plate(50);

        System.out.println(plate1.decreaseFood(20));
        System.out.println(plate1.decreaseFood(21));
        System.out.println(plate2.decreaseFood(40));
        System.out.println(plate2.decreaseFood(50));

        plate1.fill(40);
        plate2.fill(100);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate1);
        }
        for (int i = 0; i < cats.length; i++) {
            if(cats[i].isFed()) System.out.println(cats[i].name + " сыт");
            else System.out.println(cats[i].name + " остался голодным");
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate2);
        }
        for (int i = 0; i < cats.length; i++) {
            if(cats[i].isFed()) System.out.println(cats[i].name + " сыт");
            else System.out.println(cats[i].name + " остался голодным");
        }
    }
}
