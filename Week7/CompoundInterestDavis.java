
public class CompoundInterestDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		System.out.printf("Your total is $%.2f", computeBalance(1000, .045, 3));
		
		System.out.printf("\nYour total is $%.2f", computeBalance(2000, .03, 5));
		
		System.out.printf("\nYour total is $%.2f", computeBalance(3000, .01, 10));

	}
	
	public static double computeBalance(int initBalance, double interestRate, int years) {
		
		double bankAccount = initBalance;
		
		for (int i = 0; i < years; i++) {
			bankAccount = bankAccount * (1 + interestRate);
		}
		
		
		return bankAccount;
	}

}
