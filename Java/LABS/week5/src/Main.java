enum Day{
    MON,
    TUE,
    WED,
    THU,
    FRI,
    SAT,
    SUN
}

public class Main {
    public static void main(String[] args) {

        Day day = Day.FRI;

    Circle circle1 = new Circle(4);
    Circle circle2 = new Circle(3);

    Circle[] circles = new Circle[2];
    circles[0] = circle1;
    circles[1] = circle2;

    for( Circle c : circles )
    {
        System.out.println(c.computeArea());
    }

    }
}