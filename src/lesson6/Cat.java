package lesson6;

public class Cat extends Animal {
    static int catCount = 0;
    public Cat(){
        catCount++;
    }
    Cat(String name, String color, int age, int lengthRun){
        super(name, color, age, lengthRun);
        catCount++;
    }

    public void swim(int length) {
        System.out.println(name + " не умеет плавать");
    }

    }



