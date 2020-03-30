package SateeshK_115237;
import java.util.*;

public class Main {
	

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		String s1= sc.nextLine();
		sc.close();
		UserMainCode.sumOfDigits(s1);
		// TODO Auto-generated method stub

	}	
		
}

class UserMainCode {
	
	public static void sumOfDigits(String s1) {
		int sum =0;
		for (int i = 0; i<s1.length(); i++) {
			char a= s1.charAt(i);
			if(Character.isDigit(a)) {
				int b = Integer.parseInt(String.valueOf(a));
				sum = sum+b;
			}
		}
		if(sum==0) {
			System.out.println(-1);
			
		}else
			System.out.println(sum);
		
	}
}
