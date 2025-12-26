package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        int size = arr.length;

        System.out.println("Enter elements to search : ");
        int target = input.nextInt();

        int ans = binarySearch(arr , size , target);
        System.out.println(ans);
    }
    public static int binarySearch(int[] arr , int size , int target)
    {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]){
                return mid;
            } else if (arr[mid] > arr[0]) {
                if(target >= arr[0] && target <= arr[mid]){
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            } else if (arr[mid] < arr[0]) {
                if(target >= arr[mid] && target <= arr[end]){
                    start = mid  + 1;
                }
                else
                    end = mid - 1;
            }
        }
        return ans;
    }
}
