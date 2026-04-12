import java.util.Scanner;

public class DelhiPollution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day to calculate fine ... ");
        int day = input.nextInt();

        if (day < 1 && day > 31)
        {
            System.out.println("please Enter Day Between 1 to 31");

        }

        System.out.println("Enter Size of Array... ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array... ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        int fine = 1200;


        int fineOfDay = calculateFine(arr , size , fine , day);
        System.out.println(fineOfDay);

    }
    public static int calculateFine(int[] arr , int size , int fine, int day)
    {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++)
        {
            if (arr[i] % 2 == 0)
            {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }
        if(day % 2 == 0)
        {
            return fine * oddCount;
        }
        else{
            return fine * evenCount;
        }

    }
}
