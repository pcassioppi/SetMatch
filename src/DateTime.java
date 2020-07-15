import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTime {

	Date starttime;
	Date endtime;
	
	public void setTime() {
		Scanner scanner = new Scanner(System.in);
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
			String start = date+scanner.next();
			
			Date startdatetime = null;
			
			try {
				startdatetime = datetimeFormat.parse(start);
			}
			catch (ParseException e) {		
				System.out.println("Incorrect time format");
				j = false;
			}
			
			this.setStartTime(startdatetime);
			
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
				this.setEndTime(enddatetime);
			}
		
	
//		System.out.println("The start time is "+this.starttime);
//		System.out.println("The end time is "+this.endtime);
		}
	}
	
	public Date getStartTime() {
		return starttime;		
	}
	
	public void setStartTime(Date starttime) {
		this.starttime = starttime;
	}
	
	public Date getEndTime() {
		return starttime;		
	}
	
	public void setEndTime(Date endtime) {
		this.endtime = endtime;
	}
}
