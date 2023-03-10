/**
 * 
 */
package employeetest;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import employee.Empgoldcoins;

/**
 * @author Administrator
 *
 */
public class empTest {
	
	

	
		@Test
		public void testofgoldcoins() {
			
			Empgoldcoins s= new Empgoldcoins();
			assertEquals("*****",s.findcoins(LocalDate.of(2023, 2, 14)));
			assertEquals("***",s.findcoins(LocalDate.of(2023, 4, 14)));
			
			
		}

	}


