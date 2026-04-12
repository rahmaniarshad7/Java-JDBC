import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to find factorial : ");
        int num = input.nextInt();
        System.out.println(factorial(num));
    }
    public static int factorial(int num1)
    {
        int fact = 1;
        int i = 1;
        while (i <= num1){
            fact = fact * i;
            i++;
        }
        return fact;
    }
}
