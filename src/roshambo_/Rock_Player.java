package roshambo_;
//generating rock
//Rock player is extending Player
public class Rock_Player extends Player {
	public Rock_Player(String name, String roshamboValue){
		super(name, roshamboValue);
                
	}

	//now must override
	
	
	@Override
	public String generateRoshambo( ){
		
		//when play selects rock it will generate rock, & return rock
		
		
		return getRoshamboValue();
			
	}
}


