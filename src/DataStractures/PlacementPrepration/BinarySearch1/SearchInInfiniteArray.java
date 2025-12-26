package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = input. nextInt();
        }
        System.out.println("Enter target elements : ");
        int target = input.nextInt();

        int index = searchInfiniteArray(arr , target);
        System.out.println(index);
    }
    public static  int searchInfiniteArray(int[] arr , int target)
    {
        int start = 0;
        int end = 1;
        while(target > arr[end])
        {
            start = end;
            end = end * 2;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
        }
        return -1;
    }

}
