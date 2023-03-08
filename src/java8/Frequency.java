/**
 * 
 */
package java8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Administrator
 *
 */
public class Frequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s= Arrays.asList("hydra","ji","lk");
		Map<String,Long> names=s.stream().map(t->t.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(names);
				
	}

}
