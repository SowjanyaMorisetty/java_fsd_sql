/**
 * 
 */
package collections;

import java.util.ArrayList;
/**
 * @author Administrator
 *
 */
public class ArrayList1 {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("sowjanya");
		a.add("abc");
		a.add("def");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		a.add(0,"hello");
		System.out.println(a);
		
		boolean b=a.equals("abc");
		System.out.println(b);
		
		a.remove(0);
		a.remove(1);
		boolean c=a.isEmpty();
		System.out.println(c);
		
		
		
	}

	private static char[] size(ArrayList<String> a) {
		// TODO Auto-generated method stub
		return null;
	}

}

