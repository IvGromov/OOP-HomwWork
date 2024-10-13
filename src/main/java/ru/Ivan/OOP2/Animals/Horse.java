package ru.Ivan.OOP2.Animals;

 public class Horse extends Animal{
    public Horse(String name){
        this.name = name;
        this.run_velocity = 10;
        this.swim_velocity = 3;
        this.max_stamina = 100;
        this.stamina = 100;
        this.run_stamina = 1;
        this.swim_stamina = 4;
    }
}
