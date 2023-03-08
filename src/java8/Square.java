/**
 * 
 */
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class Square {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("hyderabad","haryana","kerala");
	
		List<String> s1= s.stream().filter(t->t.toLowerCase().startsWith("h")).collect(Collectors.toList());
		System.out.println(s1);

	}

}
