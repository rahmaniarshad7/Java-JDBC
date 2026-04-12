package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number : ");
        int num = input.nextInt();

        int decimal = binaryToDecimal(num);
        System.out.println("Decimal Number of : " + num + " " + decimal);
    }
    public static int binaryToDecimal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num > 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = (int) (rem * Math.pow(2 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
