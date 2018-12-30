
public class BankAccount {

	double balance = 1000;
	
	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}



	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void Deposit(double d) {
		
		this.balance += d;
	}
	
	public void Withdraw(double w) {
		
		this.balance -= w;
	}
	
}
