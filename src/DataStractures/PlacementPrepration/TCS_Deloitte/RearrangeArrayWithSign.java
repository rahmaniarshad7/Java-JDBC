package DataStractures.PlacementPrepration.TCS_Deloitte;

import java.util.Scanner;

public class RearrangeArrayWithSign {

    public static void rearrangeArray(int[] arr , int size){
        int[] posArr = new int[size/2];
        int[] negArr = new int[size/2];

        for(int i = 0; i < size; i++){
            if(arr[i] > 0){
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        rearrangeArray(arr , size);
    }
}
