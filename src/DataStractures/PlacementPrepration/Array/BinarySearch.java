package DataStractures.PlacementPrepration.Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter elements to Search : ");
        int target = input.nextInt();

        int ans = binarySearch(arr, size, target);
        if (ans == -1) {
            System.out.println("Element not found in Array : ");
        } else {
            System.out.println("Element found at index " + ans);
        }
    }

    public static int binarySearch(int[] arr, int size, int target) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
