import java.util.Scanner;

public class PurchaseDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		
		final double TAX_RATE = 0.06;
		final int invoiceLength = 4;
		final int goldTier = 750;
		final int silverTier = 500;
		final int bronzeTier = 300;
		final String lineBreakStars = "***********************************************";
		final String invoiceNumberPrint = "Invoice number: ";
		final String amtOfSalePrint = "Amount of sale: ";
		final String salesTaxPrint = "Sales Tax: ";
		final String totalPurchasePrint = "Total Purchase: ";
		final String medallionLevelPrint = "Medallion level: ";
		final String anotherPurchasePrompt = "Would you like to enter another purchase? [y]es or [n]o:";
		final String exitString = "n";
		final String continueString = "y";
		final String errorMsg = "Sorry please try again";
		final String thankYouMsg = "Thanks for using our system!";
		
		double userInputSaleTotal = 0;
		String anotherPurchaseConfirm = "y";
		String userInputInvoiceNo = "";
		String medallionLevel = "N/A";
		String medallionGold = "Gold";
		String medallionSilver = "Silver";
		String medallionBronze = "Bronze";
		boolean exitNow = false;
		
		

		
		// Prompts the user for inputs for quantity of books and subtotal
		while (!exitNow) {
			
			if (anotherPurchaseConfirm.equals(continueString)) {
				
				System.out.println("What was your invoice number? What was your sale total?");
				userInputInvoiceNo = in.nextLine();
				
				if (userInputInvoiceNo.length() == invoiceLength) {
					userInputSaleTotal = in.nextDouble();
					in.nextLine();
					userInputInvoiceNo = userInputInvoiceNo.toUpperCase();
					
					double tax = userInputSaleTotal * TAX_RATE;
					tax = Math.round((tax) * 100.0) / 100.0;
					double orderTotal = tax + userInputSaleTotal;
					orderTotal = Math.round((orderTotal) * 100.0) / 100.0;
					
					if (orderTotal > goldTier) {
						medallionLevel = medallionGold;
					} else if (orderTotal < goldTier && orderTotal >= silverTier) {
						medallionLevel = medallionSilver;
					} else if (orderTotal > silverTier && orderTotal >= bronzeTier) {
						medallionLevel = medallionBronze;
					}
					
					System.out.println(lineBreakStars);
					System.out.println(invoiceNumberPrint + userInputInvoiceNo);
					System.out.println(amtOfSalePrint + userInputSaleTotal);
					System.out.println(salesTaxPrint + tax);
					System.out.println(totalPurchasePrint + orderTotal);
					System.out.println(medallionLevelPrint + medallionLevel);
					System.out.println(lineBreakStars);
					
					System.out.println(anotherPurchasePrompt);
					anotherPurchaseConfirm = in.nextLine();
				}
				else {
					System.out.println(errorMsg);
				}
				
			} else if (anotherPurchaseConfirm.equals(exitString)) {
				exitNow = true;
			}

			
		}
		System.out.println(thankYouMsg);

		in.close();

	}

}
