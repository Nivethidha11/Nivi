package swing2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Swing1 {

	private JFrame frame;
	private JTextField s;
	private JTextField d;
	private JTextField txtDistanceCovered;
    private JTextArea print;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing1 window = new Swing1();
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
	public Swing1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblDistanceCalculator = new JLabel("Distance Calculator");
		lblDistanceCalculator.setBounds(139, 22, 127, 29);
		panel.add(lblDistanceCalculator);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setBounds(25, 74, 89, 28);
		panel.add(lblSource);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setBounds(25, 113, 89, 29);
		panel.add(lblDestination);
		
		s = new JTextField();
		s.setBounds(224, 78, 127, 20);
		panel.add(s);
		s.setColumns(10);
		
		d = new JTextField();
		d.setBounds(224, 117, 127, 20);
		panel.add(d);
		d.setColumns(10);
		
		JButton res = new JButton("Calculate");
		res.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String source=s.getText();
				String destination=d.getText();
				Double res=1.15*57;
				print.setText(res+" km");
			}
		});
		res.setBounds(139, 181, 105, 43);
		panel.add(res);
		
		txtDistanceCovered = new JTextField();
		txtDistanceCovered.setText("Distance Covered");
		txtDistanceCovered.setBounds(25, 275, 127, 20);
		panel.add(txtDistanceCovered);
		txtDistanceCovered.setColumns(10);
		
		print = new JTextArea();
		print.setBounds(234, 275, 117, 35);
		panel.add(print);
	}

}
