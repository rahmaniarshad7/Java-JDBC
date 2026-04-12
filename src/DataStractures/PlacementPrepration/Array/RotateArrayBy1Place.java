package DataStractures.PlacementPrepration.Array;

import DataStractures.PlacementPrepration.RightRotateArrayByKPlace;

import java.util.Scanner;

public class RotateArrayBy1Place {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        rotateArrayBy1Place(arr , size);
    }
    public static void rotateArrayBy1Place(int[] arr , int size)
    {

        RightRotateArrayByKPlace.rightRotate(arr, size);
        for (int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + "  ");
        }

    }
}
