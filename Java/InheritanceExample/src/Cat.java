public class Cat extends Animal {

    public int age;

    public Cat(String color , int age){
        super(color);
        this.age = age;
    }

    public void meuww() {
        System.out.println("meuuuuuuw!");
    }

    void test(){

        super.eat();
        this.eat();
        super.color = "pink";
    }
}
