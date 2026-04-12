public class Calculator
{
    public int add(int a , int b)
    {
        return a + b;
    }
    public int add(int a , int b , int c)
    {
        return a + b + c;
    }
    public long add(long a , long b)
    {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5 , 5));
        System.out.println(calc.add(10 , 20 , 30));
        System.out.println(calc.add((int) 10.52, (int) 10.52));
    }
}
