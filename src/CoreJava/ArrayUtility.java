import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = input.nextInt();
        int []num = new int[size];

        System.out.println("Enter Elements in Array.....");
        int i = 0;
        while (i < size){
            num[i] = input.nextInt();
            i++;
        }
        return num;

    }
}
