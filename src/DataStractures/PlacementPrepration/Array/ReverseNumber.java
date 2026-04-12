package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number to Reverse : ");
        int num = input.nextInt();

        int reverse = reverseNumber(num);
        System.out.println("Original Number : " + num);
        System.out.println("Reverse Number : " + reverse);
    }
    public static int reverseNumber(int num)
    {
        int reverse = 0;
        while(num != 0)
        {
            int rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
        }
        return reverse;
    }
}
