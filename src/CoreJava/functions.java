import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to functions ");
        System.out.println("Enter first Number : ");
        int a = input.nextInt();

        System.out.println("enter second number : ");
        int b = input.nextInt();
        System.out.println(addition(a , b));
    }
    public static int addition(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

}
