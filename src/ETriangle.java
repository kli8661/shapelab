public class ETriangle extends Shape
{
    private int side;

    public ETriangle(int side)
    {
        super("ETriangle");//Constructive
        this.side = side;//Field side
    }
    public double getArea()
    {
        return 0.433*(side*side);// returning SquareRoot of 3 divided by 4  and times the sidelength squared
    }
    public double getPerimeter()
    {
        return side*3;//ETriangle have 3 equal side length. side*3 returns perimeter;
    }
}