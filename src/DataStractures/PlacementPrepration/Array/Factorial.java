package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : " );
        long  num = input.nextInt();

        long factorial = getFactorial(num);
        System.out.println("Factorial of Number : " + factorial);

    }
    public static long getFactorial(long num)
    {
        int fact = 1;
        int i = 1;
        while(i <= num)
        {
            fact *= i;
            i++;
        }
        return fact;
    }
}
