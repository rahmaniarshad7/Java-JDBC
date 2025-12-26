package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateQuery {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "7544";
        String query = "UPDATE employees \n" +
                "SET job_title = 'Backend Engineer' , salary = 80000.0 \n" +
                "WHERE id = '1';";


        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully....");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url , username , password);
            System.out.println("Connection Established Successfully...");
            Statement statement = connection.createStatement();
            int rowEffect = statement.executeUpdate(query);

            if(rowEffect > 0){
                System.out.println("Updated Successfully...");
            } else{
                System.out.println("Update Failed....");
            }
            statement.close();
            connection.close();


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
