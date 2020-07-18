package graphic;

import costumer.Bill;
import costumer.MAIN;
import costumer.Project;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Jul 15 18:44:01 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Show_Project extends JFrame {
	public Show_Project() {

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		initComponents();
	}

	private void menuItem1ActionPerformed(ActionEvent e) {
		this.dispose();
		Login login = new Login();
		login.setVisible(true);
	}

	private void menuItem2ActionPerformed(ActionEvent e) {
		this.dispose();
		Regester regester = new Regester();
		regester.setVisible(true);
	}

	private void button1ActionPerformed(ActionEvent e) throws Exception {
		TreeMap<String , String> nameToPath = MAIN.READ_OBJECT(new File("paths.txt"));
		String path = nameToPath.get(textField1.getText());
		Project project = MAIN.READ_OBJECT(new File(path + "/" + textField1.getText() + "/Projects/" + textField2.getText()+".txt"));
		JOptionPane.showMessageDialog(rootPane , "date :\t" + project.getDate() + "\nprice:\t" + project.getPrice() + "\ntype :\t" +
				project.getActivity_kind());
	}

	private void menuItem3ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Salary show_salary=  new Show_Salary();
		show_salary.setVisible(true);
	}

	private void menuItem4ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Instrument show_instrument = new Show_Instrument();
		show_instrument.setVisible(true);
	}

	private void menuItem5ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Bill show_bill = new Show_Bill();
		show_bill.setVisible(true);
	}

	private void menuItem6ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Project show_project = new Show_Project();
		show_project.setVisible(true);
	}

	private void menuItem7ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Factor show_factor = new Show_Factor();
		show_factor.setVisible(true);
	}

	private void menuItem8ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Fund show_fund = new Show_Fund();
		show_fund.setVisible(true);
	}

	private void menuItem9ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Receivals show_receivals = new Show_Receivals();
		show_receivals.setVisible(true);
	}

	private void menuItem10ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Tax show_tax = new Show_Tax();
		show_tax.setVisible(true);
	}

	private void menuItem11ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Fix show_fix = new Show_Fix();
		show_fix.setVisible(true);
	}

	private void menuItem12ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Investment show_investment = new Show_Investment();
		show_investment.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		menu2 = new JMenu();
		menuItem3 = new JMenuItem();
		menuItem4 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem6 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menuItem9 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menuItem12 = new JMenuItem();
		label2 = new JLabel();
		label1 = new JLabel();
		textField1 = new JTextField();
		button1 = new JButton();
		label4 = new JLabel();
		textField2 = new JTextField();

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
				menuItem2.setText("register a facility");
				menuItem2.addActionListener(e -> menuItem2ActionPerformed(e));
				menu1.add(menuItem2);
			}
			menuBar1.add(menu1);

			//======== menu2 ========
			{
				menu2.setText("show");

				//---- menuItem3 ----
				menuItem3.setText("salary");
				menuItem3.addActionListener(e -> menuItem3ActionPerformed(e));
				menu2.add(menuItem3);

				//---- menuItem4 ----
				menuItem4.setText("instrument");
				menuItem4.addActionListener(e -> menuItem4ActionPerformed(e));
				menu2.add(menuItem4);

				//---- menuItem5 ----
				menuItem5.setText("bill");
				menuItem5.addActionListener(e -> menuItem5ActionPerformed(e));
				menu2.add(menuItem5);

				//---- menuItem6 ----
				menuItem6.setText("project");
				menuItem6.addActionListener(e -> menuItem6ActionPerformed(e));
				menu2.add(menuItem6);

				//---- menuItem7 ----
				menuItem7.setText("factor");
				menuItem7.addActionListener(e -> menuItem7ActionPerformed(e));
				menu2.add(menuItem7);

				//---- menuItem8 ----
				menuItem8.setText("fund");
				menuItem8.addActionListener(e -> menuItem8ActionPerformed(e));
				menu2.add(menuItem8);

				//---- menuItem9 ----
				menuItem9.setText("receivals");
				menuItem9.addActionListener(e -> menuItem9ActionPerformed(e));
				menu2.add(menuItem9);

				//---- menuItem10 ----
				menuItem10.setText("tax");
				menuItem10.addActionListener(e -> menuItem10ActionPerformed(e));
				menu2.add(menuItem10);

				//---- menuItem11 ----
				menuItem11.setText("fix");
				menuItem11.addActionListener(e -> menuItem11ActionPerformed(e));
				menu2.add(menuItem11);

				//---- menuItem12 ----
				menuItem12.setText("investment");
				menuItem12.addActionListener(e -> menuItem12ActionPerformed(e));
				menu2.add(menuItem12);
			}
			menuBar1.add(menu2);
		}
		setJMenuBar(menuBar1);

		//---- label2 ----
		label2.setText("project info");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label1 ----
		label1.setText("Name of the facility : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

		//---- button1 ----
		button1.setText("show");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		//---- label4 ----
		label4.setText("Name of the project :");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 9f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
					.addGap(74, 74, 74))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(50, 50, 50)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(textField2)
						.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(249, 249, 249)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(262, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addComponent(button1)
					.addContainerGap(13, Short.MAX_VALUE))
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
	private JMenu menu2;
	private JMenuItem menuItem3;
	private JMenuItem menuItem4;
	private JMenuItem menuItem5;
	private JMenuItem menuItem6;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenuItem menuItem9;
	private JMenuItem menuItem10;
	private JMenuItem menuItem11;
	private JMenuItem menuItem12;
	private JLabel label2;
	private JLabel label1;
	private JTextField textField1;
	private JButton button1;
	private JLabel label4;
	private JTextField textField2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
