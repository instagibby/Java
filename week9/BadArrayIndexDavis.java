import java.util.Scanner;

public class BadArrayIndexDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		int requestedPosition = 0;
		String replyToUser = "";
		
		String[] firstNames = {"Spencer", "Claire", "Yousef", "Kay-Lea", "Aaron", "Derek", "Gibby", "Keith", "Nathan", "Zach"}; 
		
		try {
			
			System.out.println("Which name would you like to see?");
			requestedPosition = in.nextInt();
			
			replyToUser = firstNames[requestedPosition];
			System.out.println(replyToUser);

		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Sorry but your request was out of the array's index. Try 0-9");
		}

	}

}
