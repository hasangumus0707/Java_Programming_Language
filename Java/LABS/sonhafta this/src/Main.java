public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        rect1.displayInfo();

        Rectangle rect2 = new Rectangle(100 , 200);
        rect2.displayInfo();

        Rectangle rect3 = new Rectangle(-10 , 10 , 100 , 500 );
        rect3.displayInfo();
    }
}