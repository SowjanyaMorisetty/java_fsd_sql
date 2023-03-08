/**"
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class SearchingHotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Budjet> b=new ArrayList<Budjet>();
		b.add(new Budjet("A",20000,"123"));
		b.add(new Budjet("B",10000,"124"));
		b.add(new Budjet("C",70000,"125"));
		b.add(new Budjet("D",50000,"126"));
		
		List<Budjet> l=b.stream().filter(s->(s.budjet>10000)&&(s.budjet<80000)).collect(Collectors.toList());
		System.out.println(l);
				
		Scanner sc=new Scanner(System.in);
		Double userbudget=sc.nextDouble();
		
		List<Budjet> l1=l.stream().filter(id->id.equals(userbudget)).collect(Collectors.toList());
		
		System.out.println(l1);
	
		
		
		
		
		
		
		

	}

}
