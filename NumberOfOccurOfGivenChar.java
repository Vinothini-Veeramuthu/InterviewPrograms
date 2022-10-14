package interviewprgrms;

public class NumberOfOccurOfGivenChar {

	public static void main(String[] args) {
		 String s = "Java is java again java again";
		 
	        char c = 'a';
	 
	        int orilen = s.length();
	        int replacelen = s.replace("a", "").length();
	        int count= orilen-replacelen;
	 
	        System.out.println("Number of occurances of 'a' in "+s+" = "+count);

	}

}
