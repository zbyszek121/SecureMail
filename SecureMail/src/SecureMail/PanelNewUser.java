package SecureMail;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PanelNewUser extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7962679739454074006L;
	private JTextField textField;
	private JTextField TIusername;
	private JPasswordField TIpassword;
	private JPasswordField TIpassword2;

	/**
	 * Create the panel.
	 */
	public PanelNewUser() {
		setLayout(null);
		
		JLabel label1 = new JLabel("New User");
		label1.setBounds(10, 11, 46, 14);
		add(label1);
		
		JLabel lblYourPublicKey = new JLabel("Your public key:");
		lblYourPublicKey.setBounds(20, 38, 76, 14);
		add(lblYourPublicKey);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(100, 35, 150, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(44, 69, 52, 14);
		add(lblUsername);
		
		TIusername = new JTextField();
		TIusername.setBounds(100, 66, 86, 20);
		add(TIusername);
		TIusername.setColumns(10);
		
		TIpassword = new JPasswordField();
		TIpassword.setBounds(100, 97, 86, 20);
		add(TIpassword);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(44, 100, 52, 14);
		add(lblPassword);
		
		TIpassword2 = new JPasswordField();
		TIpassword2.setBounds(100, 128, 86, 20);
		add(TIpassword2);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password:");
		lblConfirmPassword.setBounds(10, 131, 96, 14);
		add(lblConfirmPassword);
		
		JButton BTconfirm = new JButton("Confirm");
		BTconfirm.setBounds(7, 156, 89, 23);
		add(BTconfirm);
		
		JButton BTcancel = new JButton("Cancel");
		BTcancel.setBounds(100, 156, 89, 23);
		add(BTcancel);

	}

}
