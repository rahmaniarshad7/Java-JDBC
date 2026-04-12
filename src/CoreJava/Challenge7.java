import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number to swap : ");
        int a = input.nextInt();
        System.out.println("enter second number to swap ");
        int b = input.nextInt();
        System.out.println("Before swapping a = " + a);
        System.out.println("Before swapping b = " + b);
        //using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping a = " + a);
        System.out.println("After swapping b = " + b);
    }
}
