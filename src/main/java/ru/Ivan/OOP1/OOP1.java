package ru.Ivan.OOP1;

public class OOP1 {
    public static void main(String[] args) {
        User[] users = {new User("Anton","Antonov","Alexeевич", 1976, "aaavich76@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1996, "aaavich96@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1966, "aaavich66@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 2001, "aaavich2001@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1974, "aaavich74@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1963, "aaavich63@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1989, "aaavich89@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1993, "aaavich93@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 2003, "aaavich2003@yourmail.au"),
                new User("Anton","Antonov","Alexeевич", 1982, "aaavich82@yourmail.au"),};
        for (int i = 0; i < users.length; i++) {
            if ((2024 - users[i].getYear()) > 40){
                users[i].info();
            }
        }

        Box[] boxes =
                {
                    new Box(15, "Red", "001"),
                    new Box(16, "Blue", "002"),
                    new Box(17, "Green", "003"),
                    new Box(18, "Yellow", "004"),
                    new Box(19, "Black", "005")
                };
        boxes[0].Open();
        boxes[1].putItem("молоток");
        boxes[0].putItem("гвозди");
        boxes[0].putItem("молоток");
        boxes[0].getItem();
        boxes[0].putItem("молоток");
        boxes[4].setColor("White");
        for (int i = 0; i < boxes.length; i++)
        {
            boxes[i].info();
        }
    }

}
