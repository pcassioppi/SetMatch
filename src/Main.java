import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Print available times
		//first, ask the user if they are new or not, if they are, have them input their info
		//if not then move on to the next step, and ask "would you like to set your available times?"
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Are you a new user? (y/n)");
		String tf = scanner.next().toLowerCase();
		if(tf.equals('y')) {
			
		}
		
		
		DateTime input = new DateTime();		
		System.out.println("Enter a date (dd/mm/yyyy): ");
		String date = scanner.next();		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Boolean j = true;
		try {
		    dateFormat.parse(date);
		}
		catch (ParseException e) {
		    System.err.println("Invalid input");
		    j = false;
		}
				
		if(j) {
			SimpleDateFormat datetimeFormat = new SimpleDateFormat("dd/MM/yyyyh:mm");
			
			System.out.println("Enter a start time:");
			String starttime = date+scanner.next();
			
			Date startdatetime = null;
			
			try {
				startdatetime = datetimeFormat.parse(starttime);
			}
			catch (ParseException e) {		
				System.out.println("Incorrect time format");
				j = false;
			}
			
			input.setStartTime(startdatetime);
			
			if(j) {
				System.out.println("Enter an end time:");
				String endtime = date+scanner.next();
			
				
				Date enddatetime = null;
				
				try {
					enddatetime = datetimeFormat.parse(endtime);
				}
				catch (ParseException e) {		
					System.out.println("Incorrect time format");
					j=false;
				}
				input.setEndTime(enddatetime);
			}
		
		System.out.println("The start time is "+input.starttime);
		System.out.println("The end time is "+input.endtime);
		}
		
		else {
			System.out.println("Error");
		}
		
		scanner.close();		
		}
		
	

}
