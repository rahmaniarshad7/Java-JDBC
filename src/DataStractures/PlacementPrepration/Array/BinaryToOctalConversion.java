package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class BinaryToOctalConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number : ");
        int num = input.nextInt();

        int octal = BinaryToOctal(num);
        System.out.println("Octal Number of " + num + " is " + octal);

    }
    public static int BinaryToOctal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num > 0)
        {
            int rem = num % 8;
            num /= 8;
            ans = (int) (rem* Math.pow(10 , pow) + ans);
            pow++;

        }
        return ans;
    }
}
