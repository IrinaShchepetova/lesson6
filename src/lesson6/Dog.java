package lesson6;

public class Dog extends Animal {
    static int dogCount = 0;
    public Dog(){
        dogCount++;
    }
    Dog(String name, String color, int age, int lengthRun){
        super(name, color, age, lengthRun);
        dogCount++;
    }
    public void swim(int length){
        if (length <= 10) {
            System.out.println(name + " плывет на " + length + "m");
        }
        else {
            System.out.println(name + " не умеет плавать так далеко");
        }
    }
}
