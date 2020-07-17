import java.sql.*;
import java.util.Scanner;

public class MySQLConnection {
	
	Connection conn = null;

	public Connection RetrieveConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://setmatchdb.cqkvg3uj1j8v.us-east-2.rds.amazonaws.com/user","admin","pcsetmatch");		
		}catch(Exception e) {System.out.println(e);}
		return conn;
		}
}
