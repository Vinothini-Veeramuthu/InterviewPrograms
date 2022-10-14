package interviewprgrms;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
	String str =" java is java is language for tan and tan";
		String[] split = str.split(" ");
		Set<String> set = new HashSet<String>();
		Set<String> uniqueset = new HashSet<String>();
		for(int i=0;i<split.length;i++)
		{
			boolean add = set.add(split[i]);
			if(!add)
			{
				uniqueset.add(split[i]);
			}
		}
		
      System.out.println(uniqueset); 
	}
}  
		

	

		
