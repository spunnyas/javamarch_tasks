package syabdulr_115588_task1;
import java.util.Scanner;

public class task1 {
	 public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    String s = sc.nextLine();

		    if( s.length()%2 == 0){
		    
		    String s1 = getMiddleChars(s);
		    System.out.println(s1);
		}else{
		    System.out.println(" String should be Even");
		}
		}

		    public static String getMiddleChars(String str)
		    {
		                StringBuffer sb=new StringBuffer();
		                 sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
		                 String s2 = sb.toString();
		                 return s2;
		                 
		     }

}
