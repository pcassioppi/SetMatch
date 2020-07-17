import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Player {
	
	int id =0;
	String name;
	int skill;
	String city;
	
	public void playerInfo(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		this.name = scanner.next();
		
		System.out.println("Enter your city: ");
		this.city = scanner.next();
		//input.setCity(city);
		
		System.out.println("Enter your skill level (Beginner, Novice, Intermediate, Advanced,or Expert): ");
		String skill = scanner.next().toLowerCase();
		int slevel = 0;
		if(skill.equals("beginner")) {
		}
		else if(skill.equals("novice")) {
			slevel = 1;
		}
		else if(skill.equals("intermediate")) {
			slevel = 2;
		}
		else if(skill.equals("Advanced")) {
			slevel = 3;
		}
		else if(skill.equals("Expert")) {
			slevel = 4;
		}
		else {
			System.out.println("Input error");
		}
		
		this.skill = slevel;
		int id=1;
		
		//MySQLConnection db = new MySQLConnection();
		
		
		
		System.out.println("User:  "+name);
		System.out.println("City:  "+city);
		System.out.println("Skill:  "+skill);
		System.out.println("Id: "+id);
		id++;
		
	}
	
	Connection conn = null;

	public Connection RetrieveConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://setmatchdb.cqkvg3uj1j8v.us-east-2.rds.amazonaws.com/user","admin","pcsetmatch");		
		}catch(Exception e) {System.out.println(e);}
		return conn;
		}
	
	
	
	}
	
	

