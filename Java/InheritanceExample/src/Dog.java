public class Dog extends Animal {

    public String breed;

    public Dog(String color, String breed){
        super(color);
        this.breed = breed;

    }
    public void bark() {
        System.out.println("hav hav hav!");
    }
}
