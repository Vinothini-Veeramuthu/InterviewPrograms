package interviewprgrms;

public class ReverseAString {

	public static void main(String[] args) {
		String str = "Lord is my adonai";
		char[] charArray = str.toCharArray();
		
		/*Using in-built funtion
		StringBuilder strbld = new StringBuilder();
		strbld.append(str);
		System.out.println(strbld.reverse()); */
		
		/*Without in-built function
		for(int i =charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		} */

	}

}
