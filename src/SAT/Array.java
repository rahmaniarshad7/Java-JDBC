package SAT;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Size : ");
        int size = input.nextInt();

        // Deceleration
        int arr[] = new int[size];
        System.out.println("Enter elements in Array : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        // printing elements of array

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
