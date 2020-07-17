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
			AccountingSearch accountingSearch = new AccountingSearch();
			accountingSearch.setVisible(true);
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
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addContainerGap(166, Short.MAX_VALUE)
							.addComponent(label5, GroupLayout.PREFERRED_SIZE, 473, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(58, 58, 58)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label3, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
							.addGap(28, 28, 28)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(textField1)
								.addComponent(passwordField1, GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))))
					.addGap(23, 23, 23))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(247, 247, 247)
							.addComponent(label2, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(236, 236, 236)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(121, 121, 121)
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(209, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(44, 44, 44)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(passwordField1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(label5, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2))
					.addContainerGap(12, Short.MAX_VALUE))
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
