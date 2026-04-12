public class Rectangle implements Area , Perimeter{

    private final double  length;
    private final double breadth;

    public Rectangle(double length , double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
