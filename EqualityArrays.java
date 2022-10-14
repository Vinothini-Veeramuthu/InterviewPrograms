package interviewprgrms;

import java.util.Arrays;

public class EqualityArrays {

	public static void main(String[] args) {
		
		int[] a= {5,7,8,4};
		int[] b= {5,7,8,4};
		
       boolean result= Arrays.equals(a, b);
       if(result==true)
       {
    	   System.out.println("Arrays are equal");
       }
       else
       {
    	   System.out.println("Arrays are not equal");
       }

	}

}
