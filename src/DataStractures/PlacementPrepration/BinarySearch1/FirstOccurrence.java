package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements inArray : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target elements : ");
        int target = input.nextInt();

        int firstIndex = firstOccurrence(arr , size , target);
        int lastIndex = lastOccurrence(arr , size , target);
        System.out.println("First Occurrence : " + firstIndex);
        System.out.println("Last Occurrence : " + lastIndex);
    }
    public static int firstOccurrence(int[] arr , int size , int target)
    {
        int start = 0;
        int end = size - 1;
        int ans = 0;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
            {
                ans = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }

        }
        return ans;
    }
    public static int lastOccurrence(int[] arr , int size , int target)
    {
        int start = 0 ;
        int end = size - 1;
        int ans = -1;
        while(start <= end)
        {
            int mid = start  + (end - start) / 2;
            if (target == arr[mid]){
                ans = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }

        }
        return ans;
    }
}
