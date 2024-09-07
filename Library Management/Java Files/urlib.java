package urlibb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class urlib extends JFrame {

	private JPanel contentPane;
	public JTextField id1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					urlib frame = new urlib();
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
	public urlib() {
		setTitle("URLIB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(245, 245, 245)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel captn = new JLabel("A Library could show you everything");
		captn.setBounds(334, 27, 925, 64);
		captn.setFont(new Font("Castellar", Font.BOLD, 35));
		contentPane.add(captn);
		
		JLabel captn1 = new JLabel("if you know where to look...");
		captn1.setBounds(450, 101, 703, 64);
		captn1.setFont(new Font("Castellar", Font.BOLD, 32));
		contentPane.add(captn1);
		
		JPanel space = new JPanel();
		space.setBounds(511, 231, 488, 456);
		space.setBackground(SystemColor.menu);
		space.setForeground(new Color(0, 0, 0));
		space.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(211, 211, 211)));
		contentPane.add(space);
		space.setLayout(null);
		
		JLabel lgn = new JLabel("SIGN IN");
		lgn.setHorizontalAlignment(SwingConstants.CENTER);
		lgn.setFont(new Font("Corbel", Font.PLAIN, 35));
		lgn.setBounds(138, 34, 189, 64);
		space.add(lgn);
		
		id1 = new JTextField();
		
		id1.setFont(new Font("Cambria", Font.PLAIN, 18));
		id1.setBounds(175, 141, 242, 33);
		space.add(id1);
		id1.setColumns(10);
		
		JLabel nuser = new JLabel("new user??create ur id");
		nuser.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				reg jr=new reg();
				jr.setBounds(0, 0, 1920,1080);
				jr.setVisible(true);
				
			}
		});
		nuser.setForeground(new Color(100, 149, 237));
		nuser.setFont(new Font("Yu Gothic Light", Font.BOLD, 20));
		nuser.setBounds(27, 400, 311, 46);
		space.add(nuser);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Monospaced", Font.PLAIN, 20));
		passwordField.setBounds(175, 233, 242, 31);
		space.add(passwordField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(105, 105, 105)));
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(38, 108, 414, 271);
		space.add(panel);
		panel.setLayout(null);
		
		JLabel id = new JLabel("USERID:");
		id.setBounds(34, 38, 94, 26);
		panel.add(id);
		id.setFont(new Font("Eras Light ITC", Font.BOLD, 23));
		
		JLabel pwd = new JLabel("PASSWORD:");
		pwd.setBounds(10, 124, 148, 31);
		panel.add(pwd);
		pwd.setFont(new Font("Eras Light ITC", Font.BOLD, 22));
		
		JButton sgin = new JButton("login");
		sgin.setBackground(SystemColor.inactiveCaptionBorder);
		sgin.setBounds(132, 193, 146, 54);
		panel.add(sgin);
		sgin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String idd=;
				//String pdd=passwordField.getText();
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
					String query="select count(*) from users where u_id=? AND pwd=?";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,id1.getText());
					ps.setString(2,passwordField.getText());
					ResultSet rs=ps.executeQuery();
					rs.next();
					int count=rs.getInt(1);
					if(count==0)
					{
						JOptionPane.showMessageDialog(sgin,"invalid");
					}
					else
					{
						
						 setVisible(false);
		                  page2 jf=new page2();
		                  jf.setBounds(0, 0, 1920, 1080);
					      jf.setVisible(true);
					      JOptionPane.showMessageDialog(sgin,"Logged in");
					}	
						
						
					
					
					ps.close();
					con.close();
					id1.setText("");
					passwordField.setText("");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				  
			  
			  
			}
		});
		sgin.setFont(new Font("SimSun", Font.BOLD, 25));
		
		JLabel bbk = new JLabel("<-BACK");
		bbk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				front1 ft=new front1();
				ft.setBounds(0, 0, 1920, 1080);
				ft.setVisible(true);
			}
		});
		bbk.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		bbk.setForeground(SystemColor.activeCaption);
		bbk.setBounds(0, 699, 103, 33);
		contentPane.add(bbk);
		
		
		
	}
}
