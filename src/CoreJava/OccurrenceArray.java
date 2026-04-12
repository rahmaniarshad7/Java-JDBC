import java.util.Scanner;

public class OccurrenceArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Occurrence .... ");
        int [] numArray = ArrayUtility.inputArray();
        System.out.print("Enter number to find Occurrence : ");
        int num = input.nextInt();
        int occurrence = occ(numArray , num);
        System.out.println("occurrence of " + num + " is " + occurrence);
    }
    public static int occ(int [] numArray , int num){
        int count = 0;
        int i = 0;
        while (i < numArray.length){
            if (numArray[i] == num){
                count = count + 1;
            }
            i++;
        }
        return count;
    }
}
