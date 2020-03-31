package gnanasaiN_115236;


import java.text.ParseException;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class UserMainCode{

	static int getDateDifference() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first date:");
		String d1=sc.nextLine();
		System.out.println("Enter the second date:");
		String d2=sc.nextLine(); 
		Date date1= sdf.parse(d1);
		Date date2=sdf.parse(d2);
		long result=date1.getTime()-date2.getTime();
	    int diff= Math.round(result/(1000*60*60*24));;
	    System.out.println("The difference between the two date is: "+diff);
	    return diff;
	    
	}

}

public class Main {
	public static void main(String [] args) {
		try {
			UserMainCode.getDateDifference();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
