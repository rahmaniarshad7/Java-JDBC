import java.sql.*;
class UpdatingData
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "7544";
        String query = "UPDATE employees SET job_title = 'React Developer', salary = 60000.0 WHERE id = 3;";
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
                System.out.println("Update  Successful " + row_effected + " row(s) affected");
            } else {
                System.out.println("Update Failed");
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