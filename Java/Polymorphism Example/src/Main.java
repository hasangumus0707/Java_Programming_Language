public class Main {
    public static void main(String[] args) {

        Horse h = new Horse();
        Cat c = new Cat();
        Dog d = new Dog();

        Animal[] animals = new Animal[]{h,c,d};

        /*that is also okey
        Animal[] animals = {h,d,c};
        */

        /*that is also okey
        Animal[] animals = new Animal[3];
        animals[0] = h;
        animals[1] = c;
        animals[2] = d;
         */

        for(Animal a : animals) {
            a.eat();
        }

        Animal animal = new Horse();
        ((Horse)animal).walk();

        Horse horse = (Horse)animal;
        horse.walk();

        animal = new Dog();
        ((Dog)animal).bark();




    }
}