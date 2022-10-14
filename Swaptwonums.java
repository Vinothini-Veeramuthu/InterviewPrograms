package interviewprgrms;

public class Swaptwonums {

	public static void main(String[] args) {
		
		//Without using 3rd variable
		int x=7;
		int y=5;
		
		System.out.println("Before swap x is:" + x);
		System.out.println("Before swap y is:" + y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swap x is:" + x);
		System.out.println("After swap y is:" + y); 
		
		//USing 3rd variable
		
		float a = 2.3f;
		float b= 4.6f;
		
		System.out.println("Befor swap a is:" + a);
		System.out.println("Before swap b is:" + b);
		
		float temp;
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swap a is:" + a);
		System.out.println("After swap b is:" + b);
		
		
		
	

	}

}
