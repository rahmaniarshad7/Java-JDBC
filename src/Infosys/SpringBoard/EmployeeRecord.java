package Infosys.SpringBoard;

public class EmployeeRecord {
    public static void main() {

        double[] arr = new double[] {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        double sum = 0;
        for (double v : arr) {
            sum = sum + v;
        }
        double avg = sum / arr.length;

        int count = 0;
        int count2 = 0;

        for (double v : arr) {
            if (v > avg) {
                count++;
            } else {
                count2++;
            }
        }
        System.out.println(STR."Average Salary : \{avg}");
        System.out.println(STR."Salary less than Average : \{count2}");
        System.out.println(STR."Salary Greater than Average : \{count}");
    }
}
