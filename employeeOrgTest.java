/**
 * 
 */
package employeetest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import employee.employeeOrg;

/**
 * @author Administrator
 *
 */
public class employeeOrgTest {
	@Test
	
	public void Coins1()
	{
		int input=56;
		int expected=5;
		int actual=employeeOrg.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins2()
	{
		int input=167;
		int expected=3;
		int actual=employeeOrg.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins3()
	{
		int input=205;
		int expected=1;
		int actual=employeeOrg.gettingCoins(input);
		assertEquals(expected,actual);
	}
	@Test
	public void Coins4()
	{
		int input=280;
		int expected=0;
		int actual=employeeOrg.gettingCoins(input);
		assertEquals(expected,actual);
	}

}
