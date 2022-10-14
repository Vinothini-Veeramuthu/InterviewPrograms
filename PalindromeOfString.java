package interviewprgrms;

public class PalindromeOfString {

	public static void main(String[] args) {
		String str ="madam";
        StringBuilder strbldr = new StringBuilder();
        strbldr.append(str);
        StringBuilder reverse = strbldr.reverse();
        String revstr = reverse.toString();
         
        if (str.equals(revstr))
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("Is not a palindrome");
        }
         
	}
}

