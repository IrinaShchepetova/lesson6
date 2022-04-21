package lesson6;

public class Cat extends Animal {
    static int catCount = 0;
    public Cat(){
        catCount++;
    }
    Cat(String name, String color, int age){
        super(name, color, age);
        catCount++;
    }

    public void swim(int length) {
        System.out.println(name + " не умеет плавать");
    }
    public void run(int length){
        if (length <= 200) {
            System.out.println(name + " бежит на " + length + "m");
        }
        else {
            System.out.println(name + " не умеет бегать так далеко");
        }
    }
    }


