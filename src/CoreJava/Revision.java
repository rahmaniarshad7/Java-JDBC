class Practice{
    int a = 10;
    int y = 20;
    void display()
    {
        System.out.println(a);
        System.out.println(y);
    }
}
public class Revision {
    public static void main(String[] args) {
        Practice v1 = new Practice();
        v1.display();
        v1 = new Practice();
        v1.display();
    }
}
