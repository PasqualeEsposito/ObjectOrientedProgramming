package test;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class RectangleComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
	// Recover Graphics2D
	Graphics2D g2 = (Graphics2D) g;
	
	Color magenta = new Color(0.2F, 0.5F, 0.4F);
	g2.setColor(magenta);
	Rectangle box = new Rectangle(5, 10, 20, 30);
	g2.draw(box);
	box.translate(15, 25);
	g2.draw(box);
	box.translate(100, -30);
	g2.draw(box);
	Ellipse2D.Double ellipse = new Ellipse2D.Double(50, 50, 100, 30);
	g2.fill(ellipse);
	g2.draw(ellipse);
	Line2D.Double segment = new Line2D.Double(15, 15, 111, 111);
	g2.draw(segment);
	Point2D.Double from = new Point2D.Double(50, 50);
	Point2D.Double to = new Point2D.Double(50, 180);
	Line2D.Double line = new Line2D.Double(from, to);
	g2.draw(line);
	g2.drawString("Ci provo!", 250, 100);
	
	}
	
	private static final long serialVersionUID = 1L;
}
