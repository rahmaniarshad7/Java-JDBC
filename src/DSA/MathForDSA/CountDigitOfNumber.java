package DSA.MathForDSA;

import java.util.Scanner;

public class CountDigitOfNumber {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        int ans = countDigit(num);
        System.out.println(ans);
    }
    static int countDigit(int num){
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            count++;
            num /= 10;
        }

        return count;
    }
}
