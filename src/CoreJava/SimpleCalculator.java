import java.util.Scanner;

public class SimpleCalculator {
    public static int main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welcome to My Calculator..... \n");

        System.out.print("enter num1 : ");
        int num1 = input.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = input.nextInt();

        System.out.println(" Addition = + \n Subtraction = - \n Multiplication = * \n Division = /");

        System.out.println("Enter sign....");

        String sign = input.nextLine();

        return switch (sign){
            case "+" -> num1 + num2;
            case "-" -> num1 + num2;
            case "*" -> num1 + num2;
            case "/" -> num1 + num2;
            default -> 1;
        };

    }

}
