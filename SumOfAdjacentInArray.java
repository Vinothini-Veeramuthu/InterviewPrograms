package interviewprgrms;

public class SumOfAdjacentInArray {

	public static void main(String[] args) {
		
		int[] arr = {5,6,3,4,5,2,1};
		int sum=0;
		for(int i=0;i+1<arr.length;i++)
		{
			sum=arr[i]+arr[i+1];
			System.out.print(sum + " ");
		}

	}

}

/*
 static void pairwiseSum(int arr[], int n)
{
int sum = 0;
for (int i = 0; i + 1 < n; i++)
{
    // adding the alternate numbers
    sum = arr[i] + arr[i + 1];
    System.out.print(sum + " ");
}
}
public static void main(String[] args)
{
int arr[] = {4, 10, 15, 5, 6};
int n = arr.length;
pairwiseSum(arr, n);
} */