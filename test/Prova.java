package test;

import javax.swing.*;

public class Prova {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setTitle("Italian flag");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ItaliaComponent component = new ItaliaComponent();
		//CarComponent component = new CarComponent();
		//RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);
	}

}
