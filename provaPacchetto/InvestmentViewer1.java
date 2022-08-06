package provaPacchetto;

import java.awt.event.*;
import javax.swing.*;
import banca.BankAccount;

public class InvestmentViewer1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("Add interest");
		final BankAccount account = new BankAccount(1000);
		final JLabel label = new JLabel("balance = " + account.getBalance());
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener {
			
			public void actionPerformed(ActionEvent event) {
				double interest = account.getBalance() * 0.5 / 100;
						account.deposit(interest);
						label.setText(
						"balance=" + account.getBalance());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(300, 80);
		frame.setVisible(true);
	}

}
