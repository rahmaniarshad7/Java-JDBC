import java.sql.*;
class MysqlCon
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "7544";
        String query = "select * from employees;";
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
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println("___________________________________");

                System.out.println("ID : " + id);
                System.out.println("Name : " + name);
                System.out.println("Job_Title : " + job_title);
                System.out.println("Salary : " + salary);

            }
            rs.close();
            stmt.close();
            con.close();

            System.out.println();
            System.out.println("Connection Close Successfully ");

        } catch (SQLException e){
            System.out.println(e.getMessage());
        }


    }
}
//JDBC_InsertingValues