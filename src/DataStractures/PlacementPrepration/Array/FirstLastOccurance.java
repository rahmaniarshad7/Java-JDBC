package DataStractures.PlacementPrepration;

import java.util.Scanner;

public class FirstLastOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter elements : ");
        int target = input.nextInt();

        int firstIndex = firstPosition(arr , size , target);
        int lastIndex = lastPosition(arr , size , target);

        System.out.println("first position = " + firstIndex);
        System.out.println("Last position = " + lastIndex);

    }
    public static int firstPosition(int[] arr , int size , int target)
    {
        int first = -1;
        for(int i = 0; i < size; i++)
        {
            if(arr[i] == target)
            {
                first = i;
                return first;
            }
        }
        return first;
    }
    public static int lastPosition(int[] arr , int size , int target)
    {
        int last  = -1;
        for(int i = size - 1; i >= 0; i--)
        {
            if (arr[i] == target)
            {
                last = i;
                return last;
            }
        }
        return last;
    }
}
