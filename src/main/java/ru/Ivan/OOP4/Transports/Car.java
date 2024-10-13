package ru.Ivan.OOP4.Transports;

import java.util.Arrays;

public class Car extends Transport{
    public Car() {
        setVelocity(20);
        setMax_fuel(500);
        setFuel(this.max_fuel);
        setFuel_per_second(7.5f);
        this.allowedTerrains = Arrays.asList(TerrainType.PLAIN);
    }

    @Override
    public String toString() {
        return "Машина";
    }
}
