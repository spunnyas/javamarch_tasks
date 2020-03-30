package hamsiniK_114353;
import java.util.*;
class UserMainCode
{
	String previous_reading,current_reading;
	double charge_per_unit;
	public static int calculateElectricityBill(String previous_reading,String current_reading,double charge_per_unit)
	{
		previous_reading=previous_reading;
		current_reading=current_reading;
		charge_per_unit=charge_per_unit;
		String substring1=previous_reading.substring(5,previous_reading.length());
		double p=Double.parseDouble(substring1);
		String substring2=current_reading.substring(5,current_reading.length());
		double c=Double.parseDouble(substring2);
		double units=c-p;
		double value=units*charge_per_unit;
		int r=(int)value;
		return r;
	 }
	private static String subString(int i, int j) {
		
		return null;
	}
	
}
public class Main
{

	public static void main(String[] args) 
	{
		String pre_reading,cur_reading;
		double charge_per_unit;
		Scanner scan=new Scanner(System.in);
		pre_reading=scan.nextLine();
		cur_reading=scan.nextLine();
		charge_per_unit=scan.nextInt();
		int result=UserMainCode.calculateElectricityBill(pre_reading,cur_reading,charge_per_unit);
		System.out.println(result);
	}

}