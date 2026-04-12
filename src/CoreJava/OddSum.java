import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        int number = input.nextInt();

        int add = oddSum(number);
        System.out.println(add);
    }
    public static int oddSum(int num)
    {
        int sum = 0;
        int i = 1;
        while (i <= num)
        {
            sum = sum + i;
            i= i + 2;
        }
        return sum;
    }
}