package banking;
import java.sql.Connection;
import java.sql.DriverManager;
// Global connection Class
public class connection {
    static Connection connection_; // Global Connection Object
    public static Connection getConnection() {
        
        try {
        Class.forName("com.mysql.jdbc.Driver");
        connection_ = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root", "prachi@123456789");
        }
        catch (Exception e) {
            System.out.println("Connection Failed!");
        }
        
 
        return connection_;
    }
}
