import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to fnd Factorial : ");
        int num = input.nextInt();

        long result = factorial(num);
        System.out.println(result);
    }
    public static long factorial(int num)
    {
        if (num == 1)
        {
            return 1;
        }
        return num * factorial(num -1);
    }
}
