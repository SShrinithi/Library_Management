package urlibb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.JLayeredPane;
import java.sql.*;
public class front1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					front1 frame = new front1();
					frame.setBounds(0,0,1920,1080);
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
	public front1() {
		setTitle("URLIB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1447, 792);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(216, 191, 216)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tit = new JLabel("UR LIB");
		tit.setHorizontalAlignment(SwingConstants.CENTER);
		tit.setFont(new Font("SansSerif", Font.ITALIC, 60));
		tit.setForeground(new Color(255, 204, 102));
		tit.setBounds(469, 101, 586, 148);
		contentPane.add(tit);
		
		JLabel stud = new JLabel("");
		stud.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				urlib js=new urlib();
				js.setBounds(0,0,1920,1080);
				js.setVisible(true);
			}
		});
		stud.setHorizontalAlignment(SwingConstants.CENTER);
		stud.setIcon(new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\urlibb\\urlibb\\ad7.png"));
		stud.setBounds(865, 302, 406, 264);
		contentPane.add(stud);
		
		JLabel adm = new JLabel("");
		adm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				admin jl=new admin();
				jl.setBounds(0,0,1920,1080);
				jl.setVisible(true);
			}
		});
		adm.setIcon(new ImageIcon("C:\\Users\\admin\\eclipse-workspace\\urlibb\\urlibb\\ad8.jpeg"));
		adm.setBounds(354, 315, 274, 233);
		contentPane.add(adm);
	}
}
