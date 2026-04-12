import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to factorial Generator : \n");

        System.out.print("Enter Number to find factorial : ");
        int num = input.nextInt();

        long result = factorial(num);
        System.out.println(result);
    }
    static long factorial(int num){
        long fact = 1;
        int i = 1;
        while (i <= num)
        {
          fact = fact * i;
          i++;
        }

        return fact;
    }
}
