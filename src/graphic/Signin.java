package graphic;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Mon Jul 13 19:07:54 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Signin extends JFrame {
	public Signin() {
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) throws Exception {
		if(Arrays.equals(passwordField1.getPassword(), passwordField2.getPassword()))
			if(User_Pass.create_Account(textField1.getText() , String.valueOf(passwordField2.getPassword())))
			{
				JOptionPane.showMessageDialog(rootPane , "your account's been successfully created");
				this.dispose();
				Login login = new Login();
				login.setVisible(true);
			}
			else
			{
				label6.setForeground(Color.RED);
				label6.setText("This username's taken");
			}
		else {
			label6.setForeground(Color.RED);
			label6.setText("please enter the correct password");
		}
	}

	private void button2ActionPerformed(ActionEvent e) {
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		button1 = new JButton();
		button2 = new JButton();
		label5 = new JLabel();
		label4 = new JLabel();
		label6 = new JLabel();
		passwordField1 = new JPasswordField();
		passwordField2 = new JPasswordField();

		//======== this ========
		setTitle("Accounting");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("Username : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 7f));

		//---- label2 ----
		label2.setText("Sign in");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label3 ----
		label3.setText("Password :");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getStyle() | Font.BOLD, label3.getFont().getSize() + 7f));

		//---- button1 ----
		button1.setText("sign in ");
		button1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		//---- button2 ----
		button2.setText("login");
		button2.setFont(new Font("Stencil", Font.PLAIN, 16));
		button2.setForeground(Color.blue);
		button2.addActionListener(e -> button2ActionPerformed(e));

		//---- label5 ----
		label5.setText("confirm Password :");
		label5.setFont(label5.getFont().deriveFont(label5.getFont().getStyle() | Font.BOLD, label5.getFont().getSize() + 7f));

		//---- label4 ----
		label4.setText("already have an account ?");

		//---- label6 ----
		label6.setFont(label6.getFont().deriveFont(label6.getFont().getStyle() | Font.BOLD, label6.getFont().getSize() + 10f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(93, 93, 93)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 0, Short.MAX_VALUE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(label5, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)))
					.addGap(22, 22, 22)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
							.addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
						.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
					.addGap(65, 65, 65))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(160, 160, 160)
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
							.addGap(41, 41, 41)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(286, 286, 286)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(208, Short.MAX_VALUE))
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(166, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(label2, GroupLayout.PREFERRED_SIZE, 226, GroupLayout.PREFERRED_SIZE)
							.addGap(246, 246, 246))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(label6, GroupLayout.PREFERRED_SIZE, 558, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(26, 26, 26)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(31, 31, 31)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(34, 34, 34)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(51, 51, 51)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(label6, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4)
						.addComponent(button2))
					.addGap(39, 39, 39))
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
	private JButton button1;
	private JButton button2;
	private JLabel label5;
	private JLabel label4;
	private JLabel label6;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
