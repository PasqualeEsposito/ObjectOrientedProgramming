package eventi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class TimerTest { // Questo programma collauda la classe Timer
	public static void main(String[] args) {
		class CountDown implements ActionListener {
			public CountDown(int initialCount) {
				count = initialCount;
			}
			
			public void actionPerformed(ActionEvent event){
				if (count >= 0)
					System.out.println(count);
				count--;
			}
			private int count;
		}
		CountDown listener = new CountDown(10);
		Timer t = new Timer(1000, listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit?");
		System.exit(0);
	}
}
