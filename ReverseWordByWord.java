package interviewprgrms;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String str = "The Lord is my savior";
		String outputstr="";
		String[] words = str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
				
			outputstr=outputstr+words[i]+ " ";
			
		}
		System.out.print(outputstr);
		
}
}
