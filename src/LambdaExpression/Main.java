package LambdaExpression;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("My System Starts....");

        MyInter i = () -> System.out.println("Hello I am Fine....");
        i.getMessage();
        MyInter i2 = () -> System.out.println("Hello  I am Arshad....");
        i2.getMessage();

        SunInterface sunInterface = ( a ,  b) -> a + b;

        System.out.println(sunInterface.getSum(5 , 10));
        System.out.println(sunInterface.getSum(10 , 20));

        StrLegnth strLenth = (str) -> str.length();
        System.out.println(strLenth.getLength("Arshad"));

    }
}
    