package pekan9_2511533008;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calculator_2511533008 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_2511533008 window = new calculator_2511533008();
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
	public calculator_2511533008() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 244, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField.setBounds(10, 11, 209, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("\uF0E7");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Backspace=null;
				if (textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					Backspace= str.toString();
					textField.setText(Backspace);
				}
			}
		});
		btnBackspace.setFont(new Font("Wingdings", Font.BOLD, 12));
		btnBackspace.setBounds(10, 97, 47, 36);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.setBounds(59, 97, 47, 36);
		frame.getContentPane().add(btnClear);
		
		JButton btn00 = new JButton("00");
		btn00.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setBounds(110, 97, 53, 36);
		frame.getContentPane().add(btn00);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation ="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPlus.setBounds(166, 96, 53, 36);
		frame.getContentPane().add(btnPlus);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setFont(new Font("Tahoma", Font.BOLD, 12));
		button7.setBounds(10, 144, 47, 36);
		frame.getContentPane().add(button7);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setFont(new Font("Tahoma", Font.BOLD, 12));
		button8.setBounds(59, 144, 47, 36);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button9.getText();
				textField.setText(number);
			}
		});
		button9.setFont(new Font("Tahoma", Font.BOLD, 12));
		button9.setBounds(110, 144, 53, 36);
		frame.getContentPane().add(button9);
		
		JButton btnMin = new JButton("-");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation ="-";
			}
		});
		btnMin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMin.setBounds(167, 143, 52, 36);
		frame.getContentPane().add(btnMin);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button4.setBounds(10, 191, 47, 36);
		frame.getContentPane().add(button4);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button5.setBounds(59, 191, 47, 36);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 12));
		button6.setBounds(110, 191, 53, 36);
		frame.getContentPane().add(button6);
		
		JButton btnKali = new JButton("*");
		btnKali.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation ="*";
			}
		});
		btnKali.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKali.setBounds(167, 191, 52, 36);
		frame.getContentPane().add(btnKali);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.setBounds(10, 238, 47, 36);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button2.setBounds(59, 238, 47, 36);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button3.setBounds(110, 238, 53, 36);
		frame.getContentPane().add(button3);
		
		JButton btnBagi = new JButton("/\r\n");
		btnBagi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation ="/";
			}
		});
		btnBagi.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBagi.setBounds(167, 238, 52, 36);
		frame.getContentPane().add(btnBagi);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setFont(new Font("Tahoma", Font.BOLD, 12));
		button0.setBounds(10, 285, 47, 36);
		frame.getContentPane().add(button0);
		
		JButton btnTitik = new JButton(".");
		btnTitik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnTitik.getText();
				textField.setText(number);
			}
		});
		btnTitik.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTitik.setBounds(59, 285, 47, 36);
		frame.getContentPane().add(btnTitik);
		
		JButton btnSamaDengan = new JButton("=");
		btnSamaDengan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer ;
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if  (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if  (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if  (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}else if  (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnSamaDengan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSamaDengan.setBounds(110, 285, 53, 36);
		frame.getContentPane().add(btnSamaDengan);
		
		JButton btnModulo = new JButton("%");
		btnModulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText(" ");
				operation ="%";
			}
		});
		btnModulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnModulo.setBounds(166, 285, 53, 36);
		frame.getContentPane().add(btnModulo);
	}
}
