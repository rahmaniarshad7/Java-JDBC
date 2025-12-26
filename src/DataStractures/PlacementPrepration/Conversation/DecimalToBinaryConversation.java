package DataStractures.PlacementPrepration.Conversation;

import java.util.Scanner;

public class DecimalToBinaryConversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal Number To Convert in Binary : ");
        int decimal = input.nextInt();

        int binary = decimalToBinary(decimal);
        System.out.println(binary);
    }
    public static int decimalToBinary(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num > 0)
        {
            int rem = num % 2;
            num /= 2;
            ans = (int) (rem * Math.pow(10 , pow) + ans);
            pow++;

        }
        return ans;
    }

}
