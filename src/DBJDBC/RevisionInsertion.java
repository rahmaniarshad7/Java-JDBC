package DBJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RevisionInsertion {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/family_information";
        String username = "root";
        String pass = "7544";
        String query = "INSERT INTO family(id , name , contact_number , education) VALUES(2 , 'Altamash Rahmani' , 736109 , 'PCB');";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            Connection connection = DriverManager.getConnection(url , username , pass);
            Statement statement = connection.createStatement();
           int rowEffect =  statement.executeUpdate(query);

           if (rowEffect > 0){
               System.out.println("Insertion Successfully...");
           } else {
               System.out.println("Insertion failed");
           }

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
