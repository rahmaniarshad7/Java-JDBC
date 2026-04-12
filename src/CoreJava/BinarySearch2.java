import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array.... ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in Array... ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Element to Search in array... ");
        int key = input.nextInt();

        int index = binarySearch(arr , size , key);

        if (index == -1)
        {
            System.out.println("Element is not Found.... ");
        }
        else {
            System.out.println("Element is present at index " + index);
        }
    }
    public static int binarySearch(int[] arr , int size , int key)
    {
        int start = 0;
        int end = size - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if (key == arr[mid])
            {
                return mid;
            }
            else if (key > arr[mid])
            {
                start = mid + 1;
            }
            else if (key < arr[mid])
            {
                end = mid - 1;
            }
        }

        return -1;
    }
}
