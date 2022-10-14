package interviewprgrms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccuCharInString {

	/*public static void main(String[] args) {
		int maxCount=0;
		char maxChar =0;
		String str ="Java is apale";
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<charArray.length;i++)
        {
        	if(map.containsKey(charArray[i]))
        	{
        		map.put(charArray[i], map.get(charArray[i]+1));
        	}
        	else
        	{
        		map.put(charArray[i], 1);
        	}
        }
       System.out.println(map);
       Set<Entry<Character, Integer>> entrySet = map.entrySet();
       for(Entry<Character,Integer> entry :entrySet)
       {
    	   if(entry.getValue() > maxCount)
    	   {
    		maxCount = entry.getValue();
    		maxChar = entry.getKey();
    	   }
       }
       System.out.println(maxChar);
	}  */
	
	
	
	public static void printMaxOccurringChar(String inputString)
    {   
        Map<Character, Integer> charCountMap = new HashMap<Character,Integer>();
         
        char[] charArray = inputString.replaceAll("\\s+", "").toCharArray();
         
        for (char c : charArray) 
        {
            if (charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
         
        Set<Entry<Character, Integer>> entrySet = charCountMap.entrySet();
         
        int maxCount = 0;
         
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
         
        System.out.println("Input String : "+inputString);
         
        System.out.println("Maximum Occurring char and its count :");
         
        System.out.println(maxChar+" : "+maxCount);
    }
     
    public static void main(String[] args) 
    {
        printMaxOccurringChar("Java Concept Of The Day");
         
        //System.out.println("========================");
         
       // printMaxOccurringChar("Java J2ee Android Hibernate JSP");
         
        //System.out.println("========================");
         
        //printMaxOccurringChar("abbcccddddeeeeeffffff");
         
        //System.out.println("=========================");
         
        //printMaxOccurringChar("122333444455555666666");
    }
}
