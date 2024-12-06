public class Pyramid extends Shape3D{

    public Pyramid(int depth, int height, int width)
    {
        super(depth,height,width);
    }

    @Override
    public double getVolume()
    {
        return (depth * height * width) / 3;
    }

    @Override
    public double getArea()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "pyramid with depth and height and width: "+depth+" "+height+" "+width+" Volume: "+getVolume();

    }
}
