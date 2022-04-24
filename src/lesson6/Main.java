package lesson6;

public class Main {

    public static void main(String[] args) {
        Animal myCat = new Cat("Like", "orange", 1, 100);
        Animal myDog = new Dog("Bim", "black", 5, 500);
        Animal mySecondCat = new Cat("Dina", "brown", 3, 300);
        Animal mySecondDog = new Dog("Bobi", "white", 8, 600);

        myCat.run(200);
        myCat.swim(50);
        myDog.run(500);
        myDog.swim(10);
        mySecondCat.run(200);
        mySecondCat.swim(40);
        mySecondDog.run(500);
        mySecondDog.swim(50);

        Animal[] zoo = {
                myDog,
                myCat,
                mySecondDog,
                mySecondCat
        };
        System.out.println("Всего животных " + zoo.length);
        System.out.println("Всего кошек " + Cat.catCount);
        System.out.println("Всего собак " + Dog.dogCount);
    }
}
