import javax.swing.JOptionPane;

public class HelloUserDavis {

	public static void main(String[] args) {
		// Spencer Davis
		
		// Prompt user for values
		String name = JOptionPane.showInputDialog("Type your name please");
		String inputAge = JOptionPane.showInputDialog("Type your age please");
		
		// Turn age string to integer
		int age = Integer.parseInt(inputAge);
		
		// Upper case first letter and lower case the rest
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		
		// Increment age
		age++;
		
		// Prints out the dialog for updated name and age
		JOptionPane.showMessageDialog(null, "Howdy, " + name +". Next year you will be " + age + " years old.");

	}

}
	