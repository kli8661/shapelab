public class Rectangle extends Shape {
    private int height;
    private int width;

    /**
     * Constructs Rectangle
     * @param height
     * @param width
     */
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    /**
     * Gets Area of Rectangle
     * @return
     */
    public double getArea()
    {
        return height * width;
    }

    /**
     * Gets Perimeter of Rectangle
     * @return
     */
    public double getPerimeter()
    {
        return ((height *2) + (width * 2));
    }
}
