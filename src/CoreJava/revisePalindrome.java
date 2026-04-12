import java.util.Scanner;

public class revisePalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check palindrome : ");
        int num = input.nextInt();

        int result = checkPalindrome(num);
        if (result == num)
        {
            System.out.println("Number is Palindrome : ");
        }
        else
            System.out.println("Not Palindrome : ");

    }
    public static int checkPalindrome(int num)
    {
        int r;
        int sum = 0;
        while(num > 0)
        {
             r = num % 10;
             sum = (sum * 10 ) + r;
             num = num / 10;
        }
        return sum;
    }
}
