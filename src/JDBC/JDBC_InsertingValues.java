package JDBC;

import java.sql.*;
class JDBC_InsertingValues
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "7544";
        String query = "INSERT INTO employees(id , name , job_title , salary) VALUES ('4', 'Vishnu' , 'Frontend Developer' , 60000.0);";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded Successfully ");
        } catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url , username , password);
            System.out.println("Connection established Successfully");
            Statement stmt = con.createStatement();

            int row_effected = stmt.executeUpdate(query);
            if (row_effected > 0){
                System.out.println("Insertion Successful " + row_effected + " row(s) affected");
            } else {
                System.out.println("Insertion Failed");
            }


            stmt.close();
            con.close();

            System.out.println();
            System.out.println("Connection Close Successfully ");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
