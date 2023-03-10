/**
 * 
 */
package employee;

import java.time.LocalDate;

/**
 * @author Administrator
 *
 */
public class Empgoldcoins {

	/**
	 * @param args
	 */
	
	public String  findcoins(LocalDate date) {
		int dayOfYear=date.getDayOfYear();
		
		if (dayOfYear<80||dayOfYear>365) {
			return "*****";
		}else if (dayOfYear<172) {
			return "***";
		}
		
		return null;
	}

}
