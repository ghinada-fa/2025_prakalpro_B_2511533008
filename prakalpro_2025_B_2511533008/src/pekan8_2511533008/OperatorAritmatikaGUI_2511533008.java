package pekan8_2511533008;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OperatorAritmatikaGUI_2511533008 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533008 frame = new OperatorAritmatikaGUI_2511533008();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511533008() {
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(172, 210, 181));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(142, 11, 149, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setBounds(10, 50, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bilangan 2");
		lblNewLabel_1_1.setBounds(10, 75, 63, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Operator");
		lblNewLabel_1_2.setBounds(10, 128, 63, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(10, 178, 63, 14);
		contentPane.add(lblNewLabel_1_3);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(73, 47, 47, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setBounds(73, 72, 47, 20);
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(73, 124, 47, 22);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setEnabled(false);
		txtHasil.setEditable(false);
		txtHasil.setBounds(73, 175, 47, 20);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 harus diisi");
				} else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex(); //operator
						if (c==0) {
							hasil = a+b;
						}
						if (c==1) {
							hasil = a-b;
						}
						if (c==2) {
							hasil = a*b;
						}
						if (c==3) {
							hasil = a/b;
						}
						if (c==4) {
							hasil = a%b;
						}
					} catch (NumberFormatException ex) {
						pesanError("Bilangan 1 dan Bilangan 2 harus angka");
					}
				}
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		btnNewButton.setBounds(141, 124, 89, 23);
		contentPane.add(btnNewButton);

	}
}
