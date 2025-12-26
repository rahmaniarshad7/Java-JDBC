package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class PeakIndexInMountain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int peak = peakInMountain(arr , size);
        System.out.println(peak);
    }
    public static int peakInMountain(int[] arr , int size)
    {
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            } else if (arr[mid] < arr[mid  + 1]) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
/*
* int start = 0;
        int end = arr.size() - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(mid > 0 && mid < arr.size() - 1)
            {
                if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }
                else if(arr[mid - 1] > arr[mid]){
                    end = mid - 1;
                }
                else if(arr[mid + 1] > arr[mid]){
                    start = mid + 1;
                }

            }
            else if(mid == 0){
                if(arr[0] > arr[1]){
                    return 0;
                }else{
                    return 1;
                }
            }
            else if(mid == arr.size() - 1){
                if(arr[mid] > arr[mid - 1]){
                    return mid;
                }else{
                    return arr.size() - 1;
                }
            }
        }
        return -1;*/
