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
 * Created by JFormDesigner on Tue Jul 14 16:18:07 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Add_Instrument extends JFrame {
	public Add_Instrument() {
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
		if(costumer instanceof Municipality || costumer instanceof Factory) {
			Instrument instrument = new Instrument(date.getText(), String.valueOf(price.getValue()), s1.getText(), s2.getText());
			MAIN.WRITE_OBJECT(new File(path + "/" + name.getText() + "/Instruments/" + s1.getText() + "_" + s2.getText() + ".txt"), instrument);
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
		s1 = new JTextField();
		price = new JSpinner();
		label5 = new JLabel();
		button2 = new JButton();
		label6 = new JLabel();
		s2 = new JTextField();
		name = new JTextField();
		label7 = new JLabel();

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
		label2.setText("Instrument");
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
		label4.setText("Side1's name :");
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
		label6.setText("Side2's name :");
		label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 9f));

		//---- label7 ----
		label7.setText("Facility's name : ");
		label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 9f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addGap(0, 168, Short.MAX_VALUE)
					.addComponent(label2, GroupLayout.PREFERRED_SIZE, 328, GroupLayout.PREFERRED_SIZE)
					.addGap(159, 159, 159))
				.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label7, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
									.addGap(30, 30, 30)
									.addComponent(name, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
										.addComponent(label1, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
										.addComponent(label3, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
										.addComponent(label6, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
										.addComponent(label4, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
									.addGap(30, 30, 30)
									.addGroup(contentPaneLayout.createParallelGroup()
										.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
											.addComponent(date, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
											.addComponent(price, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
											.addComponent(s1, GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
										.addComponent(s2, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE))))
							.addGap(28, 28, 28))
						.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
							.addGroup(contentPaneLayout.createParallelGroup()
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addGroup(contentPaneLayout.createParallelGroup()
										.addGroup(contentPaneLayout.createSequentialGroup()
											.addGap(90, 90, 90)
											.addComponent(button1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
										.addGroup(contentPaneLayout.createSequentialGroup()
											.addGap(103, 103, 103)
											.addComponent(button2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 199, GroupLayout.PREFERRED_SIZE))
								.addComponent(label5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE))
							.addGap(72, 72, 72))))
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
						.addComponent(s1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addGap(18, 18, 18)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label6, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(s2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(4, 4, 4)
							.addComponent(name, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
					.addGap(18, 18, 18)
					.addComponent(button1)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(label5)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button2)
					.addContainerGap(21, Short.MAX_VALUE))
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
	private JTextField s1;
	private JSpinner price;
	private JLabel label5;
	private JButton button2;
	private JLabel label6;
	private JTextField s2;
	private JTextField name;
	private JLabel label7;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
