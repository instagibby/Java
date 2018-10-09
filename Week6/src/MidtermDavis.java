import java.text.DecimalFormat;
import java.util.Scanner;

public class MidtermDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		//	Could easily change decimal so that if you wanted .00 after even a 
		//	whole number you would just do	("$#.00")
		DecimalFormat df = new DecimalFormat("$#.##");
		
		final String FIRST_NAME_PROMPT = "Enter first name: ";
		final String LAST_NAME_PROMPT = "Enter last name: ";
		final String TOTAL_SALES_PROMPT = "Enter total Sales: ";
		final String ALLSTAR_PROMPT = "Press y for all-star, n for non-all-star: ";
		final String CONTINUE_PROMPT = "Please enter another first name or ZZZ to quit: ";
		final String ALLSTAR_YES = "y";
		final String MAX_STAR_PRINT = " ****";
		final String MED_STAR_PRINT = " **";
		final String MIN_STAR_PRINT = "";
		final String EXIT_VALUE = "ZZZ";
		final String EXIT_MSG = "Goodbye!";
		final int MAX_STAR = 100;
		final int MED_STAR = 50;
		final double ALLSTAR_BONUS_RATE = 0.03;
		final double NON_ALLSTAR_BONUS_RATE = 0.02;

		String fNameUserInput = "";
		String lNameUserInput = "";
		String isAllStarResponse = "";
		String starPrint = "";
		double totalSalesUserInput = 0;
		double allstarBonus = 0;
		boolean toContinue = true; 
		
		//	First Name
		System.out.println(FIRST_NAME_PROMPT);
		fNameUserInput = in.nextLine();
		
		while(toContinue) {
			
			//	Last Name
			System.out.println(LAST_NAME_PROMPT);
			lNameUserInput = in.nextLine();
			
			//	Total Sales
			System.out.println(TOTAL_SALES_PROMPT);
			totalSalesUserInput = in.nextDouble();
			
			in.nextLine();
			
			//	All Star y/n
			System.out.println(ALLSTAR_PROMPT);
			isAllStarResponse = in.nextLine();
			
						
			//	Is all star or not
			if(isAllStarResponse.equals(ALLSTAR_YES)) {

				allstarBonus = totalSalesUserInput * ALLSTAR_BONUS_RATE;
				
			} else {
				
				allstarBonus = totalSalesUserInput * NON_ALLSTAR_BONUS_RATE;
			}
			
			//	Tests for stars to print
			if (allstarBonus > MAX_STAR) {
				
				starPrint = MAX_STAR_PRINT;
				
			} else if (allstarBonus > MED_STAR) {
				
				starPrint = MED_STAR_PRINT;
				
			} else {
				
				starPrint = MIN_STAR_PRINT;
			}
			
			//Prints
			System.out.println(FirstLetterToUpper(fNameUserInput) + ", " + FirstLetterToUpper(lNameUserInput) + starPrint + " - " + df.format(allstarBonus));
			
			System.out.println("\n" + CONTINUE_PROMPT);
			
			fNameUserInput = in.nextLine();
			
			if (fNameUserInput.equals(EXIT_VALUE)) {
				toContinue = false;
				System.out.println(EXIT_MSG);
			}
			
		};
		
		in.close();
	}
	
	//	Why not make a method to make life easier! Upper case the first letter and return the word
	public static String FirstLetterToUpper(String str) {
		str = str.toLowerCase();
		String capitalized = str.substring(0, 1).toUpperCase() + str.substring(1);
		return capitalized;
	}

}
