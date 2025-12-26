package DataStractures.PlacementPrepration.TCS_Deloitte;

import java.util.Scanner;

public class PalindromeNumber {

    public static int checkPalindrome(int num){
        int original = num;
        int reverse = 0;
        while(original > 0){
            int rem = original % 10;
            original /= 10;
            reverse = reverse * 10 + rem;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number to check Palindrome....");
        int num = input.nextInt();

        int ans = checkPalindrome(num);
        if(ans == num){
            System.out.println("Number is Palindrome...");
        } else {
            System.out.println("Number is not Palindrome...");
        }
    }
}
