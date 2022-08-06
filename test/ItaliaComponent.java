package test;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class ItaliaComponent extends JComponent {
	
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Italia i = new Italia();
		
		i.draw(g2);
	}
}
