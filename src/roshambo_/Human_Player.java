package roshambo_;
import java.util.Scanner;
// to use constructor generate fields
public class Human_Player extends Player {
	
	
 
	//need constructor from superclass
	//go to source select superclass
	

	@Override
	public String generateRoshambo() {
		
		 //set whatever the player choose and assigning the roshambo value
		
		Scanner scanPlayer = new Scanner(System.in);
		String userInput =scanPlayer.nextLine();
	 
		if(userInput.equalsIgnoreCase("r")){
		 setRoshamboValue("Rock");
		 
		}
		 else if(userInput.equalsIgnoreCase("p")){
			 setRoshamboValue("Paper");
		 }
		 else if(userInput.equalsIgnoreCase("s"));
		setRoshamboValue("Scissors");			
		}
	return getRoshamboValue();
 	
}

	public Human_Player(String name, String roshamboValue) {
		super(name, roshamboValue);
		// TODO Auto-generated constructor stub
	}
	}

