package ru.Ivan.OOP1.Room;

import java.util.ArrayList;

public class Room {
    private String name;
    private int height;
    private int weight;
    public int lenght;
    private int vol;
    private int S;
    private ArrayList<Furniture> furnitures;

    public Room(int lenght, int weight, int height, String name){
        this.height = height;
        this.weight = weight;
        this.lenght = lenght;
        vol = height*lenght*weight;
        S = lenght*weight;
        this.name = name;
        this.furnitures = new ArrayList<>();
    }

    public void placeFurniture(Furniture furniture){
        furniture.number = furnitures.size();
        this.furnitures.add(furniture);
    }

    @Override
    public String toString() {
        return name;
    }

    public void info(){
        System.out.println("В комнате " + name + " площадью "+ S + " находятся: ");
        for (int i = 0; i < furnitures.size(); i++) {
            System.out.print(furnitures.get(i) + ", ");
        }
    }
}
