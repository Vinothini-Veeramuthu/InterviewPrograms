package interviewprgrms;

public class PalindromeNumber {

	public static void main(String[] args) {
		// A number that remains the same when its digits are reversed is called palindrome number
		
		int n=987;
		int original=n;
		int reverse=0;
		int lastdigit=0;
		while(n>0)
		{
		lastdigit= n%10;
		reverse= reverse*10+lastdigit;
		n=n/10;
	    }
		System.out.println(reverse);
		
		
		if(reverse==original)
		{
			System.out.println("palindrome number");
		}
		else
		{
			System.out.println("Not a palindrome number");
		}
}
	

	}


