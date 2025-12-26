package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target elements : ");
        int target = input.nextInt();

        int position = searchInsertPosition(arr , size , target);
        System.out.println(position);
    }
    public static int searchInsertPosition(int[] arr , int size , int target)
    {
        int ans = size;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] < target)
            {
                start = mid + 1;
            } else if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
