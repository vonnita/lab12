package roshambo_;

import java.util.Random;

public class Random_Player extends Player {

	@Override
	public String generateRoshambo() {
		//creating the random
		
		int random = (int )(Math. random() * 3 + 1);
	    
		if (random==1 ){
			
		 setRoshamboValue("rock");
		}
		else if (random ==2){
			 setRoshamboValue("paper");		 			
		}
		else if (random ==3){
			setRoshamboValue("Scissors");
					
		}
		
				
			//method
			return getRoshamboValue();
		}
// generate source from superclass
	public Random_Player(String name, String roshamboValue) {
		super(name, roshamboValue);
		// TODO Auto-generated constructor stub
	}
	


}