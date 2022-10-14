package interviewprgrms;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n =10;
		int firstTerm=0;
		System.out.println(firstTerm);
		int secondTerm=1;
		System.out.println(secondTerm);
		for(int i=1; i<=10; i++)
		{
		
		int nextTerm = firstTerm+secondTerm;
		System.out.println(nextTerm);
		firstTerm=secondTerm;
		secondTerm=nextTerm;
	}
	}
}
