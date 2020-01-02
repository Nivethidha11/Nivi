package swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing2 {

	private JFrame frame;
	private JTextField p;
	private JTextField d;
	private JTextArea print;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing2 window = new swing2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public swing2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 552, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDiscountCalculator = new JLabel("Discount Calculator");
		lblDiscountCalculator.setBounds(176, 23, 125, 27);
		panel.add(lblDiscountCalculator);
		
		JLabel lblPrincipal = new JLabel("Principal Amount");
		lblPrincipal.setBounds(26, 89, 152, 27);
		panel.add(lblPrincipal);
		
		JLabel lblDiscountPercentage = new JLabel("Discount Percentage");
		lblDiscountPercentage.setBounds(26, 148, 152, 27);
		panel.add(lblDiscountPercentage);
		
		p = new JTextField();
		p.setBounds(302, 92, 113, 24);
		panel.add(p);
		p.setColumns(10);
		
		d = new JTextField();
		d.setBounds(302, 151, 113, 27);
		panel.add(d);
		d.setColumns(10);
		
		JButton result = new JButton("Calculate");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double amt=Double.parseDouble(p.getText());
				double dis=Double.parseDouble(d.getText());
				double res=(dis*amt)/100;
				double fin=amt-res;
				print.setText(fin+" Rs");
			}
		});
		result.setBounds(189, 207, 89, 45);
		panel.add(result);
		
		JLabel lblNetPrice = new JLabel("NET Price");
		lblNetPrice.setBounds(26, 302, 102, 35);
		panel.add(lblNetPrice);
		
		print = new JTextArea();
		print.setBounds(273, 302, 102, 35);
		panel.add(print);
	}

}
