package graphic;

import costumer.MAIN;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Tue Jul 14 13:44:44 IRDT 2020
 */



/**
 * @author mohamd
 */
public class FileChooser extends JFrame {
	public FileChooser() {

		this.setResizable(false);
		this.setLocationRelativeTo(null);
		initComponents();
	}

	private void fileChooser1ActionPerformed(ActionEvent e) throws Exception {
		this.dispose();
		System.out.println(fileChooser1.getSelectedFile().getAbsolutePath());
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		fileChooser1 = new JFileChooser();

		//======== this ========
		Container contentPane = getContentPane();

		//---- fileChooser1 ----
		fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser1.setDialogType(JFileChooser.SAVE_DIALOG);
		fileChooser1.setDialogTitle("choose a folder to save");
		fileChooser1.addActionListener(e -> {
			try {
				fileChooser1ActionPerformed(e);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(fileChooser1, GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addComponent(fileChooser1, GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
		);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	public JFileChooser fileChooser1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
