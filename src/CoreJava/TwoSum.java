import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of Array...");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements in Array...");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target Sum ...");
        int sum = input.nextInt();

        int ans = checkSum(arr , size , sum);
        if (ans == 1){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
    public static int checkSum(int[] arr , int size , int sum)
    {
        int start = 0;
         int end = size -1;

         while (start <= end)
         {
             if (arr[start] + arr[end] == sum)
             {
                 return 1;
             }
             else if (arr[start] + arr[end] < sum)
             {
                 start++;
             }
             else
                 end--;
         }

        return 0;
    }
}
