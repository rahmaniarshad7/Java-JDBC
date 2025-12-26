package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class CountOccurrenceOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target element : ");
        int target = input.nextInt();
        int lb = firstOcc(arr , size , target);
        int ub = lastOcc(arr , size , target);
        if(lb == -1 && ub == -1)
        {
            System.out.println("Element not found : ");
        }else {
            System.out.println(ub - lb + 1);
        }

    }
    public static int firstOcc(int[] arr , int size , int target)
    {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            {
                ans = mid;
                end = mid - 1;
            }
            else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static int lastOcc(int[] arr , int size , int target)
    {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
            {
                ans = mid;
                start = mid + 1;
            }
            else if (target < arr[mid])
            {
                end = mid - 1;
            }
            else if (target > arr[mid])
            {
                start = mid + 1;
            }
        }
        return ans;
    }
}
