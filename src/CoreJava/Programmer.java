public class Programmer extends Employee{
    public double baseSalary;
    public double overTimePay;

    public Programmer(String name, double baseSalary , double overTimePay) {
        super(name, "Programmer");
        this.baseSalary = baseSalary;
        this.overTimePay = overTimePay;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + overTimePay;
    }
}
