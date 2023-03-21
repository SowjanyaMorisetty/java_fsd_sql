package batch3.DI_ConstructorInjection;

public class Roles {
	
	public String characterName;
	public String responsibility;
	public Roles(String characterName, String responsibility) {
	
		this.characterName = characterName;
		this.responsibility = responsibility;
	}
	
	@Override
	public String toString() {
		return "Roles [characterName=" + characterName + ", responsibility=" + responsibility + "]";
	}
	
	public  void display()
	{
		System.out.println("my name is   "+characterName+"My responsibility is  "+responsibility);
	}

}
