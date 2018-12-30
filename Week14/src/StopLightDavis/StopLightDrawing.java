import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class StopLightDrawing extends JComponent {

	Color go = Color.gray;
	Color slow = Color.gray;
	Color stop = Color.red;
	
	String activeLightColor = "red";
	
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 150, 250);
		
		g.setColor(Color.black);
		g.drawRect(0, 0, 150, 250);
		
		g.setColor(stop);
		g.fillOval(50, 30, 50, 50);
		
		g.setColor(slow);
		g.fillOval(50, 100, 50, 50);

		g.setColor(go);
		g.fillOval(50, 170, 50, 50);

		
	}
	
	public void changeColor() {
		go = Color.gray;
		slow = Color.gray;
		stop = Color.gray;
		
		
		switch(activeLightColor) {
			case "red":
				activeLightColor = "green";
				go = Color.green;
				break;
			case "green":
				activeLightColor = "yellow";
				slow = Color.orange;
				break;
			case "yellow":
				activeLightColor = "red";
				stop = Color.red;
				break;
		}
		repaint();
	}
}
