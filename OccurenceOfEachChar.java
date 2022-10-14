package interviewprgrms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfEachChar {

	public static void main(String[] args) {
		
		String str ="amazzon apple";
		char[] charArray = str.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<charArray.length;i++)
		{
			
			map.put(charArray[i], map.getOrDefault(charArray[i],0)+1);
			
		}
		System.out.println(map);	

	}

}
