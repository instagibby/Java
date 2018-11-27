package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.Madlib;

public class FormPanel extends JPanel {
	
	private JLabel nameText = new JLabel("Name: ");
	private JTextField nameField = new JTextField(10);
	
	private JLabel item1Text = new JLabel("item: ");
	private JTextField item1TextField = new JTextField(10);
	
	private JLabel item2Text = new JLabel("item: ");
	private JTextField item2TextField = new JTextField(10);
	
	private JLabel item3Text = new JLabel("item: ");
	private JTextField item3TextField = new JTextField(10);
	
	private JLabel verbText = new JLabel("verb: ");
	private JTextField verbTextField = new JTextField(10);
	
	private JLabel adjText = new JLabel("adjective: ");
	private JTextField adjTextField = new JTextField(10);
	
	private JButton submit = new JButton("Submit");
	private JButton clear = new JButton("Clear");

	private JTextArea results = new JTextArea(5,15);
	
	
	public FormPanel() {
		super();
		
		add(nameText);
		add(nameField);
		
		
		add(item1Text);
		add(item1TextField);
		
		add(item2Text);
		add(item2TextField);
		
		add(item3Text);
		add(item3TextField);
		
		add(verbText);
		add(verbTextField);
		
		add(adjText);
		add(adjTextField);
		
		add(submit);
		add(clear);
		
		ClearButtonListener cbl = new ClearButtonListener();
		clear.addActionListener(cbl);
		
		SubmitButtonListener sbl = new SubmitButtonListener();
		submit.addActionListener(sbl);
		
		add(results);
	}
	
	class ClearButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			nameField.setText("");
			
			item1TextField.setText("");
			item2TextField.setText("");
			item3TextField.setText("");
			
			verbTextField.setText("");
			adjTextField.setText("");
			
			nameField.grabFocus();
			results.setText("");
			
		}
		
	}
	
	class SubmitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String name = nameField.getText();
			String item1 = item1TextField.getText();
			String item2 = item2TextField.getText();
			String item3 = item3TextField.getText();
			String verb = verbTextField.getText();
			String adj = adjTextField.getText();
			
			Madlib usersLib = new Madlib();
			usersLib.setName(name);
			usersLib.setItem1(item1);
			usersLib.setItem2(item2);
			usersLib.setItem3(item3);
			usersLib.setVerb(verb);
			usersLib.setAdjective(adj);
			
			
			results.setText(usersLib.reciteMadLib());
		}
		
	}
	
}
