import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n3;

        System.out.println("Enter number to find fabrication series up to ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++)
        {
            n3 = n1 + n2;
            System.out.println( " " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
