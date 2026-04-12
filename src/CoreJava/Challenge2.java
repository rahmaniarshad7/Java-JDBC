import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        //taking input first number from user
        int number = input.nextInt();
        //taking input from user second number
        int number2 = input.nextInt();
        int sum = number + number2;
        // print sum
        System.out.println("Addition of number = : " + sum);

    }
}
