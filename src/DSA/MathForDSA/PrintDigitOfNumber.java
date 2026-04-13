package DSA.MathForDSA;

import java.util.Scanner;

public class PrintDigitOfNumber {
    static void main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = input.nextInt();

        printDigit(num);
    }
    static void printDigit(int num){
        while(num > 0){
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;
        }
    }
}
