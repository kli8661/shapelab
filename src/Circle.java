public class Circle extends Shape
{
    private int side;
    public Circle(int side)
    {
        super("Circle");//Constructive
        this.side = side;// setting perameter to Field
    }
    public double getArea()
    {
        return Math.PI*side*side;
    }//getting area using PI r squared
    public double getPerimeter()
    {
        return Math.PI*2*side;//getting perimeter by 2 times PI times Radius;
    }
}