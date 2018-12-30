import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BankAccountFrame extends JPanel {
	
	BankAccount account;
	
	private JLabel amount = new JLabel("amount: ");
	private JTextField amountField = new JTextField(10);
	
	private JButton withdraw = new JButton("Withdraw");
	private JButton deposit = new JButton("Deposit");
	
	private JLabel balance = new JLabel("balance=0" );
	
	
	public BankAccountFrame(BankAccount b) {
		super();
		
		account = b;
		
		add(amount);
		add(amountField);
		
		add(withdraw);
		add(deposit);
		
		
		WithdrawButtonListener w = new WithdrawButtonListener();
		withdraw.addActionListener(w);
		
		DepositButtonListener d = new DepositButtonListener();
		deposit.addActionListener(d);
		
		add(balance);
		balance.setText("balance=" + account.getBalance());
		
		
	}
	
	class DepositButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				double userInput = Double.parseDouble(amountField.getText());
				
				account.Deposit(userInput);
				balance.setText("balance=" + account.getBalance());

			} catch (NumberFormatException err) {
			    err.printStackTrace(); //prints error
			}
			
			
		}
		
	}
	class WithdrawButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				double userInput = Double.parseDouble(amountField.getText());
				account.Withdraw(userInput);
				balance.setText("balance=" + account.getBalance());

			} catch (NumberFormatException err) {
			    err.printStackTrace(); //prints error
			}
			
		}
		
	}
	
}
