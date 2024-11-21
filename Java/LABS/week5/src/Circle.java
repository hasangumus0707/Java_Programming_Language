public class Circle {

  int radius;
  private static double pi = 3.141519;

  public Circle(int radius )
  {
      this.radius = radius;
  }

  public double computeArea()
  {
      return radius* pi;
  }

  public static double getPi(){

      return pi;
  }

}
