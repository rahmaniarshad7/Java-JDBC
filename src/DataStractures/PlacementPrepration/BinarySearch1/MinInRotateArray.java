package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class MinInRotateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements i n Array : ");
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int min = minimumInRotateArray(arr , size);
        System.out.println(min);
    }
    public static int minimumInRotateArray(int[] arr , int size)
    {
        int ans = 0;
        int start = 0;
        int end = size - 1;
        while(start <=end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[0]){
                start = mid + 1;
            } else if (arr[mid] < arr[0]) {
                ans = arr[mid];
                end = mid - 1;
            } else if (arr[mid] == arr[0]) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
