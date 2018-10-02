import java.util.Scanner;

public class PrintStarsDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many rows of stars.. yeah, stars. How many you want?");
		int userInputStarRows = in.nextInt();
		int stars = 0;
		String starRow = "**************";
		do {
			System.out.println(starRow);
			if (userInputStarRows != 0 ) {
				stars++;
			}
		} while (stars != userInputStarRows);
		
		in.close();
	}

}
	