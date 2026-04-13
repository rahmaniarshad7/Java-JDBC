package DSA.MathForDSA;

import java.util.Scanner;

public class SumOfDigitOfNumber {
    static  void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        int ans = findDigitSum(num);
        System.out.println(ans);
    }
    static int findDigitSum(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        return  sum;
    }
}
