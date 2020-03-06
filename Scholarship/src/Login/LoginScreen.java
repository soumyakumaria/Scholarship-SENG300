package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class LoginScreen {

	private JFrame frame;
	private JLabel lblEmergingUniversity;
	private JTextField textField;
	private JLabel lblUsername;
	private JPasswordField passwordField;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
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
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 128));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblEmergingUniversity = new JLabel("Emerging University");
		lblEmergingUniversity.setForeground(new Color(0, 0, 128));
		lblEmergingUniversity.setFont(new Font("Sitka Text", Font.PLAIN, 28));
		lblEmergingUniversity.setBounds(81, 13, 302, 58);
		frame.getContentPane().add(lblEmergingUniversity);
		
		textField = new JTextField();
		textField.setBounds(156, 84, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblUsername = new JLabel("Username:");
		lblUsername.setBounds(52, 87, 92, 16);
		frame.getContentPane().add(lblUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(156, 117, 116, 22);
		frame.getContentPane().add(passwordField);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(52, 131, 77, 16);
		frame.getContentPane().add(lblPassword);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String realUsr = "Soumya";
				String realPass="Seng2020";
				String inputUsr = textField.getText();
				String inputPss =  	passwordField.getText();
				if(realUsr.contentEquals(inputUsr) && realPass.contains(inputPss)) {
					JOptionPane.showMessageDialog(null, "the username and password are valid");
				}
				else {
					JOptionPane.showMessageDialog(null, "the username and password are invalid");
					
				}
				
			}
		});
		btnLogin.setBounds(156, 152, 116, 25);
		frame.getContentPane().add(btnLogin);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(310, 84, 110, 123);
		frame.getContentPane().add(lblNewLabel);
		ImageIcon img =new ImageIcon(this.getClass().getResource("/da58fd2d-2682-456a-a827-54e4b2dea8bd_200x200.png").getFile());
		lblNewLabel.setIcon(img);
	}
}
