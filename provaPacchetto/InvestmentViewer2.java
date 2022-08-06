package provaPacchetto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import banca.BankAccount;

public class InvestmentViewer2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Add interest");
		JLabel rateLabel = new JLabel("Interest rate: ");
		final JTextField rateField = new JTextField(10);
		rateField.setText("100");
		final BankAccount b = new BankAccount(1000);
		JLabel resultLabel = new JLabel("balance = " + b.getBalance());
		panel.add(rateLabel);
		panel.add(rateField);
		panel.add(button);
		panel.add(resultLabel);
		frame.add(panel);
		
		class AddInterestListener implements ActionListener {

			public void actionPerformed(ActionEvent event) {
				double rate = Double.parseDouble(rateField.getText());
				double interest = b.getBalance() * rate / 100;
				b.deposit(interest); 
				resultLabel.setText("balance=" + b.getBalance());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(500, 80);
		frame.setVisible(true);
	}

}
