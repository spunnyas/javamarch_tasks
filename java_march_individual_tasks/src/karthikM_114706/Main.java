package karthikM_114706;

import java.util.HashSet;
import java.util.Scanner;

public class Main{

  public static void main(String[] args) {
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++) {
	  a[i]=sc.nextInt();
  }
   System.out.println(UserMainCode.addEvenOdd(a));
 
 }
  
}
class UserMainCode{
	public static int addEvenOdd(int[] a) {
		int end=a.length;
		HashSet<Integer> set=new HashSet<Integer>(end);
		for(int i=0;i<end;i++)
			set.add(a[i]);
		int arr[]=set.stream().mapToInt(Number::intValue).toArray();
		int n1 = 0, n2 = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] % 2 == 0)
				n1 += (a[i] * a[i]);
			else
				n2 += (a[i] * a[i] * a[i]);
		return n1 + n2;
 }

}



