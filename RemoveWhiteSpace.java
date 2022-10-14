package interviewprgrms;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String str = "Attempt great things  to  God";
		String str2 = str.replaceAll("\\s","");
		System.out.println(str2);

	}

}
