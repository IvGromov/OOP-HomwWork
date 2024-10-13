package ru.Ivan.OOP4.Transports;

import ru.Ivan.OOP4.Human;
import ru.Ivan.OOP4.Moving;

import java.util.Arrays;

public class Bike extends Transport {
    private final int velocity;
    float max_fuel = 0;
    float fuel = 0;
    float fuel_per_second = 0;

    public Bike() {

        velocity = 5;
        this.allowedTerrains = Arrays.asList(TerrainType.FORREST, TerrainType.PLAIN);
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        boolean result = false;
        if (canMoveOn(terrain)) {
            float time = distance / velocity;
            result = true;
            System.out.println(owner + " смог проехать на " + this + " расстояние " + distance + " по " + terrain);
        }
        else System.out.println(this + " не могут передвигаться по " + terrain);
        return result;
    }


    @Override
    public String toString() {

        return "Велосипед";
    }

    @Override
    public void changeOwner(Human owner){
        this.owner = owner;
    }
}
