/**
 * 
 */
package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Details {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Employee> p=new ArrayList<Employee>();
		
		p.add(new Employee(123,"sowjanya",190000));
		p.add(new Employee(124,"A",200000));
		p.add(new Employee(125,"B",500000));
		p.add(new Employee(126,"C",400000));
		
		List<Double> s=  p.stream().map(t->t.getSalary()).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(s);
		
		double d;
        List<Double> s1=s.stream().
				
			peek(e->
			
		{
			if(e>50000)
			{
		    System.out.println((e*0.10)+e);
				
			}
			else if(e>100000)
			{
				System.out.println((e*0.5)+e);
			}
		}
		).collect(Collectors.toList());
		
				
	    for(Employee h:p)
	    {
	    	System.out.println(h.getName()+" : "+h.salary);
	    }
	   }
		

	}

	






