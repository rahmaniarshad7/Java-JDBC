package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class StringDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        String str = input.nextLine();

        int ans = sum(str);
        System.out.println("Sum of String : " + ans);
    }
    public static int sum(String str)
    {
        int sum = 0;
        for(int i = 0; i < str.length(); i++)
        {
            
            sum = sum + str.charAt(i) - 48;
        }

        return sum;
    }
}
