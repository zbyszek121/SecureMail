package SecureMail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Window.Type;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setEnabled(false);
		menuBar.add(mnFile);
		
		JMenuItem mntmSaveToFile = new JMenuItem("Save to file");
		mnFile.add(mntmSaveToFile);
		
		JMenuItem mntmLoadFromFile = new JMenuItem("Load from file");
		mnFile.add(mntmLoadFromFile);
		
		JMenu mnNewMenu = new JMenu("Emails");
		mnNewMenu.setEnabled(false);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewEmail = new JMenuItem("New Email");
		mnNewMenu.add(mntmNewEmail);
		
		JMenu mnActions = new JMenu("Actions");
		mnActions.setEnabled(false);
		menuBar.add(mnActions);
		
		JMenuItem mntmCheckNewEmails = new JMenuItem("Check new Emails");
		mnActions.add(mntmCheckNewEmails);
		
		JMenuItem mntmSaveToDb = new JMenuItem("Save to DB");
		mnActions.add(mntmSaveToDb);
		
		JMenuItem mntmLoadFromDb = new JMenuItem("Load from DB");
		mnActions.add(mntmLoadFromDb);
		
		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnAbout.add(mntmAbout);
		
		JMenuItem mntmLogout = new JMenuItem("Exit");
		menuBar.add(mntmLogout);
	}

}
