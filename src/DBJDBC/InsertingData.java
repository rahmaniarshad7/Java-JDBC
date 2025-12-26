package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingData {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "7544";
        String query = "INSERT INTO employees(id , name , job_title , salary) VALUES(6 , 'Vishnu Kumar' , 'Database Engineer' , 520000.0);";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully....");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url , username , password);
            Statement statement = connection.createStatement();
            int rowEffected = statement.executeUpdate(query);
            if (rowEffected > 0){
                System.out.println("Insertion Successfully  " + rowEffected + "  row(s) effected");
            }
            else {
                System.out.println("Insertion Failed...");
            }
            statement.close();
            connection.close();


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
