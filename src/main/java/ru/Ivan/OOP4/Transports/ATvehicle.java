package ru.Ivan.OOP4.Transports;

import java.util.Arrays;

public class ATvehicle extends Transport {
    public ATvehicle() {
        setVelocity(15);
        setMax_fuel(350);
        setFuel(this.max_fuel);
        setFuel_per_second(10f);
        this.allowedTerrains = Arrays.asList(TerrainType.SWAMP, TerrainType.PLAIN);
    }
    @Override
    public String toString() {
        return "Вездеход";
    }
}
