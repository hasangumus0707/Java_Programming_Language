public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("red", 3);
        cat.meuww();
        cat.eat();
        System.out.println(cat.color);

        Dog dog = new Dog("yellow", "kangal" );
        System.out.println(dog.color);
        dog.bark();
        dog.eat();
    }
}