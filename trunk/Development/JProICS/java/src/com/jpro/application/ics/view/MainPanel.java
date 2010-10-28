package com.jpro.application.ics.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	private JLabel test1label;
	
	public MainPanel() {
		initComponents();
	}
	
	private void initComponents() {
		
		setBackground(Color.white);
		
		test1label = new JLabel("testa");
		
		setSize(400, 600);
		add(test1label);

		setBorder(BorderFactory.createTitledBorder(""));

	}

}
