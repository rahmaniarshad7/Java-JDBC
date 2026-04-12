package in.collecticonsGenerices;

public class VarArgs {
    public static void main(String[] args)
    {
        int sum = sum(2,3,4);
        System.out.println(sum);

    }
    public static int sum(int...a)
    {
        int sum = 0;
        for (int i : a)
        {
            sum = sum + i;
        }
        return sum;

    }

}
