package DSA.MathForDSA;

import java.util.Scanner;

public class PalindromeNumber {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        int ans = reverseNumber(num);
        if (ans == num){
            System.out.println(num + " is a Palindrome Number");
        }
        else {
            System.out.println(num + " is not a Palindrome Number");
        }
    }
    static int reverseNumber(int num){
        int reverse = 0;
        while (num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse;
    }
}
