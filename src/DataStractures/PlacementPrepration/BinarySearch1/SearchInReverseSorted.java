package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SearchInReverseSorted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter elements to Search : ");
        int target = input.nextInt();

        int ans = binarySearch(arr , size , target);
        System.out.println("Element found at index : " + ans);
    }
    public static int binarySearch(int[] arr , int size , int target)
    {
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target)
            {
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;

            } else if (target > arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
