import java.util.Scanner;

public class Armstorng {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to check Armstrong : ");
        int num = input.nextInt();
        
        int result = checkArmstrong(num);
        if (result == num)
        {
            System.out.println("Number is Armstrong : ");
        }
        else 
            System.out.println("Number is not Armstrong : ");

    }
    public static int checkArmstrong(int num)
    {
        int r;
        int sum = 0;
        
        while(num > 0)
        {
            r = num % 10;
            sum = sum + (int) Math.pow(r , 3);
            num = num / 10;
        }
        
        return sum;
    }
}
