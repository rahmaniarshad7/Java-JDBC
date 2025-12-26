package DataStractures.PlacementPrepration.Conversation;

import java.util.Scanner;

public class OctalToDecimalConversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Octal Number To Convert Into Decimal : ");
        int octal = input.nextInt();

        int decimal = octalToDecimal(octal);
        System.out.println(decimal);
    }
    public static int octalToDecimal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 10;
            num = num / 10;
            ans = (int) (rem * Math.pow(8 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
