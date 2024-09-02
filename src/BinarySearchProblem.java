import java.util.Scanner;

public class BinarySearchProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size of Array.....");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements in Array .. : ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Element to find : ");
        int element = input.nextInt();


        int result = binarySearch(arr , size , element);
        System.out.println( "Element is present at index " + result);

    }
    public static int binarySearch(int[] arr , int size , int element)
    {
        int start = 0;
        int end = size - 1;

        while(start <= end )
        {
            int mid = (start + end) / 2;
            if (arr[mid] == element)
            {
                return mid;
            } else if (arr[mid] > element)
            {
                end = mid - 1;
            } else if (arr[mid] < element)
            {
                start = start + 1;
            }
        }
        return -1;
    }
}
