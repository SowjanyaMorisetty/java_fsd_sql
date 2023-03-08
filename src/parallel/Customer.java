/**
 * 
 */
package parallel;

/**
 * @author Administrator
 *
 */
public class Customer extends FoodDetails {

	
	

	
	private  int uId;
	
	private String name;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Customer(String food, Double price, int fId, int uId, String name) {
		super(food, price, fId);
		this.uId = uId;
		this.name = name;
	}

	
	
	
	
}
