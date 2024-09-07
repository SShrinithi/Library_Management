package urlibb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.PopupMenu;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import javax.swing.UIManager;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.sql.ResultSet;
import javax.swing.JTable;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.*;
import java.awt.event.MouseMotionAdapter;


public class page2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
    private JLayeredPane layeredPane;
  
    private JTextField textField_1;
    private JTextField uid;
    private JTextField bidd;
    private JTextField uiid;
    private JTextField be;
    private JTextField athrr;
    private JTextField pr;
    private JTextField eno;
    private JTextField qqt;
    private JPanel panel_1;
    private JLabel biii;
    private JLabel bnnn;
    private JLabel ppp;
    private JLabel eeee;
    private JLabel qqqq;
    private JLabel flll;
    private JLabel shhhh;
    private JLabel lblBname;
    private JLabel  lblAuthor;
    private JLabel lblBname_1_1;
    private JLabel lblBname_1_1_1;
    private JLabel lblBname_1_1_1_1;
    private JLabel lblBname_1_1_1_1_1;
    private JLabel lblBname_1_1_1_1_1_1 ;
    private JTextField textField;
    private String renee;
    private String dd;
    private String cc;
    private JLabel n;
     String cur,du;
     private JLabel d;
    
    
    
    
    //private JLabel bkn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					page2 frame = new page2();
					frame.setBounds(0,0,1920,1080);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 public void switchPanels(JPanel panel)
	 {
		 //Component layeredPane;	 
		 layeredPane.removeAll();
		 layeredPane.add(panel);
		 layeredPane.repaint();
		 layeredPane.revalidate();
	 }
	

	/**
	 * Create the frame.
	 */
	public page2() {
		setTitle("urlib");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1467, 779);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new LineBorder(new Color(216, 191, 216), 3, true));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		 layeredPane = new JLayeredPane();
		layeredPane.setBackground(Color.WHITE);
		layeredPane.setBounds(316, 85, 1076, 612);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel def = new JPanel();
		
			
		
		
		def.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(245, 245, 245)));
		def.setBackground(new Color(230, 230, 250));
		layeredPane.add(def, "name_42730850507500");
		def.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("WELCOME!!!");
		lblNewLabel_4.setFont(new Font("Ink Free", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(422, 204, 264, 150);
		def.add(lblNewLabel_4);
		
		
		JPanel aall = new JPanel();
		aall.setBackground(new Color(248, 248, 255));
		aall.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
		layeredPane.add(aall, "name_15596491007200");
		aall.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("check your desired book availability here!!!");
		lblNewLabel.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(26, 31, 529, 38);
		aall.add(lblNewLabel);
		
		 panel_1 = new JPanel();
		panel_1.setBounds(95, 351, 869, 238);
		aall.add(panel_1);
		panel_1.setLayout(null);
		biii = new JLabel("");
		biii.setFont(new Font("Tahoma", Font.PLAIN, 25));
		biii.setBounds(366, 10, 408, 35);
		panel_1.add(biii);
		
		 bnnn = new JLabel("");
		bnnn.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bnnn.setBounds(119, 79, 156, 35);
		panel_1.add(bnnn);
		
		 ppp = new JLabel("");
		ppp.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ppp.setBounds(154, 160, 123, 35);
		panel_1.add(ppp);
		
		 eeee = new JLabel("");
		eeee.setFont(new Font("Tahoma", Font.PLAIN, 25));
		eeee.setBounds(439, 79, 123, 35);
		panel_1.add(eeee);
		
		 qqqq = new JLabel("");
		qqqq.setFont(new Font("Tahoma", Font.PLAIN, 25));
		qqqq.setBounds(402, 160, 123, 35);
		panel_1.add(qqqq);
		
		 flll = new JLabel("");
		flll.setFont(new Font("Tahoma", Font.PLAIN, 25));
		flll.setBounds(739, 79, 123, 35);
		panel_1.add(flll);
		
	 shhhh = new JLabel("");
		shhhh.setFont(new Font("Tahoma", Font.PLAIN, 25));
		shhhh.setBounds(739, 160, 123, 35);
		panel_1.add(shhhh);
		lblBname = new JLabel("");
		lblBname.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname.setBounds(277, 10, 123, 35);
		panel_1.add(lblBname);
		
		 lblAuthor = new JLabel("");
		lblAuthor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAuthor.setBounds(21, 79, 123, 35);
		panel_1.add(lblAuthor);
		
		 lblBname_1_1 = new JLabel("");
		lblBname_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname_1_1.setBounds(21, 160, 123, 35);
		panel_1.add(lblBname_1_1);
		
		 lblBname_1_1_1 = new JLabel("");
		lblBname_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname_1_1_1.setBounds(350, 79, 123, 35);
		panel_1.add(lblBname_1_1_1);
		
	lblBname_1_1_1_1 = new JLabel("");
		lblBname_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname_1_1_1_1.setBounds(350, 160, 123, 35);
		panel_1.add(lblBname_1_1_1_1);
		
		 lblBname_1_1_1_1_1 = new JLabel("");
		lblBname_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname_1_1_1_1_1.setBounds(633, 79, 123, 35);
		panel_1.add(lblBname_1_1_1_1_1);
		
	 lblBname_1_1_1_1_1_1 = new JLabel("");
	lblBname_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblBname_1_1_1_1_1_1.setBounds(633, 160, 123, 35);
		panel_1.add(lblBname_1_1_1_1_1_1);
		
		JLabel ct = new JLabel("");
		ct.setBounds(493, 312, 94, 50);
		aall.add(ct);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(SystemColor.inactiveCaptionBorder);
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				    
				
			    JLabel lblNewLabel_3 = new JLabel("enter book name:");
				lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
				lblNewLabel_3.setBounds(330, 176, 198, 44);
				aall.add(lblNewLabel_3);
				JTextField bbne = new JTextField();
				bbne.setFont(new Font("Sitka Text", Font.PLAIN, 20));
				bbne.setBounds(500, 178, 272, 38);
				aall.add(bbne);
				bbne.setColumns(10);
				JButton etr = new JButton("ENTER");
				etr.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
							String queryy="select count(*)from books where bname=?";
							PreparedStatement pss=con.prepareStatement(queryy);
							pss.setString(1,bbne.getText());
							ResultSet rss=pss.executeQuery();
							    rss.next();
							    String count=rss.getString("count(*)");
							    ct.setText(count);
							//int i=pss.executeUpdate();
							if(count!="0")
							{
							try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
							String query="select bname,author,publisher,ed_no,qty,floor_no,shelf_no from books where bname=?";
							PreparedStatement ps=conn.prepareStatement(query);
							ps.setString(1,bbne.getText());
							ResultSet rs=ps.executeQuery();
						    while(rs.next())
						    {
						    	lblBname.setText("bname:");
							      lblAuthor.setText("Author:");;
							    lblBname_1_1.setText("publisher:");;
							  lblBname_1_1_1.setText("ed_no:");;
							    lblBname_1_1_1_1.setText("qty:");;
							  lblBname_1_1_1_1_1.setText("floor_no:");;
							    lblBname_1_1_1_1_1_1.setText("shelf_no:"); 
						    	biii.setText(rs.getString("bname"));
						    	bnnn.setText(rs.getString("author"));
						    	ppp.setText(rs.getString("publisher"));
						    	eeee.setText(rs.getString("ed_no"));
						    	qqqq.setText(rs.getString("qty"));
						    	flll.setText(rs.getString("floor_no"));
						    	shhhh.setText(rs.getString("shelf_no"));
						    }	
						    
						    
						    ps.close();
							conn.close();
							}
							catch (Exception e1) {
								  
								// TODO Auto-generated catch block
								e1.printStackTrace();
							    }
							}
							
							 //if(count!="1")
							if(count.contentEquals("0"))
							{
								JOptionPane.showMessageDialog(etr,"Currently book not available");
							}
							pss.close();
							con.close();
						}
						   catch (Exception e1) {
							  
							// TODO Auto-generated catch block
							e1.printStackTrace();
						    }
						
				    	
					}
				});
				etr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
				etr.setBackground(SystemColor.menu);
				etr.setBounds(449, 269, 140, 47);
				aall.add(etr);
				
				
			}
		});
		comboBox.setFont(new Font("Eras Light ITC", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Computer science ", "Electronics and electrics", "Mechanical", "Chemical ", "Bio-tech", "Mathematics", "Law and rules", "General knowledge", "Fiction and non-fiction"}));
		comboBox.setMaximumRowCount(10);
		comboBox.setBounds(318, 90, 364, 38);
		aall.add(comboBox);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel rene = new JPanel();
		rene.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		rene.setBackground(new Color(248, 248, 255));
		layeredPane.add(rene, "name_15678909663200");
		rene.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Renewal");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(55, 26, 256, 46);
		rene.add(lblNewLabel_1);
		
		JLabel userid = new JLabel("User ID:");
		userid.setHorizontalAlignment(SwingConstants.CENTER);
		userid.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		userid.setBounds(80, 98, 164, 35);
		rene.add(userid);
		
		JLabel bid = new JLabel("Book ID:");
		bid.setHorizontalAlignment(SwingConstants.CENTER);
		bid.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		bid.setBounds(80, 183, 164, 35);
		rene.add(bid);
		
		uid = new JTextField();
		uid.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		uid.setBounds(264, 97, 309, 35);
		rene.add(uid);
		uid.setColumns(10);
		
		bidd = new JTextField();
		bidd.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		bidd.setColumns(10);
		bidd.setBounds(264, 182, 309, 35);
		rene.add(bidd);
		JLabel ig = new JLabel("");
		ig.setIcon(new ImageIcon("C:\\Users\\admin\\Desktop\\urlib\\bbk.png"));
		ig.setBounds(736, 44, 288, 335);
		rene.add(ig);
		
		JLabel lblNewLabel_5 = new JLabel("renew date:");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_5.setBounds(636, 452, 201, 46);
		rene.add(lblNewLabel_5);
		JLabel iii = new JLabel("\r\n");
		iii.setFont(new Font("Tahoma", Font.PLAIN, 20));
		iii.setBounds(797, 447, 207, 46);
		rene.add(iii);
		JLabel unn = new JLabel("UName:");
		unn.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		unn.setBounds(80, 452, 135, 46);
		rene.add(unn);
		
		JLabel bn = new JLabel("BName:");
		bn.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		bn.setBounds(80, 510, 135, 46);
		rene.add(bn);
		
		JLabel un = new JLabel("");
		un.setFont(new Font("Sitka Text", Font.PLAIN, 27));
		un.setBounds(213, 452, 246, 46);
		rene.add(un);
		
		JLabel b1 = new JLabel("");
		b1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		b1.setBounds(175, 510, 447, 46);
		rene.add(b1);
		JLabel lblNewLabel_5_1 = new JLabel("due(in RS.):");
		lblNewLabel_5_1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblNewLabel_5_1.setBounds(646, 508, 201, 46);
		rene.add(lblNewLabel_5_1);
		
		JLabel dt = new JLabel("");
		dt.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		dt.setBounds(807, 503, 139, 46);
		rene.add(dt);
		
		
		JButton rnw = new JButton("RENEW");
		rnw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			  try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
					String query="select date_add(curdate(),interval 7 day) as renew_date";
					PreparedStatement ps=con.prepareStatement(query);
					ResultSet rs=ps.executeQuery();
				    while(rs.next())
				    {
				    	iii.setText(rs.getString("renew_date"));
				    }
				 
				    String que="select user_name from users where u_id=? ";
					PreparedStatement p=con.prepareStatement(que);
					
					p.setString(1,uid.getText());
					ResultSet r=p.executeQuery();
					while(r.next())
					{
						un.setText(r.getString("user_name"));	
					}
					
					 String qu="select bname from books where b_id=? ";
						PreparedStatement pp=con.prepareStatement(qu);
						//pss.setString(1,renee);
						pp.setString(1,bidd.getText());
						ResultSet sr=pp.executeQuery();
						while(sr.next())
						{
							b1.setText(sr.getString("bname"));	
						}
					
						String qq="select curdate() as currant_date";
						PreparedStatement i=con.prepareStatement(qq);
						ResultSet t=i.executeQuery();
					    while(t.next())
					    {
					    	cur=t.getString("currant_date");
					    }
					    String qt="select due_date from renew where u_id=?";
					   
						PreparedStatement qp=con.prepareStatement(qt);
						 qp.setString(1,uid.getText());
						
						ResultSet tp=qp.executeQuery();
					    while(tp.next())
					    {
					    	du=tp.getString("due_date");
					    }
					    int dtt=0;
					    if(cur.compareTo(du)>0)
					    {
					    	dtt=dtt+1;
					    	String s1=new Integer(dtt).toString();
					    	dt.setText(s1);
					    }
					    else
					    {
					    	dt.setText("0");
					    }
						
					 renee=iii.getText();
					 String queryy="update renew set due_date=?,due=?,cnt=cnt+1 where u_id=? ";
						PreparedStatement pss=con.prepareStatement(queryy);
						pss.setString(1,renee);
						pss.setString(2,dt.getText());
						pss.setString(3,uid.getText());
						int ii=pss.executeUpdate();
						JOptionPane.showMessageDialog(rnw,"updated due date");
						
						
			}
			  catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			 
			  }
			
			 
			  
			  
			}
			  
		});
		rnw.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		rnw.setBounds(234, 308, 164, 46);
		rene.add(rnw);
		
		
		
		
		
		
		
		
		
		
		
		
		
		JPanel donat = new JPanel();
		donat.setBackground(new Color(248, 248, 255));
		donat.setBorder(new LineBorder(new Color(128, 128, 128), 3));
		layeredPane.add(donat, "name_15683805104800");
		donat.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("...DONATE-A-BOOK...");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(72, 53, 319, 42);
		donat.add(lblNewLabel_2);
		
		JLabel usid = new JLabel("L_User ID:");
		usid.setHorizontalAlignment(SwingConstants.CENTER);
		usid.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		usid.setBounds(167, 165, 164, 35);
		donat.add(usid);
		
		
		JLabel lblLname = new JLabel("LNAME:");
		lblLname.setHorizontalAlignment(SwingConstants.CENTER);
		lblLname.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		lblLname.setBounds(167, 227, 164, 35);
		donat.add(lblLname);
		
		JLabel bne = new JLabel("BOOK NAME:");
		bne.setHorizontalAlignment(SwingConstants.CENTER);
		bne.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		bne.setBounds(167, 280, 164, 35);
		donat.add(bne);
		
		JLabel athr = new JLabel("AUTHOR:");
		athr.setHorizontalAlignment(SwingConstants.CENTER);
		athr.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		athr.setBounds(184, 344, 164, 35);
		donat.add(athr);
		
		JLabel pblr = new JLabel("PUBLISHER:");
		pblr.setHorizontalAlignment(SwingConstants.CENTER);
		pblr.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		pblr.setBounds(167, 410, 164, 35);
		donat.add(pblr);
		
		JLabel ed = new JLabel("ED_NO:");
		ed.setHorizontalAlignment(SwingConstants.CENTER);
		ed.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		ed.setBounds(167, 481, 164, 35);
		donat.add(ed);
		
		JLabel qt = new JLabel("QTY:");
		qt.setHorizontalAlignment(SwingConstants.CENTER);
		qt.setFont(new Font("Sitka Text", Font.PLAIN, 25));
		qt.setBounds(167, 542, 164, 35);
		donat.add(qt);
		
		uiid = new JTextField();
		uiid.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		uiid.setBounds(358, 164, 280, 36);
		donat.add(uiid);
		uiid.setColumns(10);
		textField = new JTextField();
		textField.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(358, 227, 280, 36);
		donat.add(textField);
		
		be = new JTextField();
		be.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		be.setColumns(10);
		be.setBounds(358, 279, 280, 36);
		donat.add(be);
		
		athrr = new JTextField();
		athrr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		athrr.setColumns(10);
		athrr.setBounds(358, 343, 280, 36);
		donat.add(athrr);
		
		pr = new JTextField();
		pr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		pr.setColumns(10);
		pr.setBounds(358, 409, 280, 36);
		donat.add(pr);
		
		eno = new JTextField();
		eno.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		eno.setColumns(10);
		eno.setBounds(358, 480, 280, 36);
		donat.add(eno);
		
		qqt = new JTextField();
		qqt.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		qqt.setColumns(10);
		qqt.setBounds(358, 541, 280, 36);
		donat.add(qqt);
		
		JButton ddt = new JButton("DONATE");
		ddt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
					String query="insert into donation values(?,?,?,?,?,?,?)";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,uiid.getText());	
					ps.setString(2,textField.getText());	
					ps.setString(3,be.getText());	
					ps.setString(4,athrr.getText());	
					ps.setString(5,pr.getText());	
					ps.setString(6,eno.getText());	
					ps.setString(7,qqt.getText());	
					
					
					 
					int i=ps.executeUpdate();
					JOptionPane.showMessageDialog(ddt,"donation request sent");
					ps.close();
					con.close();
					uiid.setText("");
					textField.setText("");
					be.setText("");
					athrr.setText("");
					pr.setText("");
					eno.setText("");
					qqt.setText("");
					
					} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
				
		ddt.setBackground(SystemColor.inactiveCaptionBorder);
		ddt.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		ddt.setBounds(773, 315, 177, 44);
		donat.add(ddt);
		
	
		
		
		
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(211, 211, 211), 2, true));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 85, 263, 612);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JButton avail = new JButton("AVAILABILITY");
		avail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(aall);
				
			}
		});
		
		
		
		avail.setBackground(SystemColor.inactiveCaptionBorder);
		avail.setForeground(new Color(0, 0, 139));
		avail.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		avail.setBounds(36, 118, 196, 49);
		panel.add(avail);
		
		
		JButton renewel = new JButton("RENEWAL");
		renewel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(rene);
				
			}
		});
		renewel.setBackground(SystemColor.inactiveCaptionBorder);
		renewel.setForeground(new Color(0, 0, 139));
		renewel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		renewel.setBounds(36, 225, 196, 49);
		panel.add(renewel);
		
		JButton donation = new JButton("DONATION");
		donation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(donat);
				
			}
		});
		donation.setBackground(SystemColor.inactiveCaptionBorder);
		donation.setForeground(new Color(0, 0, 139));
		donation.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		donation.setBounds(36, 343, 196, 49);
		panel.add(donation);
		
		JButton logt = new JButton("LOG OUT");
		logt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				urlib jf=new urlib();
				jf.setVisible(true);
			}
		});
		logt.setBackground(SystemColor.menu);
		logt.setFont(new Font("STKaiti", Font.PLAIN, 20));
		logt.setForeground(new Color(0, 0, 139));
		logt.setBounds(47, 486, 158, 49);
		panel.add(logt);
		
		JLabel lib = new JLabel("URLIB");
		lib.setForeground(new Color(0, 0, 128));
		lib.setHorizontalAlignment(SwingConstants.CENTER);
		lib.setFont(new Font("Serif", Font.PLAIN, 35));
		lib.setBounds(67, 22, 132, 45);
		contentPane.add(lib);
		
		
		
		
		
	}
}
