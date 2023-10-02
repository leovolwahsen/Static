package org.example;

class Thing {
    // final stands for variable declaration like const not changeable
    public final static int LUCY_NUMBER = 7;
    public String name;
    /*
    static use-cases is that if The value of the variable is independent of the objects
    (not unique for each object). E.g. number of students.
    Static variable: When you need something that will be
    used throughout the application and every instance need to know the variable.
    */
    public static String description;

    public static int count = 0;

    public int id;
    public Thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}

public class Main {
    public static void main(String[] args) {
        Thing.description = "I am an description";
        Thing.showInfo();

        System.out.println("Before creating objects, count is: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects, count is: " + Thing.count);


        thing1.name = "Sam";
        thing2.name = "Sussan";

        thing1.showName();
        thing2.showName();

        System.out.println(Thing.LUCY_NUMBER);
    }
}