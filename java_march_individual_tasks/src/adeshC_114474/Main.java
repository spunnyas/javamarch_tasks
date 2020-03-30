package adeshC_114474;
import java.util.*;
class UserMainCode{
	public static ArrayList<Integer> sortMergedArrayList(int[] arr1, int[] arr2)
	{
		ArrayList<Integer> ar  = new ArrayList<Integer>();//To store the output 
		ArrayList<Integer> arr = new ArrayList<Integer>(); //For merging the both arrays.
		ArrayList<Integer> arrr = new ArrayList<Integer>();//For adding the sorted array.
		Set<Integer> set = new TreeSet<Integer>();// For sorting the merged array
		//Merging the first array into arr.
			for(int array1:arr1)
			{
				arr.add(array1);
			}
		//Merging the second array into arr.
			for(int array2:arr2)
			{
				arr.add(array2);
			}
		//Sorting the Merged array.
			for(int array: arr)
			{
				set.add(array);
			}
		//Adding the sorted array. 
			for(int arrrr:set)
			{
				arrr.add(arrrr);
			}
		// To store the 2nd, 6th and 8th element.
			for(int i=0;i<arrr.size();i++)
			{
				if(i == 2 || i == 6 || i == 8)
				{
					ar.add(arrr.get(i));
				}
			}
		return ar;
	}
}
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fst_arr[] = new int[5];
		int sec_arr[] = new int[5];
		System.out.println("Enter the first array");
		for(int i=0;i<fst_arr.length;i++)
		{
			fst_arr[i] = sc.nextInt();
		}
		System.out.println("Enter the Second array");
		for(int i=0;i<sec_arr.length;i++)
		{
			sec_arr[i] = sc.nextInt();
		}
	   ArrayList<Integer> arr = UserMainCode.sortMergedArrayList(fst_arr, sec_arr);
		for(int array:arr) 
		{
			System.out.println(array +" ");
		}

	}

}
