import java.sql.*;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	
	int id = 0;
	String name;
	int skill;
	String city;
	
	public void playerInfo(){
		id = setNextId();
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter your name: ");
		this.name = scanner.next();
		
		System.out.println("Enter your city: ");
		scanner.nextLine(); 
		this.city = scanner.nextLine();
		
		System.out.println("Enter your skill level (Beginner, Novice, Intermediate, Advanced,or Expert): ");
		String skill = scanner.next().toLowerCase();
		int slevel=0;
		if(skill.equals("beginner")) {
			slevel=1;
		}
		else if(skill.equals("novice")) {
			slevel = 2;
		}
		else if(skill.equals("intermediate")) {
			slevel = 3;
		}
		else if(skill.equals("advanced")) {
			slevel = 4;
		}
		else if(skill.equals("expert")) {
			slevel = 5;
		}
		else {
			System.out.println("Input error");
		}
		
		this.skill = slevel;
		
		System.out.println("User:  "+name);
		System.out.println("City:  "+city);
		System.out.println("Skill:  "+skill);
		System.out.println("Id: "+id);
		
	}
	
	
	
	Connection conn = null;

	public void inputPlayerInfo(int id, String name, int skill, String city) {
		MySQLConnection db = new MySQLConnection();
		conn = db.RetrieveConnection();
		
		try {
		String query = "insert into player (id, name, skilllevel, city)"+" values (?,?,?,?)";
		
		PreparedStatement preparedStmt = conn.prepareStatement(query);
	    preparedStmt.setInt (1, id);
	    preparedStmt.setString (2, name);
	    preparedStmt.setInt (3, skill);
	    preparedStmt.setString (4, city);
	    
	    preparedStmt.execute();
	    conn.close();
		}
		catch(Exception e) {System.out.println(e);}
	}
	
	public int setNextId() {

		MySQLConnection db = new MySQLConnection();
		conn = db.RetrieveConnection();
		
		try {
		java.sql.Statement stmt = conn.createStatement();
		String query = "select max(id) from player";
		
		ResultSet rs = stmt.executeQuery(query);
		if (rs.next()) {
		    id = rs.getInt(1);
		    id++;
		}
	    conn.close();
		}
		catch(Exception e) {System.out.println(e);}
		
		return id;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSkill() {
		return skill;
	}

	public String getCity() {
		return city;
	}
	}
	
	

