package roshambo_;

public abstract class Player {
 
	private String Name;
	private String roshamboValue;
	
	public String getName() {
		return Name;
	}
	public String getRoshamboValue() {
		return roshamboValue;
	}
	public void setRoshamboValue(String roshamboValue) {
		this.roshamboValue = roshamboValue;
	}
	public void setName(String name) {
		Name = name;
	}
		
	//generate method
	public abstract String generateRoshambo();
	

	public Player(String name, String roshamboValue) {
		//constructor
		setName(name);
		setRoshamboValue(roshamboValue);
		
	}
	
}
//must generate constructor of name
