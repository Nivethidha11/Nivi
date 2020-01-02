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

public class swing3 {

	private JFrame frame;
	private JTextField d;
	private JTextField p;
	private JTextArea print;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing3 window = new swing3();
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
	public swing3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 394);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mileage Calculator");
		lblNewLabel.setBounds(189, 11, 149, 25);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance in km");
		lblNewLabel_1.setBounds(27, 72, 157, 17);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Petrol Consumed in litre");
		lblNewLabel_2.setBounds(27, 126, 157, 17);
		panel.add(lblNewLabel_2);
		
		d = new JTextField();
		d.setBounds(346, 72, 86, 20);
		panel.add(d);
		d.setColumns(10);
		
		p = new JTextField();
		p.setBounds(346, 126, 86, 20);
		panel.add(p);
		p.setColumns(10);
		
		JButton result = new JButton("Calculate Mileage");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int distance=Integer.parseInt(d.getText());
				int petrol=Integer.parseInt(p.getText());
				int ans=distance/petrol;
				print.setText(ans+" ");
				
			}
		});
		result.setBounds(210, 180, 128, 42);
		panel.add(result);
		
		lblNewLabel_3 = new JLabel("Mileage per litre");
		lblNewLabel_3.setBounds(27, 264, 157, 28);
		panel.add(lblNewLabel_3);
		
		print = new JTextArea();
		print.setBounds(346, 264, 86, 31);
		panel.add(print);
	}

}
