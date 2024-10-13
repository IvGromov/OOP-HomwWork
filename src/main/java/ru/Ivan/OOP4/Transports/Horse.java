package ru.Ivan.OOP4.Transports;

import java.util.Arrays;

public class Horse extends Transport{
    float max_stamina = 2500;
    float stamina;
    float stamina_per_second = 2.5f;
    private final int velocity;
    private final String name;

    public Horse(String name) {
        this.name = name;
        velocity = 10;
        stamina = max_stamina;
        this.allowedTerrains = Arrays.asList(TerrainType.FORREST, TerrainType.SWAMP, TerrainType.PLAIN);
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        boolean result = false;
        if (canMoveOn(terrain)){
            float time = distance/velocity;
            result = time*stamina_per_second < stamina;
            if (result) {
                stamina -= time*stamina_per_second;
                System.out.println(owner + " смог проехать на " + this + " расстояние " + distance + " по " + terrain);
            }
            else {
                stamina = 0;
                System.out.println(owner + " не смог проехать на " + this + " расстояние " + distance + ": " + name + " устала");
            }
        }
        else System.out.println(this + " не могут передвигаться по " + terrain);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }
}
