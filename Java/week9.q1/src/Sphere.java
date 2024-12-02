public class Sphere extends Shape3D{

    public Sphere(int depth, double radius)
    {
        super(depth, radius);
    }

    @Override
    public double getVolume()
    {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    @Override
    public double getArea()
    {
        return 4 * PI * radius * radius;
    }

    @Override
    public String toString()
    {
        return "Sphere with depth and radius: "+depth+" "+radius+" Volume: "+getVolume()+" Area: "+getArea();
    }
}
