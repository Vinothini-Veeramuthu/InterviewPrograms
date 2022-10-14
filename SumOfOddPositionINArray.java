package interviewprgrms;

public class SumOfOddPositionINArray {

	public static void main(String[] args) {
		// input=[5,6,1,2,4,3,7]
		//output=11
		
		int[] arr = {5,6,1,2,4,5,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				sum = sum+ arr[i];
			}
		}
		System.out.println(sum);
	}

}
