import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();

        if (number % 2 == 0){
            System.out.println("number is even ");
        } else {
            System.out.println("Number is odd ");
        }
    }
}
