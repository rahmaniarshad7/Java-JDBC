package DataStractures.PlacementPrepration.BinarySearch1;

import java.util.Scanner;

public class SquareRoot1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int ans = findingRoot(num);
        System.out.println(ans);
    }
    public static int findingRoot(int num)
    {
        int ans = -1;
        int start = 0;
        int end = num;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            int root = mid * mid;
            if(root == num){
                return mid;
            }
            else if (root > num)
            {
                end = mid - 1;
            } else if (root < num) {
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
}
