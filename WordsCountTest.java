/**
 * 
 */
package count;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class WordsCountTest {

	@Test
	public void CountingWords()
	{
		
		ArrayList<String> s=new ArrayList<String>(Arrays.asList("hi","hello","hi","why","hi"));
		 
		 String input2="hi";
		 int expected=3;
		 int actual=WordsCount.countWords(s, input2);
		 assertEquals(expected,actual);
	
}
}
