package GameApp;

import java.util.Random;
import java.util.Scanner;

import roshambo_.*;

public class RoshamboApp {
//create random method
	public static String getRandomValue(){
		String randomValue = "";
		Random rand = new Random();
		int randomNum = rand.nextInt(3)+1;
		if(randomNum ==1)
			randomValue = "Rock";
		else if(randomNum ==2)
			randomValue ="Paper";
		else 
			randomValue="Siccors";
		return randomValue;
		
		
	}
	public static void main(String[] args) {

				
		Scanner scan1 = new Scanner(System.in);
		String choice = "yes";
		
				
		System.out.println("Welcome to the Rock, Paper, Scissors!");
		System.out.print("Enter your name: ");
		String userInput = scan1.nextLine();
		
		while (choice.equalsIgnoreCase("yes")) {
		
		//Jets = Rock_Player Sharks= Random Player
		System.out.print("Would you like to play against The Jets or The Sharks (j/s)?");
		String userInput2 = scan1.nextLine();
		System.out.print("Choose either Rock, Paper, or Scissors? (R/P/S:");
		String userInput3 =scan1.nextLine();
		
		//Instantiation the classes
		//making constructor of all classes from the abstract class
		Player player1= new Rock_Player ("The Jets" ,"Rock") ;
		Player player2= new Random_Player("The Shark" ,getRandomValue());
		Player player3= new Human_Player(userInput,userInput3);
         
		
          System.out.print("Play Again? y/n:");
        choice = scan1.nextLine();
         		
	}
	}
}
	
		
		
