package lesson6;

public abstract class Animal {
    String name;
    String color;
    int age;

    Animal(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    Animal(){

    }
    public abstract void run(int length);

    public abstract void swim(int length);
}
