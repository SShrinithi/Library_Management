package urlibb;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTable;


import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import java.sql.PreparedStatement;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JSlider;

public class adpage extends JFrame {

	private JPanel contentPane;
    private JLayeredPane layeredPane;
    private JTextField bbknme;
    //private JTable table;
    //private JTable tbldata;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adpage frame = new adpage();
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
	public adpage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1490, 885);
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
			
			JLabel cnt = new JLabel("No. of books added:");
			cnt.setFont(new Font("Lucida Console", Font.PLAIN, 30));
			cnt.setHorizontalAlignment(SwingConstants.CENTER);
			cnt.setBounds(241, 178, 399, 83);
			def.add(cnt);
			
			JLabel ct = new JLabel("0");
			ct.setFont(new Font("Lucida Console", Font.PLAIN, 30));
			ct.setBounds(629, 199, 70, 41);
			def.add(ct);
			
			JButton rfeh = new JButton("REFRESH");
			rfeh.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
						String query="select count(*) from books";
								
						PreparedStatement ps=con.prepareStatement(query);
						
					    ResultSet rs=ps.executeQuery();
					    rs.next();
					    String count=rs.getString("count(*)");
					    ct.setText(count);
						//JOptionPane.showMessageDialog(aa,i+"book added successfully");
						//ps.close();
						con.close();
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
					
				}
			});
			rfeh.setBackground(SystemColor.inactiveCaption);
			rfeh.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
			rfeh.setBounds(916, 548, 115, 41);
			def.add(rfeh);
			
			JPanel adb = new JPanel();
			adb.setBackground(new Color(248, 248, 255));
			adb.setBorder(new LineBorder(new Color(128, 128, 128), 3, true));
			layeredPane.add(adb, "name_15596491007200");
			adb.setLayout(null);
			
			
			JLabel asd = new JLabel("ADD");
			asd.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
			asd.setHorizontalAlignment(SwingConstants.CENTER);
			asd.setBounds(0, 28, 529, 38);
			adb.add(asd);
			
			
			JLabel bid1 = new JLabel("Book ID:");
			bid1.setHorizontalAlignment(SwingConstants.CENTER);
			bid1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			bid1.setBounds(68, 97, 164, 35);
			adb.add(bid1);
			
			JLabel bname1 = new JLabel("Book Name:");
			bname1.setHorizontalAlignment(SwingConstants.CENTER);
			bname1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			bname1.setBounds(68, 182, 164, 35);
			adb.add(bname1);
			
			JLabel gen = new JLabel("Genre:");
			gen.setHorizontalAlignment(SwingConstants.CENTER);
			gen.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			gen.setBounds(99, 261, 164, 35);
			adb.add(gen);
			
			JLabel pub1 = new JLabel("Publisher:");
			pub1.setHorizontalAlignment(SwingConstants.CENTER);
			pub1.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			pub1.setBounds(53, 419, 164, 35);
			adb.add(pub1);
			
			JTextField bb = new JTextField();
		     bb.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			bb.setBounds(264, 97, 309, 35);
			adb.add(bb);
			bb.setColumns(10);
			
			JTextField bnd = new JTextField();
			bnd.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			bnd.setColumns(10);
			bnd.setBounds(264, 182, 309, 35);
			adb.add(bnd);
			
			JComboBox gn = new JComboBox();
			gn.setModel(new DefaultComboBoxModel(new String[] {"", "computer science", "electronics and electrics", "mechanical", "civil", "chemical", "bio-tech", "mathematics", "general knowledge", "fiction and non-fiction", "law ", "arts"}));
			gn.setMaximumRowCount(10);
			gn.setFont(new Font("Eras Light ITC", Font.PLAIN, 20));
			gn.setBackground(SystemColor.inactiveCaptionBorder);
			gn.setBounds(264, 258, 317, 38);
			adb.add(gn);
			
			JTextField  aatr = new JTextField();
			aatr.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			aatr.setColumns(10);
			aatr.setBounds(264, 343, 309, 35);
			adb.add(aatr);
			
			JLabel aatt = new JLabel("Author:");
			aatt.setHorizontalAlignment(SwingConstants.CENTER);
			aatt.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			aatt.setBounds(90, 343, 164, 35);
			adb.add(aatt);
			
			JTextField pp = new JTextField();
			pp.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			pp.setColumns(10);
			pp.setBounds(264, 419, 309, 35);
			adb.add(pp);
			
			JLabel eed = new JLabel("Ed no:");
			eed.setHorizontalAlignment(SwingConstants.CENTER);
			eed.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			eed.setBounds(68, 486, 164, 35);
			adb.add(eed);
			
			JTextField edn = new JTextField();
			edn.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			edn.setColumns(10);
			edn.setBounds(264, 486, 309, 35);
			adb.add(edn);
			
			JLabel lblQty = new JLabel("No.of books:");
			lblQty.setHorizontalAlignment(SwingConstants.CENTER);
			lblQty.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			lblQty.setBounds(68, 547, 164, 35);
			adb.add(lblQty);
			
			JTextField qt = new JTextField();
			qt.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			qt.setColumns(10);
			qt.setBounds(264, 546, 309, 35);
			adb.add(qt);
			
			JLabel flr = new JLabel("Floor no:");
			flr.setHorizontalAlignment(SwingConstants.CENTER);
			flr.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			flr.setBounds(615, 141, 164, 35);
			adb.add(flr);
			
			JLabel shlf = new JLabel("Shelf No:");
			shlf.setHorizontalAlignment(SwingConstants.CENTER);
			shlf.setFont(new Font("Sitka Text", Font.PLAIN, 25));
			shlf.setBounds(627, 208, 164, 35);
			adb.add(shlf);
			
			JTextField fl = new JTextField();
			fl.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			fl.setColumns(10);
			fl.setBounds(789, 141, 234, 35);
			adb.add(fl);
			
			JTextField sl = new JTextField();
			sl.setFont(new Font("Sitka Text", Font.PLAIN, 20));
			sl.setColumns(10);
			sl.setBounds(789, 208, 234, 35);
			adb.add(sl);
			JButton aa = new JButton("ADD");
			aa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
						String query="insert into books values(?,?,?,?,?,?,?,?,?)";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,bb.getText());
						ps.setString(2,bnd.getText());
						String vall=(String) gn.getSelectedItem();
						ps.setString(3, vall.toString());
						
						ps.setString(4,aatr.getText());
						ps.setString(5,pp.getText());
						ps.setString(6,edn.getText());
						ps.setString(7,qt.getText());
						ps.setString(8,fl.getText());
						ps.setString(9,sl.getText());
						
						int i=ps.executeUpdate();
						JOptionPane.showMessageDialog(aa,i+"book added successfully");
						//ps.close();
						con.close();
						bb.setText("");
						bnd.setText("");
						gn.setSelectedIndex(0);
						aatr.setText("");
						pp.setText("");
						edn.setText("");
						qt.setText("");
						fl.setText("");
						sl.setText("");
						
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
			aa.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
			aa.setBounds(859, 454, 164, 46);
			adb.add(aa);
			
			
			
			
			
			/*JButton rt = new JButton("RESET");
			rt.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					bb.setText("");
					bnd.setText("");
					gn.setText("");
					aatr.setText("");
					pp.setText("");
					edn.setText("");
					qt.setText("");
					fl.setText("");
					sl.setText("");
					
					
					
				}
			});
			rt.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
			rt.setBounds(859, 535, 164, 46);
			adb.add(rt);*/
			
			
			
			
			
			
			
			
			
			
			JPanel remv = new JPanel();
			remv.setBorder(new LineBorder(new Color(128, 128, 128), 3));
			remv.setBackground(new Color(248, 248, 255));
			layeredPane.add(remv, "name_15678909663200");
			remv.setLayout(null);
			
			JLabel lblNewLabel1 = new JLabel("Remove!!!");
			lblNewLabel1.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
			lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel1.setBounds(26, 31, 529, 38);
			remv.add(lblNewLabel1);
			
			JComboBox comboBox1 = new JComboBox();
			comboBox1.setBackground(SystemColor.inactiveCaptionBorder);
			comboBox1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					    
					
				    JLabel lblNewLabel_3 = new JLabel("enter book name:");
					lblNewLabel_3.setFont(new Font("Sitka Text", Font.PLAIN, 20));
					lblNewLabel_3.setBounds(330, 176, 198, 44);
					remv.add(lblNewLabel_3);
					JTextField	en = new JTextField();
					en.setFont(new Font("Sitka Text", Font.PLAIN, 20));
					en.setBounds(500, 178, 272, 38);
					remv.add(en);
					en.setColumns(10);
					JButton etr1 = new JButton("ENTER");
					 etr1.addActionListener(new ActionListener() {
					     	public void actionPerformed(ActionEvent e) {
					     		try {
									Class.forName("com.mysql.cj.jdbc.Driver");
									Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
									String queryy="delete from books where bname= ?";
									PreparedStatement ps=con.prepareStatement(queryy);
									
									ps.setString(1,en.getText());
									
									
									int i=ps.executeUpdate();
									JOptionPane.showMessageDialog(etr1,i+"book removed successfully");
									//ps.close();
									con.close();
									en.setText("");
									
									
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
					     		
					     		
					     	}
					     });

					etr1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
					etr1.setBackground(SystemColor.menu);
					etr1.setBounds(449, 269, 140, 47);
					remv.add(etr1);
					
					
				}
			});
			comboBox1.setFont(new Font("Eras Light ITC", Font.PLAIN, 20));
			comboBox1.setModel(new DefaultComboBoxModel(new String[] {"", "Computer science ", "Electronics and electrics", "Mechanical", "Chemical ", "Bio-tech", "Mathematics", "Law and rules", "General knowledge", "Fiction and non-fiction"}));
			comboBox1.setMaximumRowCount(10);
			comboBox1.setBounds(318, 90, 364, 38);
		     remv.add(comboBox1);
		     
		     
			
			
			
			
			
			
			
			
			
			
			
			
			
			JPanel edi = new JPanel();
			edi.setBackground(new Color(248, 248, 255));
			edi.setBorder(new LineBorder(new Color(128, 128, 128), 3));
			layeredPane.add(edi, "name_15683805104800");
			edi.setLayout(null);
			
			JLabel lblNewLabel_2 = new JLabel("-DONATE REQUEST-");
			lblNewLabel_2.setForeground(new Color(0, 0, 128));
			lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
			lblNewLabel_2.setBounds(72, 53, 319, 42);
			edi.add(lblNewLabel_2);
			 bbknme = new JTextField();
			 bbknme.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		     bbknme.setBounds(451, 250, 336, 50);
		     edi.add(bbknme);
		     bbknme.setColumns(10);
		     
		     JLabel bbb = new JLabel("Enter book name:");
		     bbb.setFont(new Font("Tahoma", Font.PLAIN, 23));
		     bbb.setBounds(233, 248, 207, 42);
		     edi.add(bbb);
		     
		     JButton ettr = new JButton("SEARCH");
		     ettr.addActionListener(new ActionListener() {
		     	public void actionPerformed(ActionEvent e) {
		     		switchPanels(adb);
		     		try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/urlib","root","romihemi1518");
						String query="select bname,author,publisher,ed,qty from donation where bname=?";
						PreparedStatement ps=con.prepareStatement(query);
						ps.setString(1,bbknme.getText());
						ResultSet rs=ps.executeQuery();
						
					    while(rs.next())
					    {
					    	bnd.setText(rs.getString("bname"));
					    	aatr.setText(rs.getString("author"));
					        pp.setText(rs.getString("publisher"));
					    	edn.setText(rs.getString("ed"));
					    	qt.setText(rs.getString("qty"));
					    	
					    }	
					    
					    
					    
					   
						
						
						 
						ps.close();
						con.close();
						
						
						
						
						
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		     		//switchPanels(edi);
		     		//bbknme.setText("");
		     		
		     		
		     	}
		     });
		     ettr.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		     ettr.setBounds(425, 379, 176, 50);
		     edi.add(ettr);
		     
		    
		     
		     
			
			
			
			
			
			
			
			
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switchPanels(def);
			}
		});
		panel.setBorder(new LineBorder(new Color(211, 211, 211), 2, true));
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(10, 85, 263, 612);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton addd = new JButton("ADD BOOKS");
		addd.setBackground(SystemColor.inactiveCaptionBorder);
		addd.setForeground(new Color(0, 0, 139));
		addd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(adb);
				
				
			}
		});
		addd.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		addd.setBounds(36, 118, 196, 49);
		panel.add(addd);
		
		JButton del = new JButton("REMOVE");
		del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(remv);
			}
		});
		del.setBackground(SystemColor.inactiveCaptionBorder);
		del.setForeground(new Color(0, 0, 139));
		del.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		del.setBounds(36, 225, 196, 49);
		panel.add(del);
		
		JButton edit = new JButton("SEARCH");
		edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanels(edi);
			}
		});
		edit.setBackground(SystemColor.inactiveCaptionBorder);
		edit.setForeground(new Color(0, 0, 139));
		edit.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		edit.setBounds(36, 343, 196, 49);
		panel.add(edit);
		
		JButton logt = new JButton("LOG OUT");
		logt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				front1 af=new front1();
				af.setBounds(0,0,1920,1080);
				af.setVisible(true);
			}
		});
		logt.setBackground(SystemColor.menu);
		logt.setFont(new Font("STKaiti", Font.PLAIN, 20));
		logt.setForeground(new Color(0, 0, 139));
		logt.setBounds(47, 486, 158, 49);
		panel.add(logt);
		
		JLabel ulb = new JLabel("URLIB");
		ulb.setForeground(new Color(0, 0, 128));
		ulb.setHorizontalAlignment(SwingConstants.CENTER);
		ulb.setFont(new Font("Serif", Font.PLAIN, 35));
		ulb.setBounds(67, 22, 132, 45);
		contentPane.add(ulb);
}
}


