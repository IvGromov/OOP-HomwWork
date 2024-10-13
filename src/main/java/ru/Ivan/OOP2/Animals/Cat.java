package ru.Ivan.OOP2.Animals;

 public class Cat extends Animal{
    public Cat(String name) {
        this.name = name;
        this.run_velocity = 2;
        this.swim_velocity = 0;
        this.max_stamina = 10;
        this.stamina = 10;
        this.run_stamina = 1;
        this.swim_stamina = 1000;
    }
}
