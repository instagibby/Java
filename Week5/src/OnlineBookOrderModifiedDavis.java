import java.util.Scanner;

public class OnlineBookOrderModifiedDavis {

	public static void main(String[] args) {
	// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		
		double bookSubtotal = 0;
		final double TAX_RATE = 0.065;
		final double SHIPPING_RATE = 2.95;

		
		// Prompts the user for inputs for quantity of books and subtotal
		System.out.println("How many books did you buy today?");
		int userInputBooks = in.nextInt();
		
		// Runs loop for as many books as was input
		for (int i = 0; i < userInputBooks; i++) {
			System.out.println("And what was the price of book " + (i+1) + "?");
			double userInputPrice = in.nextDouble();
			bookSubtotal =  bookSubtotal + userInputPrice;
		}

		// Sets variables for calculations
		double tax = bookSubtotal * TAX_RATE;
		double shipping = (int)userInputBooks * SHIPPING_RATE;
		
		double orderTotal = shipping + tax + bookSubtotal;

		double orderTotalRounded = Math.round((orderTotal) * 100.0) / 100.0;

		// Prints out the receipt
		System.out.println("============ Bookstore Receipt ============");
		System.out.println("Number of books purchased: " + userInputBooks);
		System.out.println("Book Subtotal: $" + bookSubtotal);
		System.out.printf("Tax: $%.2f \n", tax);
		System.out.println("Shipping: $" + shipping);
		System.out.println("\n" + "----------------------" +"\n");
		System.out.println("Your order total is: $" + orderTotalRounded);
		
		in.close();
	}

}
