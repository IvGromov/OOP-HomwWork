package ru.Ivan.OOP3.Objects;

public class Cat {

    public String name;
    int appetite;
    boolean fed;

    public Cat(String name){
        this.name = name;
        appetite = 10;
        fed = false;
    }

    public boolean isFed() {
        return fed;
    }

    public void eat(Plate plate){
        if (plate.food != 0){
            if(appetite != 0){
                if (!plate.decreaseFood(appetite)){
                    System.out.println(name + " смотрит на незаполненную тарелку и думает что она пустая");
                }
                else
                {
                    appetite = 0;
                    fed = true;
                    System.out.println(name + " наелся, в тарелке осталось " + plate.food + " еды");
                }
            }
            else System.out.println(name + " не голоден");
        }
        else System.out.println(name + " не может поесть, потому что тарелка пуста");
    }
}
