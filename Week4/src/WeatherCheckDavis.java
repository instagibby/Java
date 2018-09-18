import java.util.Scanner;

public class WeatherCheckDavis {

	public static void main(String[] args) {

		// Spencer Davis

		Scanner in = new Scanner(System.in);

		// Declare Variables for comparison and responses
		String spring = "spring";
		String springReply = "No jacket needed";
		int springTemp = 60;

		String summer = "summer";
		String summerReply = "Drink lots of water";
		int summerTemp = 90;

		String fall = "fall";
		String fallReply = "Enjoy the leaves";
		int fallTemp = 60;

		String winter = "winter";
		String winterReply = "Bundle up";
		int winterTemp = 10;

		String noResponse = "No advice from me";

		// Prompt user for input data
		System.out.println("What season is it?");
		String weatherPrompt = in.nextLine();
		System.out.println("What is the temperature?");
		double tempPrompt = in.nextDouble();
		weatherPrompt = weatherPrompt.toLowerCase();
		
		String responseToUser;

		// Run to test the scenario
		if (weatherPrompt.equals(spring) && tempPrompt > springTemp) {
			responseToUser = springReply;
		} else if (weatherPrompt.equals(summer) && tempPrompt > summerTemp) {
			responseToUser = summerReply;
		} else if (weatherPrompt.equals(fall) && tempPrompt > fallTemp) {
			responseToUser = fallReply;
		} else if (weatherPrompt.equals(winter) && tempPrompt < winterTemp) {
			responseToUser = winterReply;
		} else {
			responseToUser = noResponse;
		}

		System.out.println(responseToUser);
		in.close();
	}

}
