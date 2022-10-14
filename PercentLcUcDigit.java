package interviewprgrms;

public class PercentLcUcDigit {

	public static void main(String[] args) {
		
		//Character.isUpperCase(ch) –> This method checks whether ‘ch’ is in uppercase or not
		//Character.isLowerCase(ch) –> This method checks whether ‘ch’ is in lowercase or not
		//Character.isDigit(ch) –> This method checks whether ‘ch’ is a digit or not
		
		//String str= "Tiger Runs @ The Speed Of 100 km/hour";
		
		String str = "Vino Thini 123$";
		int digitcount=0;
		int upperCaseCount =0;
		int lowerCaseCount =0;
		int letter = 0;
		int whitespace =0;
		int others=0;
		for(int i=0;i<str.length();i++)
		{
			char value = str.charAt(i);
			
			if(Character.isDigit(value))
			{
				digitcount++;
			}
			else if(Character.isUpperCase(value))
			{
				upperCaseCount++;
			}
			else if(Character.isLowerCase(value))
			{
				lowerCaseCount++;
			}
			else if(Character.isLetter(value))
			{
				letter++;
			}
			else if(Character.isWhitespace(value))
			{
				whitespace++;
			}
			else
			{
				others++;
			}
		}
      System.out.println(digitcount);
      System.out.println(upperCaseCount);
      System.out.println(lowerCaseCount);
      System.out.println(letter);
      System.out.println(whitespace);
      System.out.println(others);
	}

} 
/*

if(!Character.isDigit(s.charAt(i))
        && !Character.isLetter(s.charAt(i))
        && !Character.isWhitespace(s.charAt(i))) {
	count++;
}
}

// When there is no special character encountered
if (count == 0)

System.out.println("No Special Characters found");
else

// Special character/s found then
System.out.println(
    "String has Special Characters\n" + count + " "
    + "Special Characters found.");
}
}
*/

