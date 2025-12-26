package DataStractures.PlacementPrepration.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        bubbleSort(arr , size);
    }
    public static void bubbleSort(int[] arr , int size)
    {
        for(int i = size - 2; i >= 0; i--){
            for(int j = 0; j <= i; j++){

            }
        }
    }
}
