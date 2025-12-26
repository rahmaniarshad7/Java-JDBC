package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class FirstIndexInInfiniteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("enter elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter target elements : ");
        int target = input.nextInt();

        int firstIndex = firstIndexInSortedArray(arr , target);
        System.out.println(firstIndex);
    }
    public static int firstIndexInSortedArray(int[] arr , int target){
        int ans = -1;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            start = end;
            end = end * 2;
        }
        while(start <=end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return  ans;
    }
}
