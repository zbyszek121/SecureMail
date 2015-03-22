package SecureMail;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class PanelLogin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8350130502373398238L;
	private JPasswordField TIpassword;

	/**
	 * Create the panel.
	 */
	public PanelLogin() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ucieklak Zbigniew - Secure Mail");
		lblNewLabel.setBounds(149, 11, 147, 14);
		add(lblNewLabel);
		
		JLabel lblHaslo = new JLabel("Password:");
		lblHaslo.setBounds(141, 66, 52, 14);
		add(lblHaslo);
		
		JButton BTlogin = new JButton("Confirm");
		BTlogin.setBounds(173, 90, 89, 23);
		add(BTlogin);
		
		JButton BTnewUser = new JButton("New User");
		BTnewUser.setBounds(149, 150, 147, 23);
		add(BTnewUser);
		
		TIpassword = new JPasswordField();
		TIpassword.setBounds(195, 63, 113, 20);
		add(TIpassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(141, 36, 52, 14);
		add(lblUsername);
		
		JComboBox CBusername = new JComboBox();
		CBusername.setBounds(195, 36, 113, 20);
		add(CBusername);

	}
}
