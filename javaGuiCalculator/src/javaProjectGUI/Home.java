package javaProjectGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;

public class Home {

	private JFrame frame;
	private JLabel firstLabelMessage;
	private JTextField inputFirst;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField inputSecond;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_2;
	int inputFirstNumber,inputSecondNumber, Sum;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home window = new Home();
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
	public Home() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(10, -39, 893, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		inputFirst = new JTextField();
		
		inputFirst.setBounds(426, 70, 129, 31);
		frame.getContentPane().add(inputFirst);
		inputFirst.setColumns(10);
		
		JButton btnNewButton = new JButton("Addition");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				inputFirstNumber = Integer.parseInt(inputFirst.getText());
				inputSecondNumber = Integer.parseInt(inputSecond.getText());
				
				
				
				
				Sum =inputFirstNumber + inputSecondNumber;
			
				
				//JOptionPane.showMessageDialog(null, "Hi Pritam You Are Doing Great");
				firstLabelMessage.setText(Integer.toString(Sum));
				
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(213, 174, 114, 39);
		frame.getContentPane().add(btnNewButton);
		
		firstLabelMessage = new JLabel("");
		firstLabelMessage.setHorizontalAlignment(SwingConstants.CENTER);
		firstLabelMessage.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		firstLabelMessage.setBounds(239, 255, 399, 55);
		frame.getContentPane().add(firstLabelMessage);
		
		lblNewLabel = new JLabel("Enter First Number");
		lblNewLabel.setBounds(260, 72, 156, 27);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Enter Second Number");
		lblNewLabel_1.setBounds(260, 116, 156, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		inputSecond = new JTextField();
		inputSecond.setBounds(426, 112, 129, 31);
		frame.getContentPane().add(inputSecond);
		inputSecond.setColumns(10);
		
		btnNewButton_1 = new JButton("Substraction");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				inputFirstNumber = Integer.parseInt(inputFirst.getText());
				inputSecondNumber = Integer.parseInt(inputSecond.getText());
				
				
				
					Sum = inputFirstNumber - inputSecondNumber;
						
				//JOptionPane.showMessageDialog(null, "Hi Pritam You Are Doing Great");
				firstLabelMessage.setText(Integer.toString(Sum));
				
			}
		});
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBounds(381, 174, 114, 39);
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Multiplication");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				inputFirstNumber = Integer.parseInt(inputFirst.getText());
				inputSecondNumber = Integer.parseInt(inputSecond.getText());
				
				
				
					Sum = inputFirstNumber * inputSecondNumber;
						
				//JOptionPane.showMessageDialog(null, "Hi Pritam You Are Doing Great");
				firstLabelMessage.setText(Integer.toString(Sum));
				
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setBounds(545, 174, 114, 39);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				inputFirstNumber = Integer.parseInt(inputFirst.getText());
				inputSecondNumber = Integer.parseInt(inputSecond.getText());
				
				
				
					Sum = inputFirstNumber / inputSecondNumber;
						
				//JOptionPane.showMessageDialog(null, "Hi Pritam You Are Doing Great");
				firstLabelMessage.setText(Integer.toString(Sum));
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(213, 243, 114, 39);
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Modulus");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				inputFirstNumber = Integer.parseInt(inputFirst.getText());
				inputSecondNumber = Integer.parseInt(inputSecond.getText());
				
				
				
					Sum = inputFirstNumber % inputSecondNumber;
						
				//JOptionPane.showMessageDialog(null, "Hi Pritam You Are Doing Great");
				firstLabelMessage.setText(Integer.toString(Sum));
				
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.DARK_GRAY);
		btnNewButton_4.setBounds(545, 243, 114, 39);
		frame.getContentPane().add(btnNewButton_4);
		
		lblNewLabel_2 = new JLabel("Your Answer is");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(239, 224, 399, 39);
		frame.getContentPane().add(lblNewLabel_2);
		
		
	}
}
