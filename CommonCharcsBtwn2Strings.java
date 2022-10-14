package interviewprgrms;

import java.util.Set;
import java.util.TreeSet;

public class CommonCharcsBtwn2Strings {

	public static void main(String[] args) {
		
		//Steps to remember:
		//Don’t count white spaces.
		//Must be case sensitive i.e treat 'A' and 'a' as two different characters.
		//Ignore multiple occurrences of same character in the same string.
		
		// Hint: TreeSet is a data structure which doesn’t allow duplicates and also maintains the order.
		
		
	//	Step 1 : Let firstString and secondString be two input strings.
		
		String str1 = "thin sticks";
		String str2 = "thick bricks";
		
	//	Step 2 : Remove white spaces from input strings and convert them to char array.
		
		char[] charArray1 = str1.replaceAll("\\s+", "").toCharArray();
		char[] charArray2 = str2.replaceAll("\\s+", "").toCharArray();
		
	//	Step 3 : Construct two TreeSet objects firstStringSet and secondStringSet.
		
		Set<Character> set1 = new TreeSet<Character>(); 
		Set<Character> set2 = new TreeSet<Character>();
		
	//	Step 4 : Add all chars of firstStringToCharArray to firstStringSet.
		for(int i=0;i<charArray1.length;i++)
		{
			set1.add(charArray1[i]);
		}
		for(int i=0; i<charArray2.length;i++)
		{
			set2.add(charArray2[i]);
		}
	//	Step 6 : Get common elements of these two sets using retainAll() method.
		
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
