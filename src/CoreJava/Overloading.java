public class Overloading {
    public static int sum(int a, int b)
    {
        return a + b;
    }
    public static int sum(int a, int b, int c)
    {
        return a + b +c;
    }
    public static int sum (int a , int b , int c, int d)
    {
        return a + b + c + d;
    }

    public static void main(String[] args)
    {
        Overloading overload = new Overloading();
        System.out.println(overload.sum(3,2));
        System.out.println(overload.sum(1,2));
        System.out.println(overload.sum(1,2,3,4));
    }
}
