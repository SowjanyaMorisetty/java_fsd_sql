/**
 * 
 */
package collections3;

import java.util.HashMap;

/**
 * @author Administrator
 *
 */
public class Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashMap<Integer,HashMap2> s=new HashMap<>();
		
		HashMap2 emp1=new HashMap2(21,"sowjanya",245132,"talent pool");
		HashMap2 emp2=new HashMap2(22,"yashwanth",245098,"talent pool");
		HashMap2 emp3=new HashMap2(23,"meghana",245111,"talent pool");
		
		s.put(1,emp1 );
		s.put(1,emp2 );
		s.put(1,emp3 );
		
		int p=s.hashCode();
		System.out.println(p);

	}

}
