/**
 * 
 */
package serialize;

import java.io.Serializable;


/**
 * @author Administrator
 *
 */
public class SerializableDemo implements Serializable {
	
	private String name;
	private int age;
	private String address;
	private String designation;
	
	
	public SerializableDemo(String name, int age, String address, String designation) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.designation = designation;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
	

	
}
