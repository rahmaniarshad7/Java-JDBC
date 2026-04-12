package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class SubArrayTargetSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target sum : ");
        int target = input.nextInt();

        targetSum(arr , size , target);
    }
    public static void targetSum(int[] arr , int size , int target)
    {
        int currentSum = 0;
        int left = 0;
        int right = 0;
        while(right < size)
        {
            currentSum = currentSum + arr[right];
           if (currentSum < target)
           {
               right++;
           } else if (currentSum > target) {
               currentSum = currentSum - arr[left];
               left++;

           } else if (currentSum == target) {
               for (int i = left + 1; i <= right; i++)
               {
                   System.out.print(arr[i] + " ");
               }

           }
        }
    }
}
