import java.util.Scanner;

public class Main3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length... ");
        double length = input.nextDouble();

        System.out.print("Enter Breadth... ");
        double breadth = input.nextDouble();

        Rectangle1 rec = new Rectangle1(length , breadth);
        double area = rec.getArea();
        System.out.println("Area of Rectangle = " + area);

        System.out.print("Enter Radius of Circle... ");
        double radius = input.nextDouble();

        Circle1 cir = new Circle1(radius);
        double cirArea = cir.getArea();
        System.out.println("Area of Circle = " + cirArea);

        System.out.print("Enter Base of Triangle... ");
        double base = input.nextDouble();
        System.out.print("Enter Height of Circle... ");
        double height = input.nextDouble();

        Triangle1 tri = new Triangle1(base , height);
        double triArea = tri.getArea();
        System.out.println("Area of Triangle = " + triArea);
    }
    
}
