public class Main {
    public static void main(String[] args) {

        Shape2D circle = new Circle(0);
        Shape2D square = new Square(0);
        Shape2D rectangle = new Rectangle(0,0);
        Shape2D[] arrayShape2D = new Shape2D[]{circle,square,rectangle};

        for ( Shape2D shape : arrayShape2D)
        {
            System.out.println(shape);
        }

        Shape3D cylinder = new Cylinder(0,0);
        Shape3D sphere = new Sphere(0,0);
        Shape3D pyramid = new Pyramid(0,0,0);
        Shape3D cone = new Cone(0,0);
        Shape3D[] arrayShape3D = new Shape3D[]{cylinder, sphere, pyramid, cone};

        for(Shape3D shape : arrayShape3D)
        {
            System.out.println(shape);
        }
    }
}