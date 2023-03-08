package collections;


import java.util.*;

public class ArraysCommon {
	public static void main(String[] args) {
		
		HashSet<Integer> s1=new HashSet<>();
		HashSet<Integer> s2=new HashSet<>();
		
		s1.add(10);
		s1.add(11);
		s1.add(15);
		s1.add(18);
		
		s2.add(11);
		s2.add(1);
		s2.add(9);
		s2.add(6);
		
		if(s1.contains(s2))
		{
			System.out.println(s1+" , "+s2);
		}
		else
		{
			System.out.println("no common elements");
		}	

	}

}
