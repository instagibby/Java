import java.util.Scanner;

public class AverageAgeDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		// Prompts for inputs
		System.out.println("How many ages would you like to enter?");
		int userInputAges = in.nextInt();
		
		// Variables
		double runningAgeValue = 0;
		double finalAge;
		int count = 0;
		
		// Validates user input
		if (userInputAges < 1) {
			System.out.println("Sorry please enter a number at or above 1");
		}
		else {
			// Runs loop to gather values of ages
			while (count < userInputAges) {
				System.out.println("Enter age " + (count+1) + ":");
				int ageValue = in.nextInt();
				runningAgeValue = runningAgeValue + ageValue;
				count++;
			}
			
			finalAge = runningAgeValue / userInputAges;
			
			System.out.println("The average age is: " + finalAge);
		}
		
		in.close();
	}

}
