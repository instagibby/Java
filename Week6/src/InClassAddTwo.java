import java.util.Scanner;

public class InClassAddTwo {

	public static void main(String[] args) {
		// Spencer Davis
		
		Scanner in = new Scanner(System.in);
		boolean toContinue = true;
		int exitNumber = -1;
		int num1 = 0;
		String equals = " = ";
		String plusSign = " + ";
		
		
		
		while (toContinue) {
			System.out.println("Enter a Number: ");
			num1 = in.nextInt();
			
			if (num1 == exitNumber) {
				break;
			}
			
			System.out.println("Enter a Number: ");
			int num2 = in.nextInt();
			
			int result = addTwoNumbers(num1, num2);
			
			System.out.println(num1 + plusSign + num2 + equals + result);
			
			
		}
		in.close();
	}

	private static int addTwoNumbers(int num1, int num2) {
		
		return num1 + num2;
	}
	

}
