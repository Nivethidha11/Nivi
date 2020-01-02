package Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Swing1 {

	private JFrame frame;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t1;
	private JRadioButton m;
	private JRadioButton f;
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
		frame.setBounds(100, 100, 755, 635);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUserApplicationForm = new JLabel("User Application Form");
		lblUserApplicationForm.setBounds(132, 11, 131, 14);
		panel.add(lblUserApplicationForm);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setBounds(38, 68, 103, 21);
		panel.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name\r\n");
		lblLastName.setBounds(38, 103, 103, 21);
		panel.add(lblLastName);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(38, 139, 103, 21);
		panel.add(lblDob);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setBounds(38, 177, 103, 21);
		panel.add(lblMobileNumber);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(38, 209, 103, 21);
		panel.add(lblGender);
		
		JLabel lblEmailId = new JLabel("E-mail ID");
		lblEmailId.setBounds(38, 241, 103, 21);
		panel.add(lblEmailId);
		
		JButton result = new JButton("Submit");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String firstname=t1.getText();
				String lastname=t2.getText();
				String dob=t3.getText();
				String mobile=t4.getText();
				String gender;
				if(m.isSelected())
				{
					gender="Male";
				}
				else
				{
					gender="Female";
				}
				String mail=t5.getText();
				print.setText("Registration Successfull!! Your details are:"+"\n"+"First Name\t"+firstname+"\n"+"Last Name\t"+lastname+"\n"+"Date of Birth\t"+dob+"\n"+"Mobile\t"+mobile+"\n"+"Gender\t"+gender+"\n"+"Email ID\t"+mail);
			}
		});
		result.setBounds(261, 275, 89, 41);
		panel.add(result);
		
		print = new JTextArea();
		print.setBounds(10, 327, 741, 258);
		panel.add(print);
		
		t2 = new JTextField();
		t2.setBounds(405, 103, 240, 21);
		panel.add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(405, 139, 240, 20);
		panel.add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(405, 177, 240, 20);
		panel.add(t4);
		t4.setColumns(10);
		
		 m = new JRadioButton("M");
		m.setBounds(405, 208, 109, 23);
		panel.add(m);
		
		 f = new JRadioButton("F");
		f.setBounds(536, 208, 109, 23);
		panel.add(f);
		
		t5 = new JTextField();
		t5.setBounds(405, 241, 240, 20);
		panel.add(t5);
		t5.setColumns(10);
		
		t1 = new JTextField();
		t1.setBounds(405, 68, 240, 20);
		panel.add(t1);
		t1.setColumns(10);
	}

}
