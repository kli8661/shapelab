public class ETriangle extends Shape
{
    private int side;
    public ETriangle(int side)
    {
        super(type:"ETriangle");
        this.side = side;
    }
    public double getArea()
    {
        return 0.433*(side*side);
    }
    public double getPerimeter();
    {
        return side*3;
    }
}
}