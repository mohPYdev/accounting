package graphic;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
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

	private void button1ActionPerformed(ActionEvent e) throws Exception {
		if(User_Pass.login(textField1.getText() , String.valueOf(passwordField1.getPassword()))){
			this.dispose();
			//TODO go to the next panel

		}
		else
		{
			label5.setForeground(Color.RED);
			label5.setText("wrong username or password");
		}
	}

	private void button2ActionPerformed(ActionEvent e) {
		Signin signin = new Signin();
		signin.setVisible(true);
		this.dispose();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		button1 = new JButton();
		label4 = new JLabel();
		button2 = new JButton();
		passwordField1 = new JPasswordField();
		label5 = new JLabel();

		//======== this ========
		setTitle("Accounting");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
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
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

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
							.addGap(104, 104, 104)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
							.addGap(71, 71, 71)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField1)))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(250, 250, 250)
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGap(118, 118, 118)
									.addComponent(label4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
									.addGap(54, 54, 54)
									.addComponent(button2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
							.addGap(0, 0, Short.MAX_VALUE)))
					.addContainerGap(91, Short.MAX_VALUE))
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(174, Short.MAX_VALUE)
					.addComponent(label5, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(233, 233, 233)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(277, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(26, 26, 26)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(47, 47, 47)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(label3, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(46, 46, 46)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(label5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(button2)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
					.addGap(17, 17, 17))
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
	private JLabel label4;
	private JButton button2;
	private JPasswordField passwordField1;
	private JLabel label5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
