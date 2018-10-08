import java.util.Random;
import java.util.Scanner;

public class RandomNumbersDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		//	Declare constants
		final String numberPrompt = "How many random numbers do you want to see?";
		final String lowestNumberPrompt = "Enter the lowest number you wish to see:";
		final String highestNumberPrompt = "Enter the highest number you wish to see:";
		final String highestNumberError = "Enter a whole number for highest number to see. ";
		final String lowestNumberError = "Enter a whole number for lowest number to see. ";
		final String numberOfNumberError = "Enter a whole number for amount of numbers to see. ";
		final int zeroValue = 0;
		
		//	Declare variables
		String errorMsg = "";
		int numberOfNumbers = 0;
		int lowestNumber = 0;
		int highestNumber = 0;
		boolean promptCycle = true;
		
		//	Prompt cycle so if user inputs invalid data it resets program
		//	and tells user what to fix
		while (promptCycle) {
			
			//	Tests number of numbers input
			System.out.println(numberPrompt);
			if (in.hasNextInt() && numberOfNumbers >= zeroValue) {	
				numberOfNumbers = in.nextInt();
				
				//	Tests lowest number input
				System.out.println(lowestNumberPrompt);
				if (in.hasNextInt() && lowestNumber >= zeroValue) {
					
					lowestNumber = in.nextInt();
					System.out.println(highestNumberPrompt);
					
					//	Tests highest number input
					if (in.hasNextInt() && highestNumber >= zeroValue) {
						highestNumber = in.nextInt();
					} else {
						//	Error if highest number fails
						errorMsg = highestNumberError;
						in.next();
					}
					
				} else {
					//	Error if lowest number fails
					errorMsg = lowestNumberError;
					in.next();
				}
				
			} else {
				//	Error if number of numbers fails
				errorMsg = numberOfNumberError;
				in.next();
			}		
			
			//	Tests if the error message contains text
			if (errorMsg.length() > zeroValue) {
				System.out.println(errorMsg);
			}
			else {
				//	Error message is empty so we can print all of the numbers
				for (int i = 0; i < numberOfNumbers; i++) {
					System.out.println(rand.nextInt(highestNumber) + lowestNumber);
					promptCycle = false;
				}
			}	
		}
		in.close();
	}
}
