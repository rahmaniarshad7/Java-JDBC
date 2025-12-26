package DataStractures.PlacementPrepration.Conversation;

import java.util.Scanner;

public class BinaryToDecimalConversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number To Convert into Decimal : ");
        int binary = input.nextInt();

        int decimal = binaryToDecimal(binary);
        System.out.println(decimal);
    }
    public static int binaryToDecimal(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num != 0)
        {
            int rem = num % 10;
            num = num / 10;
            ans = (int) (rem * Math.pow(2 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
