package ru.Ivan.OOP4;

import ru.Ivan.OOP4.Transports.*;

import static ru.Ivan.OOP4.Moving.TerrainType.*;

public class OOP4 {
    public static void main(String[] args) {
        Human human = new Human("Andry");
        Transport car = new Car();
        Transport bike = new Bike();
        Transport horse = new Horse("Alice");
        Transport coolcar = new ATvehicle();

        System.out.println(human);

        human.move(20, FORREST);
        human.takeTransport(car);
        human.move(20, FORREST);
        human.move(25, PLAIN);
        human.takeTransport(bike);
        human.move(25, FORREST);
        human.leaveTransport();
        human.move(500, SWAMP);
        human.takeTransport(coolcar);
        human.move(500, SWAMP);
        human.takeTransport(horse);
        human.move(25, FORREST);
        human.move(25, FORREST);
        human.move(25, FORREST);
        human.move(25, FORREST);
    }
}