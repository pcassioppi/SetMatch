import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you a new user? (y/n)");
		String tf = scanner.next().toLowerCase();
		
		
		//have the program ask for the users username if they are not a new user, and find that username in the db
		//then, ask for the password and check if that matches the value in the db
		//if neither work, throw an error message using try/catch
		Player input = new Player();
		
		if(tf.equals("y")) {			
			input.playerInfo();
		}
		
		DateTime input2 = new DateTime();
		
		System.out.println("Would you like to set your available times? (y/n)");
		String ans = scanner.next().toLowerCase();
		if(ans.equals("y")) {
			input2.setTime();
			System.out.println("The start time is "+input2.getEndTime());
			System.out.println("The end time is "+input2.getEndTime());
		}		
		else {
			System.out.println("Fin.");
		}
		
		MySQLConnection input3 = new MySQLConnection();
		
		input3.petInfo();
				
		scanner.close();		
		}
		
	

}
