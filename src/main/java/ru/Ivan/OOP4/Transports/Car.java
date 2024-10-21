package ru.Ivan.OOP4.Transports;

import java.util.Arrays;
import java.util.List;

public class Car extends Transport{
    public Car() {
        super(20, 500, 7.5f, List.of(TerrainType.PLAIN));
    }

    @Override
    public String toString() {
        return "Машина";
    }
}
