package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class FloorOfTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[] {3,4,7,8,8,10};
        int size = arr.length;

        System.out.println("Enter target elements : ");
        int target = input.nextInt();
        
        int ans = findingFloor(arr , size , target);
        System.out.println(ans);
    }
    public static int findingFloor(int[] arr , int size , int target)
    {
        int ans = 0;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                ans = arr[mid];
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return ans;
    }
}
