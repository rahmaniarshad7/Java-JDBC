package Practice;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int binaryDecimal(int num){
        int ans = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            ans = (int) (rem * Math.pow(2  , pow) + ans);
            pow++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number : ");
        int binary = input.nextInt();

        int decimal = binaryDecimal(binary);
        System.out.println(decimal);
    }
}
