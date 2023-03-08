/**
 * 
 */
package java8;

/**
 * @author Administrator
 *
 */
public class Customer {
	protected int regId;
	protected String name;
	protected String mobnum;
	protected String emailId;
	protected String location;
	
	
	public Customer(int regId, String name, String mobnum, String emailId, String location) {
		super();
		this.regId = regId;
		this.name = name;
		this.mobnum = mobnum;
		this.emailId = emailId;
		this.location = location;
	}
	

}
