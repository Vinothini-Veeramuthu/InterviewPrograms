
package interviewprgrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

public class SecodLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			set.add(data[i]);			
		}
		System.out.println(set);
		Object[] value=set.toArray();
	    System.out.println(value[value.length-2]);	
	}

}
