import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertingImage {
    public static void main(String[] args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/?user=root";
        String username = "root";
        String password = "7544";
        String image_path = "C:\\Users\\DELL\\Desktop\\JDBC_Pic\\Aiman pic.jpg";
        String query = "INSERT INTO image_table (image_data) VALUES (?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded Successfully...");

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection con = DriverManager.getConnection(url , username , password);
            System.out.println("Connection Established Successfully...");
            FileInputStream fileInputStream = new FileInputStream(image_path);
            byte[] imageData = new byte[fileInputStream.available()];
            fileInputStream.read(imageData);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setBytes(1 ,imageData);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0){
                System.out.println("Image Inserted Successful...");
            } else{
                System.out.println("Image Insertion Failed...");
            }



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
