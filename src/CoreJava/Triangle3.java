public class Triangle3 implements Shape3
{
    private final double base;
    private final double height;

    Triangle3(double base , double height)
   {
       this.base = base;
       this.height = height;
   }

    @Override
    public double getArea() {

        return 0.5 * base * height;

    }

    /**
     * @return
     */
    @Override
    public double getPerimeter() {
        return 0;
    }
}
class main10{
    public static void main(String[] args) {
       Triangle3 tri = new Triangle3(5 , 10);
       tri.getArea();
    }
}
