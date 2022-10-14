package interviewprgrms;

public class RemoveVowels {

	public static void main(String[] args) {
		String str = "Blessed";
		String withoutvowel = "";
		withoutvowel = str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(withoutvowel);

	}

}
