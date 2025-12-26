package DataStractures.PlacementPrepration.Recurssion;

import java.util.Scanner;

public class Sum_of_Square_N_Natural_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter NUmber : ");
        int num = input.nextInt();

        int ans = getSum(num);
        System.out.println(ans);
    }
    public static int getSum(int num){
        if(num == 1){
            return 1;
        }
        return num * num + getSum(num - 1);
    }
}
