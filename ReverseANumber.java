package interviewprgrms;

public class ReverseANumber {

	public static void main(String[] args) {
		
		// input=987
		//output=789
		/* steps:
		1.Take last digit out -->n=n%10-->987%10=7(store it in lastdigit)
		2.store it in a variable "reverse"  reverse=lastdigit (Use the logic, reverse=reverse*10+lastdigit) to shift the position  
		3.eliminate last digit --> n=n/10--> 978/10=98	
		*/
		
		int n=987;
		int reverse=0;
		int lastdigit=0;
		while(n>0)
		{
		lastdigit= n%10;
		reverse= reverse*10+lastdigit;
		n=n/10;
	    }
		System.out.println(reverse);
}
}
