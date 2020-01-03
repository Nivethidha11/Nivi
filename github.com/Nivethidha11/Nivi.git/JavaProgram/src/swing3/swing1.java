package swing3;

import java.awt.EventQueue;
import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class swing1 {

	private JFrame frame;
	private JTextField name1;
	private JTextField t1;
	private JTextField name2;
	private JTextField t2;
	private JCheckBox c1;
	private JCheckBox c2;
	private JCheckBox c3;
	private JCheckBox c4;
	private JCheckBox c5;
	private JCheckBox c6;
	private JCheckBox c7;
	private JCheckBox c8;
	private JCheckBox c9;
	private JCheckBox c10;
	private JCheckBox c11;
	private JCheckBox c12;
	private JCheckBox pc1;
	private double discount;
	private JPanel panel_3;
	private Button result;
	private JTextArea print;
	private JCheckBox pc4;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing1 window = new swing1();
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
	public swing1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		discount = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(35, 134, 160, 257);
		panel_1.setBackground(Color.PINK);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		c1 = new JCheckBox("New check box");
		c1.setBounds(45, 7, 25, 23);
		panel_1.add(c1);
		c1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"1":"");
			}
		});

		c2 = new JCheckBox("New check box");
		c2.setBounds(98, 7, 25, 23);
		panel_1.add(c2);
		c2.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"2":"");
			}
		});
		
		c3 = new JCheckBox("New check box");
		c3.setBounds(45, 46, 25, 23);
		panel_1.add(c3);
		c3.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"3":"");
			}
		});

		c4 = new JCheckBox("New check box");
		c4.setBounds(98, 46, 25, 23);
		panel_1.add(c4);
		c4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"4":"");
			}
		});
		
		c5 = new JCheckBox("New check box");
		c5.setBounds(45, 88, 25, 23);
		panel_1.add(c5);
		c5.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"5":"");
			}
		});

		c6 = new JCheckBox("New check box");
		c6.setBounds(98, 88, 25, 23);
		panel_1.add(c6);
		c6.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"6":"");
			}
		});

		c7 = new JCheckBox("New check box");
		c7.setBounds(45, 129, 25, 23);
		panel_1.add(c7);
		c7.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"7":"");
			}
		});
		
		

		
		
		c8 = new JCheckBox("New check box");
		c8.setBounds(98, 129, 25, 23);
		panel_1.add(c8);
		c8.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"8":"");
			}
		});
		
		c9 = new JCheckBox("New check box");
		c9.setBounds(45, 169, 25, 23);
		panel_1.add(c9);
		c9.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"9":"");
			}
		});
		
		c10 = new JCheckBox("New check box");
		c10.setBounds(98, 169, 25, 23);
		panel_1.add(c10);
		c10.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"10":"");
			}
		});

		c11 = new JCheckBox("New check box");
		c11.setBounds(45, 209, 25, 23);
		panel_1.add(c11);
		c11.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t1.setText(e.getStateChange()==1?"11":"");
			}
		});

		c12 = new JCheckBox("New check box");
		c12.setBounds(98, 209, 25, 23);
		panel_1.add(c12);
		c12.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				t2.setText(e.getStateChange()==1?"12":"");
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(261, 134, 215, 122);
		panel_2.setBackground(Color.CYAN);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 11, 46, 14);
		panel_2.add(lblName);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(10, 43, 46, 14);
		panel_2.add(lblDob);
		
		pc1 = new JCheckBox("Physically Disabled");
		pc1.setBounds(6, 65, 152, 23);
		panel_2.add(pc1);
		pc1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				discount = Double.parseDouble((e.getStateChange()==1?"400":""));
			}
		});
		

		
		
		
		JLabel lblSeatNo = new JLabel("Seat NO:");
		lblSeatNo.setBounds(10, 97, 46, 14);
		panel_2.add(lblSeatNo);
		
		name1 = new JTextField();
		name1.setBounds(102, 8, 86, 20);
		panel_2.add(name1);
		name1.setColumns(10);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(102, 95, 86, 20);
		panel_2.add(t1);
		
		JDateChooser d1 = new JDateChooser();
		d1.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			}
		});
		d1.setBounds(102, 37, 91, 20);
		panel_2.add(d1);
		
		JLabel lblBookingDetails = new JLabel("Booking Tickets");
		lblBookingDetails.setBounds(308, 11, 119, 23);
		panel.add(lblBookingDetails);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(547, 316, 4, 22);
		panel.add(textArea_1);
		
		JLabel lblSeats = new JLabel("Seats");
		lblSeats.setBounds(57, 72, 77, 34);
		panel.add(lblSeats);
		
		JLabel lblBookingDetail = new JLabel("Booking Detail");
		lblBookingDetail.setBounds(308, 72, 108, 34);
		panel.add(lblBookingDetail);
		
		panel_3 = new JPanel();
		panel_3.setBounds(261, 269, 215, 122);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.CYAN);
		panel.add(panel_3);
		
		JLabel label = new JLabel("Name");
		label.setBounds(10, 11, 46, 14);
		panel_3.add(label);
		
		JLabel label_1 = new JLabel("DOB");
		label_1.setBounds(10, 43, 46, 14);
		panel_3.add(label_1);
		
		
		
		JLabel label_2 = new JLabel("Seat NO:");
		label_2.setBounds(10, 97, 46, 14);
		panel_3.add(label_2);
		
		name2 = new JTextField();
		name2.setColumns(10);
		name2.setBounds(102, 8, 86, 20);
		panel_3.add(name2);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(102, 95, 86, 20);
		panel_3.add(t2);
		
		JDateChooser d2 = new JDateChooser();
		d2.setBounds(97, 37, 91, 20);
		panel_3.add(d2);
		
		pc4 = new JCheckBox("Physically Disabled");
		pc4.setBounds(10, 67, 152, 23);
		panel_3.add(pc4);
		pc4.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				discount = Double.parseDouble((e.getStateChange()==1?"400":""));
			}
		});
		

		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(509, 133, 184, 258);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		print = new JTextArea();
		print.setBounds(10, 11, 164, 201);
		panel_4.add(print);
		
		result = new Button("Print");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
																																											
				double price=1650.80-discount;
				
				print.setText("COST    750 Rs.\n"+"NOS    2\n "+"TOTAL    1500 Rs.\n"+"DISCOUNT    -"+discount+"Rs.\n"+"GST    +150.80 Rs.\n"+"\nNET PRICE    "+price+"Rs.");
			}
		});
		result.setBounds(55, 226, 70, 22);
		panel_4.add(result);
	}
}
