package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SearchInNearlySortedArray {
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
        System.out.println("Enter target elements : ");
        int target = input.nextInt();

        int ans = nearlySortedArray(arr , size , target);
        System.out.println(ans);
    }
    public static int nearlySortedArray(int[] arr , int size , int target)
    {
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            {
                return mid;
            } else if ( mid - 1 >= start && target == arr[mid - 1]) {
                return mid - 1;
            } else if (mid + 1 >= end && target == arr[mid + 1]) {
                return mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 2;
            } else if (target > arr[mid]) {
                start = mid + 2;
            }

        }
        return -1;
    }
}

