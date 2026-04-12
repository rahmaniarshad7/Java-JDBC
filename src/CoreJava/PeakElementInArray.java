import java.util.Scanner;

public class PeakElementInArray
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array....  ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int i  = 0; i < size; i++)
        {
            arr[i] = input.nextInt();
        }
        int result = peakElement(arr , size);
        System.out.println("Peak Element in Array " + arr[result]);

    }
    public static int peakElement(int[] arr , int size)
    {
        int low = 0;
        int high = size - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            if (mid > 0 && mid < size -1)
            {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid +1])
                {
                    return mid;
                } else if (arr[mid - 1] > arr[mid])
                {
                    high = mid -1;
                } else if (arr[mid + 1] > arr[mid])
                {
                    low = mid + 1;

                }
            }
            else if (mid == 0)
            {
                if (arr[0] > arr[1])
                {
                    return 0;
                }
                else
                    return 1;
            } else if (mid == size -1)
            {
                if (arr[size -1 ] > arr[size -2])
                {
                    return size -1;
                }
                else
                    return size -2;

            }
        }

        return -1;
    }
}
