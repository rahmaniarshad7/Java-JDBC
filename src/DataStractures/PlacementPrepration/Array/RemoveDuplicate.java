package DataStractures.PlacementPrepration.Array;

import java.util.Scanner;

public class RemoveDuplicate {
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
       int count =  uniqueElement(arr , size);
        System.out.println("Size of Unique elements in Array : " + count);
    }
    public static int uniqueElement(int[] arr , int size)
    {
        int count = 0;
        for (int i = 1; i < size; i++)
        {
            if (arr[i] == arr[i - 1])
            {

            }
            else {
                count++;
            }
        }
        return count + 1;
    }
}
