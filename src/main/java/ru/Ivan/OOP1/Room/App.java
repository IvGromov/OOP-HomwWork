package ru.Ivan.OOP1.Room;

public class App {
    public static void main(String[] args){
        Room bathroom = new Room(15,15,15, "bathroom");
        Room hub = new Room(25,15,25, "hub");

        Furniture table = new Furniture("table");
        Furniture chair = new Furniture("chair");
        Furniture flowers = new Furniture("flowers");

        hub.placeFurniture(table);
        hub.placeFurniture(chair);
        hub.placeFurniture(flowers);
        hub.info();
    }
}
