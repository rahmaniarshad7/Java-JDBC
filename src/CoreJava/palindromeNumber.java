import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check palindrome : ");
        int num = input.nextInt();

        int sum = 0;
        int rem;
        int temp;
        temp = num;
        while (num > 0)
        {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;

        }
        if (temp == sum)
        {
            System.out.println("Number is Palindrome : ");
        }
        else
            System.out.println("Number is not palindrome : ");
    }
}
