/**
 * 
 */
package Batch3.TESTNG;

/**
 * @author Administrator
 *
 */
public class Construction {
	
	private String city_name;
	private double price_With_Material;
	private double price_Without_Material;
	
	
	public Construction(String city_name, double price_With_Material, double price_Without_Material) {
		super();
		this.city_name = city_name;
		this.price_With_Material = price_With_Material;
		this.price_Without_Material = price_Without_Material;
	}
	
	
	public String getCity_name() {
		return city_name;
	}
	
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public double getPrice_With_Material() {
		return price_With_Material;
	}
	public void setPrice_With_Material(double price_With_Material) {
		this.price_With_Material = price_With_Material;
	}
	public double getPrice_Without_Material() {
		return price_Without_Material;
	}
	public void setPrice_Without_Material(double price_Without_Material) {
		this.price_Without_Material = price_Without_Material;
	}
	
	
	

}
