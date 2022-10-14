
package interviewprgrms;

import java.util.Arrays;

public class AnagramOfString {

	public static void main(String[] args) {
		String str1 = "race";
		String str2 = "care";
		
		str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        boolean result = Arrays.equals(charArray1, charArray2);
        
        if(result)
        {
        	System.out.println("Both are anagram");
        }
        else
        {
        	System.out.println("Not anagram");
        }
	}

}

