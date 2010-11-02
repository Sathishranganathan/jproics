package com.jpro.application.ics.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class MainMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenu newJMenu;

	public MainMenuBar() {

		initComponents();

	}

	private void initComponents() {

		newJMenu = new JMenu("New");
		add(newJMenu);

	}

}
