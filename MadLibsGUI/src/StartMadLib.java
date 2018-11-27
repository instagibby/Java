import javax.swing.JFrame;
import javax.swing.JPanel;

import view.FormPanel;

public class StartMadLib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		JPanel panel = new FormPanel();
		
		frame.add(panel);
		frame.setSize(200,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
