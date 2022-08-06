package provaPacchetto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTester {

	public static void main(String[] args) {
		class CountDown implements ActionListener {
			public CountDown(int initial) {
				count = initial;
			}
			public void actionPerformed(ActionEvent event) {
				if(count >= 0)
					System.out.println(count);
			}
			
			private int count;
		}
		
		ActionListener listener = new CountDown(10);
		Timer t = new Timer(1000, listener);
		t.getDelay();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}

}
