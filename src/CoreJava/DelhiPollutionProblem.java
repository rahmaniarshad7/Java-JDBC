import java.util.Scanner;

public class DelhiPollutionProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size Of Array.... ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements in Array... ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
       int fine = calculateFine(arr , size);
        System.out.println("Total fine = " + fine);

    }
    public static int calculateFine(int[] arr , int size)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day... ");
        int day = input.nextInt();

        int fine = 1200;
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < size; i++)
        {
            if (arr[i] % 2 == 0)
            {
                countEven++;
            }
            else countOdd++;
        }
        if ((day >= 1 && day <= 31) && (day % 2 == 0))
        {
            return countOdd * fine;
        }
        else {
            return countEven * fine;
        }
    }
}
