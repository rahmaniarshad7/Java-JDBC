import java.util.Scanner;

public class CheckMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Enter your Marks : ");
        int mark = input.nextInt();

        String category = mark > 80 ? " High " : (mark > 50 ? "Moderate" : "Low" );
        System.out.println(category);
    }
}
