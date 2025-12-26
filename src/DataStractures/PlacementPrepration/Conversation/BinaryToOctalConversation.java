package DataStractures.PlacementPrepration.Conversation;

import java.util.Scanner;

public class BinaryToOctalConversation {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number To Convert into Octal : ");
        int binary = input.nextInt();

        int decimal = binaryToDecimal(binary);
        int octal = decimalToOctal(decimal);
        System.out.println(octal);
    }
    public static int binaryToDecimal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = (int) (rem * Math.pow(2 , pow) + ans);
            pow++;
        }
        return ans;
    }
    public static int decimalToOctal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 8;
            num /= 8;
            ans = (int) (rem * Math.pow(10 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
