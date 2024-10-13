package ru.Ivan.OOP4;

import ru.Ivan.OOP4.Transports.Transport;

import java.util.Arrays;
import java.util.List;

public class Human implements Moving{
    float max_fuel = 700;
    float stamina;
    float stamina_per_second = 2.5f;
    private final int velocity;
    private final String name;
    private Transport currentTransport;
    private List<TerrainType> allowedTerrains;


    @Override
    public String toString() {
        return name;
    }
    public Human(String name){
        this.name = name;
        stamina = max_fuel;
        velocity = 1;
        this.allowedTerrains = Arrays.asList(TerrainType.FORREST, TerrainType.SWAMP, TerrainType.PLAIN);
    }

    public void takeTransport(Transport transport){
        boolean check = false;
        if (currentTransport != null) {
            currentTransport.changeOwner(null);
            check = true;
        }
        currentTransport = transport;
        currentTransport.changeOwner(this);
        if (check) System.out.println(name + " пересел на " + currentTransport);
        else System.out.println(name + " сел за " + currentTransport);
    }

    public void leaveTransport(){
        if (currentTransport != null) {
            currentTransport.changeOwner(null);
        }
        currentTransport = null;
        System.out.println(name + " покинул свой транспорт ");
    }

    @Override
    public boolean canMoveOn(TerrainType terrain) {
        return allowedTerrains.contains(terrain);
    }

    @Override
    public boolean move(int distance, TerrainType terrain){
        boolean result = false;
        if (currentTransport != null) result = currentTransport.move(distance, terrain);
        else {
            if (canMoveOn(terrain)){
            float time = distance/velocity;
            result = time*stamina_per_second < stamina;
            if (result) {
                this.stamina -= time*stamina_per_second;
                System.out.println(this + " прошел пешком расстояние " + distance + " по " + terrain);
            }
            else {
                this.stamina = 0;
                System.out.println(this + " не смог пройти пешком расстояние " + distance + " и устал.");
            }
            }
            else System.out.println("Люди не могу тпередвигаться по " + terrain + " без транспорта");
        }
        return result;
    }

    @Override
    public double getFuel() {
        return stamina;
    }

    @Override
    public void consumeFuel(double delta) {

    }
}
