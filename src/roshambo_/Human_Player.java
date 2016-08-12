package roshambo_;
// to use constructor generate fields
public class Human_Player extends Player {
	
	//need constructor from superclass
	//go to source select superclass
	

	@Override
	public String generateRoshambo() {
		
		 
		return getRoshamboValue();
	}

	public Human_Player(String name, String roshamboValue) {
		super(name, roshamboValue);
		// TODO Auto-generated constructor stub
	}

}
