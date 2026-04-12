public class Rectangle1 implements Shape{
    private final double length;
    private final double breadth;

    public Rectangle1(double length , double breadth){
        this.length = length;
        this.breadth = breadth;
    }


    /**
     * @return
     */
    @Override
    public double getArea() {
        return length * breadth;
    }
}
