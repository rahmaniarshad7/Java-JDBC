package in.kgcoding.exception;

import java.util.Scanner;

public class ExceptionHandaling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int first = input.nextInt();

        System.out.print("Enter Second number : ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.println("Divide : " + result);
        }
        catch(ArithmeticException exception)
        {
            System.out.printf("%s not divide by zero", exception.getMessage());
            System.out.println();
            System.out.println(exception.getCause());

        }
    }
}
