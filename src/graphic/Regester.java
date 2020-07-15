package graphic;

import costumer.MAIN;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jul 14 12:52:05 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Regester extends JFrame {
	ArrayList<String> names = new ArrayList<>();
	TreeMap<String , String> nameToPath;
	public Regester() {
		initComponents();
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

	private void button1ActionPerformed(ActionEvent e) {
		this.dispose();
		String path = nameToPath.get(name.getText());
		new File(path , name.getText()).mkdir();
		if(comboBox1.getSelectedIndex() == 0)
		{
			new File(path + "/" + name.getText() , "Instruments");
			new File(path + "/" + name.getText() , "Factors_expense");
			new File(path + "/" + name.getText() , "Factors_income");
			new File(path + "/" + name.getText() , "Bills");
			new File(path + "/" + name.getText() , "Salaries");
			new File(path + "/" + name.getText() , "Attributes");
			Factory_Reg factory_reg = new Factory_Reg(names);
			factory_reg.setVisible(true);
		}
		else if(comboBox1.getSelectedIndex() == 1){
			new File(path + "/" + name.getText() , "Bills");
			new File(path + "/" + name.getText() , "Projects");
			new File(path + "/" + name.getText() , "Salaries");
			new File(path + "/" + name.getText() , "Attributes");
			Company_Reg company_reg = new Company_Reg(names);
			company_reg.setVisible(true);
		}
		else {
			new File(path + "/" + name.getText(), "Factors");
			new File(path + "/" + name.getText() , "Instruments");
			new File(path + "/" + name.getText() , "Salaries");
			new File(path + "/" + name.getText() , "Attributes");
			Municipality_Reg municipality_reg = new Municipality_Reg();
			municipality_reg.setVisible(true);
		}
	}

	private void button2ActionPerformed(ActionEvent e) {
		names.add(emp.getText());
		emp.setText("");
	}

	private void button3ActionPerformed(ActionEvent e) throws Exception {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setVisible(true);
		File file = new File("paths.txt");
		if(file.exists())
		{
			nameToPath = MAIN.READ_OBJECT(file);
		}
		nameToPath.put(name.getText() , fileChooser.fileChooser1.getSelectedFile().getAbsolutePath());
		MAIN.WRITE_OBJECT(file , nameToPath);
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
		name = new JTextField();
		comboBox1 = new JComboBox<>();
		button1 = new JButton();
		label4 = new JLabel();
		email = new JTextField();
		label5 = new JLabel();
		phone = new JTextField();
		label6 = new JLabel();
		activity = new JTextField();
		label8 = new JLabel();
		label9 = new JLabel();
		emp = new JTextField();
		button2 = new JButton();
		label10 = new JLabel();
		button3 = new JButton();

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
			}
			menuBar1.add(menu1);
		}
		setJMenuBar(menuBar1);

		//---- label2 ----
		label2.setText("REgister");
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
		button1.setText("Register");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
		button1.addActionListener(e -> button1ActionPerformed(e));

		//---- label4 ----
		label4.setText("Email : ");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 9f));

		//---- label5 ----
		label5.setText("Phone Number : ");
		label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 9f));

		//---- label6 ----
		label6.setText("Activity Type : ");
		label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 9f));

		//---- label8 ----
		label8.setText("please enter the name of your employees and hit the add button ");

		//---- label9 ----
		label9.setText("Employee name : ");
		label9.setFont(label9.getFont().deriveFont(label9.getFont().getSize() + 9f));

		//---- button2 ----
		button2.setText("add");
		button2.addActionListener(e -> button2ActionPerformed(e));

		//---- label10 ----
		label10.setText("Where do you want to save ?");
		label10.setFont(label10.getFont().deriveFont(label10.getFont().getSize() + 9f));

		//---- button3 ----
		button3.setText("Choose");
		button3.addActionListener(e -> {
			try {
				button3ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(0, 0, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createParallelGroup()
									.addComponent(label3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
									.addComponent(label4, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
									.addComponent(label5, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
									.addComponent(label6, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
							.addGap(368, 368, 368))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(label8, GroupLayout.PREFERRED_SIZE, 537, GroupLayout.PREFERRED_SIZE)
							.addGap(42, 42, 42))))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
								.addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
									.addComponent(label10, GroupLayout.PREFERRED_SIZE, 362, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button3, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
								.addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
									.addComponent(label9, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
									.addGap(38, 38, 38)
									.addComponent(emp, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(button2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGap(0, 0, Short.MAX_VALUE)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
										.addGroup(contentPaneLayout.createParallelGroup()
											.addComponent(phone, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
											.addComponent(email, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
											.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
											.addComponent(activity, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
										.addComponent(name, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
										.addComponent(label2, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
									.addGap(46, 46, 46))
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
									.addGap(246, 246, 246))))))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(name, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(email, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(phone, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(activity, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(label4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
							.addComponent(label5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(18, 18, 18)
							.addComponent(label6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(18, 18, 18)
					.addComponent(label8)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label9, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(emp, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(button2))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(button3))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
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
	private JTextField name;
	private JComboBox<String> comboBox1;
	private JButton button1;
	private JLabel label4;
	private JTextField email;
	private JLabel label5;
	private JTextField phone;
	private JLabel label6;
	private JTextField activity;
	private JLabel label8;
	private JLabel label9;
	private JTextField emp;
	private JButton button2;
	private JLabel label10;
	private JButton button3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
