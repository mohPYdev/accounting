package graphic;

import costumer.Company;
import costumer.MAIN;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Jul 14 14:27:06 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Company_Reg extends JFrame {
	ArrayList<String> names;
	String name , email , phone , activity;
	public Company_Reg(String name, String email, String phone, String activity, ArrayList<String> names)
	{
		initComponents();
		this.names = names;
		this.name = name;
		this.email = email;
		this.activity = activity;
		this.phone = phone;
	}

	private void menuItem1ActionPerformed(ActionEvent e) {
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}

	private void menuItem2ActionPerformed(ActionEvent e) {
		this.dispose();
		AccountingSearch accountingSearch = new AccountingSearch();
		accountingSearch.setVisible(true);
	}

	private void menuItem3ActionPerformed(ActionEvent e) {
		this.dispose();
		Regester regester = new Regester();
		regester.setVisible(true);
	}


	private void button1ActionPerformed(ActionEvent e) throws Exception {
		Company company = new Company(name , email , phone , activity , names , Integer.parseInt(code.getText()) , boss.getText() ,
				addrss.getText() , date.getText() , Double.parseDouble(other.getText()), (int) invest.getValue());
		TreeMap<String , String> nameToPath = MAIN.READ_OBJECT(new File("paths.txt"));
		String path = nameToPath.get(name);
		MAIN.WRITE_OBJECT(new File(path + "/" + name + "/Attributes/other_expenses.txt") , company.getOther_expence());
		MAIN.WRITE_OBJECT(new File(path + "/" + name + "/Attributes/investments.txt") , company.getInvestment());
		MAIN.WRITE_OBJECT(new File(path + "/" + name + "/Attributes/info.txt") , company);
		this.dispose();
		Regester regester = new Regester();
		regester.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		menuItem3 = new JMenuItem();
		label2 = new JLabel();
		label1 = new JLabel();
		label3 = new JLabel();
		code = new JTextField();
		button1 = new JButton();
		label4 = new JLabel();
		boss = new JTextField();
		label5 = new JLabel();
		addrss = new JTextField();
		label6 = new JLabel();
		date = new JTextField();
		invest = new JSpinner();
		label7 = new JLabel();
		other = new JTextField();

		//======== this ========
		setTitle("Accounting");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		//======== menuBar1 ========
		{
			menuBar1.setBackground(new Color(204, 204, 204));

			//======== menu1 ========
			{
				menu1.setText("menu ");

				//---- menuItem1 ----
				menuItem1.setText("log out");
				menuItem1.addActionListener(e -> menuItem1ActionPerformed(e));
				menu1.add(menuItem1);

				//---- menuItem2 ----
				menuItem2.setText("accountant");
				menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
				menu1.add(menuItem2);

				//---- menuItem3 ----
				menuItem3.setText("Register");
				menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
				menu1.add(menuItem3);
			}
			menuBar1.add(menu1);
		}
		setJMenuBar(menuBar1);

		//---- label2 ----
		label2.setText("COMPANY");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label1 ----
		label1.setText("Economic code : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

		//---- label3 ----
		label3.setText("Investments : ");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 9f));

		//---- button1 ----
		button1.setText("Register");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		//---- label4 ----
		label4.setText("Boss name : ");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 9f));

		//---- label5 ----
		label5.setText("Address : ");
		label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 9f));

		//---- label6 ----
		label6.setText("Date of establishment :");
		label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 9f));

		//---- label7 ----
		label7.setText("Other expenses : ");
		label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 9f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addComponent(label4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
								.addComponent(label7, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
							.addGap(30, 30, 30)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
									.addComponent(boss, GroupLayout.Alignment.LEADING)
									.addComponent(addrss, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
								.addComponent(invest, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
								.addComponent(date, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
								.addComponent(other, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
								.addComponent(code, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))))
					.addGap(28, 28, 28))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(250, 250, 250)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(268, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(16, 16, 16)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(code, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(28, 28, 28)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(invest, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
					.addGap(28, 28, 28)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(boss, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(26, 26, 26)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(addrss, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label5, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
					.addGap(26, 26, 26)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(date, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(33, 33, 33)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(other, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(button1)
					.addGap(51, 51, 51))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem1;
	private JMenuItem menuItem2;
	private JMenuItem menuItem3;
	private JLabel label2;
	private JLabel label1;
	private JLabel label3;
	private JTextField code;
	private JButton button1;
	private JLabel label4;
	private JTextField boss;
	private JLabel label5;
	private JTextField addrss;
	private JLabel label6;
	private JTextField date;
	private JSpinner invest;
	private JLabel label7;
	private JTextField other;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
