package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRevision {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "7544";
        String query = "DELETE FROM employees WHERE id = 5;";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully....");


        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url , username , password);
            Statement statement = connection.createStatement();

            int effectRow = statement.executeUpdate(query);
            if(effectRow > 0 ){
                System.out.println("Deletion Successfully...");
            }
            else {
                System.out.println("Deletion failed....");
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
