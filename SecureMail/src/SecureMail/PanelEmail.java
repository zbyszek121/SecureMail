package SecureMail;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class PanelEmail extends JPanel {
	private JTextField TFfrom;
	private JTextField TFto;

	/**
	 * Create the panel.
	 */
	public PanelEmail() {
		setLayout(null);
		
		JLabel label = new JLabel("From:");
		label.setBounds(10, 14, 46, 14);
		add(label);
		
		JLabel label_1 = new JLabel("To:");
		label_1.setBounds(10, 39, 46, 14);
		add(label_1);
		
		TFfrom = new JTextField();
		TFfrom.setEditable(false);
		TFfrom.setColumns(10);
		TFfrom.setBounds(47, 11, 393, 20);
		add(TFfrom);
		
		TFto = new JTextField();
		TFto.setEditable(false);
		TFto.setColumns(10);
		TFto.setBounds(47, 36, 393, 20);
		add(TFto);
		
		JEditorPane TFcontent = new JEditorPane();
		TFcontent.setEditable(false);
		TFcontent.setBounds(10, 60, 430, 207);
		add(TFcontent);
		
		JButton BTre = new JButton("Re");
		BTre.setBounds(10, 269, 89, 23);
		add(BTre);
		
		JButton BTcancel = new JButton("Cancel");
		BTcancel.setBounds(351, 269, 89, 23);
		add(BTcancel);

	}

}
