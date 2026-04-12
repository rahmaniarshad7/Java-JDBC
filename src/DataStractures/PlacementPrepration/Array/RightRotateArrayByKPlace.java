package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class RightRotateArrayByKPlace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Times Rotations : ");
        int k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            rightRotate(arr, size);
        }
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rightRotate(int[] arr , int size)
    {
        int temp = arr[size - 1];
        for (int i = size - 2; i >= 0; i--)
        {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
    }
}
