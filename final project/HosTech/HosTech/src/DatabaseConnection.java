import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;


public class DatabaseConnection {

    
    public static Connection dbConnector()
    {
		String url = "jdbc:mysql://localhost:3306/";
		 String user = "root";
		  String password = "";
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection(url, user, password);
            return con;

		}
		  catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
	}
}