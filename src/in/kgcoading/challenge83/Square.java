package in.kgcoading.challenge83;

public class Square extends Shape{

    private final double sideINCms;

    public Square(double sideINCms) {
        this.sideINCms = sideINCms;
    }

    public double getSideINCms() {
        return sideINCms;
    }

    /**
     * @return
     */
    @Override
    public double calculateArea() {
        return Math.pow(sideINCms , 2);
    }
}
