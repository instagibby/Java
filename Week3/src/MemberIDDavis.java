import java.util.Scanner;

public class MemberIDDavis {
	
	// Spencer Davis
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// Prompts for input asking for member ID
		System.out.println("Enter your member ID: ");
		String memberIDInput = in.nextLine().toUpperCase();
		
		
		// Get the substring for the blocks as they are needed from the user input
		String first = memberIDInput.substring(0,1);
		String second = memberIDInput.substring(1,4);
		String third = memberIDInput.substring(4,8);
		String fourth = memberIDInput.substring(8,10);
		String fifth = memberIDInput.substring(10,13);
		String sixth = memberIDInput.substring(13,14);
		
		// Places the parts of the member id in the spots as well as adds spacing/formatting as required
		System.out.println(first + "-" + second + " " + third + " " + fourth + "-" + fifth + " (" + sixth + ")");
		
		in.close();
	}

}
