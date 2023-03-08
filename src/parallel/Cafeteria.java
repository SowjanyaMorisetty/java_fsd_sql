/**
 * 
 */
package parallel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Cafeteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	   
	  
		List<Customer> f=Arrays.asList();
		
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter customer id");
	  f.add(new Customer("Veg Meals",80.0,1,123,"ho"));
	  f.add(new Customer("Fish Curry",120.0,2,123,"ho"));
	  f.add(new Customer("Chapathi Veg Curry",40.0,3,125,"hloo"));
	  f.add(new Customer("Chapathi Chicken",120.0,5,123,"ho"));
	  f.add(new Customer("Veg Fried Rice ",60.0,6,123,"ho"));
	  f.add(new Customer("Chicken Fried Rice",120.0,7,123,"ho"));
	  
	  
	  //update
	  FoodDetails FishCurry=f.stream().filter(p->p.getFood().equals("FishCurry")).findFirst().orElse(null);
	  
	  
	 
	  
	  
	  
			  
			   
	   
		f.forEach(s->System.out.println(s.getfId()+""+s.getFood()+" "+s.getuId()+" "+s.getName()+""+s.getPrice()));
	  
		
		
		
		
		

	}

}
