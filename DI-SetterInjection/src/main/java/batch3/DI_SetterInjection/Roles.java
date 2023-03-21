package batch3.DI_SetterInjection;

public class Roles {
	
	public String characterName;
	public String responsibility;
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
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
