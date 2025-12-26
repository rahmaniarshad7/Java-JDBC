package DBJDBC;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrievingData {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "7544";
        String query = "select * from employees;";


        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url , username ,password);
            System.out.println("Connection Established Successfully ....");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String job_title = resultSet.getString("job_title");
                double salary = resultSet.getDouble("salary");

                System.out.println();
                System.out.println("---------------------------");
                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Job title : " + job_title);
                System.out.println("Salary : " + salary);
            }
            resultSet.close();
            statement.close();
            connection.close();


        } catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
