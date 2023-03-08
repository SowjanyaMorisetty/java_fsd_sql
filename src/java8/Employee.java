/**
 * 
 */
package java8;

import java.util.Comparator;

/**
 * @author Administrator
 *
 */
public class Employee implements Comparator{
	protected int id;
	protected String name;
	protected double salary;
	
	
	
	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
