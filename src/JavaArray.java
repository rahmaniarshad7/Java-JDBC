import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter size of array");
        int size = input.nextInt();

        int []arr = new int[size];
        System.out.print("Enter elements in array : ");
        for (int i =0; i<size; i++){
            arr[i] = input.nextInt();
        }
        for (int i =0; i<=size; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);






    }

}
