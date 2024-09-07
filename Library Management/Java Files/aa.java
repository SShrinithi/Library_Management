package urlibb;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class aa extends JPanel {
	private JTextField serch;

	/**
	 * Create the panel.
	 */
	public aa() {
		setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(192, 192, 192)));
		setBackground(new Color(230, 230, 250));
		setLayout(null);
		
		JLabel chk = new JLabel("CHECK WHETHER YOUR DESIRED BOOK IS AVAILABLE OR NOT!!!");
		chk.setFont(new Font("Eras Light ITC", Font.BOLD, 25));
		chk.setBounds(242, 73, 757, 53);
		add(chk);
		
		serch = new JTextField();
		serch.setText("search");
		serch.setFont(new Font("Corbel Light", Font.PLAIN, 25));
		serch.setBounds(258, 161, 502, 53);
		add(serch);
		serch.setColumns(10);

	}
}
