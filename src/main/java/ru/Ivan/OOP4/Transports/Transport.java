package ru.Ivan.OOP4.Transports;

import ru.Ivan.OOP4.Human;
import ru.Ivan.OOP4.Moving;

import java.util.List;

public class Transport implements Moving {
    protected float max_fuel;
    protected float fuel;
    protected float fuel_per_second;
    protected float velocity;
    protected Human owner;
    protected List<TerrainType> allowedTerrains;

    public float getVelocity() {
        return velocity;
    }

    protected void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public float getMax_fuel() {
        return max_fuel;
    }

    protected void setMax_fuel(float max_fuel) {
        this.max_fuel = max_fuel;
    }

    protected void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public float getFuel_per_second() {
        return fuel_per_second;
    }

    protected void setFuel_per_second(float fuel_per_second) {
        this.fuel_per_second = fuel_per_second;
    }

    public void changeOwner(Human owner){
        this.owner = owner;
    }

    public Human getOwner() {
        return owner;
    }

    public Transport(float velocity,float max_fuel, float fuel_per_second, List<TerrainType> terrain){
        this.max_fuel = max_fuel;
        this.fuel = max_fuel;
        this.fuel_per_second = fuel_per_second;
        this.velocity = velocity;
        allowedTerrains = terrain;
    }
    public Transport(){

    }

    @Override
    public String toString() {
        return "Transport";
    }

    @Override
    public boolean canMoveOn(TerrainType terrain) {
        return allowedTerrains.contains(terrain);
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        boolean result = false;
        if (canMoveOn(terrain)){
            float time = distance/velocity;
            result = time*this.fuel_per_second < this.fuel;
            if (result) {
                this.fuel -= time*this.fuel_per_second;
                System.out.println(this.owner + " смог проехать на " + this + " расстояние " + distance + " по " + terrain);
            }
            else {
                this.fuel = 0;
                System.out.println(this.owner + " не смог проехать на " + this + " расстояние " + distance + " из-за нехватки топлива.");
            }
        }
        else System.out.println(this + " не могут передвигаться по " + terrain);
        return result;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public void consumeFuel(double delta) {

    }
}
