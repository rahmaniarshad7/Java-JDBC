package SAT;

import java.util.Scanner;

public class MaximumInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter elements in Array : ");

        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        // finding Maximum value in Array
        int max = arr[0];
        for(int i = 1; i < size; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(STR."Max Value : \{max}");

    }
}
