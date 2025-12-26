package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter element to find floor : ");
        int target = input.nextInt();
        int floor = findingFloor(arr , size , target);
        System.out.println(floor);
    }
    public static int findingFloor(int[] arr , int size , int target){
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target < arr[mid]){
                ans = mid;
                end = mid - 1;
            }
            else if (target > arr[mid]){

                start = mid + 1;
            }
        }
        return ans;
    }
}
