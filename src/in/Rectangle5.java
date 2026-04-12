package in;

public class Rectangle5 {
    int length;
    int breadth;

    public Rectangle5(int length , int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void area()
    {
        int area = length * breadth;
        System.out.println(area);
    }
}
class main9{
    public static void main(String[] args) {
        Rectangle5 rectangle5 = new Rectangle5(4 , 5);
        rectangle5.area();


        Rectangle5 rec = new Rectangle5(5 , 8);
        rec.area();
    }
}
