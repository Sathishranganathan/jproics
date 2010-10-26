package com.jpro.application.ics.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		// TODO Auto-generated constructor stub
		initComponents();
	}

	private void initComponents() {
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 800) / 2, (screenSize.height - 600) / 2,
				800, 600);

		LeftButtonPanel buttonPanel = new LeftButtonPanel();
		

		add(buttonPanel, BorderLayout.WEST);
		setVisible(true);

	}

	public static void main(String[] args) {

		// Set cross-platform Java L&F (also called "Metal")
		try {
			UIManager.setLookAndFeel(new SyntheticaBlueIceLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		new MainFrame();

	}
}
