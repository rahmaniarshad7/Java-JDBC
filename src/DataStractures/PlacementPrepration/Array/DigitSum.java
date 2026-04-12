package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int digitSum = sumDigit(num);
        System.out.println("Sum of Digit : " + digitSum);
    }
    public static int sumDigit(int num)
    {
        int sum = 0;
        while (num != 0)
        {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

}
