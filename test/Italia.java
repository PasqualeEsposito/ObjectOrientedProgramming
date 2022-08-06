package test;

import java.awt.*;
import java.awt.geom.*;

public class Italia {
	public Italia() {
	}
	
	public void draw(Graphics2D g2) {
		Rectangle leftRectangle = new Rectangle(100, 100, 30, 60);
		Rectangle rightRectangle = new Rectangle(160, 100, 30, 60);
		Line2D.Double topLine = new Line2D.Double(130, 100, 160, 100);
		Line2D.Double bottomLine = new Line2D.Double(130, 160, 160, 160);
		g2.setColor(Color.GREEN);
		g2.fill(leftRectangle);
		g2.setColor(Color.RED);
		g2.fill(rightRectangle);
		g2.setColor(Color.BLACK);
		g2.draw(topLine);
		g2.draw(bottomLine);
		
		/*Rectangle upRectangle = new Rectangle(100, 100, 80, 20);
		Rectangle bottomRectangle = new Rectangle(100, 120, 80, 20);
		g2.setColor(Color.BLUE);
		g2.fill(upRectangle);
		g2.setColor(Color.RED);
		g2.fill(bottomRectangle);
		g2.setColor(Color.BLACK);
		Line2D.Double topLine = new Line2D.Double(100, 80, 179, 80);
		Line2D.Double leftLine = new Line2D.Double(100, 80, 100, 100);
		Line2D.Double rightLine = new Line2D.Double(179, 80, 179, 100);
		g2.draw(topLine);
		g2.draw(rightLine);
		g2.draw(leftLine);*/
	}
}













