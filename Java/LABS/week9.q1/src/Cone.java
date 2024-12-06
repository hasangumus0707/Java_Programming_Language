public class Cone  extends Shape3D{

    public Cone(double height , double radius)
    {
        super(height, radius);
    }

    @Override
    public double getVolume()
    {
        return (1.0 / 3.0) * PI * radius * radius * height;
    }

    @Override
    public  double getArea()
    {
        return PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    public String toString()
    {
        return "Cone with height and radius: "+height+" "+radius+" Volume: "+getVolume()+" Area: "+getArea();

    }
}
