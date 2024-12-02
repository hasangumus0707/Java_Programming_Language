public abstract class Shape2D {

    public final double PI = Math.PI;
    protected double height;
    protected double radius;
    protected double width;

    public Shape2D(double height, double width) {

        this.height = height;
        this.width = width;
    }

    public Shape2D(double radius) {

        this.radius = radius;
    }

    public abstract double getArea();

    @Override
    public abstract String toString();
}
