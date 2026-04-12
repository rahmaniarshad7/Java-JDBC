public class Sum {
    static void main() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        System.out.println("Time complexity: O(1)");

        double res = division(10 , 2);
        System.out.println("Division result: " + res);
    }
    public static double division(int num1, int num2){
        return (double) num1 / num2;
    }
}
