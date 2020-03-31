package vineelaV_114591;
package vineelaV_114591;

import java.util.Scanner;
class Maincode
{
static int validateNumber(String s)
{
int flag=0;
if(s.matches("\\d{3}[-]\\d{3}[-]\\d{4}")) {
flag = 1;
}
else {
flag=-1;
}
return flag;
}

}
public class Main {

public static void main(String[] args) {
String str;int res;
Scanner s=new Scanner(System.in);
str=s.nextLine();
res=Maincode.validateNumber(str);
if(res==1) {
System.out.println("Valid Number Format");
}else {
System.out.println("Invalid Number Format");
   }
}
}