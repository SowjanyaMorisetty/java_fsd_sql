/**
 * 
 */
package UST_BATCHNO3.JUNIT5_TESTCASES;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Administrator
 *
 */

public class CountingVowelsTest  {
	@Test
	public void counting()
	{
	String input="sowjAnya";
	
	int expected=3;
	int actual=CountingVowels.vowelCount(input);
	assertEquals(expected,actual);

}
	
}
