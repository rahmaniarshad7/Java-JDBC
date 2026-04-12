package DataStractures.PlacementPrepration.Array;

import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Elements to Search : ");
        int target = input.nextInt();
        int ans = linearSearch(arr , size , target);

        if(ans == -1)
        {
            System.out.println("Elements not found in Array : ");
        }
        else {
            System.out.println("Elements is found at index " + ans);
        }
    }
    public static int linearSearch(int[] arr , int size , int target)
    {
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
