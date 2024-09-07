package urlibb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class reg extends JFrame {

	private JPanel contentPane;
	//private JTextField nme;
	//private JTextField rgno;
	//private JTextField pno;
	//private JTextField email;
	//private JPasswordField PD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg frame = new reg();
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
	public reg() {
		setTitle("URLIB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1920, 1080);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new LineBorder(new Color(255, 240, 245), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(220, 220, 220)));
		panel.setBounds(537, 124, 463, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SIGN UP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(144, 42, 169, 22);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(220, 220, 220)));
		panel_1.setBounds(38, 111, 386, 364);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel uname = new JLabel("NAME:");
		uname.setFont(new Font("Tahoma", Font.PLAIN, 20));
		uname.setHorizontalAlignment(SwingConstants.CENTER);
		uname.setBounds(27, 52, 83, 28);
		panel_1.add(uname);
		
		JLabel reg = new JLabel("REG NO:");
		reg.setFont(new Font("Tahoma", Font.PLAIN, 20));
		reg.setBounds(38, 117, 86, 28);
		panel_1.add(reg);
		
		JTextField nme = new JTextField();
		nme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		nme.setBounds(151, 51, 197, 33);
		panel_1.add(nme);
		nme.setColumns(10);
		
		JTextField rgno = new JTextField();
		rgno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rgno.setColumns(10);
		rgno.setBounds(151, 116, 197, 33);
		panel_1.add(rgno);
		
		JLabel phno = new JLabel("PHONE NO:");
		phno.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phno.setBounds(27, 185, 106, 28);
		panel_1.add(phno);
		
		JTextField pno = new JTextField();
		pno.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pno.setColumns(10);
		pno.setBounds(151, 180, 197, 33);
		panel_1.add(pno);
		
		JLabel emil = new JLabel("EMAIL ID:");
		emil.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emil.setBounds(27, 247, 97, 28);
		panel_1.add(emil);
		
		JTextField email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email.setColumns(10);
		email.setBounds(151, 247, 197, 33);
		panel_1.add(email);
		
		JLabel psd = new JLabel("CREATE PWD:");
		psd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		psd.setBounds(10, 309, 128, 28);
		panel_1.add(psd);
		
		JPasswordField PD = new JPasswordField();
		PD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		PD.setBounds(151, 309, 197, 28);
		panel_1.add(PD);
		
		JButton register = new JButton("REGISTER");
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
					String query="insert into users values(?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1, rgno.getText());
					ps.setString(2, nme.getText());
					ps.setString(3, pno.getText());
					ps.setString(4, email.getText());
					ps.setInt(5,0);
					ps.setInt(6,0);
					ps.setString(7,PD.getText());
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(register,i+"registered");
					ps.close();
					con.close();
					rgno.setText("");
					 nme.setText("");
			           pno.setText("");
				      email.setText("");
				      PD.setText("");
				      
					
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				setVisible(false);
				urlib jf=new urlib();
				jf.setVisible(true);
			}
		});
		register.setBackground(new Color(240, 248, 255));
		register.setFont(new Font("Serif", Font.PLAIN, 20));
		register.setBounds(165, 498, 148, 47);
		panel.add(register);
		JLabel bbk = new JLabel("<-BACK");
		bbk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				urlib ft=new urlib();
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
