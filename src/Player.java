import java.util.Scanner;

public class Player {
	
	int id =0;
	String name;
	int skill;
	String city;
	
//	public void setPlayerInfo(int id, String name, int skill, String city){
//		//Scanner scanner = new Scanner(System.in);
//		this.id=id;	
//		//System.out.println("Enter your name: ");
//		//this.name = scanner.next();
//		this.name = name;
//		this.skill = skill;	
//		this.city = city;			
//	}
	
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

		
		System.out.println("User:  "+name);
		System.out.println("City:  "+city);
		System.out.println("Skill:  "+skill);
		System.out.println("Id: "+id);
		id++;
		
	}
	
	
	}
	
	

