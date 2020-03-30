


package vineethaI_114368
import java.util.Arrays;
import java.util.Scanner;
class Maincode
{
static int getBigDiff(int n1[]){
int t=0,diff=0;
// Arrays.sort(n1);
// diff=n1[n1.length-1]-n1[0];
   for(int i=0;i<n1.length;i++) {
   for(int j=i+1;j<n1.length;j++) {
   if(n1[i]>n1[j]) {
   t=n1[i];
   n1[i]=n1[j];
   n1[j]=t;
    }
   }
   }
   diff=n1[n1.length-1]-n1[0];
return diff;
}
}

public class Main {

public static void main(String[] args) {
int n,res=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int[] n1=new int[n];
for(int i=0;i<n;i++) {
n1[i]=s.nextInt();
}
res=Maincode.getBigDiff(n1);
System.out.println(res);
}

}
