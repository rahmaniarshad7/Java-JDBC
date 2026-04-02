package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteQuery {
    public static void main(String[] args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "7544";
        String query = "DELETE FROM employees WHERE id = 6; ";

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
                System.out.println(STR."Insertion Successfully  \{rowEffected}  row(s) effected");
            }
            else {
                System.out.println("Insertion Failed...");
            }
            statement.close();
            connection.close();
            System.out.println("Connection Closed Successfully");


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
