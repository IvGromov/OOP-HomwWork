package ru.Ivan.OOP3.Objects;

public class Plate {

    int food;
    final int maxfood;

    public Plate(int size){
        food = size;
        maxfood = size;
    }

    public int getFood() {
        return food;
    }



    public void fill(int value) {
        if (value > 0) {
            food += value;
            if (food >= maxfood) {
                food = maxfood;
                System.out.println("Тарелка полностью заполнена");
            }
            else System.out.println("В тарелке теперь " + food + " еды");
        }
    }

    public boolean decreaseFood(int value){
        if (value > food) return false;
        else{
            food -= value;
            return true;
        }
    }
}
