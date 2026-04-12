public class Main6{
    public static void main(String[] args) {
        Employee emp1 = new Manager("Arshad Rahmani" , 7500.00, 1500.00);
        Employee emp2 = new Programmer("Aiman Fatma" , 10000.00 , 6000.00);

        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());
    }
    
}
