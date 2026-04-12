import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Size of Array... ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter Elements in Array... ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter Elements to Search...");
        int key = input.nextInt();

        int result = binarySearch(arr, size, key);
        if (result == -1)
        {
            System.out.println("Element is not present...");
        }
        else
            System.out.println("Element is present at index : " + result);
    }

    public static int binarySearch(int[] arr, int size, int key) {
        int start = 0;
        int end = size - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                return mid;

            }
            else if (arr[mid] > key){
                end = mid - 1;

            }
            else if (arr[mid] < key)
            {
                start = mid + 1;
            }

        }
        return -1;
    }


}
