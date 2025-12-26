package Practice;

import java.util.Scanner;

public class DecimalToOctal {

    public static int decimalToOctal(int num){
        int ans = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 8;
            num /= 8;
             ans = (int) (rem * Math.pow(10 , pow) + ans);
             pow++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal Number : ");
        int decimal = input.nextInt();

        int octal = decimalToOctal(decimal);
        System.out.println(octal);
    }
}
