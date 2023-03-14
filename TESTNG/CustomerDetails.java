package Batch3.TESTNG;

public class CustomerDetails extends Construction {

	
	private String cust_Name;
	private String phone_No;
	private int squareFeet;
	
	public CustomerDetails(String city_name, double price_With_Material, double price_Without_Material,
			String cust_Name, String phone_No, int squareFeet) {
		super(city_name, price_With_Material, price_Without_Material);
		this.cust_Name = cust_Name;
		this.phone_No = phone_No;
		this.squareFeet = squareFeet;
	}
	
	
	
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	
	
	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}



	
	public int getSquareFeet() {
		return squareFeet;
	}
	public void setSquareFeet(int squareFeet) {
		this.squareFeet = squareFeet;
	}



	@Override
	public String toString() {
		return "CustomerDetails [cust_Name=" + cust_Name + ", phone_No=" + phone_No + ", squareFeet=" + squareFeet
				+ "]";
	}
	
	
	
	
}
