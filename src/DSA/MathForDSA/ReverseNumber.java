package DSA.MathForDSA;

import java.util.Scanner;

public class ReverseNumber {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        int ans = reverseDigit(num);
        System.out.println("Reverse of " + num + " is : " + ans);
    }
    static int reverseDigit(int num){
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse;
    }
}
