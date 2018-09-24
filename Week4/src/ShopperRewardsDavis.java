import java.text.DecimalFormat;
import java.util.Scanner;

public class ShopperRewardsDavis {

	public static void main(String[] args) {
		// Spencer Davis

		Scanner in = new Scanner(System.in);
		DecimalFormat dfPercent = new DecimalFormat("##%");
		DecimalFormat dfValue = new DecimalFormat("$##.00");
		DecimalFormat dfCents = new DecimalFormat("#¢");
		
		System.out.println("Please enter the cost of your groceries:");
		double cartInput = in.nextDouble();
		
		// Coupon ranges
		int lowCost = 10;
		int mediumCost = 60;
		int highCost = 150;
		int highestCost = 210;
		
		// Gas discount ranges
		int baseGas = 1;
		int oneCentGas = 49;
		int twoCentGas = 99;

		// Variables for if statements
		double discountPercent = 0;
		double discountValue = 0;
		int gasDiscountValue = 0;
		
		// Responses
		String couponReply;
		String gasDiscountReply;
		
		// Get coupon discount %
		if (cartInput < lowCost) {
			discountPercent = 0;
		} else if (cartInput <= mediumCost) {
			discountPercent = 0.08;
		} else if (cartInput <= highCost) {
			discountPercent = 0.1;
		} else if (cartInput <= highestCost) {
			discountPercent = 0.12;
		} else if (cartInput > highestCost) {
			discountPercent = 0.14;
		}
		
		// Get gas discount
		if (cartInput < baseGas) {
			gasDiscountValue = 0;
		} else if (cartInput <= oneCentGas) {
			gasDiscountValue = 1;
		} else if (cartInput <= twoCentGas) {
			gasDiscountValue = 2;
		} else if (cartInput > twoCentGas) {
			gasDiscountValue = 3;
		} 
		
		// Calculates discount amount/value
		discountValue = cartInput * discountPercent;
		
		// Sets response to user with formatted values
		couponReply = "You receive a discount coupon of " + dfValue.format(discountValue) + ". (" + dfPercent.format(discountPercent) + " of your purchase)";
		gasDiscountReply = "You have earned a " + dfCents.format(gasDiscountValue) + " discount per gallon of gas.";
		
		// Prints to user
		System.out.println(couponReply);
		System.out.println(gasDiscountReply);
		

		in.close();
	}

}
