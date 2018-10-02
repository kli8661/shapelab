public abstract class Shape {

    private String type;

    /**
     * Constructs Shape
     * @param type
     */
    public Shape(String type)
    {
        this.type = type;
    }

    /**
     * Gets area of a shape
     * @return
     */
    public abstract double getArea();

    /**
     * Gets rectangle of shape
     * @return
     */
    public abstract double getPerimeter();

    public String toString()
    {
        return "I am a " + type + ".";
    }
}
