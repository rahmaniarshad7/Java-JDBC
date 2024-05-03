package in.kgcoading.challenge83;

public class Testing {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);

        System.out.println("Area of Circle = " + circle.calculateArea());
        System.out.println("Area of square = " + square.calculateArea());
    }
}
