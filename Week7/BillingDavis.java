
public class BillingDavis {

	public static void main(String[] args) {
		//	Spencer Davis
	
		//	One
		System.out.printf("%.2f", computePhotoBill(19.99));
		System.out.println();
		//	Two
		System.out.printf("%.2f", computePhotoBill(19.99, 2));
		System.out.println();
		//	Three
		System.out.printf("%.2f", computePhotoBill(19.22, 2, .1));
		
	}
	
	
	public static double computePhotoBill(double photoBookPrice) {
		
		final double TAX_RATE = 1.06;
		double total = photoBookPrice * TAX_RATE;
		return total;
	}
	
	public static double computePhotoBill(double photoBookPrice, int bookQuantity) {
		
		final double TAX_RATE = 1.06;
		double total = (photoBookPrice * bookQuantity) * TAX_RATE;
		return total;
	}
	
	public static double computePhotoBill(double photoBookPrice, int bookQuantity, double couponDiscountRate ) {
		
		final double TAX_RATE = 1.06;
		double total = ((photoBookPrice * bookQuantity) * (1 - couponDiscountRate)) * TAX_RATE;
		return total;
	}

}
