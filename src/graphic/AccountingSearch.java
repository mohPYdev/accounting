package graphic;

import accountant.Accountant_comp;
import accountant.Accountant_fact;
import accountant.Accountant_muni;
import costumer.MAIN;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jul 14 11:44:21 IRDT 2020
 */



/**
 * @author mohamd
 */
public class AccountingSearch extends JFrame {
	public AccountingSearch() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) throws Exception {
		String path;
		TreeMap<String , String > nameToPath;
		File file = new File("paths.txt");
		if(file.exists())
		{
			nameToPath = MAIN.READ_OBJECT(file);
			if(nameToPath.containsKey(textField1.getText())) {
				path = nameToPath.get(textField1.getText());
				// Factory= 0    ,  Company = 1 ,   Municipality = 2
				double cost , income , profit;
				if(comboBox1.getSelectedIndex() == 0){
					Accountant_fact factory = new Accountant_fact(textField2.getText() , textField1.getText());
					cost = factory.costComputer(path);
					income = factory.incomeComputer(path);
					profit = factory.profitComputer(path);
				}
				else if(comboBox1.getSelectedIndex() == 1){
					Accountant_comp company = new Accountant_comp(textField2.getText() , textField1.getText());
					cost = company.costComputer(path);
					income = company.incomeComputer(path);
					profit = company.profitComputer(path);
				}
				else{
					Accountant_muni municipality = new Accountant_muni(textField2.getText() , textField1.getText());
					cost = municipality.costComputer(path);
					income = municipality.incomeComputer(path);
					profit = municipality.profitComputer(path);
				}

				JOptionPane.showMessageDialog(rootPane , "cost : " + cost + "\nincome : " + income + "\nprofit : " + profit);
			}
			else {
				try {
					throw new NoData();
				} catch (NoData ex) {
					JOptionPane.showMessageDialog(rootPane, ex.getMessage());
				}
			}
		}
		else {
			try {
				throw new NoData();
			} catch (NoData ex) {
				JOptionPane.showMessageDialog(rootPane, ex.getMessage());
			}
		}
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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem1 = new JMenuItem();
		menuItem2 = new JMenuItem();
		label2 = new JLabel();
		label1 = new JLabel();
		label3 = new JLabel();
		textField1 = new JTextField();
		comboBox1 = new JComboBox<>();
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
		}
		setJMenuBar(menuBar1);

		//---- label2 ----
		label2.setText("Accountant");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label1 ----
		label1.setText("Name of the facility : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

		//---- label3 ----
		label3.setText("Kind of facility : ");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 9f));

		//---- comboBox1 ----
		comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
			"Factory",
			"Company",
			"Municipality"
		}));

		//---- button1 ----
		button1.setText("search");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		//---- label4 ----
		label4.setText("Accountant ID  : ");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 9f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
					.addGap(141, 141, 141))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(78, 78, 78)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
							.addComponent(label1, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
							.addComponent(label3, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE))
					.addGap(69, 69, 69)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(textField1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
						.addComponent(comboBox1))
					.addGap(28, 28, 28))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(295, 295, 295)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(313, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(47, 47, 47)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(41, 41, 41)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(label4, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
						.addComponent(textField2, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
					.addGap(32, 32, 32)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
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
	private JLabel label2;
	private JLabel label1;
	private JLabel label3;
	private JTextField textField1;
	private JComboBox<String> comboBox1;
	private JButton button1;
	private JLabel label4;
	private JTextField textField2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
