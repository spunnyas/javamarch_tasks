package shaliniP_115515;

import java.util.Scanner;

public class UserMainCode {
	 public static int countSequentialChars(String str1)
	{
		int c=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)==str1.charAt(i+1))
			{
				if(str1.charAt(i+1)==str1.charAt(i+2))
				{
					++c;
					i=i+2;
				}
			}
		}
		return c;
		
	}
	
	public static void main (String args[])
	{
		String s1;
		Scanner in=new Scanner(System.in);
		s1=in.nextLine();
		int ans= UserMainCode.countSequentialChars(s1);
		
		System.out.println(ans);
	}

}

