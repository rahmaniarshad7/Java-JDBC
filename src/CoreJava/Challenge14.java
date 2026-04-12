import java.util.Scanner;

//convert fahrenheit to celsius
public class Challenge14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fahrenheit : ");
        float f = input.nextFloat();
        float c = (f - 32) * 5 / 9;
        System.out.println(" Celsius = " + c);
    }
}
