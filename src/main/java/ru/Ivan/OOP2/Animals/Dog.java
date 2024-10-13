package ru.Ivan.OOP2.Animals;

 public class Dog extends Animal{
    public Dog(String name){
        this.name = name;
        this.run_velocity = 1;
        this.swim_velocity = 5;
        this.max_stamina = 20;
        this.stamina = 20;
        this.run_stamina = 1;
        this.swim_stamina = 2;
    }
}
