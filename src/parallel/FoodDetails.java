/**
 * 
 */
package parallel;

/**
 * @author Administrator
 *
 */
public class FoodDetails {
	
	private String food;
	private Double price;
	private int fId;
	
	
	public FoodDetails(String food, Double price, int fId) {
		super();
		this.food = food;
		this.price = price;
		this.fId = fId;
	}
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	
	
	
	

}
