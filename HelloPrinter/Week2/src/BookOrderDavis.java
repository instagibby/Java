import java.util.Scanner;

public class BookOrderDavis {
	
	// Spencer Davis
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		// Prompts the user for inputs for quantity of books and subtotal
		System.out.println("How many books did you buy today? (Integer please!)");
		String userInputBooks = in.nextLine();
		System.out.println("And what was your order subtotal today? (Integer as well!)");
		String userInputOrderTotal = in.nextLine();
		
		
		// Sets variables for calculations
		int numOfBooksPurchased = Integer.parseInt(userInputBooks);
		double bookSubtotal = Double.parseDouble(userInputOrderTotal);
		double tax = bookSubtotal * 0.065;
		double shipping = (int)numOfBooksPurchased * 2.95;
		
		double orderTotal = shipping + tax + bookSubtotal;

		double orderTotalRounded = Math.round((orderTotal) * 100.0) / 100.0;

		// Prints out the receipt
		System.out.println("============ Bookstore Receipt ============");
		System.out.println("Number of books purchased: " + numOfBooksPurchased);
		System.out.println("Book Subtotal: $" + bookSubtotal);
		System.out.println("Tax: $" + tax);
		System.out.println("Shipping: $" + shipping);
		System.out.println("\n" + "----------------------" +"\n");
		System.out.println("Your order total is: $" + orderTotalRounded);
		
		in.close();
	}
}
