package interviewprgrms;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		//Inuput=153-->1+125+27=153
		//Input=371-->27+343+1=371
		//Sum of cube of digits is number itself is called Amstrong Number.
		
		int n= 153;
		double temp;
		double Amstrong=0;
		int original=n;
		
		while(n>0)
		{
			temp=n%10;
			temp = Math.pow(temp, 3);
			Amstrong= Amstrong+temp;
			n=n/10;	
		}
		if(Amstrong==original)
		{
			System.out.println("Amstrong number");
		}
		else
		{
			System.out.println("Not an amstrong number");
		}

	}

}
