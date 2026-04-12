package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class DecimalToBinaryConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int binary = decimalToBinary(num);
        System.out.println("Binary Form of " + num + "  " + binary);
    }
    public static int decimalToBinary(int num)
    {
        int ans = 0;
        int pow = 1;
        while (num > 0)
        {
            int rem = num % 2;
            num /= 2;
            ans += rem * pow;
            pow *= 10;
        }
        return ans;
    }
}
