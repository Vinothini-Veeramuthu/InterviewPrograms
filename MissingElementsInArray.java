package interviewprgrms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementsInArray {

	public static void main(String[] args) {
		Integer[] arr= {1,2,3,5,7,6,8};
		List<Integer> lst = new ArrayList<Integer>(Arrays.asList(arr));
		Collections.sort(lst);
		System.out.println(lst);
		for(int i=0;i<lst.size()-1;i++)
		{
	        if(lst.get(i)!=i+1)
	        {
	        	System.out.println(i+1);
	        	break;
	        }
		}
		
		/*for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
		}
		System.out.println("Sum of elements :" +  sum1);
		for(int i=1;i<=8;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Sum of all elements :"  + sum2);
		System.out.println("The missing element is: " + (sum2-sum1));

	}*/

}
}
