package Infosys.SpringBoard;

public class EmployeeRecord {
    public static void main(String[] args) {
        double[] arr = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double sum = 0;
        for (double v : arr) sum += v;
        double avg = sum / arr.length;
        int less = 0, greater = 0;
        for (double v : arr) {
            if (v > avg) greater++;
            else less++;
        }
        System.out.println("Average Salary : " + avg);
        System.out.println("Salary less than Average : " + less);
        System.out.println("Salary Greater than Average : " + greater);
    }
}
