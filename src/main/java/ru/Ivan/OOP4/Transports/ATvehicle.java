package ru.Ivan.OOP4.Transports;

import java.util.Arrays;

public class ATvehicle extends Transport {
    public ATvehicle() {
        super(15, 350, 10f, Arrays.asList(TerrainType.SWAMP, TerrainType.PLAIN));
    }
    @Override
    public String toString() {
        return "Вездеход";
    }
}
