package graphic;

import costumer.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Tue Jul 14 16:01:20 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Add_Bill extends JFrame {
	public Add_Bill() {

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
		AccountingSearch accountingSearch = new AccountingSearch();
		accountingSearch.setVisible(true);
	}

	private void menuItem3ActionPerformed(ActionEvent e) {
		this.dispose();
		Regester regester = new Regester();
		regester.setVisible(true);
	}

	private void button1ActionPerformed(ActionEvent e) throws Exception {
		TreeMap<String , String > nameToPath = MAIN.READ_OBJECT(new File("paths.txt"));
		String path = nameToPath.get(name.getText());
		Costumer costumer = MAIN.READ_OBJECT(new File(path + "/" + name.getText() + "/Attributes/info.txt"));
		if(costumer instanceof Company || costumer instanceof Factory){
			Bill.BillType type = Bill.BillType.WATER;
			switch (comboBox1.getSelectedIndex()) {
				case 0:
					type = Bill.BillType.WATER;
					break;
				case 1:
					type = Bill.BillType.GAS;
					break;
				case 2:
					type = Bill.BillType.POWER;
					break;
				case 3:
					type = Bill.BillType.TELEPHONE;
					break;
			}
			Bill bill = new Bill(id.getText() , String.valueOf(price.getValue()) , date.getText(), type);
			MAIN.WRITE_OBJECT(new File(path + "/" + name.getText() + "/Bills/" + id.getText()+".txt") , bill);
		}
		else{
			try{
				throw new InvalidData();
			}catch (InvalidData ex)
			{
				JOptionPane.showMessageDialog(rootPane , ex.getMessage());
			}
		}
	}

	private void button2ActionPerformed(ActionEvent e) {
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
		date = new JTextField();
		button1 = new JButton();
		label4 = new JLabel();
		id = new JTextField();
		price = new JSpinner();
		label5 = new JLabel();
		button2 = new JButton();
		label6 = new JLabel();
		comboBox1 = new JComboBox<>();
		label7 = new JLabel();
		name = new JTextField();

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
		label2.setText("BILL");
		label2.setFont(new Font("Stencil", Font.BOLD, 44));
		label2.setEnabled(false);

		//---- label1 ----
		label1.setText("date : ");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 9f));

		//---- label3 ----
		label3.setText("Price : ");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 9f));

		//---- button1 ----
		button1.setText("Add");
		button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
		button1.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		//---- label4 ----
		label4.setText("ID : ");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 9f));

		//---- label5 ----
		label5.setText("when you are done click on the button below");

		//---- button2 ----
		button2.setText("Done");
		button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
		button2.addActionListener(e -> {
			try {
				button1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			button2ActionPerformed(e);
		});

		//---- label6 ----
		label6.setText("Type : ");
		label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 9f));

		//---- comboBox1 ----
		comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
			"water",
			"gas",
			"power",
			"telephone"
		}));

		//---- label7 ----
		label7.setText("Facility's name : ");
		label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 9f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(0, 257, Short.MAX_VALUE)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
					.addGap(70, 70, 70))
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(label1, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
									.addComponent(label3, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
									.addComponent(label6, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
									.addComponent(label4, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
								.addComponent(label7, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE))
							.addGap(30, 30, 30)
							.addGroup(contentPaneLayout.createParallelGroup()
								.addComponent(name, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
								.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
									.addComponent(date, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
									.addComponent(price, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
									.addComponent(id, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
									.addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
							.addGap(28, 28, 28))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addComponent(label5, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
							.addGap(76, 76, 76))))
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(237, 237, 237)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(256, 256, 256)
							.addComponent(button2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(274, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(date, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(28, 28, 28)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(price, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(id, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(name, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addComponent(button1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label5)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button2)
					.addContainerGap(11, Short.MAX_VALUE))
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
	private JTextField date;
	private JButton button1;
	private JLabel label4;
	private JTextField id;
	private JSpinner price;
	private JLabel label5;
	private JButton button2;
	private JLabel label6;
	private JComboBox<String> comboBox1;
	private JLabel label7;
	private JTextField name;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
