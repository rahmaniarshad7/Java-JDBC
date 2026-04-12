import java.util.Scanner;

// calculate area of triangle using base and height
public class Challenge11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in );
        System.out.print("enter Base of Triangle : ");
        float base= input.nextFloat();
        System.out.print("enter Height of Triangle : ");
        float height = input.nextFloat();
        double area = 0.5 *(base*height);
        System.out.println("Area of Triangle = " + area);
    }
}
