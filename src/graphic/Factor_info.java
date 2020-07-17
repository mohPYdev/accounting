package graphic;

import java.awt.event.*;
import costumer.Factor;
import costumer.Product;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
/*
 * Created by JFormDesigner on Wed Jul 15 19:11:35 IRDT 2020
 */



/**
 * @author mohamd
 */
public class Factor_info extends JFrame {
	Factor factor;
	public Factor_info(Factor factor) {
		initComponents();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.factor = factor;
		StringBuilder text = new StringBuilder();
		for(Product p : factor.getProducts())
			text.append(p.getName()).append("\t\t").append(p.getPrice()).append("\n");
		textArea1.setText(String.valueOf(text));
		sender.setText(factor.getSender());
		receiver.setText(factor.getReceiver());
		cost.setText(String.valueOf(factor.getCost()));
	}

	private void button1ActionPerformed(ActionEvent e) {
		this.dispose();
		Show_Factor show_factor = new Show_Factor();
		show_factor.setVisible(true);
		textArea1.setText("");
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();
		label2 = new JLabel();
		label3 = new JLabel();
		receiver = new JLabel();
		sender = new JLabel();
		button1 = new JButton();
		label4 = new JLabel();
		cost = new JLabel();

		//======== this ========
		setTitle("Accounting");
		Container contentPane = getContentPane();

		//---- label1 ----
		label1.setText("products");
		label1.setFont(label1.getFont().deriveFont(label1.getFont().getStyle() | Font.BOLD, label1.getFont().getSize() + 11f));
		label1.setEnabled(false);

		//======== scrollPane1 ========
		{

			//---- textArea1 ----
			textArea1.setFont(textArea1.getFont().deriveFont(textArea1.getFont().getSize() + 8f));
			scrollPane1.setViewportView(textArea1);
		}

		//---- label2 ----
		label2.setText("Sender : ");
		label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));

		//---- label3 ----
		label3.setText("Receiver :");
		label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));

		//---- receiver ----
		receiver.setFont(receiver.getFont().deriveFont(receiver.getFont().getSize() + 5f));

		//---- sender ----
		sender.setFont(sender.getFont().deriveFont(sender.getFont().getSize() + 5f));

		//---- button1 ----
		button1.setText("OK");
		button1.addActionListener(e -> button1ActionPerformed(e));

		//---- label4 ----
		label4.setText("Total cost :");
		label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));

		//---- cost ----
		cost.setFont(cost.getFont().deriveFont(cost.getFont().getSize() + 5f));

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(105, 105, 105)
							.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 363, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(217, 217, 217)
							.addComponent(label1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(116, 116, 116)
							.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
								.addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
									.addComponent(label4, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
									.addComponent(cost, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label3, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(receiver, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(contentPaneLayout.createSequentialGroup()
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(sender, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(244, 244, 244)
							.addComponent(button1, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(103, Short.MAX_VALUE))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(14, 14, 14)
					.addComponent(label1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addGap(28, 28, 28)
					.addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(sender, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(label3, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(receiver, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(contentPaneLayout.createParallelGroup()
						.addComponent(cost, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(label4, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(button1)
					.addGap(13, 13, 13))
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	private JLabel label2;
	private JLabel label3;
	private JLabel receiver;
	private JLabel sender;
	private JButton button1;
	private JLabel label4;
	private JLabel cost;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
