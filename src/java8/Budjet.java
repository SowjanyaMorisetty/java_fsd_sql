/**
 * 
 */
package java8;

/**
 * @author Administrator
 *
 */
public class Budjet {

	
	
	protected String hotelName;
	
	protected double budjet;
	protected String hotelId;
	public Budjet(String hotelName, double budjet, String hotelId) {
		super();
		this.hotelName = hotelName;
		this.budjet = budjet;
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "Budjet [budjet=" + budjet + "]";
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public double getBudjet() {
		return budjet;
	}
	public void setBudjet(double budjet) {
		this.budjet = budjet;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	
}
	
	
	
	
	
