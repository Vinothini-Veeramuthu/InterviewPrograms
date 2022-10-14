package interviewprgrms;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedAndNonRepeatedChar {

	public static void main(String[] args) {
		
	   String inputString = "Java is Jenkins";
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        
        //Converting inputString to char array
         
        char[] strArray = inputString.toCharArray();
         
        //Checking each char of strArray
         
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                 
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //adding this char in charCountMap with 1 as it's value
                 
                charCountMap.put(c, 1);
            }
        }
         
        //checking for first non-repeated character
         
        for (char c : strArray)
        {
            if (charCountMap.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                 
                break;
            }
        }
         
        //checking for first repeated character
         
        for (char c : strArray)
        {
            if (charCountMap.get(c) > 1)
            {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");
                 
                break;
            }

	}
	}
	
}
