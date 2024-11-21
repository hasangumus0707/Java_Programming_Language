
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
try
{
    System.out.println("Enter a value");
    int value1 = input.nextInt();

    System.out.println("Enter another value");
    int value2 = input.nextInt();
    System.out.println("Done1");

    System.out.println(value1 / value2);
    System.out.println("Done2");
}

catch(InputMismatchException e)
{
    System.out.println("expected input is int");
}

catch(Exception e)
{
    System.out.println(e.getMessage());
}

try
{
    Time1 time2 = new Time1(24, 13, 26);

    System.out.println(time2.toString());
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}

 /*
        System.out.println(Car.companyName);
        System.out.println(Car.counter);
        Car car1 = new Car(2016, "USA");
        Car car2 = new Car(2016, "D");
        System.out.println(Car.counter);
        Car car3 = new Car(2016, "TR");
        Car car4 = new Car(2016, "GB");

        Car.companyName = "VW";

        System.out.println(Car.companyName);
        System.out.println(Car.counter);

*/
    }
}