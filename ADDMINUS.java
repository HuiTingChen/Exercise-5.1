import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ADDMINUS {

	private JFrame frame;
	private JTextField num1textField;
	private JTextField num2textField;
	private JTextField AnswertextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ADDMINUS window = new ADDMINUS();
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
	public ADDMINUS() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 674, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton ADDButton = new JButton("ADD");
		ADDButton.setForeground(Color.WHITE);
		ADDButton.setBackground(Color.GRAY);
		ADDButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ADDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					  int num1 = Integer.parseInt(num1textField.getText());
					  int num2 = Integer.parseInt(num2textField.getText());
					  
					  int answer = num1 + num2;
					  
					  AnswertextField.setText(Integer.toString(answer));
					  
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a whole number.");
				}
			}
		});
		ADDButton.setBounds(160, 176, 122, 33);
		frame.getContentPane().add(ADDButton);
		
		JButton MINUSButton = new JButton("MINUS");
		MINUSButton.setForeground(Color.WHITE);
		MINUSButton.setBackground(Color.GRAY);
		MINUSButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					  int num1 = Integer.parseInt(num1textField.getText());
					  int num2 = Integer.parseInt(num2textField.getText());
					  
					  int answer = num1 - num2;
					  
					  AnswertextField.setText(Integer.toString(answer));
					  
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter a whole number.");
				}
			}
			
		});
		MINUSButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		MINUSButton.setBounds(360, 176, 122, 33);
		frame.getContentPane().add(MINUSButton);
		
		num1textField = new JTextField();
		num1textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		num1textField.setBounds(160, 121, 122, 33);
		frame.getContentPane().add(num1textField);
		num1textField.setColumns(10);
		
		num2textField = new JTextField();
		num2textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		num2textField.setColumns(10);
		num2textField.setBounds(360, 121, 122, 33);
		frame.getContentPane().add(num2textField);
		
		JLabel AnswerLabel = new JLabel("The Answer is");
		AnswerLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		AnswerLabel.setBounds(183, 260, 186, 33);
		frame.getContentPane().add(AnswerLabel);
		
		AnswertextField = new JTextField();
		AnswertextField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		AnswertextField.setColumns(10);
		AnswertextField.setBounds(343, 261, 122, 33);
		frame.getContentPane().add(AnswertextField);
	}

}
