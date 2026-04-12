import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number");
        int num = input.nextInt();
        System.out.println(sum1(num));
    }
    public static int sum1(int num)
    {
        int sum = 0;
        while (num > 0)
        {
            sum = sum + (num % 10);
            num = num / 10;
        }
        return sum;
    }
}
