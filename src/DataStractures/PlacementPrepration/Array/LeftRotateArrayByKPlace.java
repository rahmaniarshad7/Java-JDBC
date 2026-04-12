package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class LeftRotateArrayByKPlace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter Elements in Array : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter K Place to Rotate Array : ");
        int k = input.nextInt();

       int[] ans =  leftRotate(arr , size , k);
       for(int i = 0; i < size; i++)
       {
           System.out.print(ans[i] + "  ");
       }
    }
    public static int[] leftRotate(int[] arr , int size , int k)
    {
        int[] num = new int[size];
        for (int i = 0; i < size; i++)
        {
            num[(i + k) % size] = arr[i];
        }
       return num;
    }
}
