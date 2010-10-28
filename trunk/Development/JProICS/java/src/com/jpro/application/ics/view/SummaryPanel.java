package com.jpro.application.ics.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class SummaryPanel extends JPanel{
	
	private JLabel test1label;

	
	public SummaryPanel() {
		// TODO Auto-generated constructor stub
		initComponents();
	}
	
	private void initComponents() {
		
		test1label = new JLabel("testa");
		add(test1label);
		
		setSize(400, 600);
		
	}

}
