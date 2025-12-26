package Practice;

import java.util.Scanner;

public class DecimalToBinary {

    public static int DecimalToBinary(int num){
        int ans = 0;
        int pow = 0;
        while(num > 0){
            int rem = num % 2;
            num /= 2;

            ans = (int) (rem * Math.pow(10 , pow) + ans);
            pow++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Decimal Number : ");
        int num = input.nextInt();

        int binary = DecimalToBinary(num);
        System.out.println(binary);
    }
}
