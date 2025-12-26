package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class CielOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter target elements :");
        int target = input.nextInt();

        int ciel = findingCiel(arr , size , target);
        System.out.println(ciel);
    }
    public static int findingCiel(int[] arr , int size , int target){
        int ans = -1;
        int start = 0;
        int end = size - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target){
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
