/**
 * 
 */
package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Target25 {

	public static void main(String[] args) {
	

		ArrayList<Integer> a=new ArrayList<Integer>();
		
		
		
		a.add(10);
		a.add(15);
		a.add(0);
		a.add(14);
		a.add(10);
		a.add(2);
		a.add(3);
		a.add(7);
		a.add(6);
		System.out.println(a);
		boolean flag=false;
		

		for(Integer i:a )
		{
			for(Integer j:a)
			{
			if((i+j)==25&&flag==false)
			{
				System.out.println(i+", "+j);
				flag=true;
				break;
				
			}
			
		}

	}
}
}



