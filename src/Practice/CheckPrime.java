package Practice;

import java.util.Scanner;

public class CheckPrime {

    public static int checkPrime(int num)
    {
        if(num < 2){
            return 0;
        } else if (num == 2) {
            return  1;
        } else if (num > 2)
        {
            for (int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    return 0;

                }
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int ans = checkPrime(num);
        if(ans == 0){
            System.out.println("Number is not Prime : ");
        } else {
            System.out.println("Number is prime : ");
        }

    }
}
