package com.jpro.application.ics.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import de.javasoft.plaf.synthetica.SyntheticaBlueIceLookAndFeel;
import de.javasoft.plaf.synthetica.SyntheticaBlueMoonLookAndFeel;

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
		
		MainMenuBar menuBar = new MainMenuBar();
		
		setJMenuBar(menuBar);
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		setBounds((screenSize.width - 800) / 2, (screenSize.height - 600) / 2,
				800, 600);

		LeftButtonPanel buttonPanel = new LeftButtonPanel();
		MainPanel mainPanel = new MainPanel();

		add(buttonPanel, BorderLayout.WEST);
		add(mainPanel, BorderLayout.CENTER);
		setVisible(true);

	}

	public static void main(String[] args) {

		// Set cross-platform Java L&F (also called "Metal")
		try {
			UIManager.setLookAndFeel(new SyntheticaBlueMoonLookAndFeel());
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
