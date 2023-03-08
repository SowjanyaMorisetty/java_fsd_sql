package temppack;

import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
public class ArrayCommon {

	

	public static void main(String[] args) {
		
				Integer arr1[]= {1,2,3,4,5};
				Integer arr2[]= {1,4,7,8,9};
				
				

		
		HashSet<Integer> s1=new HashSet<Integer>();
		HashSet<Integer> s2=new HashSet<Integer>();
		s1.addAll(Arrays.asList(arr1));
		s2.addAll(Arrays.asList(arr2));
		
		
		if(s1.retainAll(s2))
		{
			System.out.println(s1);
		}
		

	}

}
