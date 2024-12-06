public class Circle extends Shape2D{

    public Circle(double radius)
    {
        super(radius);
    }

    @Override
    public double getArea()
    {
        return PI * radius * radius;
    }

    @Override
    public String toString(){
        return "Circle with radius: " + radius + " area: " + getArea();
    }


}
