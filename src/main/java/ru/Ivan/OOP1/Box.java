package ru.Ivan.OOP1;

public class Box {
    private final int size;
    private String color;
    private boolean open;
    private String item;
    public String name;

    public Box(int size, String color, String name)
    {
        this.size = size;
        this.color = color;
        this.open = false;
        this.item = "empty";
        this.name = name;
    }
    public void info()
    {
        System.out.println(size);
        System.out.println(color);
        System.out.println(open);
        System.out.println(item);
        System.out.println(name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Коробка " + name +" перекрашена в " + color);
    }

    public boolean isOpen() {
        return open;
    }

    public void Open() {
        if (this.open == true) System.out.println("Коробка " + name + " уже была открыта");
        else System.out.println("Коробка " + name + " закрыта");
        this.open = true;
    }
    public void Close() {
        if (this.open == false) System.out.println("Коробка " + name + " уже была закрыта");
        else System.out.println("Коробка " + name + " открыта");
        this.open = false;
    }

    public String Item() {
        return item;
    }

    public void getItem() {
        if (open == true)
        {
            if (this.item != "empty")
            {
                System.out.println("Вы достали из коробки " + name + " " + item);
                this.item = "empty";
            }
            else System.out.println("В коробке пусто");
        }
        else System.out.println("Коробка " + name + " закрыта");
    }

    public void putItem(String item)
    {
        if (open == true)
        {
            if (this.item == "empty")
            {
                this.item = item;
                System.out.println("Вы положили в коробку " + name + " " + item);
            }
            else System.out.println("В коробке уже что-то лежит");
        }
        else System.out.println("Коробка " + name + " закрыта");
    }
}
