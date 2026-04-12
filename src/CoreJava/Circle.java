public class Circle implements Shape{
    
    private final double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * @return 
     */
    @Override
    public double getArea() {

        return Math.PI * (Math.pow(radius , 2));
    }
}
