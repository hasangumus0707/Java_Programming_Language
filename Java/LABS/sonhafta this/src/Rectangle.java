public class Rectangle {

    int x , y;
    int width , height;


    public Rectangle()
    {
        this(0 ,0 , 1 , 2);
    }

    public Rectangle(int width , int height)
    {
        this(0 , 0 , width , height);
    }

    public Rectangle( int x , int y , int width , int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void displayInfo()
    {
        System.out.println(x +" "+ y  +" "+ width + " "+  height);
    }
}
