package in.kgcoading.challenge83;

public class Circle extends Shape{
    private double radiusInCms;

    public Circle(double radiusInCms){
        this.radiusInCms = radiusInCms;
    }

    public double getRadiusInCms() {
        return radiusInCms;
    }

    /**
     * @return
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radiusInCms, 2);
    }
}
