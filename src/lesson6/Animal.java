package lesson6;

public abstract class Animal {
    String name;
    String color;
    int age;
    int lengthRun;

    Animal(String name, String color, int age,int lengthRun){
        this.name = name;
        this.color = color;
        this.age = age;
        this.lengthRun = lengthRun;
    }
    Animal(){

    }
    public void run( int maxLengthRun){
        if (lengthRun <= maxLengthRun) {
            System.out.println(name + " бежит на " + lengthRun + "m");
        }
        else {
            System.out.println(name + " не умеет бегать так далеко");
        }
    }

    public abstract void swim(int length);
}
