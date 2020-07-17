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
	
	
	//Here, we can create
	
	public void petInfo() {
		if(conn==null) {
			conn= RetrieveConnection();
		}
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your pets name: ");
		String ans1 = scanner.next();
		
		System.out.println("Enter your pets species: ");
		String ans2 = scanner.next();
		
		try {
		String query = "insert into pet (name, species)"+" values (?,?)";
		
		PreparedStatement preparedStmt = conn.prepareStatement(query);
	    preparedStmt.setString (1, ans1);
	    preparedStmt.setString (2, ans2);
	    
	    preparedStmt.execute();
	    conn.close();
		}
		catch(Exception e) {System.out.println(e);}
	}
}
