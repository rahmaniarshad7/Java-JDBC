package JDBC;

public class JDBC {
    static void main() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found");
        }
    }
}
