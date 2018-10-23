import java.util.Scanner;

public class ChildcareChargesDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		int userInputAge = 0;	//		Days
		int userInputDays = 0;	//1  2   3   4    5
		int rates[][] = {		{30, 60, 88, 115, 140},	// 0
				                {26, 52, 70, 96,  120},	// 1	A
				                {24, 46, 67, 89,  110},	// 2	G
				                {22, 40, 60, 75,  88},	// 3	E
				                {20, 35, 50, 66,  84} };// 4
		
		 while (userInputAge != 999) {
			System.out.println("How old is the child?");
			if (in.hasNextInt()) {
				userInputAge = in.nextInt();
				//
				if (userInputAge == 999) {
					break;
				} else if (userInputAge == 0 || userInputAge > 4) {
					System.out.println("Sorry we only take kids under the age of 4!");
				} else {
					System.out.println("How many days a week are needed?");
					userInputDays = in.nextInt();
					System.out.println("Cost = $" + rates[userInputAge][userInputDays - 1]);
				}
			} else {
				in.nextLine();
				System.out.println("Please enter a number!");
			}
			
		}
		System.out.println("Thanks for stopping by!");

		in.close();
	}

}
