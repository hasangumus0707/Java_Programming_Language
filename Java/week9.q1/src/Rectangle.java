public class Rectangle extends Shape2D{

    public Rectangle(double height , double width)
    {
        super(height, width);
    }

    @Override
    public double getArea()
    {
        return (height * width) / 2;
    }

    @Override
    public String toString()
    {
        return "Reactangle with height and width: " + height +" "+width+" Area: "+ getArea();
    }
}
