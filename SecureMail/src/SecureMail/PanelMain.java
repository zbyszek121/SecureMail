package SecureMail;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class PanelMain extends JPanel {
	private JTextField TIfriendKey;
	private JTextField TIfriendName;

	/**
	 * Create the panel.
	 */
	public PanelMain() {
		setLayout(null);
		
		JLabel text1 = new JLabel("Emails:");
		text1.setBounds(10, 39, 46, 14);
		add(text1);
		
		JList LIemails = new JList();
		LIemails.setBounds(10, 260, 185, -194);
		add(LIemails);
		
		JLabel lblFriens = new JLabel("Friends:");
		lblFriens.setBounds(219, 39, 46, 14);
		add(lblFriens);
		
		JList LIFriends = new JList();
		LIFriends.setBounds(219, 232, 185, -166);
		add(LIFriends);
		
		JButton BTnewEmail = new JButton("New Email");
		BTnewEmail.setBounds(215, 11, 89, 23);
		add(BTnewEmail);
		
		JLabel lblKey = new JLabel("Key");
		lblKey.setBounds(219, 235, 18, 14);
		add(lblKey);
		
		TIfriendKey = new JTextField();
		TIfriendKey.setBounds(243, 232, 86, 20);
		add(TIfriendKey);
		TIfriendKey.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(336, 235, 46, 14);
		add(lblNewLabel);
		
		TIfriendName = new JTextField();
		TIfriendName.setBounds(364, 232, 86, 20);
		add(TIfriendName);
		TIfriendName.setColumns(10);
		
		JButton BTaddFriend = new JButton("Add Friend");
		BTaddFriend.setBounds(219, 260, 110, 23);
		add(BTaddFriend);
		
		JButton BTdeleteFriend = new JButton("Delete Friend");
		BTdeleteFriend.setBounds(334, 260, 106, 23);
		add(BTdeleteFriend);
		
		JButton BTdeleteEmail = new JButton("Delete Email");
		BTdeleteEmail.setBounds(10, 260, 91, 23);
		add(BTdeleteEmail);
		
		JButton BTdeleteAllEmails = new JButton("Delete All Emails");
		BTdeleteAllEmails.setBounds(106, 260, 110, 23);
		add(BTdeleteAllEmails);
		
		JRadioButton CBinpost = new JRadioButton("Inpost");
		CBinpost.setSelected(true);
		CBinpost.setBounds(6, 9, 57, 23);
		add(CBinpost);
		
		JRadioButton CBoutpost = new JRadioButton("Outpost");
		CBoutpost.setBounds(65, 9, 65, 23);
		add(CBoutpost);
		
		JButton BTcopyKey = new JButton("Copy your key");
		BTcopyKey.setBounds(315, 11, 125, 23);
		add(BTcopyKey);

	}
}
