import java.util.Scanner;

public class BookOrderSentinelDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
				Scanner in = new Scanner(System.in);
				
				// Declare Variables
				double bookSubtotal = 0;
				final double TAX_RATE = 0.065;
				final double SHIPPING_RATE = 2.95;
				int bookCount = 0;
				
				
				System.out.println("What was the price of book " + (bookCount+1) + "? Enter a negative number to exit.");
				double userInputPrice = in.nextDouble();
				
				while (userInputPrice >= 0) {
					bookCount++;
					bookSubtotal =  bookSubtotal + userInputPrice;
					System.out.println("What was the price of book " + (bookCount+1) + "? Enter a negative number to exit.");
					userInputPrice = in.nextDouble();
				}

				// Sets variables for calculations
				double tax = bookSubtotal * TAX_RATE;
				double shipping = (int)bookCount * SHIPPING_RATE;
				
				double orderTotal = shipping + tax + bookSubtotal;

				double orderTotalRounded = Math.round((orderTotal) * 100.0) / 100.0;

				// Prints out the receipt
				System.out.println("============ Bookstore Receipt ============");
				System.out.println("Number of books purchased: " + bookCount);
				System.out.println("Book Subtotal: $" + bookSubtotal);
				System.out.printf("Tax: $%.2f \n", tax);
				System.out.println("Shipping: $" + shipping);
				System.out.println("\n" + "----------------------" +"\n");
				System.out.println("Your order total is: $" + orderTotalRounded);
				
				in.close();
	}

}
