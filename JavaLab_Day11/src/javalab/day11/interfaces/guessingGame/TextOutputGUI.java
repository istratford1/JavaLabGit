package javalab.day11.interfaces.guessingGame;


public class TextOutputGUI implements OutputInterface
{

	@Override
	public void displayGameStart() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the guessing game");
		
		
	}

	@Override
	public void displayMainMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please select a difficulty level");
	}

	@Override
	public void displayGameState() {
		// TODO Auto-generated method stub
		System.out.println("Please guess a number");
		
	}

	@Override
	public void displayWin() {
		// TODO Auto-generated method stub
		System.out.println("Well done ! you gessed correctly");
		
	}

	@Override
	public void displayLose() {
		// TODO Auto-generated method stub
		System.out.println("Bad luck...try again ");
			
	}

	@Override
	public void displayGameEnd() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for playing");
			
	}

}
