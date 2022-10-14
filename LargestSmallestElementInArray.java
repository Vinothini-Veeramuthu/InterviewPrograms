package interviewprgrms;

import java.util.Arrays;

public class LargestSmallestElementInArray {

	public static void main(String[] args) 
	{
		int[] arr1 = {10,30,50,20};
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			int smallest = arr1[0];
			int largest = arr1[arr1.length-1];
			System.out.println(largest);
			System.out.println(smallest);
			break;
		}
	}

}

