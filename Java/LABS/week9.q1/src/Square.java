public class Square extends Shape2D{

    public Square(double width){
        super(width);
    }

    @Override
    public double getArea()
    {
        return width * width;
    }

    @Override
    public String toString()
    {
        return "Square with width: " + width + " Area:" +getArea();
    }

}
