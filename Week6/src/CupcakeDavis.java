import java.text.DecimalFormat;
import java.util.Scanner;

public class CupcakeDavis {

	public static void main(String[] args) {
		// Spencer Davis

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a flavor: ");
		String flavor = in.nextLine();
		System.out.println("and an icing color: ");
		String icingColor = in.nextLine();
		DecimalFormat df = new DecimalFormat("$#.##");
		
		
		System.out.println("A " + icingColor + " " + flavor + " cupcake is " + df.format(CupcakePricing(flavor, icingColor)) + ".");
		
		in.close();
	}
	
	private static double CupcakePricing(String flavor, String icingColor) {
		double price = 0;
		flavor = flavor.toLowerCase();
		icingColor = icingColor.toLowerCase();
		
		switch (flavor) {
			case "vanilla":
				price += 1.75;
				break;
			case "chocolate":
				price += 2;
				break;
			case "raspberry":
				price += 2.25;
				break;
		}
		
		switch (icingColor) {
			case "white":
				break;
			case "blue":
				price += 0.50;
				break;
			case "red":
				price += 0.25;
				break;
			default:
				price += 0.75;
		}
		
		return price;
	}

}
