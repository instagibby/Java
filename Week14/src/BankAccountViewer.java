import javax.swing.JFrame;
import javax.swing.JPanel;

public class BankAccountViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		JPanel panel = new BankAccountFrame(new BankAccount(1000));
		
		frame.add(panel);
		frame.setSize(400,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
