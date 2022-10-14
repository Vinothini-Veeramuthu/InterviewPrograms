package interviewprgrms;

public class NumberOfWordsInString {

	public static void main(String[] args) {
		
		String str = "The Lord is my Sheperd";
		
		
		String[] split = str.split(" ");
		System.out.println(split.length);
		
		//Hint: If double space is given between strings give split("\\s+")
	}

}
