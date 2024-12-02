public abstract class Shape3D  extends Shape2D{

    protected double depth;

    public Shape3D(double depth, double height, double width)
    {
        super(height,width);
        this.depth = depth;
    }

    public Shape3D(double height, double radius)
    {
        super(height,radius);
    }

    public abstract double getVolume();

    @Override
    public abstract double getArea();

    @Override
    public abstract String toString();


}
