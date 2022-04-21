package lesson6;

public class Dog extends Animal {
    static int dogCount = 0;
    public Dog(){
        dogCount++;
    }
    Dog(String name, String color, int age){
        super(name, color, age);
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
    public void run(int length){
        if (length <= 500) {
            System.out.println(name + " бежит на " + length + "m");
        }
        else {
            System.out.println(name + " не умеет бегать так далеко");
        }
    }


}
