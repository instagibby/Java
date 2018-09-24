import java.util.Arrays;
import java.util.Scanner;

public class RockPaperScissorsRevisedDavis {

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
				
					// Decided to do a nested switch statement as it seemed so much cleaner to me
					switch (playerOneInput) {
						case "rock":
							switch (playerTwoInput) {
							// rock wins player one wins
								case "scissors":
									victoryMessage = rockWinsScissors;
									winnerMessage = playerOneWins;
									break;
								case "lizard":
									victoryMessage = rockWinsLizard;
									winnerMessage = playerOneWins;
									break;
							// rock loses player two wins
								case "paper":
									victoryMessage = paperWinsRock;
									winnerMessage = playerTwoWins;
									break;
								case "spock":
									victoryMessage = spockWinsRock;
									winnerMessage = playerTwoWins;
									break;
								default:
									victoryMessage = tieMessage;
									winnerMessage = tieWinner;
							}
							break;
						case "paper":
							switch (playerTwoInput) {
							// paper wins player one wins
								case "rock":
									victoryMessage = paperWinsRock;
									winnerMessage = playerOneWins;
									break;
								case "spock":
									victoryMessage = paperWinsSpock;
									winnerMessage = playerOneWins;
									break;
							// paper loses player two wins
								case "scissors":
									victoryMessage = scissorsWinsPaper;
									winnerMessage = playerTwoWins;
									break;
								case "lizard":
									victoryMessage = lizardWinsPaper;
									winnerMessage = playerTwoWins;
									break;
								default:
									victoryMessage = tieMessage;
									winnerMessage = tieWinner;
							}
							break;
						case "scissors":
							switch (playerTwoInput) {
							// scissors wins player one wins
								case "paper":
									victoryMessage = scissorsWinsPaper;
									winnerMessage = playerOneWins;
									break;
								case "lizard":
									victoryMessage = scissorsWinsLizard;
									winnerMessage = playerOneWins;
									break;
							// scissors loses player two wins
								case "rock":
									victoryMessage = rockWinsScissors;
									winnerMessage = playerTwoWins;
									break;
								case "spock":
									victoryMessage = spockWinsScissors;
									winnerMessage = playerTwoWins;
									break;
								default:
									victoryMessage = tieMessage;
									winnerMessage = tieWinner;
							}
							break;
						case "lizard":
							switch (playerTwoInput) {
							// lizard wins player one wins
								case "paper":
									victoryMessage = lizardWinsPaper;
									winnerMessage = playerOneWins;
									break;
								case "spock":
									victoryMessage = lizardWinsSpock;
									winnerMessage = playerOneWins;
									break;
							// lizard loses player two wins
								case "scissors":
									victoryMessage = scissorsWinsLizard;
									winnerMessage = playerTwoWins;
									break;
								case "rock":
									victoryMessage = rockWinsLizard;
									winnerMessage = playerTwoWins;
									break;
								default:
									victoryMessage = tieMessage;
									winnerMessage = tieWinner;
							}
							break;
						case "spock":
							switch (playerTwoInput) {
							// spock wins player one wins
								case "scissors":
									victoryMessage = spockWinsScissors;
									winnerMessage = playerOneWins;
									break;
								case "rock":
									victoryMessage = spockWinsRock;
									winnerMessage = playerOneWins;
									break;
							// spock loses player two wins
								case "paper":
									victoryMessage = paperWinsSpock;
									winnerMessage = playerTwoWins;
									break;
								case "lizard":
									victoryMessage = lizardWinsSpock;
									winnerMessage = playerTwoWins;
									break;
								default:
									victoryMessage = tieMessage;
									winnerMessage = tieWinner;
							}
							break;
					}
				} 
				
				// Prints message to players
				System.out.println(victoryMessage);
				System.out.println(winnerMessage);
				
				
				in.close();

	}

}
