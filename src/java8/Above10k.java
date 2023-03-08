/**
 * 
 */
package java8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Above10k {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method 
		List<Product> p=new ArrayList<Product>();
	    
		p.add(new Product("pen",123,190000));
		p.add(new Product("chocolate",783,300000));
		p.add(new Product("laptop",763,9000));
		
		
		List<Double> s=p.stream().filter(t->t.pPrice>10000).map(t->t.pPrice).collect(Collectors.toList());
		System.out.println("the products above 10000 price are : "+s);
		
		
     	
     	
		
	    
	    		
		
		
		
	
		
		
		
	}

}
