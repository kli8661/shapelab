public class Circle extends Shape
{
    private int side;
    public Circle(int side)
    {
        super("Circle");
        this.side = side;
    }
    public double getArea()
    {
        return Math.PI*side*side;
    }
    public double getPerimeter()
    {
        return Math.PI*2*side;
    }
}