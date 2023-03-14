package Batch3.TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class EmployeeTest{
	
	@Test
	public void  testforemployee() {
		
		Employee e= new Employee("sharath",30,"java");
		
		Assert.assertEquals(e.getName(), "sharath");
		Assert.assertEquals(e.getAge(), 30);
		
		
	}
    
}
