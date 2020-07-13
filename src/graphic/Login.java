package graphic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Jul 13 19:02:02 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Login extends JFrame {
	public Login() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void button2ActionPerformed(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		button1 = new JButton();
		label4 = new JLabel();
		button2 = new JButton();

		//======== this ========
		setTitle("Accounting");
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Username : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 7f));

		//---- label2 ----
		label2.setText("Login");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label3 ----
		label3.setText("Password :");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 7f));

		//---- button1 ----
		button1.setText("login");
		button1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		button1.addActionListener(e -> button1ActionPerformed(e));

		//---- label4 ----
		label4.setText("don't have an account ? ");

		//---- button2 ----
		button2.setText("sign in ");
		button2.setFont(new Font("Stencil", Font.PLAIN, 16));
		button2.setForeground(Color.blue);
		button2.addActionListener(e -> button2ActionPerformed(e));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(215, 215, 215)
							.addComponent(label2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(93, 93, 93)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(button2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup()
										.addComponent(label1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
										.addComponent(label3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
									.addGap(46, 46, 46)
									.addGroup(contentPaneLayout.createParallelGroup()
										.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(199, 199, 199)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(26, 26, 26)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
					.addGap(34, 34, 34)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(33, 33, 33)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2))
					.addGap(9, 9, 9))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JButton button1;
	private JLabel label4;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
