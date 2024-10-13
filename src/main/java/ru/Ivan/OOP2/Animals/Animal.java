package ru.Ivan.OOP2.Animals;

public class Animal {
     protected String name;
     protected int run_velocity;
     protected int swim_velocity;
     protected int max_stamina;
     protected int stamina;
     protected int run_stamina;
     protected int swim_stamina;

    public int run(int distance){
        int t = 0;
        int x = 0;
        while (true){
            if (stamina > 0){
                stamina -= run_stamina;
                x += run_velocity;
                t++;
                if (x >= distance){
                    System.out.println(name + " пробежал расстояние " + distance + " за " + t + " и его выносливость равна " + stamina);
                    return t;
                }
            }
            else{
                stamina = 0;
                t = -1;
                System.out.println(name + " устал и не добежал до конца");
                return t;
            }
        }
    }
    public int swim(int distance){
        int t = 0;
        int x = 0;
        while (true){
            if (stamina > 0){
                stamina -= swim_stamina;
                x += swim_velocity;
                t++;
                if (x >= distance){
                    System.out.println(name + " проплыл расстояние " + distance + " за " + t + " и его выносливость равна " + stamina);
                    return t;
                }
            }
            else{
                stamina = 0;
                t = -1;
                System.out.println(name + " устал и не доплыл до конца");
                return t;
            }
        }
    }
    public void info(){
        System.out.println(name + " имеет " + stamina + " выносливости");
    }
}
