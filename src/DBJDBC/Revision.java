package DBJDBC;

import java.sql.*;

public class Revision {
    public static void main(String[] args)  throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/family_information";
        String username = "root";
        String password = "7544";
        String query = "SELECT * FROM family;";


        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully....");

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try{
            Connection connection = DriverManager.getConnection(url , username , password);
            System.out.println("Connection Established Successfully");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int contactNumber = resultSet.getInt("contact_number");
                String education = resultSet.getString("education");

                System.out.println();
                System.out.println("ID = " + id);
                System.out.println("Name = " + name);
                System.out.println("Contact Number = " + contactNumber);
                System.out.println("Education = " + education);
                System.out.println();
                System.out.println("----------------------------------------------");
            }
            resultSet.close();
            statement.close();
            connection.close();




        } catch (SQLException e){
            e.printStackTrace();
        }

    }
}
