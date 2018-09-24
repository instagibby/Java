import java.util.Scanner;

public class EFScaleDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);

		// Prompts for user input (x2)
		System.out.println("Enter a three second wind gust:");
		
		String outputMsg = "";
		
		if (in.hasNextInt()) {
			int windGustUserInput = in.nextInt();
			
			if (windGustUserInput < 65 && windGustUserInput >= 0) {
				outputMsg = "Please enter a number at 65 or above!";
			}
			else if ( windGustUserInput < 0) {
				outputMsg = "Is that wind flying backwards? Try a positive number!";
			}
			else if (windGustUserInput > 375) {
				outputMsg = "That breaks the world record for recorded wind speed.";
			}
			else if (windGustUserInput <= 85) {
				outputMsg = "The EF rating is 0";
			}
			else if (windGustUserInput <= 110) {
				outputMsg = "The EF rating is 1";
			}
			else if (windGustUserInput <= 135) {
				outputMsg = "The EF rating is 2";
			}
			else if (windGustUserInput <= 165) {
				outputMsg = "The EF rating is 3";
			}
			else if (windGustUserInput <= 200) {
				outputMsg = "The EF rating is 4";
			}
			else if (windGustUserInput > 200) {
				outputMsg = "The EF rating is 5";
			}
			else {
				outputMsg = "Please enter a number at or above 65!";
			}
		}
		else {
			outputMsg = "Please enter a number!";
		}
		
		System.out.println(outputMsg);

		
		in.close();
	}

}
