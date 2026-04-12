package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal Number : ");
        int num = input.nextInt();

        int decimal = octalToBinary(num);
        System.out.println("Octal Number of : " + num + " is " + decimal);

    }
    public static int octalToBinary(int num)
    {
        int ans = 0;
        int pow = 0;
        while(num > 0)
        {
            int rem = num % 10;
            num /= 10;
            ans = (int) (rem * Math.pow(8 , pow) + ans);
            pow++;
        }
        return  ans;
    }
}
