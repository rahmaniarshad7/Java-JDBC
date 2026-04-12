import java.util.Scanner;

abstract class Shape2{
   public abstract double getArea();

   public abstract double getPerimeter();
}
class Circle1 implements Shape3 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius , 2));
    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rect implements Shape3 {
    private double length;
    private double breadth;

    public Rect(double length , double breadth) {
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

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}
class Triangle1 implements Shape3 {
    private double base;
    private double height;

    public Triangle1(double base , double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return base + height;
    }
}
public class Main7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Radius Of Circle...");
        double radius = input.nextDouble();
        Circle1 cir = new Circle1(radius);

        System.out.println("Area of Circle = " + cir.getArea());

    }

}
