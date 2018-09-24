import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissorsDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);

		// Prompts for user input (x2)
		System.out.println("Player One, Choose: rock, paper, scissors, lizard, spock.");
		String playerOneInput = in.nextLine();
		System.out.println("Player Two, Choose: rock, paper, scissors, izard, spock.");
		String playerTwoInput = in.nextLine();
		
		// Handles Case
		playerOneInput = playerOneInput.toLowerCase();
		playerTwoInput = playerTwoInput.toLowerCase();
		
		// Array of possible options and verifies is players have entered a possible option
		String[] possibleOptions= new String[] {"rock", "paper", "scissors", "lizard", "spock"};
		
		// Neat test for if a string is found in an array off stack overflow
		boolean testPlayer1 = Arrays.stream(possibleOptions).anyMatch(playerOneInput::equals);
		boolean testPlayer2 = Arrays.stream(possibleOptions).anyMatch(playerTwoInput::equals);

		
		// Win Strings for each possibility
		// Rock
		String rockWinsLizard = "Rock crushes Lizard.";
		String rockWinsScissors = "Rock crushes Scissors.";
		
		// Paper
		String paperWinsRock = "Paper covers Rock.";
		String paperWinsSpock = "Paper disproves Spock.";
		
		// Scissors
		String scissorsWinsPaper = "Scissors cuts Paper.";
		String scissorsWinsLizard = "Scissors decapitates Lizard.";
		

		// Lizard
		String lizardWinsSpock = "Lizard poisons Spock.";
		String lizardWinsPaper = "Lizard eats Paper.";
		
		// Spock
		String spockWinsRock = "Spock vaporizes Rock.";
		String spockWinsScissors = "Spock smashes Scissors.";
		
		// Player one wins
		String playerOneWins = "Player one wins!";
		
		// Player two wins
		String playerTwoWins = "Player two wins!";
		
		// Messages sent after winner decided
		String victoryMessage = "Please enter a valid option:";
		String winnerMessage = "Rock, Paper, Scissors, Lizard, Spock...";
		String tieMessage = "Game ended in a tie.";
		String tieWinner = "Nobody wins today...";
		
		
		// Runs conditional to test if users input the correct data and shoots a message if not
		if (testPlayer1 && testPlayer2) {
			
			// Tests for player one rock
			if (playerOneInput.equals("rock")) {
				// Tests player two vs rock
				if (playerTwoInput.equals("paper")) {
					victoryMessage = paperWinsRock;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("scissors")) {
					victoryMessage = rockWinsScissors;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("lizard")) {
					victoryMessage = rockWinsLizard;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("spock")) {
					victoryMessage = spockWinsRock;
					winnerMessage = playerTwoWins;
				} 
				else {
					victoryMessage = tieMessage;
					winnerMessage = tieWinner;
				}
				
			}
			// Tests for player one paper
			else if (playerOneInput.equals("paper")) {
				// Tests player two vs paper
				if (playerTwoInput.equals("rock")) {
					victoryMessage = paperWinsRock;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("scissors")) {
					victoryMessage = scissorsWinsPaper;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("lizard")) {
					victoryMessage = lizardWinsPaper;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("spock")) {
					victoryMessage = paperWinsSpock;
					winnerMessage = playerOneWins;
				} 
				else {
					victoryMessage = tieMessage;
					winnerMessage = tieWinner;
				}	
			}
			// Tests for player one scissors
			else if (playerOneInput.equals("scissors")) {
				// Tests player two vs scissors
				if (playerTwoInput.equals("rock")) {
					victoryMessage = rockWinsScissors;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("paper")) {
					victoryMessage = scissorsWinsPaper;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("lizard")) {
					victoryMessage = scissorsWinsLizard;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("spock")) {
					victoryMessage = spockWinsScissors;
					winnerMessage = playerTwoWins;
				} 
				else {
					victoryMessage = tieMessage;
					winnerMessage = tieWinner;
				}
			}
			// Tests for player one lizard
			else if (playerOneInput.equals("lizard")) {
				// Tests player two vs lizard
				if (playerTwoInput.equals("rock")) {
					victoryMessage = rockWinsLizard;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("paper")) {
					victoryMessage = lizardWinsPaper;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("scissors")) {
					victoryMessage = scissorsWinsLizard;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("spock")) {
					victoryMessage = lizardWinsSpock;
					winnerMessage = playerOneWins;
				} 
				else {
					victoryMessage = tieMessage;
					winnerMessage = tieWinner;
				}
			}
			// Tests for player one spock
			else if (playerOneInput.equals("spock")) {
				// Tests player two vs spock
				if (playerTwoInput.equals("rock")) {
					victoryMessage = spockWinsRock;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("paper")) {
					victoryMessage = paperWinsSpock;
					winnerMessage = playerTwoWins;
				}
				else if (playerTwoInput.equals("scissors")) {
					victoryMessage = spockWinsScissors;
					winnerMessage = playerOneWins;
				}
				else if (playerTwoInput.equals("lizard")) {
					victoryMessage = lizardWinsSpock;
					winnerMessage = playerTwoWins;
				} 
				else {
					victoryMessage = tieMessage;
					winnerMessage = tieWinner;
				}
			}
			
		} 
		
		// Prints message to players
		System.out.println(victoryMessage);
		System.out.println(winnerMessage);
		
		
		in.close();
	}

}
