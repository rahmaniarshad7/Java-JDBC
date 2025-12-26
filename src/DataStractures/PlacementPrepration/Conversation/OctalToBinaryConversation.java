package DataStractures.PlacementPrepration.Conversation;

import java.util.Scanner;

public class OctalToBinaryConversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Octal Number to Convert Into Binary : ");
        int octal = input.nextInt();

        int decimal = octalDecimal(octal);
        int binary = decimalToBinary(decimal);
        System.out.println(binary);
    }
    public static int octalDecimal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = (int) (rem * Math.pow(8 , pow) + ans);
            pow++;
        }
        return ans;
    }
    public static int decimalToBinary(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 2;
            num /= 2;
            ans = (int) (rem * Math.pow(10 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
