package interviewprgrms;

public class Primenumber {

	public static void main(String[] args) {
		
		int n=13;
		boolean prime = true;
		for(int i=2; i<13; i++)
		{
			if(n%i==0)
			{
				prime = false;
				break;
			}
		}
		System.out.println(prime);
		

	}

}

//A number which is divisible by 1 and by itself-->Prime number