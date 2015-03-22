package SecureMail;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelNewMail extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5061492271057515070L;
	private JTextField TIto;
	private JTextField TIfrom;

	/**
	 * Create the panel.
	 */
	public PanelNewMail() {
		setLayout(null);
		
		JLabel lblFrom = new JLabel("From:");
		lblFrom.setBounds(10, 11, 46, 14);
		add(lblFrom);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(10, 36, 46, 14);
		add(lblTo);
		
		JEditorPane TIcontent = new JEditorPane();
		TIcontent.setBounds(10, 57, 430, 207);
		add(TIcontent);
		
		TIto = new JTextField();
		TIto.setBounds(47, 33, 393, 20);
		add(TIto);
		TIto.setColumns(10);
		
		TIfrom = new JTextField();
		TIfrom.setBounds(47, 8, 393, 20);
		add(TIfrom);
		TIfrom.setColumns(10);
		
		JButton BTsend = new JButton("Send");
		BTsend.setBounds(10, 266, 89, 23);
		add(BTsend);
		
		JButton BTcancel = new JButton("Cancel");
		BTcancel.setBounds(351, 266, 89, 23);
		add(BTcancel);

	}
}
