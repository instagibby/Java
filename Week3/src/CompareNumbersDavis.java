import java.util.Scanner;

public class CompareNumbersDavis {

	public static void main(String[] args) {

		// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		// Prompts for inputs
		System.out.println("Enter a number:");
		double firstNumber = in.nextDouble();
		
		System.out.println("Enter another number:");
		double secondNumber = in.nextDouble();
		
		// Sets values for comparison results
		boolean isEqual = firstNumber == secondNumber;
		boolean isGreater = firstNumber > secondNumber;
		boolean isLess = firstNumber < secondNumber;
		
		// Prints out response
		System.out.println(firstNumber + " is equal to " + secondNumber + " : " + isEqual);
		System.out.println(firstNumber + " is greater than " + secondNumber + " : " + isGreater);
		System.out.println(firstNumber + " is less than " + secondNumber + " : " + isLess);
		
		
		in.close();

	}

}
