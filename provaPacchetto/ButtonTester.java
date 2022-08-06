package provaPacchetto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonTester {

	public static void main(String[] args) {
		class ClickListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				System.out.println("AEEEEEEEEEEE!!!!");
			}
		}
		
		JFrame frame = new JFrame();
		JButton button = new JButton("aeeee???");
		frame.add(button);
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		frame.setSize(120, 60);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
