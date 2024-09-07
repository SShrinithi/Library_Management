package urlibb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
					frame.setBounds(0, 0, 1920,1080);
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
	public admin() {
		setTitle("URLIB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1469, 804);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(216, 191, 216)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel bkkl = new JLabel("<-BACK");
		bkkl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				front1 af=new front1();
				af.setBounds(0,0,1920,1080);
				af.setVisible(true);
			}
		});
		bkkl.setForeground(SystemColor.activeCaption);
		bkkl.setFont(new Font("Monospaced", Font.PLAIN, 20));
		bkkl.setBounds(10, 10, 102, 33);
		contentPane.add(bkkl);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel.setBounds(499, 241, 517, 316);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ADMIN  ID:");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblNewLabel.setBounds(43, 78, 134, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD:");
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(43, 162, 134, 50);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField.setBounds(187, 80, 253, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				adpage adp=new adpage();
				adp.setBounds(0, 0, 1920, 1080);
				adp.setVisible(true);
				JOptionPane.showMessageDialog(btnNewButton,"LOGGED IN");
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		btnNewButton.setBounds(187, 237, 142, 50);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(187, 162, 253, 41);
		panel.add(passwordField);
	}
}
