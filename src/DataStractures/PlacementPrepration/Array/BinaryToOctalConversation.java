package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class BinaryToOctalConversation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Binary Number : ");
        int binary = input.nextInt();

        int decimal = decimalConversation(binary);
        int octal = octalConversation(decimal);
        System.out.println(octal);
    }
    public static int decimalConversation(int num)
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
    public static int octalConversation(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num > 0)
        {
            int rem = num % 8;
            num /= 8;
            ans = (int) (rem * Math.pow(10 , pow) + ans);
            pow++;
        }
        return ans;
    }
}
