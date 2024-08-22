import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number : ");
        int num1 = input.nextInt();

        System.out.println("Enter second Number : ");
        int num2 = input.nextInt();

        System.out.println("Enter Third Number : ");
        int num3 = input.nextInt();

        int largest = largestNum(num1 , num2 , num3);
        System.out.println("Largest Number = " + largest);
    }
    public static int largestNum(int num1 , int num2 , int num3)
    {
        if (num1 > num2 && num1 > num3)
        {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2) {
            return num3;

        }

        return 0;
    }
}
