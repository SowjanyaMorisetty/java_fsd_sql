package collections3;

import java.util.Objects;

public class HashMap2 {
	
	private int age;
	private String name;
	private int id;
	private String depart;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, depart, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMap2 other = (HashMap2) obj;
		return age == other.age && Objects.equals(depart, other.depart) && id == other.id
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "HashMap2 [age=" + age + ", name=" + name + ", id=" + id + ", depart=" + depart + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	
	
	
	public HashMap2(int age, String name, int id, String depart) {
		
		this.age = age;
		this.name = name;
		this.id = id;
		this.depart = depart;
	}

}
