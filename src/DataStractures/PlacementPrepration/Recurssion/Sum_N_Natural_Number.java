package DataStractures.PlacementPrepration.Recurssion;

import java.util.Scanner;

public class Sum_N_Natural_Number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = input.nextInt();

        int ans = getSum(num);
        System.out.println(ans);
    }
    public static int getSum(int num)
    {
        if(num == 1){
            return 1;
        }
        return num + getSum(num - 1);
    }

}
